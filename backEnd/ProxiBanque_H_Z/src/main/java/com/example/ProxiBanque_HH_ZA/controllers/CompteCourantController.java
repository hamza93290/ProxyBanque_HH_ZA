package com.example.ProxiBanque_HH_ZA.controllers;

import com.example.ProxiBanque_HH_ZA.dtos.CompteCourantDto;
import com.example.ProxiBanque_HH_ZA.entities.CompteCourant;
import com.example.ProxiBanque_HH_ZA.services.CompteCourantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("compteCourant")
public class CompteCourantController {

    @Autowired
    private CompteCourantService compteCourantService;


    @GetMapping
    public ResponseEntity<List<CompteCourantDto>> getAllCompteCourant(){
        try {
            return new ResponseEntity<>(compteCourantService.getAllCompte(), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<CompteCourant> savaCompteCourant(@RequestBody CompteCourantDto compteCourantDto){
        try {
            return new ResponseEntity<>(compteCourantService.saveCompte(compteCourantDto), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompteCourant(@PathVariable Long id){
        try {
            compteCourantService.deleteCompte(id);
            return new ResponseEntity<>("Compte courant Supprimé avec succès", HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompteCourant> updateCompteCourant(@PathVariable Long id, @RequestBody CompteCourantDto compteCourantDto){
        try {
            return new ResponseEntity<>(compteCourantService.updateCompte(id,compteCourantDto) , HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
