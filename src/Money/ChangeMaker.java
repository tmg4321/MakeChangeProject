package Money;

import java.util.*;

public class ChangeMaker {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("Enter price of item: ");
		float price = kb.nextFloat();

		System.out.print("Enter amount customer tendered: ");
		float tender = kb.nextFloat();

		while (price > tender) {
			System.out.println("$" + tender + " is NOT enough to cover " + "$" + price);
			System.out.println("Enter amount customer tendered: ");
			tender = kb.nextFloat();
		}

		while (price == tender) {
			System.out.println("\n$" + tender + " exactly covers the price of this item.\n\nNO CHANGE.");
			break;
		}

		int change100 = (int) ((tender - price) * 100);

		while (price < tender && (change100 != 0)) {

			if (change100 > 2000) {
				int twenties = (change100 - (change100 % 2000)) / 2000;
				if (twenties == 1) {
					System.out.println("\nReturn " + twenties + " twenty to customer");
				} else {
					System.out.println("\nReturn " + twenties + " twenties to customer");
				}
				change100 = change100 - (twenties * 2000);
				continue;
			}

			if (change100 > 1000) {
				int tens = (change100 - (change100 % 1000)) / 1000;
				if (tens == 1) {
					System.out.println("\nReturn " + tens + " ten to customer");
				} else {
					System.out.println("\nReturn " + tens + " tens to customer");
				}
				change100 = change100 - (tens * 1000);
				continue;

			}

			if (change100 > 500) {
				int fives = (change100 - (change100 % 500)) / 500;
				if (fives == 1) {
					System.out.println("\nReturn " + fives + " five to customer");
				} else {
					System.out.println("\nReturn " + fives + " fives to customer");
				}
				change100 = change100 - (fives * 500);
				continue;
			}

			if (change100 > 100) {
				int ones = (change100 - (change100 % 100)) / 100;
				if (ones == 1) {
					System.out.println("\nReturn " + ones + " one-dollar bill to customer");
				} else {
					System.out.println("\nReturn " + ones + " one-dollar bills to customer");
				}
				change100 = change100 - (ones * 100);
				continue;
			}
			if (change100 > 25) {
				int quarters = (change100 - (change100 % 25)) / 25;
				if (quarters == 1) {
					System.out.println("\nReturn " + quarters + " quarter to customer");
				} else {
					System.out.println("\nReturn " + quarters + " quarters to customer");
				}
				change100 = change100 - (quarters * 25);
				continue;
			}
			if (change100 > 10) {
				int dimes = (change100 - (change100 % 10)) / 10;
				if (dimes == 1) {
					System.out.println("\nReturn " + dimes + " dime to customer");
				} else {
					System.out.println("\nReturn " + dimes + " dimes to customer");
				}
				change100 = change100 - (dimes * 10);
				continue;
			}

			if (change100 > 5) {
				int nickles = (change100 - (change100 % 5)) / 5;
				if (nickles == 1) {
					System.out.println("\nReturn " + nickles + " nickle to customer");
				} else {
					System.out.println("\nReturn " + nickles + " nickle to customer");
				}
				change100 = change100 - (nickles * 5);
				System.out.println(change100);
				continue;
			}
			if (change100 > 1) {
				int pennies = (change100 - (change100 % 1));
				if (pennies == 1) {
					System.out.println("\nReturn " + pennies + " lucky penny to customer");
				} else {
					System.out.println("\nReturn " + pennies + " pennies to customer");
				}
				change100 = 0;
				continue;
			}
		}//end while
		
		kb.close();
	}// end main

}// end class
	// need method to handle use input
	// need method to calculate change
	//
	// In the cash register we will calculate the amount of change returned to a
	// customer
	// based on the purchase price and the amount tendered.
	// We will also notify the attendant how many of each piece of currency
	// ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change
	// for the customer. Change should be provided using the largest bill and
	// coin
	// denominations as possible. Denominations that are not used should not be
	// displayed.

// +*Hint: Mod operator*

// #### User Story #1

// The user is prompted asking for the price of the item.
//
// +##### User Story #2
//
// The user is then prompted asking how much money was tendered by the customer.
//
// +##### User Story #3
//
// Display an appropriate message if the customer provided too little money or
// the exact amount.
//
// +##### User Story #4
//
// If the amount tendered is more than the cost of the item, display the
// number of bills and coins that should be given to the customer.

// #### Grading
//
// This is a graded project. You are expected to have your project completed by
// the start of class on Monday morning.
//
// You will be given either a pass or fail based on whether your code works
// given all of the following test conditions:
//
// * Amount: .67, Tendered: .50, Result: Error message
// * Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
// * Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
// * Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar
// bill, 1 one dollar bill, 4 pennies.
//
// If the project does work with all of the above test conditions, you will be
// given a *1* for this week's project.
//
// If the project does not work with the above test conditions, you will be
// given a *0* for this week's project.
//
// If you get a zero on the project, you can upgrade to a score of *.5* if you
// turn in a working project by the start of class on the following Monday
// morning AND notify an instructor that you wish to get partial credit.
//
// To turn in a project, you must push it to GitHub. You must include a
// README.md that describes how to run your program.
