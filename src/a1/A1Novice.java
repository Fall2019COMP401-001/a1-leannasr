package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt();
		for ( int i = 0; i < customers; i++) {
			String fname = scan.next();
			String lname = scan.next();
			System.out.println(fname.charAt(0) + ". " );
			System.out.println(lname);
			int items = scan.nextInt();
			double total = 0;
			for ( int c = 0; c < items; i++) {
				int count = scan.nextInt();
				String type = scan.next();
				double price = count * scan.nextDouble();
				total = total + price;
			}
			System.out.println(total);
		}
		
	}
};
