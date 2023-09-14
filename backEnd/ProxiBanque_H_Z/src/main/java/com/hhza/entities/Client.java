package com.hhza.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private int codePostal;
	private String telephone; 
	
//	
//	@JsonIgnore
//	@ManyToOne(cascade = { CascadeType.PERSIST })
//	@JoinColumn(name = "conseiller_id")
//	private Conseiller conseiller;
//	
//	
//	@JsonIgnore
//	@OneToMany(cascade = { CascadeType.PERSIST })
//	@JoinColumn(name = "compte_id")
//	private Compte compte;
	
	
	public Client() {
	}


	public Client(Long id, String nom, String prenom, String adresse, String ville, int codePostal, String telephone) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone = telephone;
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


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Override
	public String toString() {
		return "Clients [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", codePostal=" + codePostal + ", telephone=" + telephone + "]";
	}


	public void setConseiller(Conseiller conseiller) {
		
	}
	
	
	
	
	
}
