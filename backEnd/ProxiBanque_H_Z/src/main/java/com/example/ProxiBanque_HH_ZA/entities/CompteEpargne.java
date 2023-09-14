package com.example.ProxiBanque_HH_ZA.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "compteEpargne")
@Setter
@Getter
public class CompteEpargne extends Compte{

    @Column(name = "tauxRemuneration")
    private double tauxRemuneration = 0.3;

    @JsonIgnore
    @OneToOne
    Clients client;
}
