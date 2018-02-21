
package org.prometheus_core.service.common_file_management_service.service.handler;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class UserLoginGetHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        
            exchange.endExchange();
        
    }
}
