package week1_exercises;

public class P7Email {
//	Email Validation. Output is false if the validation fails else true.
//	String input1="test@gmail.com" 
//	1)@ & : should be present;
//	2)@ & . should not be repeated;
//	3)there should be four charcters between @ and .;
//	4)there shouls be atleast 3 characters before @ ;
//	5)the end of mail id should be .com; 
//	Expected Output=true

	public static void main(String[] args) {
		boolean flag = true;
		int at = 0;
		int dot = 0;
		String input = "test@gmail.com";
		int one = input.substring(input.indexOf('@') + 1, input.indexOf('.')).length();
		int two = input.substring(0, input.indexOf('@')).length();
		String last = input.substring(input.length() - 4);
		char[] arr = input.toCharArray();
		for (char ch : arr) {

			if (ch == '@') {
				at++;
			} else if (ch == '.') {
				dot++;
			}
		}

		if (at != 1 || dot != 1) {
			System.out.println("Not a valid Email, Should not have more than one (@/.)");
		}
		if (one < 4) {
			System.out.println("Not a valid Email, Minimum 4 characters should be present between @ and .");
		}
		if (two < 3) {
			System.out.println("Not a valid Email, Atleast 3 characters should be present before @");
		}
		if (!last.equalsIgnoreCase(".com")) {
			System.out.println("Not a valid Email, It should ends with .com");
		}

	}

}
