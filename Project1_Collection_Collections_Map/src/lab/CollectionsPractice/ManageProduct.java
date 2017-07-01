package lab.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ManageProduct {
	static Scanner scanner = new Scanner(System.in);
	static List<Product> list = new ArrayList<Product>();//ArrayList implement methods of List
	
	public static void main(String[] args) {
		while(true){
			menu();
		}
	}

	private static void menu() {
		System.out.println("Product Managing");
		System.out.println("--------------");
		System.out.println("1. Input");
		System.out.println("2. Output");
		System.out.println("3. Search");
		System.out.println("4. Delete");
		System.out.println("5. Update");
		System.out.println("6. Sort");
		System.out.println("7. Shuffle");//Mixed elements
		System.out.println("8. Exit");
		System.out.println("--------------");
		System.out.print(">> Choose the option: ");
		
		int choose = scanner.nextInt();
		scanner.nextLine();//remove Enter sign
		switch (choose) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;
		case 3:
			search();
			break;
		case 4:
			delete();
			break;
		case 5:
			update();
			break;
		case 6:
			sort();
			break;
		case 7:
			shuffle();
			break;
		case 8:
			System.exit(0);
			break;
		default:
			System.out.print("Please choose the options from 1->8");
			break;
		}
		
	}

	private static void shuffle() {
		Collections.shuffle(list);//mixed elements in list
	}

	private static void sort() {
		Collections.sort(list,new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price > o2.price){
					return 1;
				}
				if(o2.price < o1.price){
					return -1;
				}
				return 0;
			}
		});
	}

	private static void update() {
		System.out.print("> Name: ");
		String name = scanner.nextLine();
		
		for(Product p:list){
			if(p.name.equalsIgnoreCase(name)){
				p.input();
			}
		}
	}

	private static void delete() {
		System.out.print("> Name: ");
		String name = scanner.nextLine();
		
		for(Product p:list){
			if(p.name.equalsIgnoreCase(name)){
				list.remove(p);
				break;
			}
		}
	}

	private static void search() {
		System.out.print("> Min price: ");
		double min = scanner.nextDouble();
		System.out.print("> Max price: ");
		double max = scanner.nextDouble();
		
		System.out.println("Searching result: ");
		for(Product p:list){
			if(p.price>=min && p.price<=max){
				p.output();
				System.out.println();
			}
		}
	}

	private static void output() {
		System.out.println("Product's list:");
		for(Product p:list){
			p.output();
			System.out.println();
		}
	}

	private static void input() {
		while(true){
			Product p = new Product();
			p.input();
			list.add(p);//add p object into ArrayList
			System.out.print("> Input more(Y/N)?");
			if(scanner.nextLine().equalsIgnoreCase("N")){
				break;
			}
		}
	}
	

}
