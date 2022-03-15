package com.application.RMSecurity.service;

import com.application.RMSecurity.entity.ClientData;

import java.util.List;

public interface IClientService {
    List<ClientData> getClient(int id);
}
