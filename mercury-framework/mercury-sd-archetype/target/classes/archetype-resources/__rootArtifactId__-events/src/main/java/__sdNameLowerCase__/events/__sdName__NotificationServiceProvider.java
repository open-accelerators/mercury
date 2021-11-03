package ${package}.${sdNameLowerCase}.events;

import javax.enterprise.inject.Produces;

import ${package}.${sdNameLowerCase}.services.${sdName}NotificationService;

import io.quarkus.arc.Arc;
import io.quarkus.arc.DefaultBean;

public class ${sdName}NotificationServiceProvider {

    /**
     * Class to allow this package compilation as any real service will be implemented
     * in other projects depending on this one.
     */
    @Produces
    @DefaultBean
    ${sdName}NotificationService getService() {
        return Arc.container().select(${sdName}NotificationService.class).get();
    }

}
