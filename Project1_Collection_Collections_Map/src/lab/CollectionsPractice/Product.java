package lab.CollectionsPractice;

import java.util.Scanner;

public class Product {
	public String name;
	public double price;
	
	public void input(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("> Name: ");
		this.name = scanner.nextLine();
		System.out.print("> Price: ");
		this.price = scanner.nextDouble();	
		scanner.nextLine();
	}
	
	public void output(){
		System.out.print("Name: "+this.name + " Price: "+this.price);
	}

}
