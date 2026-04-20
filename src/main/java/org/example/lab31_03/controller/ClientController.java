package org.example.lab31_03.controller;

import org.example.lab31_03.model.Client;
import org.example.lab31_03.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    
    @GetMapping("/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/{id}/orders/count")
    public long getOrdersCountByClientId(@PathVariable Long id) {
        return clientService.getOrdersCountByClientId(id);
    }

    @GetMapping("/{id}/orders/total-cost")
    public Double getTotalCostByClientId(@PathVariable Long id) {
        return clientService.getTotalCostByClientId(id);
    }
}
