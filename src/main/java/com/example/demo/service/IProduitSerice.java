package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Produit;

public interface IProduitSerice {

	List<Produit> getProduits();
	void addProduit(Produit p);
	void updateProduit(Produit p);
	void deleteProduit(String ref);
}
