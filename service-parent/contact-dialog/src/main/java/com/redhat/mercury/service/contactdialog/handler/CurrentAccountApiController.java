package com.redhat.mercury.service.contactdialog.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-08T13:28:59.780-04:00[America/New_York]")

@Controller
@RequestMapping("${openapi.currentAccountv2.base-path:/sd-current-account/current-accountv2}")
public class CurrentAccountApiController implements CurrentAccountApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CurrentAccountApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
