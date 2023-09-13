package com.example.ProxiBanque_HH_ZA.services;

import com.example.ProxiBanque_HH_ZA.dtos.ClientsDto;
import com.example.ProxiBanque_HH_ZA.entities.Clients;

import java.util.List;
import java.util.Optional;

public interface ClientsService {

    List<Clients> getAllClients();

    Optional<Clients> getClientById(Long id);

    Clients saveClient(ClientsDto clientDto);

    ClientsDto updateClient(Long id, ClientsDto clientDTO);

    void deleteClientById(Long id);

    ClientsDto createClientWithConseiller(ClientsDto client, Long conseillerId);


}
