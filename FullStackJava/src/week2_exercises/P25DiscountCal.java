package week2_exercises;

import java.util.Scanner;

public class P25DiscountCal {

	/*
	 * Discount Calculation Calculate the discount based on the price of two items
	 * and the overall discount percentage. Input Format: a. Item 1 price as
	 * floating point b. Item 2 price as floating point c. Discount as integer
	 * Output Format: a. Total of Item 1 and Item 2 b. Price after discount (correct
	 * to 2 decimal places) c. Amount discounted (correct to 2 decimal places)
	 * Sample Input and Output Format: Price of item 1 : 20.50 Price of item 2 :
	 * 45.40 Discount in percentage : 10 Total amount : $65.90 Discounted amount :
	 * $59.31 Saved amount : $6.59
	 */

	void discountCalculation(float item1Price, float item2Price, int discountfig) {

		float totalAmount = item1Price + item2Price;
		System.out.println("Total Amount is: " + String.format("%.2f", totalAmount));

		float disAmountGiven = (totalAmount * discountfig) / 100;
		System.out.println("Saved Amount: " + String.format("%.2f", disAmountGiven));

		float savedAmt = totalAmount - disAmountGiven;
		System.out.println("Saved Amount: " + String.format("%.2f", savedAmt));

	}

	public static void main(String[] args) {
		P25DiscountCal obj = new P25DiscountCal();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first time price");
		float item1 = scan.nextFloat();

		System.out.println("Enter second time price");
		float item2 = scan.nextFloat();

		System.out.println("Enter the discount percentage");
		int disc = scan.nextInt();

		obj.discountCalculation(item1, item2, disc);
	}

}
