import org.apache.camel.builder.RouteBuilder;
import static org.apache.camel.Exchange.HTTP_PATH;
import static org.apache.camel.Exchange.HTTP_METHOD;

public class InternalReporting extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("direct:retrieveCustomerCreditRatingStateInternalReporting")
                .removeHeader("*")
                .setHeader("Accept", constant("application/json"))
                .setHeader(HTTP_METHOD, constant("GET"))
                .removeHeader(HTTP_PATH)
                .toD("http://${env.INTERNAL_CRA_ENDPOINT}/creditratings/${header.sdReferenceId}?bridgeEndpoint=true&throwExceptionOnFailure=false");

        from("direct:captureCustomerCreditRatingStateInternalReportingUpdate")
                .removeHeader("*")
                .setHeader("Content-Type", constant("application/json"))
                .setHeader("Accept", constant("application/json"))
                .setHeader(HTTP_METHOD, constant("PUT"))
                .removeHeader(HTTP_PATH)
                .toD("http://${env.INTERNAL_CRA_ENDPOINT}/creditratings/${header.sdReferenceId}?bridgeEndpoint=true&throwExceptionOnFailure=false");
    }
}