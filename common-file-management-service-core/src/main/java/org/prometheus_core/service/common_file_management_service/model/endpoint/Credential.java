package org.prometheus_core.service.common_file_management_service.model.endpoint;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Credential{

    private String domain;
    private String userName;
    private String password;

}