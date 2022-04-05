package com.redhat.mercury;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.google.inject.Inject;
import com.redhat.mercury.model.FuntionalPattern;
import com.redhat.mercury.resources.StringFormatter;


/**
 * This service generates a gRPC client connection for all APIs available in the service domain
 */
@Mojo(name = "GrpcService")
public class GrpcService extends AbstractMojo {

    @Inject
    StringFormatter formatter;

    @Parameter(property = "serviceDomainName", required = true)
    private String sdName;

    @Parameter(property = "version", required = false, defaultValue = "v10")
    private String version;

    @Parameter(property = "port", required = false, defaultValue = "9000")
    private String port;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {

        BufferedWriter clientBw = null;
        BufferedWriter propertiesBw = null;

        try {

            String sdNameCamel = formatter.capitalizeWord(sdName.replace("-", " "));

            // Retrieve list of apis from the proto/api directory
            String[] apiFiles = new File(String.format("service-domains/%s/%s-common/src/main/proto/%s/api",
                                                       sdName, sdName, version)).list();
            List<FuntionalPattern> FuntionalPatterns = new ArrayList<FuntionalPattern>();

            // Create object from each api with all naming formats
            for (String file : apiFiles) {
                FuntionalPatterns.add(new FuntionalPattern(file.split("\\.")[0], sdName));
            }

            // Create service domain client java file content
            String data = String.format("package com.redhat.mercury.%s.%s.client;\n" +
                                        "\n" +
                                        "import javax.enterprise.context.ApplicationScoped;\n" +
                                        "\n",
                                        sdNameCamel.toLowerCase(), version);

            for (FuntionalPattern fp : FuntionalPatterns) {
                data += String.format("import com.redhat.mercury.%s.%s.api.%s.%s;\n",
                                      sdNameCamel.toLowerCase(), version, fp.getFirstCap().toLowerCase(), fp.getFirstCap());
            }

            data += String.format("\n" +
                                  "import io.quarkus.grpc.GrpcClient;\n" +
                                  "\n" +
                                  "@ApplicationScoped\n" +
                                  "public class %sClient {\n" +
                                  "\n",
                                  sdNameCamel);

            for (FuntionalPattern fp : FuntionalPatterns) {
                data += String.format("    @GrpcClient(\"%s\")\n" +
                                      "    %s %s;\n" +
                                      "\n",
                                      fp.getWithSD(), fp.getFirstCap(), fp.getFirstNotCap());
            }

            for (FuntionalPattern fp : FuntionalPatterns) {
                data += String.format("    public %s %s() {\n" +
                                      "        return %s;\n" +
                                      "    }\n" +
                                      "\n",
                                      fp.getFirstCap(), fp.getWithGet(), fp.getFirstNotCap());
            }

            data += "}";

            // Create service domain client file in target directory
            File clientDir = new File(String.format("service-domains/%s/%s-client/target/classes/com/redhat/mercury/%s/%s/client",
                                                    sdName, sdName, sdNameCamel.toLowerCase(), version));
            File clientFile = new File(clientDir, sdNameCamel+"Client.java");
            FileWriter clientFw = new FileWriter(clientFile,false);
            clientBw = new BufferedWriter(clientFw);
            clientBw.write(data);

            // Create service domain application.properties file content
            String properties = "";
            for (FuntionalPattern fp : FuntionalPatterns) {
                properties += String.format("quarkus.grpc.clients.%s.host=${mercury.%s.service.host:%s}\n" +
                                "quarkus.grpc.clients.%s.port=${mercury.%s.service.port:%s}\n",
                        fp.getWithSD(), sdName, sdName, fp.getWithSD(), sdName, port);
            }

            // Create service domain application.properties file in target directory
            File propertiesDir = new File(String.format("service-domains/%s/%s-client/target/classes",
                                                        sdName, sdName));
            File propertiesFile = new File(propertiesDir, "application.properties");
            FileWriter propertiesFw = new FileWriter(propertiesFile,false);
            propertiesBw = new BufferedWriter(propertiesFw);
            propertiesBw.write(properties);

        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (clientBw != null) {
                    clientBw.close();
                }
                if (propertiesBw != null) {
                    propertiesBw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
