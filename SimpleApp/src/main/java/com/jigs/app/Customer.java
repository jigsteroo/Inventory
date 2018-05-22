package com.jigs.app;

import java.util.ArrayList;
import java.util.List;

import com.jigs.app.repository.ItemDatabase;
import com.jigs.app.repository.ItemDatabaseAccess;

public class Customer {
	private String name;
	private int age;
	private int id;
	private List<Item> items;
	private ItemDatabaseAccess ida;

	public Customer() {
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		ida = ItemDatabase.getInstance();
//		items = ida.findAll(this.id);
	}

	public Customer(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
		ida = ItemDatabase.getInstance();
//		items = ida.findAll(this.id);
	}

	public void addItem(Item item) {

			this.items = new ArrayList<>();
		
		
			this.items.add(item);
			ida.create(item, this.id);
			System.out.println("Item added");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", id=" + id + ", items=" + items + "]";
	}

}
