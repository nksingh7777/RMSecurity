package com.application.RMSecurity.repository;

import com.application.RMSecurity.entity.ClientData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<ClientData, Integer> {
}
