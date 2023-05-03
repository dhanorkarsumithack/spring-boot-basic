package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
