package week2_exercises;

public class P37ProductConstructor {

	private long id;
	private String productName;
	private String supplierName;

	P37ProductConstructor(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	void display() {
		System.out.println("Product Id is " + id + " Product Name is " + productName + " and the Supplier Name is "
				+ supplierName);
	}
}
