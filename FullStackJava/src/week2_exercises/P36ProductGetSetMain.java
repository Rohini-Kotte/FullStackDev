package week2_exercises;

import java.util.Scanner;

public class P36ProductGetSetMain {

	public static void main(String[] args) {
		P36ProductClassAndInstances obj = new P36ProductClassAndInstances();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Product Id");
		obj.setProductId(scan.nextLong());
		
		System.out.println("Enter Product name");
		obj.setProductName(scan.next());
		
		System.out.println("Enter Supplier name");
		obj.setSupplierName(scan.next());
		
		obj.display();

	}

}
