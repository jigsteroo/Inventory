package com.jigs.app;

import org.junit.Test;

import com.jigs.app.repository.CustomerDatabase;
import com.jigs.app.repository.CustomerDatabaseAccess;

public class CustomerTest {
	@Test
	public void addItem() {
		
		CustomerDatabaseAccess cda = new CustomerDatabase();
		Customer c = cda.findById(2);
		c.addItem(new Item("hats", 5));
		
		
		System.out.println(c.toString());
	}
}
