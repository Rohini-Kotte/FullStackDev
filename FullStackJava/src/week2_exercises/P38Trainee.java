package week2_exercises;

public class P38Trainee {

	private final static String BATCH_CODE = "CHNFSD";
	private int empId;
	private String empName;

	P38Trainee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	void display() {

		System.out.println(empId + " " + empName + " " + BATCH_CODE);

	}
}
