package com.ecommerce.service.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers")
public class Suppliers extends BaseEntity {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private long supplierId;
	
	@Column(name = "supplier_name")
	private String supplierName;
	

}
