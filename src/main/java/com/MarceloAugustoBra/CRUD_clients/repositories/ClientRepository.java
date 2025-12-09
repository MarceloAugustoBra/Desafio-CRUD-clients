package com.MarceloAugustoBra.CRUD_clients.repositories;

import com.MarceloAugustoBra.CRUD_clients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
