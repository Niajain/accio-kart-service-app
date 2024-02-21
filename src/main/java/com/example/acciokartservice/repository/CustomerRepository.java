package com.example.acciokartservice.repository;

import com.example.acciokartservice.model.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<customer,Integer> {
}

