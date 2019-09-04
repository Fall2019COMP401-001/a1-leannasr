package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
// Code
		
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
		int[] totalQuantities = new int[stock];
		int[] peopleBought = new int[stock];
		
		for (int r = 0; r < stock; r++) {
			totalQuantities[r] = 0;
		}
		
		for (int v = 0; v < stock; v++) {
			peopleBought[v] = 0;
		}
		
		for (int x = 0; x < customers; x++) {
			fname[x] = scan.next();
			lname[x] = scan.next();
			itemsBought[x] = scan.nextInt();
			
			int[] repeatCheck = new int[stock];
			for (int q = 0; q < stock; q++) {
				repeatCheck[q] = 0;
			}
			
			for (int y = 0; y < itemsBought[x]; y++) {
				
				int quantity = scan.nextInt();
				String item = scan.next();
				if (quantity > 0) {
				for ( int z = 0; z < stock; z++) {
					if (item.equals(itemNames[z])) {
						totalQuantities[z] = totalQuantities[z] + quantity;
						if (repeatCheck[z] == 0) {
							peopleBought[z] = peopleBought[z] + 1;
							repeatCheck[z] = repeatCheck[z] + 1;
						}
					} 
					}
				}
				}
			}
		for ( int w = 0; w < stock; w++) {
			if (totalQuantities[w] == 0) {
				System.out.println("No customers bought " + itemNames[w]);
	} else {
		System.out.println(peopleBought[w] + " " + "customers bought " + totalQuantities[w] + " " + itemNames[w]);
	}
			
		}
	}
}