package week2_exercises;

public class P18NaturalNumbersCal {

	/*
	 * Create a class with a method which can calculate the sum of first n natural
	 * numbers which are divisible by 3 or 5. Method Name - calculateSum Argument -
	 * int n Return Type - int sum Logic - Calculate the sum of first n natural
	 * numbers which are divisible by 3 or 5.
	 */

	int calculateSum(int n) {
		int sum = 0;
		int i = 1;

		while (i <= n) {
			if (i % 3 == 0) {
				sum += i;
			} else if (i % 5 == 0) {
				sum += i;
			}
			i++;
		}

		return sum;
	}

	public static void main(String[] args) {
		P18NaturalNumbersCal obj = new P18NaturalNumbersCal();
		System.out.println("Sum of Natural Numbers"+obj.calculateSum(9));

	}

}
