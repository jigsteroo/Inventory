package com.jigs.app.repository;

import java.util.List;

import com.jigs.app.Customer;

public interface CustomerDatabaseAccess {
	void delete(Customer customer);
	void create(Customer customer);
	void update(Customer customer);
	List<Customer> findAll();
	Customer findById(int id);
}
