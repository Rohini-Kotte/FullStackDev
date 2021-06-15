package week1_exercises;

public class P5SumOfDigitsInArray {

	public static void main(String[] args) {
		
		String[] arr = { "2AA", "12", "ABC", "c1a" };
		
		int sum = 0;
		for (String each : arr) {
			String temp = each.replaceAll("[a-bA-z]", "");

			if (temp.length() > 0) {
				for (char ch : temp.toCharArray()) {
					sum = sum + Character.getNumericValue(ch);
					System.out.println(sum);
				}
			}

		}
	}

}
