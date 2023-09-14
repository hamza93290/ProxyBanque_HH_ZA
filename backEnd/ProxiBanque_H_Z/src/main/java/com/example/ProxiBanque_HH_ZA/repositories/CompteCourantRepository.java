package com.example.ProxiBanque_HH_ZA.repositories;

import com.example.ProxiBanque_HH_ZA.entities.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant,Long> {

}
