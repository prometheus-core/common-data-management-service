package org.prometheus.data.management.domain.graph.authentication.graph.authentication;

import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.apache.tinkerpop.gremlin.structure.Graph;
import com.syncleus.ferma.AbstractVertexFrame;
import com.syncleus.ferma.DelegatingFramedGraph;
import com.syncleus.ferma.FramedGraph;
import com.syncleus.ferma.annotations.Adjacency;
import com.syncleus.ferma.annotations.Incidence;
import com.syncleus.ferma.annotations.Property;

import org.junit.Test;
import org.prometheus.data.management.domain.graph.authentication.EProvidesAuthenticationTo;
import org.prometheus.data.management.domain.graph.authentication.VAbstractAuthentication;
import org.prometheus.data.management.domain.graph.endpoint.EAuthenticatesVia;
import org.prometheus.data.management.domain.graph.endpoint.Protocol;
import org.prometheus.data.management.domain.graph.endpoint.VAbstractEndpoint;
import org.prometheus.data.management.domain.graph.endpoint.VCifsEndpoint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VAbstractAuthenticationTest {

    @Test
    public void testAuthenticationVetex(){
        Set<Class<?>> types = new HashSet<Class<?>>(Arrays.asList(new Class<?>[]{
                VAbstractEndpoint.class,
                VCifsEndpoint.class,
                EAuthenticatesVia.class}));
        Graph graph = TinkerGraph.open();

        //implies annotated mode
        FramedGraph fg = new DelegatingFramedGraph(graph, true, types);

        VAbstractEndpoint someEndpoint = fg.addFramedVertex(VCifsEndpoint.class);
        someEndpoint.setProtocol(Protocol.CIFS);

        VAbstractAuthentication authentication = fg.addFramedVertex(VAbstractAuthentication.class);
        authentication.setUserName("Ladislav");
        someEndpoint.addAuthenticateVia(authentication);




    }





}