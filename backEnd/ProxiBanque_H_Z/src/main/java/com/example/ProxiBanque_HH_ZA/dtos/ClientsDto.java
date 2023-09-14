package com.example.ProxiBanque_HH_ZA.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientsDto {

    private Long id;
    private String name;
    private String firstName;
    private String address;
    private Long zipCode;
    private String city;
    private String phoneNumber;
    private Long id_conseiller;
    //private Conseiller conseiller;
}
