package com.example.ProxiBanque_HH_ZA.services.impl;

import com.example.ProxiBanque_HH_ZA.dtos.CompteCourantDto;
import com.example.ProxiBanque_HH_ZA.entities.CompteCourant;
import com.example.ProxiBanque_HH_ZA.repositories.CompteCourantRepository;
import com.example.ProxiBanque_HH_ZA.services.CompteCourantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CompteCourantServiceImpl implements CompteCourantService {

    @Autowired
    private CompteCourantRepository compteCourantRepository;



    @Override
    public CompteCourantDto toDto(CompteCourant compteCourant) {



        CompteCourantDto compteCourantDto = new CompteCourantDto();
        compteCourantDto.setBalance(compteCourant.getBalance());
        compteCourantDto.setCreateDate(compteCourant.getCreateDate());
        compteCourantDto.setDecouvert(compteCourant.getDecouvert());
        compteCourantDto.setCarte(compteCourant.getCarte());
        compteCourantDto.setClient(compteCourant.getClient());
        compteCourantDto.setAccountNum(compteCourant.getAccountNum());

        return compteCourantDto;

    }

    @Override
    public List<CompteCourantDto> getAllCompte() {

        List<CompteCourantDto> compteCourantDtosList = new ArrayList<>();
        List<CompteCourant> compteCourantList = compteCourantRepository.findAll();
        if (!compteCourantList.isEmpty()){
            for (CompteCourant compteCourant : compteCourantList){
                compteCourantDtosList.add(toDto(compteCourant));
            }
            return compteCourantDtosList;
        } else throw new RuntimeException("Il n'y a pas de CompteCourant");

    }

    @Override
    public CompteCourantDto getCompteById(Long id_compte) {


        CompteCourant compteCourant = compteCourantRepository.findById(id_compte).orElseThrow(
                () -> new RuntimeException("le compte n'existe pas"));

        return toDto(compteCourant);
    }


    @Override
    public CompteCourant saveCompte(CompteCourantDto compte) {

        String uniqueId = UUID.randomUUID().toString().replace("-", "");
        String accountNum = uniqueId.substring(0, 10); // les 10er caractere

        CompteCourant compteCourant = new CompteCourant();

        compteCourant.setAccountNum(accountNum);
        compteCourant.setDecouvert(1000);
        compteCourant.setBalance(compte.getBalance());
        compteCourant.setCreateDate(compte.getCreateDate());
        compteCourant.setClient(compte.getClient());
        compteCourant.setCarte(compte.getCarte());


        return compteCourantRepository.saveAndFlush(compteCourant);
    }

    @Override
    public CompteCourant updateCompte(Long id_compte, CompteCourantDto compte) {

        if (compteCourantRepository.existsById(id_compte)){

            CompteCourant existingCompteCourant = compteCourantRepository.findById(id_compte).get();

            existingCompteCourant.setCarte(compte.getCarte());
            existingCompteCourant.setDecouvert(compte.getDecouvert());
            existingCompteCourant.setBalance(compte.getBalance());

            return  compteCourantRepository.save(existingCompteCourant);

        } else throw new RuntimeException("le compte n'existe pas");

    }

    @Override
    public void deleteCompte(Long id_compte) {
        if (compteCourantRepository.existsById(id_compte)) {
            compteCourantRepository.deleteById(id_compte);
        } else
            throw new RuntimeException("le compte n'existe pas");

    }

}

