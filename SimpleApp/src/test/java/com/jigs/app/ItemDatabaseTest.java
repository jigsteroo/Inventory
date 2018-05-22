package com.jigs.app;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.jigs.app.repository.ItemDatabase;
import com.jigs.app.repository.ItemDatabaseAccess;

public class ItemDatabaseTest {
	
	
	@Test
	@Ignore
	public void create() {
		ItemInput ip = new ItemInput();
		Item i = ip.createItem();
		ItemDatabaseAccess ida = ItemDatabase.getInstance();
		ida.create(i, 2 );
	}
	
	@Test
	@Ignore
	public void update() {
		Item i = new Item("baggers", 4, 5);
		ItemDatabaseAccess ida = ItemDatabase.getInstance();
		ida.update(i);
	}
	
	@Test
	public void findAll() {
		ItemDatabaseAccess ida = ItemDatabase.getInstance();
		List<Item> items = ida.findAll(2);
		for (Item i : items) {
			System.out.println(i);
		}
	}
	
}
