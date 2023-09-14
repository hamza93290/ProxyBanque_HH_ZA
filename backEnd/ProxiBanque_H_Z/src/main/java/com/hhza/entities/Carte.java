package com.hhza.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Carte {
	@Id
	@GeneratedValue
	private Long id;
	private String typeDeCarte;
	
	
	public Carte() {
	}


	public Carte(Long id, String typeDeCarte) {
		this.id = id;
		this.typeDeCarte = typeDeCarte;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTypeDeCarte() {
		return typeDeCarte;
	}


	public void setTypeDeCarte(String typeDeCarte) {
		this.typeDeCarte = typeDeCarte;
	}


	@Override
	public String toString() {
		return "Carte [id=" + id + ", typeDeCarte=" + typeDeCarte + "]";
	}
	
	
	
	
	

}
