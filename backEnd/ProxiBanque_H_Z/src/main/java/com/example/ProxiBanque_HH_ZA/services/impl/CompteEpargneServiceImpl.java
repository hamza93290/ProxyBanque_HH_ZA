package com.example.ProxiBanque_HH_ZA.services.impl;


import com.example.ProxiBanque_HH_ZA.dtos.CompteEpargneDto;
import com.example.ProxiBanque_HH_ZA.entities.CompteEpargne;
import com.example.ProxiBanque_HH_ZA.repositories.CompteEpargneRepository;
import com.example.ProxiBanque_HH_ZA.services.CompteEpargneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CompteEpargneServiceImpl implements CompteEpargneService {

    @Autowired
    private CompteEpargneRepository compteEpargneRepository;

    @Override
    public CompteEpargneDto toDto(CompteEpargne compteEpargne) {

        CompteEpargneDto compteEpargneDto = new CompteEpargneDto();
        compteEpargneDto.setSolde(compteEpargne.getSolde());
        compteEpargneDto.setCreateDate(compteEpargne.getCreateDate());
        compteEpargneDto.setAccountNum(compteEpargne.getAccountNum());
        compteEpargneDto.setTauxRemuneration(compteEpargne.getTauxRemuneration());

        return compteEpargneDto;
    }

    @Override
    public List<CompteEpargneDto> getAllCompte() {

        List<CompteEpargneDto> compteEpargneDtosList = new ArrayList<>();
        List<CompteEpargne> compteEpargneList = compteEpargneRepository.findAll();
        if (!compteEpargneList.isEmpty()){
            for (CompteEpargne compteEpargne : compteEpargneList){
                compteEpargneDtosList.add(toDto(compteEpargne));
            }
            return compteEpargneDtosList;
        } else throw new RuntimeException("Il n'y a pas de Compte Epargne");

    }


    @Override
    public CompteEpargneDto getCompteById(Long id_compte) {

        CompteEpargne  compteEpargne = compteEpargneRepository.findById(id_compte).orElseThrow(
                () -> new RuntimeException("le compte n'existe pas"));

        return toDto(compteEpargne);
    }


    @Override
    public CompteEpargne saveCompte(CompteEpargneDto compte) {

        String uniqueId = UUID.randomUUID().toString().replace("-", "");
        String accountNum = uniqueId.substring(0, 10); // les 10er caractere

        CompteEpargne compteEpargne = new CompteEpargne();

        compteEpargne.setAccountNum(accountNum);
        compteEpargne.setSolde(compte.getSolde());
        compteEpargne.setCreateDate(compte.getCreateDate());
        compteEpargne.setTauxRemuneration(compte.getTauxRemuneration());
        //compteEpargne.setClient(compte.getClient());
        //compteEpargne.setCarte(compte.getCarte());


        return compteEpargneRepository.saveAndFlush(compteEpargne);
    }

    @Override
    public CompteEpargne updateCompte(Long id_compte, CompteEpargneDto compte) {

        if (compteEpargneRepository.existsById(id_compte)){

            CompteEpargne existingCompteEpargne  = compteEpargneRepository.findById(id_compte).get();


            existingCompteEpargne.setSolde(compte.getSolde());
            existingCompteEpargne.setTauxRemuneration(compte.getTauxRemuneration());

            return  compteEpargneRepository.save(existingCompteEpargne);

        } else throw new RuntimeException("le compte n'existe pas");
    }

    @Override
    public void deleteCompte(Long id_compte) {

        if (compteEpargneRepository.existsById(id_compte)) {
            compteEpargneRepository.deleteById(id_compte);
        } else
            throw new RuntimeException("le compte n'existe pas");
    }
}
