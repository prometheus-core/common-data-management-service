package org.prometheus.data.management.core.persitency;

import org.neo4j.driver.v1.*;

public class PersistenceFactory {

    public static void some(){
        Driver driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "neo4j" ) );

        try ( Session session = driver.session() )
        {
            StatementResult rs = session.run( "CREATE (n) RETURN n" );
        }

        driver.close();
    }
}
