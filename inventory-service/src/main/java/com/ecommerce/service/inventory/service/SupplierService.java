package com.ecommerce.service.inventory.service;

import java.util.List;

import com.ecommerce.service.inventory.model.Suppliers;

public interface SupplierService {
	Suppliers saveSupplier(Suppliers supplier);
	List<Suppliers> getAllSupplier();
	Suppliers getSupplierById(long id);
	Suppliers updateSupplier(Suppliers supplier, long id);
	void deleteSupplier(long id);
}
