package week1_exercises;

public class P2FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
		String str=args[0].toLowerCase();
		for(char each:str.toCharArray()) {

			if(each=='a' ) {
				aCount=1;

			}else if(each=='e') {
				eCount=1;
			}
			else if(each=='i') {
				iCount=1;}
			else if(each=='o') {
				oCount=1;
			}else if(each=='u') {
				oCount=1;
			}
			count=aCount+eCount+iCount+oCount+uCount;
		}

	
	System.out.println("No of Vowels: "+count);
}

}
