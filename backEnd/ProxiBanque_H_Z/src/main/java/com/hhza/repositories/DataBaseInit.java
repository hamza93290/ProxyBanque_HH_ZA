package com.hhza.repositories;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataBaseInit {
	
	private ClientRepository dao;

	public DataBaseInit(ClientRepository dao) {
		this.dao = dao;
	}
	
	@PostConstruct
    public void initDB() {
    }

}
