package com.example.ProxiBanque_HH_ZA.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "zipcode")
    private Long zipcode;
    @Column(name = "phonenumber")
    private String phonenumber;

    @OneToOne(cascade = { CascadeType.REMOVE, CascadeType.PERSIST })
    @JoinColumn(name = "compteCourant_id")
    private CompteCourant compteCourant;

    @OneToOne(cascade = { CascadeType.REMOVE, CascadeType.PERSIST })
    @JoinColumn(name = "compteEpargne_id")
    private CompteEpargne compteEpargne;

    @ManyToOne
    @JoinColumn(name = "id_conseiller")
    private Conseiller conseiller;
}
