package com.example.ProxiBanque_HH_ZA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carte")
@Setter
@Getter

public class Carte {

    public enum TypeDeCarte {
        VISA_ELECTRON, VISA_PREMIER;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING) // Map the enum as a string in the database
    private TypeDeCarte typeDeCarte;

    @OneToOne(mappedBy = "carte", cascade = { CascadeType.PERSIST })
    CompteCourant compteCourant;
}
