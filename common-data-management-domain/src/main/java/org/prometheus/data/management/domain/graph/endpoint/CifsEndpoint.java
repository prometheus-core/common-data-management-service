package org.prometheus.data.management.domain.graph.endpoint;


import lombok.Data;

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

@Data
public class CifsEndpoint
        extends AbstractDataEndpoint
        implements DataEndpoint{



}
