package org.prometheus.data.management.domain.graph.endpoint;

public interface DataEndpoint {

    //public void connect();

    void connect();

    void listContent(String path);

}
