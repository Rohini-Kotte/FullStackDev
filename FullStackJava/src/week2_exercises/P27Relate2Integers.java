package week2_exercises;

import java.util.Scanner;

public class P27Relate2Integers {

	/*
	 * Compare 2 Integers Write a program to relate 2 integers entered by the user
	 * as equal to, less than or greater than. Input and Output Format: Input
	 * consists of 2 integers. Sample Input and Output 1: Enter the first number 6
	 * Enter the second number 8 6 is less than 8 Sample Input and Output 2: Enter
	 * the first number 8 Enter the second number 6 8 is greater than 6 Sample Input
	 * and Output 3: Enter the first number 8 Enter the second number 8 8 is equal
	 * to 8
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = scan.nextInt();

		System.out.println("Enter the second number: ");
		int n2 = scan.nextInt();

		if (n1 < n2) {
			System.out.println(n1 + " is less than " + n2);
		} else if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else {
			System.out.println(n1 + " is equal to " + n2);
		}

	}

}
