package june13;

public class ScienceBook extends Book {

	int id=12;
	String name="scienceBook";
	
	ScienceBook(){
		super(100);
		System.out.println("Science Book default constructor"); 
		
	}
	
//	void read() {
//		System.out.println("Reading a Science Book");
//	}
	
	@Override
	void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading a Science Book");
	}

}
