package com.jigs.app.repository;

import java.util.List;

import com.jigs.app.Item;

public interface ItemDatabaseAccess {
	
	void delete(Item item);
	void create(Item item, int customer_id);
	void update(Item item);
	List<Item> findAll(int customer_id);
}
