package com.neml.serviceImpl;

import java.security.SecureRandom;

import org.springframework.stereotype.Service;

import com.neml.service.OTPService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OTPServiceImpl implements OTPService {

	@Override
	public int generateOTP() {
		 log.info("Inside OtpServiceImpl :: generateOTP");
	        StringBuilder generatedToken = new StringBuilder();
	        try {
	            SecureRandom number = new SecureRandom();
	            for (int i = 0; i < 6; i++) {
	                int num = number.nextInt(9);
	                log.info("Number Generated -> " + num + " -> Loop -> " + i);
	                while (num == 0 && i == 0) {
	                    num = number.nextInt(9);
	                    log.info("Number Generated -> " + num + " -> Loop -> " + i);
	                }
	                generatedToken.append(num);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        log.info("Exiting OtpServiceImpl :: generateOTP | Generated Token="
	                + Integer.parseInt(generatedToken.toString()));
	        return Integer.parseInt(generatedToken.toString());
	}

}
