package com.hhza.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.hhza.entities.Client;
import com.hhza.repositories.ClientRepository;

@Service
public class ServiceImple implements ClientService {
	
	private ClientRepository clientRepository;
	
	

	public ServiceImple(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public List<Client> getClientsByNme(String name) {
		return null;
	}

	@Override
	public Client save(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public Optional<Client> getClientById(Long id) {
		return clientRepository.findById(id);
	}

	@Override
	public void deleteClientById(Long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client c) {
		return clientRepository.save(c);
	}

	@Override
	public boolean isClientIdExists(Long id) {
		return clientRepository.existsById(id);
	}
	
	
	
	
	
	
	
	
	
	

}
