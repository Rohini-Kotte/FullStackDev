package week1_exercises;

import java.util.ArrayList;
import java.util.List;

public class P15UniqueCharacter {
//	Display unique characters in a string. input:"helloworld" output:"helowrd"
	
	public static void main(String[] args) {

		String str="helloworld";
		List<Character> list=new ArrayList<Character>();
		
		for(char each:str.toCharArray()) {
			if(!list.contains(each)) {
				list.add(each);
			}
		}
		
		for(char each : list) {
		System.out.print(each);}
	}

}
