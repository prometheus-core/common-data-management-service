
package org.prometheus_core.service.common_file_management.service.handler;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class StoreOrderPostHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        
            exchange.endExchange();
        
    }
}
