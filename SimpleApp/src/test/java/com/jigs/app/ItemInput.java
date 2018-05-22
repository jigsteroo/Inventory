package com.jigs.app;

import java.util.Scanner;

public class ItemInput {
	Scanner input = new Scanner(System.in);
	public Item createItem() {
		System.out.println("enter item name: ");
		String name = input.nextLine();
		System.out.println("Enter quantity: ");
		int quantity = Integer.parseInt(input.nextLine());
		
		return new Item(name, quantity);
	}
}
