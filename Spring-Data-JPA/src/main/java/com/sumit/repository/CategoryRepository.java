package com.sumit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

}
