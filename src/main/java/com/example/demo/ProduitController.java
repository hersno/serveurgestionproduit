package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produit;
import com.example.demo.service.IProduitSerice;

@RestController
@RequestMapping("/api/produit")
public class ProduitController {
	
	@Autowired
	private IProduitSerice produitService;
	
	
	@GetMapping
	List<Produit> getProduit(){
		return produitService.getProduits();
	}
	
	@PostMapping
	void addProduit(@RequestBody Produit produit) {
		produitService.addProduit(produit);
	}
	
	@PutMapping
	void updateProduit(@RequestBody Produit produit) {
		produitService.updateProduit(produit);
	}
	
	@DeleteMapping("/{ref}")
	void deleteProduit(String ref) {
		produitService.deleteProduit(ref);
	}

}
