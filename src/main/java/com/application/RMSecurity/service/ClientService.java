package com.application.RMSecurity.service;

import com.application.RMSecurity.entity.ClientData;
import com.application.RMSecurity.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService implements IClientService{
    @Autowired
    private IClientRepository clientRepository;
    @Override
    public List<ClientData> getClient(int id) {
        List<Integer> ids = new ArrayList<>();
        ids.add(id);
        return clientRepository.findAllById(ids);
    }
}
