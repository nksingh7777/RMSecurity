package com.application.RMSecurity.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="CLIENT_DATA")
public class ClientData {
    @Id
    @Column(name="CLIENT_ID")
    int clientId;

    @Column(name="NAME")
    String name;

    @Column(name="ADDRESS")
    String address;

    @Column(name="GST")
    String gst;

    @Column(name="ACTIVE")
    boolean active;

}
