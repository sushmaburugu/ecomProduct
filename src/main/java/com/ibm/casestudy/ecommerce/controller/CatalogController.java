package com.ibm.casestudy.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.casestudy.ecommerce.entity.Catalog;
import com.ibm.casestudy.ecommerce.service.CatalogService;

@RequestMapping("/catalog")
@RestController
public class CatalogController {

	@Autowired
	private CatalogService catalogService;

	@GetMapping("/all")
	public List<Catalog> all() {
		return catalogService.catalogList();
	}

	@GetMapping("/save")
	public Catalog findById(@RequestBody Catalog catalog) {
		return catalogService.savaCatalog(catalog);
	}

}
