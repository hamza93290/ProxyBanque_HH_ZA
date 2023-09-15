package com.example.ProxiBanque_HH_ZA.dtos;

import com.example.ProxiBanque_HH_ZA.entities.Carte;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CompteCourantDto {

    private Long id;

    private String accountNum;

    private double solde;

    private LocalDate createDate;

    private double decouvert = 1000;

    //private Long id_client;

   // private  Long id_carte;

   private Clients client;
   private Carte carte;
}
