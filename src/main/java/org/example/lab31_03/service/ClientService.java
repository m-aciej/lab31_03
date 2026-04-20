package org.example.lab31_03.service;

import org.example.lab31_03.model.Client;
import org.example.lab31_03.repository.ClientRepository;
import org.example.lab31_03.repository.CustomerOrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    private final CustomerOrderRepository customerOrderRepository;

    public ClientService(ClientRepository clientRepository, CustomerOrderRepository customerOrderRepository) {
        this.clientRepository = clientRepository;
        this.customerOrderRepository = customerOrderRepository;
    }

    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Nie znaleziono klienta o id " + id));
    }

    public long getOrdersCountByClientId(Long clientId) {
        getClientById(clientId);
        return customerOrderRepository.countByClientId(clientId);
    }

    public Double getTotalCostByClientId(Long clientId) {
        getClientById(clientId);
        return customerOrderRepository.getTotalCostByClientId(clientId);
    }
}
