package org.example.lab31_03.service;

import org.example.lab31_03.model.Product;
import org.example.lab31_03.repository.CustomerOrderRepository;
import org.example.lab31_03.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CustomerOrderRepository customerOrderRepository;

    public ProductService(ProductRepository productRepository,
                          CustomerOrderRepository customerOrderRepository) {
        this.productRepository = productRepository;
        this.customerOrderRepository = customerOrderRepository;
    }

    public Product getMostOrderedProduct(){
        List<Long> productIds = customerOrderRepository.findMostOrderedProductIds();

        if(productIds.isEmpty()){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "Brak zamówień w bazie"
            );
        }

        Long productId = productIds.get(0);

        return productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Nie znaleziono produktu o id " + productId
                ));
    }

    public Long getTotalQuantityByProductId(Long productId){
        productRepository.findById(productId)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Nie znaleziono produktu o id " + productId
                ));

        return customerOrderRepository.getTotalQuantityByProductId(productId);
    }
}
