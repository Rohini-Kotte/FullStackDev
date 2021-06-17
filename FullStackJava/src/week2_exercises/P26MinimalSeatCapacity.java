package week2_exercises;

import java.util.Scanner;

public class P26MinimalSeatCapacity {

	/*
	 * Lab Allocation There are 3 labs in the CSE department (L1, L2 and L3) with a
	 * seating capacity of x, y and z. Find the lab which has the minimal seating
	 * capacity. Input and Output Format: Assume that x, y and z are always
	 * distinct. Refer sample input and output. Sample Input and Output 1: x 30 y 40
	 * z 20 L3 has the minimal seating capacity
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seating capacity for lab L1: ");
		int x = scan.nextInt();

		System.out.println("Enter seating capacity for lab L2: ");
		int y = scan.nextInt();

		System.out.println("Enter seating capacity for lab L3: ");
		int z = scan.nextInt();

		if (x < y && x < z) {
			System.out.println("L1 has minimal capacity: " + x);
		} else if (y < x && y < z) {
			System.out.println("L2 has minimal capacity: " + y);
		} else if (z < x && z < y) {
			System.out.println("L3 has minimal capacity: " + z);
		} else {
			System.out.println("Please enter only distinct values for L1,L2,L3");
		}
	}

}
