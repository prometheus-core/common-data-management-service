package org.prometheus.data.management.domain.graph.endpoint;


import io.undertow.security.idm.Credential;
import lombok.Data;

/**
 * Abstract structure defining core fields
 */
@Data
public class AbstractDataEndpoint {

    private String ipAddress;
    private int port;

}
