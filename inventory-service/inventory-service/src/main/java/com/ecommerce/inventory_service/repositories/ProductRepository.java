package com.ecommerce.inventory_service.repositories;

import com.ecommerce.inventory_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
