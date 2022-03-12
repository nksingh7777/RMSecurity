package com.application.RMSecurity.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Client {
    public String address;
    public String clientName;
    public String ClientID;
    public String gst;
    public String onBoardDate;
}