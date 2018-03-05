
package org.prometheus.data.management.core.service;

import com.networknt.health.HealthGetHandler;
import com.networknt.info.ServerInfoGetHandler;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.util.Methods;
import org.prometheus.data.management.core.service.handler.PetsGetHandler;
import org.prometheus.data.management.core.service.handler.PetsPetIdDeleteHandler;
import org.prometheus.data.management.core.service.handler.PetsPetIdGetHandler;
import org.prometheus.data.management.core.service.handler.PetsPostHandler;
import org.prometheus_core.service.file_management.service.handler.PetsGetHandler;
import org.prometheus_core.service.file_management.service.handler.PetsPetIdDeleteHandler;
import org.prometheus_core.service.file_management.service.handler.PetsPetIdGetHandler;
import org.prometheus_core.service.file_management.service.handler.PetsPostHandler;


public class PathHandlerProvider implements HandlerProvider {
    @Override
    public HttpHandler getHandler() {
        return Handlers.routing()
        
            .add(Methods.GET, "/v1/health", new HealthGetHandler())
        
            .add(Methods.GET, "/v1/server/info", new ServerInfoGetHandler())
        
            .add(Methods.POST, "/v1/pets", new PetsPostHandler())
        
            .add(Methods.GET, "/v1/pets", new PetsGetHandler())
        
            .add(Methods.GET, "/v1/pets/{petId}", new PetsPetIdGetHandler())
        
            .add(Methods.DELETE, "/v1/pets/{petId}", new PetsPetIdDeleteHandler())
        
        ;
    }
}
