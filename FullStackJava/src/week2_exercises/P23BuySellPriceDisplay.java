package week2_exercises;

import java.util.Scanner;

public class P23BuySellPriceDisplay {

	/*
	 * Profit Calculation Inorder to calculate profit percentage of the Electronic
	 * gadgets sold in a store, you need to store the buying price and selling price
	 * of the gadgets. Write a program to store the buying price and selling price
	 * of the products and print the values to the console. Note: ? Create the
	 * variables buyingPrice,sellingPrice ? Assign the variables with values for
	 * buying price as 20.54 and selling price as 30.50 Sample Output: Buying price
	 * is 20.54 Selling price is 30.50
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter buying price for gadget#12");
		float buyPrice = scan.nextFloat();

		System.out.println("Enter Selling price for gadget#12");
		float sellPrice = scan.nextFloat();

		System.out.println("Buying price is " + buyPrice + " Selling price is " + sellPrice);

	}

}
