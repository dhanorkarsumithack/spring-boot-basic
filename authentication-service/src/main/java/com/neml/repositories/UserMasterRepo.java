package com.neml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.neml.entities.UserMaster;

public interface UserMasterRepo extends JpaRepository<UserMaster, String> {
	

	Optional<UserMaster> findByUserId(String userId);
}
