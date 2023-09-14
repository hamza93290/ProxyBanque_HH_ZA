package com.example.ProxiBanque_HH_ZA.services.impl;

import com.example.ProxiBanque_HH_ZA.dtos.ConseillerDto;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.example.ProxiBanque_HH_ZA.entities.Conseiller;
import com.example.ProxiBanque_HH_ZA.repositories.ClientsRepository;
import com.example.ProxiBanque_HH_ZA.repositories.ConseillerRepository;
import com.example.ProxiBanque_HH_ZA.services.ConseillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ConseillerServiceImpl implements ConseillerService {


    @Autowired
    private ClientsRepository clientsRepository;

    @Autowired
    private ConseillerRepository conseillerRepository;

    @Override
    public ConseillerDto toDto(Conseiller conseiller) {

        ConseillerDto conseillerDto = new ConseillerDto();
        conseillerDto.setFirstName(conseiller.getFirstName());
        conseillerDto.setLastname(conseiller.getLastname());
        conseillerDto.setId(conseiller.getId());
        conseillerDto.setClientList(clientsRepository.findByConseiller(conseiller));
        return conseillerDto;
    }

    @Override
    public List<ConseillerDto> getAllConseiller() {

        List<ConseillerDto> conseillerDtoList = new ArrayList<>();
        List<Conseiller> conseillerList = conseillerRepository.findAll();
        if (!conseillerList.isEmpty()){
            for (Conseiller conseiller : conseillerList){
                conseillerDtoList.add(toDto(conseiller));
            }
            return conseillerDtoList;
        } else throw new RuntimeException("Tu n'as pas d'employé chez toi ? T'as raison ça fait moins d'impôts");

    }


    @Override
    public Conseiller saveConseiller(ConseillerDto conseillerDto) {
        Conseiller conseiller = new Conseiller();
        conseiller.setFirstName(conseillerDto.getFirstName());
        conseiller.setLastname(conseillerDto.getLastname());

        return conseillerRepository.saveAndFlush(conseiller);
    }

    @Override
    public Optional<Conseiller> getConseillerById(Long id) {

        return conseillerRepository.findById(id);
    }

    @Override
    public void deleteConseiller(Long id) {

        if (conseillerRepository.existsById(id)){
            Conseiller conseiller = conseillerRepository.findById(id).get();
            List<Clients> listeClientConseiller = clientsRepository.findByConseiller(conseiller);
            Conseiller conseillerParDefault = conseillerRepository.findById(1L).get();
            for (Clients c : listeClientConseiller){
                c.setConseiller(conseillerParDefault);
                clientsRepository.save(c);
            }
            conseillerRepository.deleteById(id);
        } else throw new RuntimeException("C'est la fête, on licencie des gens qui n'existe pas ??");


    }

    @Override
    public Conseiller updateConseiller(Long id, ConseillerDto conseillerDto) {

        if (conseillerRepository.existsById(id)){
            Conseiller existingConseiller = conseillerRepository.findById(id).get();
            existingConseiller.setFirstName(conseillerDto.getFirstName());
            existingConseiller.setLastname(conseillerDto.getLastname());
            return conseillerRepository.save(existingConseiller);
        } else throw new RuntimeException("Modifier un conseiller imaginaire ? Vas consulter man !");

    }
}
