package com.springboot.jpa.springbootjparelationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.springbootjparelationship.entities.Client;

public interface PersonRepository extends JpaRepository<Client, Long>{

}
