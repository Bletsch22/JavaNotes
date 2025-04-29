package notes;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Whats your name? ");
			String name = sc.nextLine();
			
			System.out.println("Welcome " + name);
			int selection = 0;
			double total = 0;
			
			
			while (selection !=4 ) {
				System.out.println("Select an option:");
				System.out.println("1) add Candybar to shopping cart: $1.99");
				System.out.println("2) add Cheese to shopping cart: $2.99 ");
				System.out.println("3) add Milk to shopping cart: $3.99");
				System.out.println("4)check out");
				selection = sc.nextInt();
				
			
				switch (selection) {
					case 1:
						total += 1.99;
						break;
					case 2:
						total += 2.99;
						break;
					case 3:
						total += 3.99;
						break;
					case 4:
						break;
					default:
						System.out.println("Please select a valid option");
				}
			}
			System.out.println("Total:" + "$" + total);
		}
		
		
		
		}
			
				
}