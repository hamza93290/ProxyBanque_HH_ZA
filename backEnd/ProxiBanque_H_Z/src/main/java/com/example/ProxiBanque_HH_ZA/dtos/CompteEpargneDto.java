package com.example.ProxiBanque_HH_ZA.dtos;

import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CompteEpargneDto {

    private Long id;

    private String accountNum;

    private double balance;

    private LocalDate createDate;

    private double tauxRemuneration = 0.3;

    Clients client;
}
