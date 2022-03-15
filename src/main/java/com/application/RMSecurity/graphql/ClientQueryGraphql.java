package com.application.RMSecurity.graphql;

import com.application.RMSecurity.entity.ClientData;
import com.application.RMSecurity.model.Client;
import com.application.RMSecurity.service.IClientService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientQueryGraphql implements GraphQLQueryResolver {
    @Autowired
    private IClientService clientService;

    public String helloWorld(){
        return "hello world";
    }
    public Client getClient(int id){
        ClientData clientData = clientService.getClient(id).get(0);
        System.out.println(clientData);
        Client c = new Client();
        c.setClientName("Nikesh");
        c.setClientID("i745343");
        c.setAddress(clientData.toString());
        return c;
    }

}
