package a1;

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
	String biggest = "";
	String smallest = "";
	for (int c = 0; c < totals.length; c++) {
		if ( totals[c] > compare) {
			compare = totals[c];
			biggest = "Biggest: " + fname[c] + " " + lname[c];
		} else {
			biggest = "Biggest: " + fname[fname.length - 1] + " " + lname[lname.length - 1];
		}
	}
	System.out.println(biggest);
	
	double compare2 = totals[totals.length - 1];
	for (int r = 0; r < totals.length; r++) {
		if (totals[r] < compare2) {
			compare2 = totals[r];
			smallest = "Smallest: " + fname[r] + " " + lname[r];
		} else {
			smallest = "Smallest: " + fname[fname.length - 1] + " " + lname[lname.length - 1];
		}
	}
	
	System.out.println(smallest);
	double bigTotal = 0;
	for ( int d = 0; d < totals.length; d++) {
		bigTotal = bigTotal + totals[d];
	}
	String average = "Average: " + bigTotal/customers; 
	System.out.println(average);
	}
	
};