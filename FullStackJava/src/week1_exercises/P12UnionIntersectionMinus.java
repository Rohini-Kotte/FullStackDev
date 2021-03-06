package week1_exercises;

import java.util.ArrayList;

public class P12UnionIntersectionMinus {
	/*
	 * Find (A union B) - (A intersection B) Sample input: int[] a={1,2,3,4};
	 * int[]b={3,4,5,6}; a union b = {1,2,3,4,5,6} a intersection b = {3,4} (a
	 * union* b)-(a intersection b) = {1,2,5,6} Sample output: int[] c={1,2,5,6}
	 */
	public static void main(String[] args) {

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

		ArrayList<Integer> compArray = new ArrayList<Integer>();
		ArrayList<Integer> intersectionList = new ArrayList<Integer>();
		for (int each : arr1) {
			compArray.add(each);
		}

		for (int each : arr2) {
			if (compArray.contains(each)) {
				intersectionList.add(each);
			}

		}

		for (int each : uni) {
			if (!intersectionList.contains(each)) {
				System.out.println(each);

			}
		}

	}

}
