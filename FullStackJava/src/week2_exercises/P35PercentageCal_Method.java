package week2_exercises;

import java.util.Scanner;

public class P35PercentageCal_Method {

	/*
	Refer 24 Profit and Loss (Using Methods)
	Note:
	• Use methods to modularize the program coded earlier for this problem statement.
	• Create a method calculateProfit() with the below mentioned signature. 
	•public float calculateProfit(int dozenCount, int pricePerDozen, int sellPrice) 
	• Invoke this method from the main method
	*/

	public float calculateProfit(int toysInDozen, int ratePerD, int sellPriceToy) {
		float profitPercentage = 0;
		float eachPrice = ratePerD / (float) 12;
		float profit = sellPriceToy - eachPrice;
		profitPercentage = (profit / eachPrice) * 100;

		return profitPercentage;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Dozens of Toy purchased ");
		int x = scan.nextInt();

		System.out.println("Enter purchased rate for dozen of toys: ");
		int y = scan.nextInt();

		System.out.println("Enter selling price of each toy ");
		int z = scan.nextInt();

		P35PercentageCal_Method obj = new P35PercentageCal_Method();

		String percent = String.format("%.2f", obj.calculateProfit(x, y, z));

		System.out.println("Profit percentage: " + percent);

	}

}
