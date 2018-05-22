package com.jigs.app;



import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.jigs.app.repository.CustomerDatabase;
import com.jigs.app.repository.CustomerDatabaseAccess;

public class CustomerDatabaseTest {
	@Test
	@Ignore
	public void create() {
		UserInput ui = new UserInput();
		Customer customer = ui.createCustomer();
		CustomerDatabaseAccess cda = new CustomerDatabase();
		cda.create(customer);
		
	}
	@Test
	@Ignore
	public void update() {
		Customer customer = new Customer("Polly", 20, 2);
		CustomerDatabaseAccess cda = new CustomerDatabase();
		cda.update(customer);
	}
	@Test
//	@Ignore
	public void findAll(){
		CustomerDatabaseAccess cda = new CustomerDatabase();
		List<Customer> customers = cda.findAll();
		for (Customer customer : customers) {
				System.out.println(customer);
		}
	}
	@Test
	@Ignore
	public void findById() {
		CustomerDatabaseAccess cda = new CustomerDatabase();
		Customer customers = cda.findById(3);
		System.out.println(customers);
	}
	
}
