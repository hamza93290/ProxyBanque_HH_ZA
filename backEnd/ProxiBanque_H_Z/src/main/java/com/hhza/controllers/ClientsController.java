package com.hhza.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hhza.entities.Client;
import com.hhza.services.ClientService;

@RestController
@RequestMapping("clients")
public class ClientsController {
	
	private ClientService service;

	public ClientsController(ClientService service) {
		this.service = service;
	}
	
	@GetMapping()
	Iterable<Client> getClients(){
		
		return service.getAllClients();
	}
	
	
	@PostMapping()
	Client postClient(@RequestBody Client client) {
		return service.save(client);
	}
	
	
	@GetMapping("/{id}")
	Optional<Client> getClientById(@PathVariable Long id){
    	
		return service.getClientById(id);
	}
	
	
	@PutMapping("/{id}")
    ResponseEntity<Client> putClient(@PathVariable Long id , @RequestBody Client client) {
    	
    	return (service.isClientIdExists(id))
    			? new ResponseEntity<>(service.save(client), HttpStatus.OK)
    			: new ResponseEntity<>(service.save(client) , HttpStatus.CREATED);
    }
	
	
	@DeleteMapping("/{id}")
    void  deleteClient(@PathVariable  Long id) {

    	service.deleteClientById(id);
    }
    
	
	

}
