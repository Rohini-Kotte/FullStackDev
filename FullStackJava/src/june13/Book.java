package june13;

public class Book {
	int id=0;
	String name="undefined";
	
	Book(){
		System.out.println("Book default constructor");
		
	}
	
	Book(int i){
		System.out.println("Book single arguements constructor");
	}
	
	void read() {
		System.out.println("Im reading a Book");
	}
			

}
