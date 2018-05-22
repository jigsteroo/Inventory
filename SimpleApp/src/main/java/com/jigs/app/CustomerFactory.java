package com.jigs.app;

import java.util.Scanner;

public class CustomerFactory {
	private Customer customer;
	Scanner input = new Scanner (System.in);
	public void startUp() {
		
		System.out.println("Enter name");
		String person = input.nextLine();
		System.out.println("Age: ");
		int age = input.nextInt();
		
	}
}
