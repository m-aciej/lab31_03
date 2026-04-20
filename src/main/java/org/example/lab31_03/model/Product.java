package org.example.lab31_03.model;

import jakarta.persistence.*;
import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<CustomerOrder> orders = new ArrayList<>();

    public Product() {}
    public Product(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<CustomerOrder> getOrders(){
        return orders;
    }

    public void setOrders(List<CustomerOrder> orders){
        this.orders = orders;
    }
}
