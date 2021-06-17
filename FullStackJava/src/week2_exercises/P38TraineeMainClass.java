package week2_exercises;

import java.util.Scanner;

public class P38TraineeMainClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter total No of Trainee Details");
		int n = scan.nextInt();

		P38Trainee[] arr = new P38Trainee[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Trainee ID: ");
			int empID = scan.nextInt();

			System.out.println("Enter Employee name: ");
			String name = scan.next();

			arr[i] = new P38Trainee(empID, name);
		}

		for (P38Trainee each : arr) {

			each.display();
		}
	}

}
