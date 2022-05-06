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

import com.redhat.mercury.codegen.model.MessagingService;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import static com.redhat.mercury.codegen.utils.NamingUtils.*;
import static com.redhat.mercury.codegen.utils.NamingUtils.toPackageName;


/**
 * This Mojo generates Common Model constants for gRPC and Messaging for all APIs available in the service domain
 */
@Mojo(name = "CommonModel", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class CommonModelMojo extends AbstractMercuryMojo {

    private final Log log = getLog();

    @Override
    public void execute() throws MojoExecutionException {
        String sdNameCamel = toCamelCase(sdName.replace("-", " "));

        // Retrieve list of apis from the proto/api directory
        String[] apiFiles = apiDir.list();
        if (apiFiles == null) {
            apiFiles = new String[0];
            log.info("No proto api files found under " + apiDir.getAbsolutePath());
        }
        List<MessagingService> services = new ArrayList<>();
        String packageName = String.format("com.redhat.mercury.%s", toPackageName(sdName));

        // Create object from each api with all naming formats
        for (String file : apiFiles) {
            services.add(new MessagingService(sdName, file.split("\\.")[0]));
        }

        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setClassLoaderForTemplateLoading(this.getClass().getClassLoader(), "/");
        Map<String, Object> params = new HashMap<>();
        params.put("packageName", packageName);
        params.put("className", sdNameCamel);
        params.put("services", services);
        params.put("domainName", toPackageName(sdName));
        params.put("domainNameUpperCase", toUpperCase(sdName));

        File clientDir = new File(String.format("%s/com/redhat/mercury/%s",
                outputDir.getPath(), sdNameCamel.toLowerCase()));
        if (!clientDir.exists()) {
            clientDir.mkdirs();
        }
        try (Writer writer = new FileWriter(clientDir.getPath() + "/" + sdNameCamel + ".java")) {
            Template template = getTemplate(config, "common/constants.ftl");
            template.process(params, writer);
        } catch (IOException | TemplateException e) {
            log.error("Unable to process the Service Domain constants template", e);
            throw new MojoExecutionException("Unable to process the Service Domain constants template", e);
        }
    }

}


