package june13;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Banking {

	
	public void logIn(int id,String password) {
		System.out.println("Login through userID and password")	;
	}
	
	public void logIn(long phoneNumber) {
		System.out.println("Login through Phone number");
	}
	public void logIn(BigInteger phoneNumber) {
		System.out.println("Login through Phone number");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking obj=new Banking();
		obj.logIn(9994011211l);
		obj.logIn(123,"asdfg");
		
		

	}

}
