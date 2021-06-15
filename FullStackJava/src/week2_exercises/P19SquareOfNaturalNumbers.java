package week2_exercises;

public class P19SquareOfNaturalNumbers {
	
	/*
	 * Create a class with a method to find the difference between the sum of the
	 * squares and the square of the sum of the first n natural numbers. Method Name
	 * - calculateDifference Argument - int n Return Type - int sum Logic - Find the
	 * difference between the sum of the squares of the first n natural numbers and
	 * the square of their sum. For Example if n is 10,you have to find
	 * (1^2+2^2+3^2+….9^2+10^2)- (1+2+3+4+5…+9+10)^2
	 */

	int calculateSum(int n) {
		int sum = 0;
		int squareSum = 0;
		int i = 1;

		while (i <= n) {

			squareSum += (i * i);
			sum += i;
			i++;
		}

		return (squareSum - (sum * sum));
	}

	public static void main(String[] args) {
		P19SquareOfNaturalNumbers obj = new P19SquareOfNaturalNumbers();
		System.out.println("Calculated value: " + obj.calculateSum(4));

	}

}
