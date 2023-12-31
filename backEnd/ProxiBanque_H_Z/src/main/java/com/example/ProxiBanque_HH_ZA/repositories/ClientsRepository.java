package com.example.ProxiBanque_HH_ZA.repositories;

import com.example.ProxiBanque_HH_ZA.entities.Clients;
import com.example.ProxiBanque_HH_ZA.entities.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Clients,Long> {
    List<Clients> findByConseiller(Conseiller conseiller);
}
