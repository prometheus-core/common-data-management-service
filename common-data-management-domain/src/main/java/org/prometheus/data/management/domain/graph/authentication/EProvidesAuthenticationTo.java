package org.prometheus.data.management.domain.graph.authentication;

import com.syncleus.ferma.AbstractEdgeFrame;
import com.syncleus.ferma.annotations.InVertex;
import com.syncleus.ferma.annotations.OutVertex;
import org.prometheus.data.management.domain.graph.endpoint.VAbstractEndpoint;

public abstract class EProvidesAuthenticationTo extends AbstractEdgeFrame {

    @InVertex
    public abstract VAbstractAuthentication getIn();

    @OutVertex
    public abstract VAbstractEndpoint getOut();
}
