package exercises;

public class P6ArrayToString {

	public static void main(String[] args) {
		String[] arr= {"Vikas","Lokesh","Ashok"};

		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			sb=sb.append(arr[i]);
			if(i!=arr.length-1) {
			sb.append(",");}
		}
		System.out.println(sb);
	}

}
