package com.neml.entities;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "registration_mstr")
public class RegistrationMaster {
	
	@Id
	private String roleId;

	
	private String orgId;
	private String orgNm;
	private String constitution;
	private Timestamp dateOfEstablishment;
	private String membershipType;
	private String registeredAddress;
	private String registeredStateCode;
	private String registeredDistrict;
	private String registeredCity;
	private String registeredPincode;
	private String registeredContactPerson;
	private String registeredContactPersonDesignation;
	private String permanentAddress;
	private String permanentStateCode;
	private String permanentDistrict;
	private String permanentCity;
	private String permanentPincode;
	private String permanentContactPerson;
	private String permanentContactPersonDesignation;
	private String ifscCode;
	private String bankAccNo;
	private String nameOfAccountHolder;
	private String bankName;
	private String accountType;
	private String bankBranch;
	private String virtualAccCode;
	private String gstStateCode;
	private String gstNumber;
	private String tanNumber;
	private String aadharCard;
	private String panCard;
	private String documentStatus;
	private String memFeeSubmitted;
	private String status;
	private String salesExecutiveName;
	private Timestamp tcAgreedDate;
	private String isTcAgreed;
	private Timestamp createdDate;
	private String createdBy;
	private Timestamp modifiedDate;
	private String modifiedBy;
	private String approvedBy;
	private Timestamp approvedDate;
	private String rejectionReason;
}
