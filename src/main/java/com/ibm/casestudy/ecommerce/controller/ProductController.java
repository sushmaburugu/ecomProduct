package com.ibm.casestudy.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.casestudy.ecommerce.entity.Catalog;
import com.ibm.casestudy.ecommerce.entity.Product;
import com.ibm.casestudy.ecommerce.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/all")
	public List<Product> all() {
		return productService.all();
	}

	@GetMapping("/{productId}")
	public Product findById(@PathVariable Long productId) {
		return productService.findById(productId).get();
	}
	
	@PostMapping("/savecatalog") 
	public Catalog saveCatalog(@RequestBody Catalog catalog) { 
		return productService.saveCatalog(catalog); 
	}
	
	/*
	 * @PostMapping("/savecatalogUsingProdId") public Catalog
	 * saveCatalogUsingProductId(@PathVariable Long catalogId) { return
	 * productService.saveCatalogUsingProductId(catalogId); }
	 */
	@PostMapping("/saveProduct") 
	public String saveProduct(@RequestBody Product product) { 
		return productService.saveProduct(product); 
	}
	 
}
