
package org.prometheus_core.service.common_file_management.service.handler;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

public class PetsPetIdGetHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
             exchange.getResponseSender().send("{\"id\":1,\"name\":\"Jessica Right\",\"tag\":\"pet\"}");
        
    }
}
