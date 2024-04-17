package com.springboot.jpa.springbootjparelationship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	private String lastname;

	public Client() {
	}

	public Client(Long id, String name, String lastname) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
