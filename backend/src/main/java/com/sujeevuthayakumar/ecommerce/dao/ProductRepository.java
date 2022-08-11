package com.sujeevuthayakumar.ecommerce.dao;

import com.sujeevuthayakumar.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
