package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String [] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter Product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine();
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be added in Stock: ");
		int quantity = sc.nextInt();
		
		product.addProduty(quantity);
		System.out.println("\nUpdate data: " + product.toString());
		
		System.out.println("\nEnter the number of products to be remove from Stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("\nUpdate data: " + product.toString());
		
		sc.close();
	}
}
