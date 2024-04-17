package com.springboot.jpa.springbootjparelationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.jpa.springbootjparelationship.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
