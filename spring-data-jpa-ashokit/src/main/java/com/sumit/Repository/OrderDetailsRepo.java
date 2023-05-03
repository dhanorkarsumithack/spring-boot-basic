package com.sumit.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.entity.OrderDetailsEntity;

public interface OrderDetailsRepo extends JpaRepository<OrderDetailsEntity, Serializable> {

}
