package week2_exercises;

import java.util.Scanner;

public class P34RedCrossForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total number of tents: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int sum = 0;

		for (int each : arr) {
			System.out.println("Enter number of refugees staying ");
			each = scan.nextInt();
			sum += each;

		}

		System.out.println("Total No of Citizens present in the camp: " + sum);
	}

}
