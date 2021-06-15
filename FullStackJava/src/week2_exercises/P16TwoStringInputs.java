package week2_exercises;

public class P16TwoStringInputs {
	
	/*
	 * Given a method with two strings as input. Write code to modify the first
	 * string such that all characters are replace by plus sign except the
	 * characters which are present in the second string. That is, if one or more
	 * characters of first string appear in second string, they will not be replace
	 * by +. Return the modified string as output. Note-ignore case.
	 */
		
		StringBuilder modifyFirstString(String input1, String input2) {
		StringBuilder bs = new StringBuilder();
		String temp = input1.toLowerCase();
		input2 = input2.toLowerCase();

		for (int i = 0; i < temp.length(); i++) {
			if (input2.contains(String.valueOf(temp.charAt(i)))) {
				bs = bs.append(input1.charAt(i));
			} else {
				bs = bs.append("+");
			}
		}
		return bs;
	}

	public static void main(String[] args) {
		
		P16TwoStringInputs obj = new P16TwoStringInputs();
		
		System.out.println(obj.modifyFirstString("New York", "New Jersy"));
	}

}
