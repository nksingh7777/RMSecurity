package com.application.RMSecurity.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class ClientQueryGraphql implements GraphQLQueryResolver {
    public String helloWorld(){
        return "hello world";
    }
}
