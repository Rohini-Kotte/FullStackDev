package week1_exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class P11Intersection {

	/*
	 * Find A interscetion B Sample input: int[] a={1,2,3,4}; int[] b={3,4,5,6};
	 * Sample output: int[] c={3,4}
	 */

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };

		ArrayList<Integer> compArray = new ArrayList<Integer>();
		ArrayList<Integer> intersectionList = new ArrayList<Integer>();
		for (int each : b) {
			compArray.add(each);
		}

		for (int each : a) {
			if (compArray.contains(each)) {
				intersectionList.add(each);
			}

		}

		System.out.println("Intersection of 2 Arrays " + intersectionList);
	}

}
