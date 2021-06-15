package week2_exercises;

public class P17Encryption {
	
	/*
	 * Given a method with a string input. Write code to encrypt the given string
	 * using following rules and return the encrypted string: a. Replace the
	 * character at odd positions by next character in alphabet b. Leave the
	 * characters at even positions unchanged Note:if an odd position character is
	 * 'z' replace it by 'a' assume the first character in the string is at position
	 * 1
	 */

	StringBuilder encrytData(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				int ascii = input.charAt(i);
				char each = (char) (ascii + 1);
				sb = sb.append(each);

			} else {
				sb = sb.append(input.charAt(i));
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		P17Encryption obj = new P17Encryption();
		System.out.println(obj.encrytData("curiosity"));
	}

}
