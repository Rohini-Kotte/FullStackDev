package week2_exercises;

public class P21PowerValueAdd {
	/*
	 * Given a method with an int array. Write code to find the power of each
	 * individual element according to its position index, add them up and return as
	 * output. Example: input = {3,6,2,1} output = (3)0+(6)1+(2)2+(1)3 = 1+6+4+1=12
	 */

	int powerCal(int[] arr) {
		int calSum = 0;
		for (int i = 0; i < arr.length; i++) {
			calSum += Math.pow(arr[i], i);
		}

		return calSum;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 2, 1 };
		P21PowerValueAdd obj = new P21PowerValueAdd();

		System.out.println(obj.powerCal(arr));
	}

}
