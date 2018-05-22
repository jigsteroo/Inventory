package com.jigs.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jigs.app.Customer;
import com.jigs.app.Item;

public class ItemDatabase implements ItemDatabaseAccess {

	private static ItemDatabase itemInstance;
	
	private ItemDatabase() {}
	
	public static ItemDatabase getInstance() {
		if(itemInstance == null) {
			itemInstance = new ItemDatabase();
		}
		return itemInstance;
	}
	
	@Override
	public void delete(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Item item, int customer_id) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO item VALUES(?,?,?,?);");
			prepareStatement.setInt(1, item.getId());
			prepareStatement.setString(2, item.getName());
			prepareStatement.setInt(3, item.getQuantity());
			prepareStatement.setInt(4,customer_id);
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Item item) {
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection
					.prepareStatement("UPDATE item SET name = ?, quantity = ? WHERE item_id = ?;");// one hour
			prepareStatement.setString(1, item.getName());
			prepareStatement.setInt(2, item.getQuantity());
			prepareStatement.setInt(3, item.getId());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Item> findAll(int customer_id) {
		List<Item> items = new ArrayList<>();
		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM item;");
			ResultSet rs = prepareStatement.executeQuery();
			while (rs.next()) {
				Item item = new Item(rs.getString(2), rs.getInt(3), rs.getInt(1), rs.getInt(4));
				items.add(item);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}
	
}
