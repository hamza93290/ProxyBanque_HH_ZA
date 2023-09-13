package com.example.ProxiBanque_HH_ZA.dtos;

import com.example.ProxiBanque_HH_ZA.entities.Conseiller;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientsDto {

    private Long id;
    private String name;
    private String firstName;
    private String adress;
    private int zipCode;
    private String city;
    private String phoneNumber;
    private Conseiller conseiller;
}
