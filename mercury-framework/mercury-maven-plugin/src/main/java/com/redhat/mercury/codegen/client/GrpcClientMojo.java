package com.redhat.mercury.codegen.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.redhat.mercury.codegen.client.model.GrpcService;
import com.redhat.mercury.codegen.client.resources.StringFormatter;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;


/**
 * This Mojo generates a gRPC client connection for all APIs available in the service domain
 */
@Mojo(name = "GrpcClient", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class GrpcClientMojo extends AbstractMojo {

    private final Log log = getLog();

    @Parameter(property = "serviceDomainName", defaultValue = "${project.parent.artifactId}", required = true)
    String sdName;

    @Parameter(property = "version", required = true, defaultValue = "${mercury.proto.version}")
    String version;

    @Parameter(property = "port", required = true, defaultValue = "${mercury.grpc.port}")
    String port;

    @Parameter(property = "outputDir", defaultValue = "${project.build.directory}/generated-sources/mercury", required = true)
    File outputDir;

    @Parameter(property = "apiDir", required = true, defaultValue = "${project.parent.basedir}/${project.parent.artifactId}-common/src/main/proto/${mercury.proto.version}/api")
    File apiDir;

    @Override
    public void execute() throws MojoExecutionException {
        String sdNameCamel = StringFormatter.capitalizeWords(sdName.replace("-", " "));

        // Retrieve list of apis from the proto/api directory
        String[] apiFiles = apiDir.list();
        if (apiFiles == null) {
            apiFiles = new String[0];
            log.info("No proto api files found under " + apiDir.getAbsolutePath());
        }
        List<GrpcService> services = new ArrayList<>();
        String packageName = String.format("com.redhat.mercury.%s.%s.client", sdNameCamel.toLowerCase(), version);
        String className = sdNameCamel + "Client";

        // Create object from each api with all naming formats
        for (String file : apiFiles) {
            services.add(new GrpcService(file.split("\\.")[0], sdName, version));
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
                outputDir.getPath(), sdNameCamel.toLowerCase(), version));
        if (!clientDir.exists()) {
            clientDir.mkdirs();
        }
        try (Writer writer = new FileWriter(clientDir.getPath() + "/" + sdNameCamel + "Client.java")) {
            Template template = getTemplate(config, "client_template.ftl");
            template.process(params, writer);
        } catch (IOException | TemplateException e) {
            log.error("Unable to process the GrpcClient template", e);
            throw new MojoExecutionException("Unable to process the GrpcClient template", e);
        }

        File propertiesFile = new File(outputDir, "application.properties");
        try (Writer writer = new FileWriter(propertiesFile)) {
            Template template = getTemplate(config, "client_application_properties.ftl");
            template.process(params, writer);
        } catch (IOException | TemplateException e) {
            log.error("Unable to process the application.properties template", e);
            throw new MojoExecutionException("Unable to process the application.properties template", e);
        }
    }

    private Template getTemplate(Configuration config, String fileName) throws MojoExecutionException {
        try {
            return config.getTemplate(fileName);
        } catch (IOException e) {
            String message = "Unable to get template " + fileName;
            log.error(message, e);
            throw new MojoExecutionException(message, e);
        }
    }

}


