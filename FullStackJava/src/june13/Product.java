package june13;

public class Product {
	int id;
	String name;
	double price;

	Product(int id, String name,double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}















	public static void main(String[] args) {

		//Array Declaration and Initialization are different
		Product[] testArr=new Product[3];
		Product prod1=new Product(1,"book",54.5);
		Product prod2=new Product(2,"Text Book",55.5);
		Product prod3= new Product(3,"noteBook",10);

		testArr[0]=prod1;
		testArr[1]=prod2;
		testArr[2]=prod3;

		//Printing
		for(Product eachProd:testArr) {
			System.out.print("Product ID: "+eachProd.getId());
			System.out.print(" Product Name : "+eachProd.getName());
			System.out.print(" Product price: "+eachProd.getPrice());
			System.out.println();
		}

		//Array Declaration & Initialization in single shot
		Product[] products= {new Product(1,"Pencil",9.0), new Product(2,"Pen",9.0), new Product(3,"eraser",2.0)};
		double totalCost=0.0;
		//Printing & calculating total Cost
		for(Product each: products) {
			totalCost=totalCost+each.getPrice();
			System.out.println(each.getId());
			System.out.println(each.getName());
			System.out.println(each.getPrice());
		}
		System.out.println("Total Price "+totalCost);

	}

}
