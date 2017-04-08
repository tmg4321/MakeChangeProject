package Money;

import java.util.*;

public class ChangeMaker {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		boolean keepGoing;

		do {
			System.out.print("\nEnter purchase price: ");
			float price = kb.nextFloat();

			System.out.print("\nEnter amount tendered: ");
			float tender = kb.nextFloat();

			while (price > tender) {
				System.out.println("$" + tender + " is NOT enough to cover " + "$" + price);
				System.out.print("Enter amount customer tendered: ");
				tender = kb.nextFloat();
			}

			while (price == tender) {
				System.out.println("\n$" + tender + " exactly covers the price of this item.");
				break;
			}

			int change100 = (int) (((tender - price) * 100) + 0.5);
			int tempChangeRequired100 = (int) (((tender - price + 0.005) * 100));
			double changeRequired = (double) tempChangeRequired100 / 100;
			System.out.println("\nChange required is : $" + changeRequired);

			while (price < tender && (change100 != 0)) {

				if (change100 >= 2000) {
					int twenties = (change100 - (change100 % 2000)) / 2000;
					if (twenties == 1) {
						System.out.println("\n\t" + twenties + " twenty-dollar bill");
					} else {
						System.out.println("\n\t" + twenties + " twenty-dollar bills");
					}
					change100 = change100 - (twenties * 2000);
				}

				if (change100 >= 1000) {
					int tens = (change100 - (change100 % 1000)) / 1000;
					if (tens == 1) {
						System.out.println("\n\t" + tens + " ten-dollar bill");
					} else {
						System.out.println("\n\t" + tens + " ten-dollar bills");
					}
					change100 = change100 - (tens * 1000);
				}

				if (change100 >= 500) {
					int fives = (change100 - (change100 % 500)) / 500;
					if (fives == 1) {
						System.out.println("\n\t" + fives + " five-dollar bill");
					} else {
						System.out.println("\n\t" + fives + " fives-dollar bills");
					}
					change100 = change100 - (fives * 500);
				}

				if (change100 >= 100) {
					int ones = (change100 - (change100 % 100)) / 100;
					if (ones == 1) {
						System.out.println("\n\t" + ones + " one-dollar bill");
					} else {
						System.out.println("\n\t" + ones + " one-dollar bills");
					}
					change100 = change100 - (ones * 100);
				}

				if (change100 >= 25) {
					int quarters = (change100 - (change100 % 25)) / 25;
					if (quarters == 1) {
						System.out.println("\n\t" + quarters + " quarter");
					} else {
						System.out.println("\n\t" + quarters + " quarters");
					}
					change100 = change100 - (quarters * 25);
				}

				if (change100 >= 10) {
					int dimes = (change100 - (change100 % 10)) / 10;
					if (dimes == 1) {
						System.out.println("\n\t" + dimes + " dime");
					} else {
						System.out.println("\n\t" + dimes + " dimes");
					}
					change100 = change100 - (dimes * 10);
				}

				if (change100 >= 5) {
					int nickles = (change100 - (change100 % 5)) / 5;
					if (nickles == 1) {
						System.out.println("\n\t" + nickles + " nickle");
					} else {
						System.out.println("\n\t" + nickles + " nickle");
					}
					change100 = change100 - (nickles * 5);
				}

				if (change100 >= 1) {
					int pennies = (change100 - (change100 % 1));
					if (pennies == 1) {
						System.out.println("\n\t" + pennies + " lucky penny");
					} else {
						System.out.println("\n\t" + pennies + " pennies");
					}
					change100 = 0;
				}
			} // end while

			System.out.print("\nAnother transaction? (Y or N): ");
			String yesOrNo = kb.next();
			yesOrNo = yesOrNo.toUpperCase();
			if (yesOrNo.equals("Y")) {
				keepGoing = true;
			} else {
				keepGoing = false;
			}

		} while (keepGoing == true);

		System.out.println("\nGoodbye!");

		kb.close();

	}// end main

}// end class
