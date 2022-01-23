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
@Table(name = "purchases")
public class Purchases extends BaseEntity {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "purchase_id")
	private long purchaseId;
	
	@ManyToOne
	@JoinColumn(name = "pur_product_id", referencedColumnName = "product_id")
	private Products pur_product_id;
	
	@ManyToOne
	@JoinColumn(name = "pur_supplier_id", referencedColumnName = "supplier_id")
	private Suppliers pur_supplier_id;
	
	@Column(name = "purchase_quantity")
	private int purchaseQuantity;



}
