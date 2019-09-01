package a1;

import java.util.Objects;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		class Stock {
			String name = scan.next();
			double price = scan.nextDouble();
		}
		
		class Customer {
			String fname = scan.next();
			String lname = scan.next();
			int items = scan.nextInt();
			double total = 0;
		}
		
	int stock = scan.nextInt();
	Stock[] items = new Stock[stock];
	for (int i = 0; i < stock; i++) {
		items[i] = new Stock();
	}
	int people = scan.nextInt();
	Customer[] customers = new Customer[people];
	for (int c = 0; c < people; c++) {
		customers[c] = new Customer();
	}
	
	for (int z = 0; z < customers[z].items; z++) {
		double total = 0.00;
		int q = scan.nextInt();
		String name = scan.next();
		for (int x = 0; x < items.length; x++) {
			if (Objects.equals(name,  items[x].name)) {
				customers[z].total = total + q*items[x].price;
			}
		}
	}
	double compare = customers[customers.length - 1].total;
	String biggest = "";
	for (int y = 0; y < customers.length; y++) {
		if (compare < customers[y].total) {
			compare = customers[y].total;
			biggest = customers[y].fname + " " + customers[y].lname + " (" + customers[y].total + ")";
		}
	}
	double compare2 = customers[customers.length - 1].total;
	String smallest = "";
	for (int s = 0; s < customers.length; s++) {
		if (customers[s].total < compare2) {
			compare2 = customers[s].total;
			smallest = customers[s].fname + " " + customers[s].lname + " (" + customers[s].total + ")";
		}
	}
	double tot = 0.00;
	for (int a = 0; a < customers.length; a++) {
		tot = tot + customers[a].total;
	}
	
	System.out.println("Biggest: " + biggest);
	System.out.println("Smallest: " + smallest);
	System.out.println("Average: " + tot/people);

	}
}
