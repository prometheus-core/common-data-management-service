package org.prometheus_core.service.file_management.model.endpoint;


import lombok.Data;

/**
 * Abstract structure defining core fields
 */
@Data
public class AbstractDataEndpoint {

    private String ipAddress;
    private int port;
    private Credential credential;
}
