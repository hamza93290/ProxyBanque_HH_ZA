package com.example.ProxiBanque_HH_ZA.controllers;


import com.example.ProxiBanque_HH_ZA.dtos.CompteEpargneDto;
import com.example.ProxiBanque_HH_ZA.entities.CompteEpargne;
import com.example.ProxiBanque_HH_ZA.services.CompteEpargneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("compteEpargne")
public class CompteEpargneController {

    @Autowired
    private CompteEpargneService compteEpargneService;


    @GetMapping
    public ResponseEntity<List<CompteEpargneDto>> getAllCompteEpargne(){
        try {
            return new ResponseEntity<>(compteEpargneService.getAllCompte(), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<CompteEpargne> savaCompteEpargne(@RequestBody CompteEpargneDto compteEpargneDto ){
        try {
            return new ResponseEntity<>(compteEpargneService.saveCompte(compteEpargneDto), HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompteEpargne(@PathVariable Long id){
        try {
            compteEpargneService.deleteCompte(id);
            return new ResponseEntity<>("Compte epargne a  etait Supprimé avec succès", HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompteEpargne> updateCompteEpargne(@PathVariable Long id, @RequestBody CompteEpargneDto compteEpargneDto){
        try {
            return new ResponseEntity<>(compteEpargneService.updateCompte(id,compteEpargneDto) , HttpStatus.OK);
        } catch (RuntimeException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

}
