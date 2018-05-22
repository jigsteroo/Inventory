package com.jigs.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root" , "");
				PreparedStatement prepareStatement = connection.prepareStatement("create table if not exists item (id int not null auto_increment, name varchar(255), primary key (id) )");
				prepareStatement.executeUpdate();
				prepareStatement = connection.prepareStatement("insert into item(name) values('Jigs') ");
				prepareStatement.executeUpdate();
				prepareStatement = connection.prepareStatement("select * from  item");
				ResultSet executeQuery = prepareStatement.executeQuery();
				if (executeQuery.next()) {
					System.out.println(executeQuery.getString(2));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
