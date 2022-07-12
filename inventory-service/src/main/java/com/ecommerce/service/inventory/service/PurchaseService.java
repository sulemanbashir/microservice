package com.ecommerce.service.inventory.service;

import java.util.List;

import com.ecommerce.service.inventory.model.Purchases;

public interface PurchaseService {
	Purchases savePurchase(Purchases purchase);
	List<Purchases> getAllPurchase();
	Purchases getPurchaseById(long id);
	Purchases updatePurchase(Purchases purchase, long id);
	void deletePurchase(long id);
}
