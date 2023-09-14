package com.example.ProxiBanque_HH_ZA.controllers;

import com.example.ProxiBanque_HH_ZA.dtos.ClientsDto;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.example.ProxiBanque_HH_ZA.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/clients")
public class ClientsController {


    @Autowired
    private ClientsService  clientServices;

    @GetMapping
    public ResponseEntity<List<Clients>> getAllClient(){
        try {
            return new ResponseEntity<>(clientServices.getAllClients(), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<Clients> postClient(@RequestBody ClientsDto client){
        try {
            return new ResponseEntity<>(clientServices.saveClient(client), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clients> updateClient(@PathVariable Long id, @RequestBody ClientsDto client){
        try {
            return new ResponseEntity<>(clientServices.updateClient(id, client), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id){
        try {
            clientServices.deleteClientById(id);
            return new ResponseEntity<>("Le client a été supprimé avec succès", HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }

}
