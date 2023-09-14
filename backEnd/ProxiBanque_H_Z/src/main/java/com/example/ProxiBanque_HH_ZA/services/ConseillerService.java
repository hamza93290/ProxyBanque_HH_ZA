package com.example.ProxiBanque_HH_ZA.services;

import com.example.ProxiBanque_HH_ZA.dtos.ConseillerDto;
import com.example.ProxiBanque_HH_ZA.entities.Conseiller;

import java.util.List;
import java.util.Optional;

public interface ConseillerService {

    ConseillerDto toDto(Conseiller conseiller);
    List<ConseillerDto> getAllConseiller();
    Conseiller saveConseiller(ConseillerDto conseillerDto);
    Optional<Conseiller> getConseillerById(Long id);
    void deleteConseiller(Long id);
    Conseiller updateConseiller(Long id, ConseillerDto conseillerDto);
}
