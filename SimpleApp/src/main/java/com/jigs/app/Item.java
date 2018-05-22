package com.jigs.app;

public class Item {

	private String name;
	private int quantity;
	private int id;
	private int customer_id;
	
	public Item() {}
	
	public Item (String name, int quantity, int id, int customer_id) {
		this.name = name;
		this.quantity = quantity;
		this.id =id;
		this.customer_id = customer_id;
	}
	public Item (String name, int quantity, int id) {
		this.name = name;
		this.quantity = quantity;
		this.id =id;
	}
	
	public Item (String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Item other = (Item) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", quantity=" + quantity + ", id=" + id + ", user_id=" + customer_id + "]";
	}
	
	
	
}
