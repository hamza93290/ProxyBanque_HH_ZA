package com.example.ProxiBanque_HH_ZA.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "compteCourant")
@Setter
@Getter
public class CompteCourant extends Compte {

    @Column(name = "decouvert")
    private double decouvert = 1000;

    @JsonIgnore
    @OneToOne
    private Clients client;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "id_carte")
    private Carte carte;
}
