package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P10Union {
	/*
	 * Find A union B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6}; Sample
	 * output: int[] c={1,2,3,4,5,6}
	 */
	public static void main(String[] args) {

		// Using Set
		System.out.println("*** Using Set****");
		Integer[] arrA = { 1, 2, 3, 4 };
		Integer[] arrB = { 3, 4, 5, 6 };

		Set<Integer> set = new HashSet<Integer>();
		set.addAll(Arrays.asList(arrA));
		set.addAll(Arrays.asList(arrB));
		System.out.println("Union of 2 arrays " + set);

		// Using ArrayList
		System.out.println("***Using ArrayList and Arrays****");
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		ArrayList<Integer> uni = new ArrayList<Integer>();
		for (int each : arr1) {
			uni.add(each);
		}

		for (int each : arr2) {
			if (!uni.contains(each)) {
				uni.add(each);
			}
		}
		System.out.println("Union of 2 arrays " + uni);
	}

}
