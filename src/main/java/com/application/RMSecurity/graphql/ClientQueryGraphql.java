package com.application.RMSecurity.graphql;

import com.application.RMSecurity.model.Client;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class ClientQueryGraphql implements GraphQLQueryResolver {
    public String helloWorld(){
        return "hello world";
    }
    public Client getClient(){
        Client c = new Client();
        c.setClientName("Nikesh");
        c.setClientID("i745343");
        c.setAddress("kings and queens PG");
        return c;
    }
}
