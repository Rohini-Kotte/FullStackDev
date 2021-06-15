package week1_exercises;

public class P13DecimalToBinary {

	public static void main(String[] args) {

		int num=10;
		String binary="";
		
		while(num>0) {
			int i=num%2;
			num=num/2;
			binary=binary+i;
			
		}
		
		System.out.println("Binary number: "+binary);
		System.out.println(Integer.toBinaryString(12));
	}

}
