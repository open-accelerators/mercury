package ${package}.${sdNameLowerCase}.services.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import ${package}.${sdNameLowerCase}.services.${sdName}Service;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

@ApplicationScoped
public class ${sdName}ServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    ${sdName}Service getService() {
        return Arc.container().select(${sdName}Service.class).get();
    }

}
