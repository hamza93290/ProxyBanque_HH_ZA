package com.example.ProxiBanque_HH_ZA.services;

import com.example.ProxiBanque_HH_ZA.dtos.CompteCourantDto;
import com.example.ProxiBanque_HH_ZA.dtos.ConseillerDto;
import com.example.ProxiBanque_HH_ZA.entities.CompteCourant;
import com.example.ProxiBanque_HH_ZA.entities.Conseiller;

import java.util.List;

public interface CompteCourantService {

    CompteCourantDto toDto(CompteCourant compteCourant);

    List<CompteCourantDto> getAllCompte();

    CompteCourantDto getCompteById(Long id_compte) ;

    CompteCourant saveCompte(CompteCourantDto compte);

    //CompteCourantDTO createCompteWithClientAndCarte(CreateCompteCourantDTO createCompteCourantDTO) throws GeneralException;

    CompteCourant updateCompte(Long compteId, CompteCourantDto compte);

    void deleteCompte(Long compteId) ;

}
