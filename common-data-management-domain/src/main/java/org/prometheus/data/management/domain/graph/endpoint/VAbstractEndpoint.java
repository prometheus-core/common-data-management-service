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
    public abstract void setProtocol(Protocol protocol);

    @Adjacency(label = "AUTHENTICATES_VIA")
    public abstract List<VAbstractAuthentication> getAuthenticateViaAuthentications();

    @Incidence(label = "AUTHENTICATES_VIA")
    public abstract List<EAuthenticatesVia> getAuthenticatesVia();

    @Incidence(label = "AUTHENTICATES_VIA")
    public abstract EAuthenticatesVia addAuthenticateVia(VAbstractAuthentication authentication);

    public List<? extends VAbstractEndpoint> getAuthenticationsWithUserNamesLadislav() {
        return this.traverse(input -> input.out("AUTHENTICATES_VIA").has("userName", "Ladislav")).toList(VAbstractEndpoint.class);
    }

}
