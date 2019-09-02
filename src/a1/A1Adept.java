package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int stock = scan.nextInt();
		String[] itemNames = new String[stock];
		double[] itemPrices = new double[stock];
		for (int i = 0; i < stock; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int customers = scan.nextInt();
		String[] fname = new String[customers];
		String[] lname = new String[customers];
		int[] itemsBought = new int[customers];
		double[] totals = new double[customers];
		for (int x = 0; x < customers; x++) {
			fname[x] = scan.next();
			lname[x] = scan.next();
			itemsBought[x] = scan.nextInt();
			double total = 0.00;
			
			for (int y = 0; y < itemsBought[x]; y++) {
				int quantity = scan.nextInt();
				String item = scan.next();
				
				for (int z = 0; z < itemNames.length; z++) {
					if ( item.equals(itemNames[z])) {
						total = total + quantity*itemPrices[z];
					}
				}
			}
			totals[x] = total;
		}
	double compare = totals[totals.length - 1];
	double biggest = 0;
	double smallest = 0;
	String firstName = "";
	String lastName = "";
	for (int c = 0; c < totals.length; c++) {
		if ( totals[c] > compare) {
			compare = totals[c];
			biggest = totals[c];
			firstName = fname[c];
			lastName = lname[c];
		} else {
			biggest = compare;
			firstName = fname[fname.length - 1];
			lastName = lname[lname.length - 1];
		}
	}
	String.format("%.2f", biggest);
	System.out.println("Biggest: " + firstName + " " + lastName + " (" + biggest + ")");
	
	double compare2 = totals[totals.length - 1];
	for (int r = 0; r < totals.length; r++) {
		if (totals[r] < compare2) {
			compare2 = totals[r];
			smallest = totals[r];
			firstName = fname[r];
			lastName = lname[r];
		} else {
			smallest = compare2;
			firstName = fname[fname.length - 1];
			lastName = lname[lname.length - 1];
		}
	}
	String.format("%.2f", smallest);
	System.out.println(("Smallest: " + firstName + " " + lastName + " (" + smallest + ")" ));
	
	double bigTotal = 0;
	for ( int d = 0; d < totals.length; d++) {
		bigTotal = bigTotal + totals[d];
	}
	double average = bigTotal/customers; 
	String.format("%.2f", average);
	System.out.println("Average: " + average);
	}
	
};