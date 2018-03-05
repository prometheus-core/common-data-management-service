package org.prometheus.data.management.domain.graph.authentication;


import com.syncleus.ferma.AbstractVertexFrame;
import com.syncleus.ferma.annotations.Adjacency;
import com.syncleus.ferma.annotations.Incidence;
import com.syncleus.ferma.annotations.Property;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public abstract class VAuthentication extends AbstractVertexFrame {

    @Property("userName")
    public abstract String getUserName();

    @Property("userName")
    public abstract void setUserName(String userName);

    @Adjacency(label = "knows")
    public abstract List<Person> getKnowsPeople();

    @Incidence(label = "knows")
    public abstract List<Knows> getKnows();

    @Incidence(label = "knows")
    public abstract Knows addKnows(Person friend);

    public List<? extends Person> getFriendsNamedBill() {
        return this.traverse(input -> input.out("knows").has("name", "bill")).toList(Person.class);
    }





}