package com.redhat.mercury.codegen.mojo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.redhat.mercury.codegen.model.GrpcService;
import com.redhat.mercury.codegen.utils.ApiFileUtils;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import static com.redhat.mercury.codegen.utils.NamingUtils.toCamelCase;
import static com.redhat.mercury.codegen.utils.NamingUtils.toPackageName;


/**
 * This Mojo generates a gRPC client connection for all APIs available in the service domain
 */
@Mojo(name = "GrpcClient", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GrpcClientMojo extends AbstractMercuryMojo {

    private final Log log = getLog();

    @Parameter(property = "port", required = true, defaultValue = "${mercury.grpc.port}")
    String port;

    @Parameter(property = "apiDir", required = true, defaultValue = "${project.parent.basedir}/${project.parent.artifactId}-common/src/main/proto/${mercury.proto.version}/api")
    File apiDir;

    @Override
    public void execute() throws MojoExecutionException {
        String underscoreServiceDomain = sdName.replace("-", "_");
        String sdNameCamel = toCamelCase(underscoreServiceDomain);

        // Retrieve list of apis from the proto/api directory
        String[] apiFiles = apiDir.list();
        if (apiFiles == null) {
            apiFiles = new String[0];
            log.info("No proto api files found under " + apiDir.getAbsolutePath());
        }
        List<GrpcService> services = new ArrayList<>();
        String packageName = String.format("com.redhat.mercury.%s.%s.client", toPackageName(underscoreServiceDomain), version);
        String className = sdNameCamel + "Client";

        // Create object from each api with all naming formats
        for (String file : apiFiles) {
            try {
                services.add(ApiFileUtils.readApiFile(apiDir, file, sdName));
            } catch (IOException e) {
                log.error("Unable to read api file " + file, e);
                throw new MojoExecutionException("Unable to read api file " + file);
            }
        }

        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setClassLoaderForTemplateLoading(this.getClass().getClassLoader(), "/");
        Map<String, Object> params = new HashMap<>();
        params.put("packageName", packageName);
        params.put("className", className);
        params.put("services", services);
        params.put("grpcPort", port);
        params.put("serviceDomainGrpcName", sdName);

        File clientDir = new File(String.format("%s/com/redhat/mercury/%s/%s/client",
                outputDir.getPath(), toPackageName(underscoreServiceDomain), version));
        if (!clientDir.exists()) {
            clientDir.mkdirs();
        }
        try (Writer writer = new FileWriter(clientDir.getPath() + "/" + sdNameCamel + "Client.java")) {
            Template template = getTemplate(config, "client/client_java.ftl");
            template.process(params, writer);
        } catch (IOException | TemplateException e) {
            log.error("Unable to process the GrpcClient template", e);
            throw new MojoExecutionException("Unable to process the GrpcClient template", e);
        }

        File propertiesFile = new File(outputDir, "application.properties");
        try (Writer writer = new FileWriter(propertiesFile)) {
            Template template = getTemplate(config, "client/application_properties.ftl");
            template.process(params, writer);
        } catch (IOException | TemplateException e) {
            log.error("Unable to process the application.properties template", e);
            throw new MojoExecutionException("Unable to process the application.properties template", e);
        }
    }

}


