package com.ibm.casestudy.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.casestudy.ecommerce.entity.Catalog;
import com.ibm.casestudy.ecommerce.repository.CatalogRepository;

@Service
public class CatalogService {

	@Autowired
	private CatalogRepository catalogRepository;

	public List<Catalog> catalogList() {
		List<Catalog> all = catalogRepository.findAll();
		return all;
	}
	
	public Optional<Catalog> findById(long catalogId) {
		return catalogRepository.findById(catalogId);
	}

	public Catalog savaCatalog(Catalog catalog) {
		return catalogRepository.save(catalog);
	}

}
