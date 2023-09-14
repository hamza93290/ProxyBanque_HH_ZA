package com.example.ProxiBanque_HH_ZA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

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

    @Column(name = "balance")
    private double balance;

    @Column(name = "createDate")
    private LocalDate createDate;


}
