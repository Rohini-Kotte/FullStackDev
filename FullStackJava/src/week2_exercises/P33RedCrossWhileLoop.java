package week2_exercises;

import java.util.Scanner;

public class P33RedCrossWhileLoop {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total number of tents: ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		int i = 0;
		while (i < n) {
			int temp = i;

			System.out.println("Enter number of refugees staying in " + (temp + 1) + " tent");
			arr[i] = scan.nextInt();
			sum += arr[i];
			i++;
		}
		System.out.println("Total No of Citizens present in the camp: " + sum);
	}

}
