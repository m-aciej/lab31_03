package org.example.lab31_03.data;

import org.example.lab31_03.model.Client;
import org.example.lab31_03.model.CustomerOrder;
import org.example.lab31_03.model.Product;
import org.example.lab31_03.repository.ClientRepository;
import org.example.lab31_03.repository.CustomerOrderRepository;
import org.example.lab31_03.repository.ProductRepository;
import org.example.lab31_03.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class SampleDataLoader implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(SampleDataLoader.class);

    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;
    private final CustomerOrderRepository customerOrderRepository;

    public SampleDataLoader(ClientRepository clientRepository,
                            ProductRepository productRepository,
                            CustomerOrderRepository customerOrderRepository) {
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
        this.customerOrderRepository = customerOrderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading sample data...");

        Client client1 = new Client("Jan", "Kowalski", "jan.kowalski@example.com", "123456789");
        Client client2 = new Client("Anna", "Nowak", "anna.nowak@example.com", "987654321");

        clientRepository.save(client1);
        clientRepository.save(client2);

        Product product1 = new Product("Laptop", "Laptop biznesowy", 3500.0);
        Product product2 = new Product("Myszka", "Mysz bezprzewodowa", 120.0);
        Product product3 = new Product("Klawiatura", "Klawiatura mechaniczna", 250.0);

        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);

        CustomerOrder order1 = new CustomerOrder(LocalDate.now(), 2, client1, product1);
        CustomerOrder order2 = new CustomerOrder(LocalDate.now(), 3, client1, product2);
        CustomerOrder order3 = new CustomerOrder(LocalDate.now(), 1, client2, product2);
        CustomerOrder order4 = new CustomerOrder(LocalDate.now(), 4, client2, product3);

        customerOrderRepository.save(order1);
        customerOrderRepository.save(order2);
        customerOrderRepository.save(order3);
        customerOrderRepository.save(order4);



        logger.info("Sample data loaded.");
    }
}
