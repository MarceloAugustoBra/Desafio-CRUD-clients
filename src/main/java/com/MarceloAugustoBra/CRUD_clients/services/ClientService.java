package com.MarceloAugustoBra.CRUD_clients.services;

import com.MarceloAugustoBra.CRUD_clients.dto.ClientDTO;
import com.MarceloAugustoBra.CRUD_clients.entities.Client;
import com.MarceloAugustoBra.CRUD_clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){
        Client client = repository.findById(id).orElseThrow();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable){
        Page<Client> clients = repository.findAll(pageable);
        return clients.map(x -> new ClientDTO(x));
    }

    @Transactional
    public ClientDTO insert (ClientDTO dto){
        Client client = new Client();
        client.setName(dto.getName());
        client.setCpf(dto.getCpf());
        client.setIncome(dto.getIncome());
        client.setBirthDate(dto.getBirthDate());
        client.setChildren(dto.getChildren());

        client = repository.save(client);
        return new ClientDTO(client);
    }

    public ClientDTO update (Long id, ClientDTO dto){
        Client client = repository.getReferenceById(id);
        client.setName(dto.getName());
        client.setCpf(dto.getCpf());
        client.setIncome(dto.getIncome());
        client.setBirthDate(dto.getBirthDate());
        client.setChildren(dto.getChildren());

        client = repository.save(client);
        return new ClientDTO(client);

    }

    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }

}
