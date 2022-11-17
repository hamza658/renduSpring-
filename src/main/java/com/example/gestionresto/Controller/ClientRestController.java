package com.example.gestionresto.Controller;

import com.example.gestionresto.Entity.Client;
import com.example.gestionresto.Repository.ClientRepository;
import com.example.gestionresto.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Client")
public class ClientRestController {
@Autowired
    IClientService iClientService;


    @GetMapping("/retrieveAllClients")
    List<Client> retrieveAllClients() {return iClientService.retrieveAllClients();}


    @PostMapping("/add")
    public Client addClient (@RequestBody Client client){
        return iClientService.addClient(client);
    }
    @PutMapping("/updateClient")
    public Client updateClient (@RequestBody Client client  ){
        return iClientService.updateClient(client);}


    @RequestMapping(value ="/{id}")
    public  Client retrieveClient (@PathVariable("id")Long id){
        return iClientService.retrieveClient(id);
    }

    @DeleteMapping("/id")
    public void deleteClient(Long id){
iClientService.deleteClient(id);
    }
    }

