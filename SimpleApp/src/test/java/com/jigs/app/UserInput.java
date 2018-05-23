package com.jigs.app;

import java.util.Scanner;

public class UserInput {
	Scanner input = new Scanner(System.in);
	public Customer createCustomer() {
		System.out.println("Enter name");
		String name = input.nextLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(input.nextLine());
		
		return new Customer(name, age);
	}
	
	//nawewweweew
	///lol
	
	
	public void walking() {
		
	}
}
