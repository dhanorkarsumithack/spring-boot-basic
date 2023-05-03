
package com.neml.controller;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neml.common.Constants;
import com.neml.entities.ResponseMessage;
import com.neml.entities.UserMaster;
import com.neml.service.LoginService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PutMapping("/saveSignUpData")
	public ResponseEntity<ResponseMessage> saveSignUpData(@Valid @RequestBody UserMaster userMaster){
		  var userMasterModelResponseEntityFunction = (Function<UserMaster, ResponseEntity<ResponseMessage>>) userMasterModel -> {
	            var responseMessage = new ResponseMessage();
	            responseMessage = loginService.saveSignUpData(userMasterModel, log);
	            if (Constants.ERROR_CODES.NO_ERROR == responseMessage.getErrorCode()) {
	                return ResponseEntity.ok(responseMessage);
	            }
	            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body(responseMessage);
	        };
	        return userMasterModelResponseEntityFunction.apply(userMaster);
	}
}
