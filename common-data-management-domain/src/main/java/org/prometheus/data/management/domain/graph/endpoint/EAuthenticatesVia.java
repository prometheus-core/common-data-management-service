package org.prometheus.data.management.domain.graph.endpoint;

import com.syncleus.ferma.AbstractEdgeFrame;
import com.syncleus.ferma.annotations.InVertex;
import com.syncleus.ferma.annotations.OutVertex;
import org.prometheus.data.management.domain.graph.authentication.VAbstractAuthentication;

public abstract class EAuthenticatesVia extends AbstractEdgeFrame {

    @InVertex
    public abstract VAbstractEndpoint getIn();

    @OutVertex
    public abstract VAbstractAuthentication getOut();
}
