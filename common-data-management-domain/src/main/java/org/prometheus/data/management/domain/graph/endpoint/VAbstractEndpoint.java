package org.prometheus.data.management.domain.graph.endpoint;


import com.syncleus.ferma.AbstractVertexFrame;
import com.syncleus.ferma.annotations.Adjacency;
import com.syncleus.ferma.annotations.Incidence;
import com.syncleus.ferma.annotations.Property;
import io.undertow.security.idm.Credential;
import lombok.Data;
import org.prometheus.data.management.domain.graph.authentication.EProvidesAuthenticationTo;
import org.prometheus.data.management.domain.graph.authentication.VAbstractAuthentication;

import java.util.List;

/**
 * Abstract structure defining core fields
 */
@Data
public abstract class VAbstractEndpoint extends AbstractVertexFrame {

    @Property("protocol")
    public abstract Protocol getProtocol();

    @Property("protocol")
    public void setProtocol(Protocol protocol){setProperty("protocol",protocol);};

    @Adjacency(label = "AUTHENTICATE_VIA")
    public List<VAbstractAuthentication> getAuthenticateViaAuthentications(){

    };

    @Incidence(label = "AUTHENTICATE_VIA")
    public List<EAuthenticatesVia> getAuthenticatesVia(){
        return traverse((v) -> v.outE("AUTHENTICATE_VIA")).toList(Knows.class);
    };

    @Incidence(label = "AUTHENTICATE_VIA")
    public EAuthenticatesVia addAuthenticateVia(VAbstractEndpoint endpoint){
        return addFramedEdge("AUTHENTICATE_VIA", endpoint, EAuthenticatesVia.class);
    };

    public List<? extends VAbstractEndpoint> getAuthenticationsWithUserNamesLadislav() {
        return this.traverse(input -> input.out("AUTHENTICATE_VIA").has("userName", "Ladislav")).toList(VAbstractEndpoint.class);
    }

}
