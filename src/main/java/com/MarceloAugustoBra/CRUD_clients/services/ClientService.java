package com.MarceloAugustoBra.CRUD_clients.services;

import com.MarceloAugustoBra.CRUD_clients.dto.ClientDTO;
import com.MarceloAugustoBra.CRUD_clients.entities.Client;
import com.MarceloAugustoBra.CRUD_clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).orElseThrow();
        return new ClientDTO(client);
    }

}
