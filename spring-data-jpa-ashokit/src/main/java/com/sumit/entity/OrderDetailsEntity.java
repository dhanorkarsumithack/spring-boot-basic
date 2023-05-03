package com.sumit.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Order_details")
@Data
public class OrderDetailsEntity {

	@Id
	@Column(name = "order_id")
	@SequenceGenerator(
			name="order_id_seq",
			sequenceName = "order_id_seq",
			allocationSize = 1
	)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
    @GenericGenerator(name = "order_id_seq", strategy = "com.sumit.generator.OrderIdGenerator")
	private String orderId;
	
	@Column(name = "order_by")
	private String orderBy;
	
	@Column(name = "order_date")
	private Date orderPlacedDate;
}
