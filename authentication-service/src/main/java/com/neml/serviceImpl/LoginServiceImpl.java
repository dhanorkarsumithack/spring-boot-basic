package com.neml.serviceImpl;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neml.common.Constants;
import com.neml.common.Constants.ERROR_CODES;
import com.neml.entities.MessageTracker;
import com.neml.entities.RegistrationMaster;
import com.neml.entities.ResponseMessage;
import com.neml.entities.UserMaster;
import com.neml.exceptions.ResourceNotFoundException;
import com.neml.repositories.MessageTrackerRepo;
import com.neml.repositories.RegistrationMasterRepo;
import com.neml.repositories.UserMasterRepo;
import com.neml.service.LoginService;
import com.neml.service.OTPService;

import jakarta.validation.Valid;



@Service
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	OTPService otpService;
	
	@Autowired
	UserMasterRepo userMasterRepo;
	
	
	@Autowired
	RegistrationMasterRepo regMasterRepo;
	
	@Autowired
	MessageTrackerRepo msgTrackerRepo;
	
	
	
	@Override
	public ResponseMessage saveSignUpData(@Valid UserMaster userMaster, Logger log) {
		log.info("Entering into LoginServiceImpl");
        var response = new ResponseMessage();
        var registrationMaster = new RegistrationMaster();
        var messagTracker = new MessageTracker();

        
        try {
        	 response = validateUserModelData(userMaster, log);
             if (!(ERROR_CODES.NO_ERROR == response.getErrorCode())) {
                 return response;
             }
             
             UserMaster userMasterModel = setUserMasterModel(userMaster, log);
             registrationMaster = setRegistrationModel(registrationMaster, userMaster, log);
             messagTracker = setMessageTrackerModel(messagTracker, userMaster, log);

             String userId=userMaster.getUserId();
             
             Optional<UserMaster> findByUserId = userMasterRepo.findByUserId(userId);
            
             if(findByUserId != null) {
            	   response.setErrorCode(ERROR_CODES.USER_ALREADY_EXIST);
                   response.setMessage("User Already exist");
             }else {
            	 UserMaster newUser=userMasterRepo.save(userMasterModel);
            	 if(newUser != null) {
            		 RegistrationMaster newRegMaster=regMasterRepo.save(registrationMaster);
            		 
            		 if(newRegMaster !=null) {
            			 MessageTracker newMsgTracker=msgTrackerRepo.save(messagTracker);
            			 log.info("Data is saved successfully!");
            			 return new ResponseMessage();
            		 }
            		
            	 }
             }
             
             
		} catch (Exception e) {
			log.info("error while inserting data");
			e.printStackTrace();
		}
        
		return null;
	}
	  
	  public UserMaster setUserMasterModel(UserMaster userMaster, Logger log) {
	        var OTP = otpService.generateOTP();
//	        var OrgId = loginDao.generateOrgID(log);
	        UserMaster userMasterModel = new UserMaster();
//	        userMaster.setUserId("U".concat("ORGID"));
	        userMaster.setIsActive("T");
	        userMaster.setOrgId("111");
	        userMaster.setOrgName(userMaster.getOrgName());
	        userMaster.setOrgCategory("ORG");
	        userMaster.setUserName(userMaster.getOrgName());
	        userMaster.setUserEmail(null);
	        userMaster.setUserRoles("TM");
	        userMaster.setUserMobile(userMaster.getUserName());//user name set in user mobile
	        userMaster.setUserPassword(String.valueOf(OTP));
	        userMaster.setUserCategory("ORG");
	        userMaster.setTmId("ORGID");
	        userMaster.setUserOtp(String.valueOf(OTP));
	        userMaster.setSha512Password(String.valueOf(OTP));
	        userMaster.setCreatedBy(userMaster.getOrgName());
	        return userMaster;
	    }
	  
	  public RegistrationMaster setRegistrationModel(RegistrationMaster regMaster, UserMaster userMaster, Logger log) {
	        regMaster.setOrgId(userMaster.getOrgId());
	        regMaster.setRoleId(userMaster.getOrgCategory());
	        regMaster.setOrgNm(userMaster.getOrgName());
	        regMaster.setConstitution(userMaster.getOrgCategory());
	        regMaster.setRegisteredAddress(null);
	        regMaster.setRegisteredStateCode(null);
	        regMaster.setRegisteredDistrict(null);
	        regMaster.setRegisteredCity(null);
	        regMaster.setRegisteredPincode(null);
	        regMaster.setDocumentStatus("N");
	        regMaster.setMemFeeSubmitted("N");
	        regMaster.setStatus("A");
	        regMaster.setIsTcAgreed("Y");
	        regMaster.setCreatedBy(userMaster.getCreatedBy());
	        return regMaster;
	    }
	  
	  public MessageTracker setMessageTrackerModel(MessageTracker messagetracker, UserMaster userMaster, Logger log) {
//	        var msgId = loginDao.generateMsgId(log);
	        StringBuilder msgSubject = new StringBuilder();
	        LocalDateTime currentDate = LocalDateTime.now();
	        currentDate = currentDate.plusMinutes(1);
	        Timestamp timeStamp = Timestamp.valueOf(currentDate);
	        msgSubject.append("OTP");
//	        messagetracker.setMsgId(msgId);
	        messagetracker.setMsgTranscode("801");
	        messagetracker.setMsgMessageType(Constants.MESSAGE_TRACKER.MESSAGE_TYPE);
	        messagetracker.setMsgStatus(Constants.MESSAGE_TRACKER.MSG_STATUS);
	        messagetracker.setMsgHasAttachment(0d);
	        messagetracker.setMsgSubject(msgSubject.toString());
	        messagetracker.setMsgMobileNos(userMaster.getUserMobile());
	        messagetracker.setMsgParameters(userMaster.getUserMobile() + "`" + userMaster.getUserOtp() + "`" + timeStamp);
	        return messagetracker;
	    }
	
    public ResponseMessage validateUserModelData(UserMaster masterModel, Logger log) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setErrorCode(ERROR_CODES.NO_ERROR);
        return responseMessage;
    }

	

}
