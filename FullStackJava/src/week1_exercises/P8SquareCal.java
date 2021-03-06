package week1_exercises;

public class P8SquareCal {
	/*
	 * Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) o/p should be
	 * rounded of to int; Sample input: double x1=5; double x2=6; double y1=8;
	 * double y2=3; output : 15
	 */

	public static void main(String[] args) {
		double x1 = 5;
		double x2 = 6;
		double y1 = 8;
		double y2 = 3;

		int cal = (int) Math.sqrt(((x1 + x2) * (x1 + x2)) + ((y1 + y2) * (y1 + y2)));

		System.out.println("Squart root of given values for expression: " + cal);

	}

}
