package week1_exercises;

public class P9LeapYear {

	public static void main(String[] args) {

		int year = 2000;
		boolean flag = false;

		if (year % 4 == 0) {
			if (year % 100 != 0) {
				flag = true;
			} else if (year % 400 == 0) {
				flag = true;
			}
		}

		if (flag == true)

		{
			System.out.println("Its a Leap year");
		} else {
			System.out.println("Not a Leap year");
		}
	}

}
