package com.example.ProxiBanque_HH_ZA.services.impl;

import com.example.ProxiBanque_HH_ZA.dtos.ClientsDto;
import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.example.ProxiBanque_HH_ZA.repositories.ClientsRepository;
import com.example.ProxiBanque_HH_ZA.repositories.ConseillerRepository;
import com.example.ProxiBanque_HH_ZA.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    private ClientsRepository clientsRepo;

    @Autowired
    private ConseillerRepository conseillerRepository;



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
        newClient.setAddress(clientDto.getAddress());
        newClient.setCity(clientDto.getCity());
        newClient.setZipcode(clientDto.getZipCode());
        newClient.setPhonenumber(clientDto.getPhoneNumber());

        if (conseillerRepository.findById(clientDto.getId_conseiller()).isEmpty()) {
            throw new RuntimeException("Conseiller avec l'ID correspondant non trouvé.");
        }

        newClient.setConseiller(conseillerRepository.findById(clientDto.getId_conseiller()).get());



        return clientsRepo.saveAndFlush(newClient);
    }

    @Override
    public Clients updateClient(Long id, ClientsDto client) {
        if (clientsRepo.existsById(id)){
            Clients existingClient = clientsRepo.findById(id).get();
            existingClient.setLastname(client.getName());
            existingClient.setFirstname(client.getFirstName());
            existingClient.setCity(client.getCity());
            existingClient.setAddress(client.getAddress());
            existingClient.setPhonenumber(client.getPhoneNumber());
            existingClient.setZipcode(client.getZipCode());
            if (conseillerRepository.existsById(client.getId_conseiller())){
                existingClient.setConseiller(conseillerRepository.findById(client.getId_conseiller()).get());
            } else
                throw new RuntimeException("Wesh, tu veux changer de conseiller, mais prends en un qui existe !");

            return clientsRepo.save(existingClient);
        } else
            throw new RuntimeException("Wesh, tu veux modifier un client qui n'existe pas, t'es bizarre toi !");

    }


    @Override
    public void deleteClientById(Long id) {

        if (clientsRepo.existsById(id)) {
            clientsRepo.deleteById(id);
        } else
            throw new RuntimeException("Le client n'existe pas");

    }


}
