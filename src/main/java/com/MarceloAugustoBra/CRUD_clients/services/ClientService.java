package com.MarceloAugustoBra.CRUD_clients.services;

import com.MarceloAugustoBra.CRUD_clients.dto.ClientDTO;
import com.MarceloAugustoBra.CRUD_clients.entities.Client;
import com.MarceloAugustoBra.CRUD_clients.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    public ClientRepository repository;

    public ClientDTO findById(Long id){

        Optional<Client> client = repository.findById(id);
        return null;

    }

}
