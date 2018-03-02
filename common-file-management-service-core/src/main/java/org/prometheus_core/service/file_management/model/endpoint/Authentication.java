package org.prometheus_core.service.file_management.model.endpoint;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Authentication{

    private String domain;
    private String userName;
    private String password;


}