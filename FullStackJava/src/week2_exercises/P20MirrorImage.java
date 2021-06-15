package week2_exercises;

public class P20MirrorImage {

	/*
	 * Create a class containing a method to create the mirror image of a String.
	 * The method should return the two Strings separated with a pipe(|) symbol .
	 * Method Name - getImage Argument - String Return Type - String Logic - Accepts
	 * One String. Find the mirror image of the String. Add the two Strings together
	 * separated by a pipe(|) symbol. For Example Input : EARTH Output : EARTH|HTRAE
	 */

	String getImage(String input) {

		String mirror = input + "|";
		for (int i = input.length() - 1; i >= 0; i--) {
			mirror += input.charAt(i);
		}
		return mirror;
	}

	public static void main(String[] args) {
		P20MirrorImage obj = new P20MirrorImage();
		System.out.println(obj.getImage("EARTH"));

	}

}
