package ${package}.${sdNameLowerCase}.services.test;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.mockito.Mockito;

import ${package}.${sdNameLowerCase}.services.${sdName}Service;

import io.quarkus.arc.profile.IfBuildProfile;

public class ${sdName}ServiceMockProvider {

    @Produces
    @IfBuildProfile("test")
    @ApplicationScoped
            ${sdName}Service get${sdName}Service() {
        return Mockito.mock(${sdName}Service.class);
    }
}
