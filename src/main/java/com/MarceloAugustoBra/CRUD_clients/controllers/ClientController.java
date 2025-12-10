package com.MarceloAugustoBra.CRUD_clients.controllers;

import com.MarceloAugustoBra.CRUD_clients.dto.ClientDTO;
import com.MarceloAugustoBra.CRUD_clients.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id){
        ClientDTO clientDTO =  clientService.findById(id);
        return clientDTO;
    }

    @GetMapping
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<ClientDTO> clientDTO = clientService.findAll(pageable);
        return clientDTO;

    }
}
