package week1_exercises;

public class P4FindNoOfWordsForGiven {

	public static void main(String[] args) {

		String[] arr= {"aa","bb","c","ddd"};
		int n=3;
		int count=0;

		for (String each : arr) {
			if(n==each.length()) {
				count++;
			}

		}

		System.out.println("Output: "+count);
	}

}
