package com.sujeevuthayakumar.ecommerce.dao;

import com.sujeevuthayakumar.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
