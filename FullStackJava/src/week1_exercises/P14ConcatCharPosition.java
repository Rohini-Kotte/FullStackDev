package week1_exercises;

public class P14ConcatCharPosition {
	/*
	 * Concatenate the character in a given position. If there is no character in a
	 * given position place "$" sign. input1[]={"abc","da","ram"}; input2=3; hint :
	 * 3rd character is "c" in "abc" 3rd character is not present in "da", so place
	 * "$" 3rd character is "m" in "ram" concate all the characters to a single
	 * string "c$m" o/p string ="c$m";
	 */
	
	public static void main(String[] args) {

		String arr[] = { "abc", "da", "ram" };
		int input2 = 3;
		String temp = "";

		for (String each : arr) {
			if (each.length() < 3) {
				temp += "$";
			} else {
				temp += String.valueOf(each.charAt(2));
			}
		}
		
		System.out.println("Concatenate: "+temp);

	}

}
