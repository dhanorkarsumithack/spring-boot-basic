package com.sumit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "contact_mstr")
public class ContactMasterEntity {
	
	@Id
	@Column(name = "contact_id")
	private Integer contactId;

	@Column(name = "contact_name")
	private String contactName;
	
	@Column(name = "contact_no")
	private Long contactNumber;
}
