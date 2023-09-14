package com.example.ProxiBanque_HH_ZA.dtos;

import com.example.ProxiBanque_HH_ZA.entities.Carte;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CompteCourantDto {

    private Long id;

    private String accountNum;

    private double balance;

    private LocalDate createDate;

    private double decouvert = 1000;

    //private Long id_client;

   // private  Long id_carte;

   private Clients client;
   private Carte carte;
}
