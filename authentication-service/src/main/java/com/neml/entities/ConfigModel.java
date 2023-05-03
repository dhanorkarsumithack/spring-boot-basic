package com.neml.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "config_table")
public class ConfigModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	
	String key;
	String value;
}
