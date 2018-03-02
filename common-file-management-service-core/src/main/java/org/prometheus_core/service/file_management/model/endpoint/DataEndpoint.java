package org.prometheus_core.service.file_management.model.endpoint;

public interface DataEndpoint {

    //public void connect();

    void connect();

    void listContent(String path);

}
