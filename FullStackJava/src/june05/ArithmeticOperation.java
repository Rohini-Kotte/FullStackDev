package june05;

public class ArithmeticOperation {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("Addition of 2 numbers: " + (a + b));
		System.out.println("Subtraction of 2 numbers: " + (a - b));
		System.out.println("Multiplication of 2 numbers: " + (a * b));
		System.out.println("Division of 2 numbers: " + (a / b));

	}

}
