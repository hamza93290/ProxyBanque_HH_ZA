package com.hhza.entities;

import java.util.ArrayList;
import java.util.List;

import com.hhza.entities.Client;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Conseiller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	 @OneToMany(mappedBy = "conseiller", cascade = CascadeType.PERSIST)
	 private List<Client> clients = new ArrayList<>();
	
	 
	 public Conseiller() {
	}


	public Conseiller(Long id, String nom, String prenom, List<Client> clients) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.clients = clients;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", clients=" + clients + "]";
	}
	
	
	
	

}
	 
	 
	


