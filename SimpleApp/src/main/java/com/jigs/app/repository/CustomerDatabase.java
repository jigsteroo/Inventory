package com.jigs.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jigs.app.Customer;

public class CustomerDatabase implements CustomerDatabaseAccess {

	@Override
	public void delete(Customer customer) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection.prepareStatement("DELETE FROM customer WHERE id = ?;");
			prepareStatement.setInt(1, customer.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void create(Customer customer) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO customer VALUES(?,?,?);");
			prepareStatement.setString(1, null);
			prepareStatement.setString(2, customer.getName());
			prepareStatement.setInt(3, customer.getAge());
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(Customer customer) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection
					.prepareStatement("UPDATE customer SET name = ?, age = ? WHERE customer_id = ?;");// one hour
			prepareStatement.setString(1, customer.getName());
			prepareStatement.setInt(2, customer.getAge());
			prepareStatement.setInt(3, customer.getId());
			prepareStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM customer;");
			ResultSet rs = prepareStatement.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer(rs.getString(2), rs.getInt(3), rs.getInt(1));
				customers.add(customer);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public Customer findById(int id) {
		Connection connection;
		Customer cus = null;
		List<Customer> customers = new ArrayList<>();
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "");
			PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM customer WHERE customer_id = ?;");
			prepareStatement.setInt(1, id);
			ResultSet rs = prepareStatement.executeQuery();
			if (rs.next()) {
				cus = new Customer(rs.getString(2), rs.getInt(3), rs.getInt(1));
				customers.add(cus);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cus;
	}
		
}
