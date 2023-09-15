package com.example.ProxiBanque_HH_ZA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@MappedSuperclass
public abstract class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "accountNum")
    private String accountNum;

    @Column(name = "solde")
    private double solde;

    @Column(name = "createDate")
    private LocalDate createDate;


}
