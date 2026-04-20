package org.example.lab31_03.controller;

import org.example.lab31_03.model.Product;
import org.example.lab31_03.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/most-ordered")
    public Product getMostOrderedProduct(){
        return productService.getMostOrderedProduct();
    }

    @GetMapping("/{id}/total-quantity")
    public Long getTotalQuantityByProductId(@PathVariable Long id){
        return productService.getTotalQuantityByProductId(id);
    }
}
