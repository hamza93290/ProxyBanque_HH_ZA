package com.example.ProxiBanque_HH_ZA.services;

import com.example.ProxiBanque_HH_ZA.dtos.CompteCourantDto;
import com.example.ProxiBanque_HH_ZA.dtos.CompteEpargneDto;
import com.example.ProxiBanque_HH_ZA.entities.CompteCourant;
import com.example.ProxiBanque_HH_ZA.entities.CompteEpargne;

import java.util.List;

public interface CompteEpargneService {

    CompteEpargneDto toDto(CompteEpargne compteEpargne);

    List<CompteEpargneDto> getAllCompte();

    CompteEpargneDto getCompteById(Long compteId) ;

    CompteEpargne saveCompte(CompteEpargneDto compte);

    CompteEpargne updateCompte(Long compteId, CompteEpargneDto compte) ;

    void deleteCompte(Long compteId) ;
}
