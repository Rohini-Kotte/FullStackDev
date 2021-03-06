package june13;

public class BookTest {

	public static void main(String[] args) {

		ScienceBook science = new ScienceBook();
		System.out.println("*****Science Book********");
		System.out.println(science.id);
		System.out.println(science.name);
		science.read();

		System.out.println("*****Story Book********");
		StoryBook story = new StoryBook();
		System.out.println(story.id);
		System.out.println(story.name);
		story.read();

		System.out.println("*******Parent class Book********");
		Book book = new Book();

		System.out.println(book.id);
		System.out.println(book.name);
		book.read();

		System.out.println("*****Object Substitution*");
		// Only Methods can be accessed and properties from child can not be access when
		// object substitution is done
		Book b1 = new ScienceBook();
		b1.read();
		System.out.println(b1.id);
		System.out.println(b1.name);

		Book bk;
		bk = new ScienceBook();
		bk.read();
		bk = new StoryBook();
		bk.read();
		
		
		//Constructor cloning
		Book bcons=new ScienceBook();
		

	}

}
