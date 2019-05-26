package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Produit;

@Service
public class ProduitMockService implements IProduitSerice {
	
	private List<Produit> produits;
	
	public ProduitMockService() {
		produits=new ArrayList<>();
		produits.add(new Produit("Livre", 25, 10000));
		produits.add(new Produit("Cahier", 40, 15000));
		produits.add(new Produit("Stylo", 12, 1000));
	}

	@Override
	public List<Produit> getProduits() {
		return produits;
	}

	@Override
	public void addProduit(Produit p) {
		produits.add(p);		
	}

	@Override
	public void updateProduit(Produit p) {
       produits.remove(p);
       produits.add(p);
	}

	@Override
	public void deleteProduit(String ref) {
		Produit p=new Produit();
		p.setRef(ref);
		produits.remove(p);
		
	}

}
