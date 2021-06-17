package week2_exercises;

import java.util.Scanner;

public class P28SecureURLValidation {
	/*
	 * Secure URL Write a program to check whether the given URL is secure. Example:
	 * Secure URL: https://www.amazon.com/ Sample Input and Output 1: Enter the
	 * string http://www.amazon.com/ Enter the start string https
	 * "http://www.amazon.com/" does not start with "https" Sample Input and Output
	 * 2: Enter the string https://www.amazon.com Enter the start string https
	 * "https://www.amazon.com/" starts with "https"
	 */
		public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		String input = scan.next();
		if (input.length() > 10) {

			if (input.substring(0, 6).equalsIgnoreCase("https:")) {
				System.out.println("String starts with https. Its a secure url");
			} else if (input.substring(0, 5).equalsIgnoreCase("http:")) {
				System.out.println("String does not starts with https. Its not a secure url");
			} else {
				System.out.println("Please Enter a valid url");
			}
		} else {
			System.out.println("Please enter a valid url");
		}
	}

}
