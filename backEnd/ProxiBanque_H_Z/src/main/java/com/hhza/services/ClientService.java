package com.hhza.services;

import java.util.List;
import java.util.Optional;

import com.hhza.entities.Client;

public interface ClientService {
	
	List<Client> getAllClients();
	List<Client> getClientsByNme(String name);
	Client save(Client c);
	Optional<Client> getClientById(Long id);
	void deleteClientById(Long id);
	Client updateClient(Client c);
	boolean isClientIdExists(Long id);
	

}
