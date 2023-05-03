package com.neml.service;

import org.slf4j.Logger;

import com.neml.entities.ResponseMessage;
import com.neml.entities.UserMaster;

import jakarta.validation.Valid;

public interface LoginService {
	
    ResponseMessage saveSignUpData(@Valid UserMaster masterModel, Logger log);

}
