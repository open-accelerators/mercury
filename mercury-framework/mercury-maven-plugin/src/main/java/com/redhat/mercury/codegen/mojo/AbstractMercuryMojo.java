package com.redhat.mercury.codegen.mojo;

import java.io.File;
import java.io.IOException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Parameter;

import freemarker.template.Configuration;
import freemarker.template.Template;

public abstract class AbstractMercuryMojo extends AbstractMojo {

    private final Log log = getLog();

    @Parameter(property = "serviceDomainName", defaultValue = "${project.parent.artifactId}", required = true)
    String sdName;

    @Parameter(property = "version", required = true, defaultValue = "${mercury.proto.version}")
    String version;

    @Parameter(property = "outputDir", defaultValue = "${project.build.directory}/generated-sources/mercury", required = true)
    File outputDir;

    protected Template getTemplate(Configuration config, String fileName) throws MojoExecutionException {
        try {
            return config.getTemplate(fileName);
        } catch (IOException e) {
            String message = "Unable to get template " + fileName;
            log.error(message, e);
            throw new MojoExecutionException(message, e);
        }
    }

}


