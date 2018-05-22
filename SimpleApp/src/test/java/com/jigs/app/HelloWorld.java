package com.jigs.app;

import org.junit.Test;

import com.jigs.app.repository.Database;

public class HelloWorld {
	@Test
	public void helloWorldTest() {
		Database db = new Database();
		db.connect();
	}
}
