package com.ibm.casestudy.ecommerce.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.casestudy.ecommerce.entity.Catalog;
import com.ibm.casestudy.ecommerce.entity.Product;
import com.ibm.casestudy.ecommerce.repository.ProductRepository;
import com.ibm.casestudy.ecommerce.repository.UserRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CatalogService catalogService;


	public List<Product> all() {
		List<Product> all = productRepository.findAll();
		return all;
	}

	public Optional<Product> findById(long productId) {
		return productRepository.findById(productId);
	}

	/*
	 * public Catalog saveCatalogUsingProductId(Long id) { Catalog catalog = new
	 * Catalog(); catalog.setProducts(Arrays.asList(findById(id).get()));
	 * catalogService.savaCatalog(catalog); return catalog; }
	 */
	
	public Catalog saveCatalog(Catalog catalog) {
		catalogService.savaCatalog(catalog);
		return catalog;
	}

	public String saveProduct(Product product) {
		if (userRepository.findAll().stream().anyMatch(a -> a.getRole().equalsIgnoreCase("admin"))) {
			productRepository.save(product);
			return "product added successfully";
		}
		else return "you don't have admin access";
	}
}
