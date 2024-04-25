package com.ibm.casestudy.ecommerce.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="catalog")
public class Catalog {

	@Id 
    @Column(name = "catalog_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catalogId;
	
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "product") private List<Product> products;
	 */

	public Long getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Long catalogId) {
		this.catalogId = catalogId;
	}
	/*
	 * public List<Product> getProducts() { return products; }
	 * 
	 * public void setProducts(List<Product> products) { this.products = products; }
	 */
}
