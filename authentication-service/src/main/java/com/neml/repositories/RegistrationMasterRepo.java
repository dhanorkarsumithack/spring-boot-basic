package com.neml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neml.entities.RegistrationMaster;

public interface RegistrationMasterRepo extends JpaRepository<RegistrationMaster, String> {

}
