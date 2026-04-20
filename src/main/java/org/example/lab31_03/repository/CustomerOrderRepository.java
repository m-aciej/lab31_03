package org.example.lab31_03.repository;

import org.example.lab31_03.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Long> {

    long countByClientId(Long clientId);

    @Query("select coalesce(sum(o.quantity * o.product.price), 0) from CustomerOrder o where o.client.id = :clientId")
    Double getTotalCostByClientId(Long clientId);

    @Query("select o.product.id from CustomerOrder o group by o.product.id order by sum(o.quantity) desc")
    List<Long> findMostOrderedProductIds();

    @Query("select coalesce(sum(o.quantity), 0) from CustomerOrder o where o.product.id = :productId")
    Long getTotalQuantityByProductId(Long productId);
}
