package com.hhza.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hhza.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
