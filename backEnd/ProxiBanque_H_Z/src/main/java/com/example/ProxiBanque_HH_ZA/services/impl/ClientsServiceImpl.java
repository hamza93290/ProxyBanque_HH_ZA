package com.example.ProxiBanque_HH_ZA.services.impl;

import com.example.ProxiBanque_HH_ZA.dtos.ClientsDto;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.example.ProxiBanque_HH_ZA.repositories.ClientsRepository;
import com.example.ProxiBanque_HH_ZA.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    private ClientsRepository clientsRepo;



    @Override
    public List<Clients> getAllClients() {
        List<Clients> clients = clientsRepo.findAll();
        if(clients.isEmpty()){
            throw new RuntimeException("il n'y a pas de client");
        }
        return clients;
    }

    @Override
    public Optional<Clients> getClientById(Long id) {
        return clientsRepo.findById(id);
    }

    @Override
    public Clients saveClient(ClientsDto clientDto) {
        Clients newClient = new Clients();
        newClient.setLastname(clientDto.getName());
        newClient.setFirstname(clientDto.getFirstName());
        newClient.setAddress(clientDto.getAdress());
        newClient.setCity(clientDto.getCity());
        newClient.setZipcode(clientDto.getZipCode());
        newClient.setPhonenumber(clientDto.getPhoneNumber());

         return clientsRepo.saveAndFlush(newClient);
    }

    @Override
    public ClientsDto updateClient(Long id, ClientsDto clientDTO) {
        return null;
    }

    @Override
    public void deleteClientById(Long id) {

    }

    @Override
    public ClientsDto createClientWithConseiller(ClientsDto client, Long conseillerId) {
        return null;
    }
}
