package com.example.ProxiBanque_HH_ZA.dtos;

import com.example.ProxiBanque_HH_ZA.entities.Clients;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConseillerDto {

    private Integer id;
    private String lastname;
    private String firstName;
    private List<Clients> clientList;
}
