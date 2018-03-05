
package org.prometheus.data.management.core.service.handler;

import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

public class PetPetIdGetHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
             exchange.getResponseSender().send(" {\n                \"photoUrls\" : [ \"aeiou\" ],\n                \"name\" : \"doggie\",\n                \"id\" : 123456789,\n                \"category\" : {\n                  \"name\" : \"aeiou\",\n                  \"id\" : 123456789\n                },\n                \"tags\" : [\n                  {\n                    \"name\" : \"aeiou\",\n                    \"id\" : 123456789\n                  }\n                ],\n                \"status\" : \"aeiou\"\n              }");
        
    }
}
