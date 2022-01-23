package com.ecommerce.service.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders extends BaseEntity {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private long orderId;
	
	@ManyToOne
	@JoinColumn(name = "order_product_id", referencedColumnName = "product_id")
	private Products order_product_id;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "phone_no")
	private int phoneNo;

}
