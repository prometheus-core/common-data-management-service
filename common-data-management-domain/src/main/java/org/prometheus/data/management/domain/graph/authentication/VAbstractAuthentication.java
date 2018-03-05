package org.prometheus.data.management.domain.graph.authentication;


import com.syncleus.ferma.AbstractVertexFrame;
import com.syncleus.ferma.annotations.Adjacency;
import com.syncleus.ferma.annotations.Incidence;
import com.syncleus.ferma.annotations.Property;
import lombok.Builder;
import lombok.Data;
import org.prometheus.data.management.domain.graph.endpoint.VAbstractEndpoint;

import java.util.List;

public abstract class VAbstractAuthentication extends AbstractVertexFrame {

    @Property("userName")
    public abstract String getUserName();

    @Property("userName")
    public abstract void setUserName(String userName);

    @Adjacency(label = "PROVIDES_AUTHENTICATION_TO")
    public abstract List<VAbstractEndpoint> getProvidesAuthenticationToEndpoints();

    @Incidence(label = "PROVIDES_AUTHENTICATION_TO")
    public abstract List<EProvidesAuthenticationTo> getProvidesAuthenticationTo();

    @Incidence(label = "PROVIDES_AUTHENTICATION_TO")
    public abstract EProvidesAuthenticationTo addProvidesAuthenticationTo(VAbstractEndpoint endpoint);

    public List<? extends VAbstractEndpoint> getEndpointsNamedZDrive() {
        return this.traverse(input -> input.out("PROVIDES_AUTHENTICATION_TO").has("label", "ZDrive")).toList(VAbstractEndpoint.class);
    }





}