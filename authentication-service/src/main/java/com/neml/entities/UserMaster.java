package com.neml.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "user_master")
public class UserMaster {

	@Id
	private String userId;
	@NotBlank(message = "Mobile no cannot be blank")
	@Size(min=10,max=10 ,message = "Mobile no cannot be blank")
	@Pattern(regexp="(^$|[0-9]{10})", message = "Enter valid mobile no")
	private String userMobile;

	private String userName;
	
	private String orgId;
	private String orgName;
	private String orgCategory;
	private String userEmail;
	private String userRoles;
	private String userPassword;
	private String userCategory;
	private String funds;
	private String cst;
	private String cms;
	private String bank;
	private String fin;
	private Timestamp lastLoginTime;
	private String isLoggedIn;
	private String firstLoginFlag;
	private String orgRole;
	private String dealerWh;
	private String viewFlg;
	private String isActive;
	private String tmId;
	private String userOtp;
	private Timestamp userOtpExpiry;
	private String clientId;
	private String cmId;
	private String userSsoToken;
	private String userSsoMd5;
	private String userTransferOtp;
	private Timestamp userTransferOtpExpiry;
	private String authToken;
	private String sha512Password;
	private String ipAddress;
	private String selectedLang;
	private String createdBy;
	private Timestamp createdOn;
	private String modifiedBy;
	private Timestamp modifiedOn;

}
