package week1_exercises;

import java.util.Arrays;

public class P3SumMaxNMain {

	public static void main(String[] args) {
		int[] arr = {19,12,17};
		
		//sort the Array
		Arrays.sort(arr);

		//Get min and max values by using index
		int min=arr[0];
		int max=arr[arr.length-1];
		
		int sum=min+max;
		System.out.println("Sum: "+sum);
	}
}
