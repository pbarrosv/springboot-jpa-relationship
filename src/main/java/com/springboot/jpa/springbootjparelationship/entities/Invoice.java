package com.springboot.jpa.springbootjparelationship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invoices")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;

	private Long total;

	@ManyToOne
	private Client client;
	
	public Invoice() {
	}

	public Invoice(Long id, String description, Long total) {
		this.id = id;
		this.description = description;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Long getTotal() {
		return total;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

}
