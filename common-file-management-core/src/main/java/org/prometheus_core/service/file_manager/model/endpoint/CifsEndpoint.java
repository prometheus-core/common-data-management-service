package org.prometheus_core.service.file_manager.model.endpoint;


import sun.security.x509.IPAddressName;

/**
 * I would like to see here some generic concept
 * of building real endpoints with respect of
 * future extendibility for:
 * FTP
 * SFTP
 * AMQP
 *
 * i WOULD LIKE TO SEE HERE FACTORY PATTERN MAYBE
 *
 */
public class CifsEndpoint
        extends AbstractDataEndpoint
        implements DataEndpoint{


    @Override
    public void dummy() {

    }
}
