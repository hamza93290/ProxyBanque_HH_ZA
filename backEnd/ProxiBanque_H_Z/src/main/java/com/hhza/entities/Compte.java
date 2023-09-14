package com.hhza.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	private Double solde;
	private Date dateDeCreation;

	public Compte() {

	}

	public Compte(Long id, String numero, Double solde, Date dateDeCreation) {
		this.id = id;
		this.numero = numero;
		this.solde = solde;
		this.dateDeCreation = dateDeCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Date getDateDeCreation() {
		return dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + ", dateDeCreation=" + dateDeCreation
				+ "]";
	}
	
	
	
	

}
