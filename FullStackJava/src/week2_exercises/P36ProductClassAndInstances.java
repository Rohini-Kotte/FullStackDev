package week2_exercises;

public class P36ProductClassAndInstances {

	private long id;
	private String productName;
	private String supplierName;


	public void setProductId(long id) {
		this.id = id;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	void display() {
		System.out.println("Product Id is " + id + " Product Name is " + productName + " and the Supplier Name is "
				+ supplierName);
	}
}
