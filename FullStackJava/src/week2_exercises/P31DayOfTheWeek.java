package week2_exercises;

import java.util.Scanner;

public class P31DayOfTheWeek {

	public static void main(String[] args) {

		/*
		 * Day of the Week (Using new keyword) Write a program to find the day of the
		 * week for the day number given. 1 should return Sun, 2 should return Mon, etc.
		 * Note: Declare and Initialize array elements using new keyword. Sample Input
		 * and Output: Enter the day number 3 Day of the week is Tue
		 */	
		
		
		
		String[] arr = new String []{ "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the day number:(1 to 7) ");
		int i = scan.nextInt();
		System.out.println("Day of the week: " + arr[i - 1]);

		
		
		
		
		
		
	}

}
