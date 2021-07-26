package org.gitproject;

public class gitProject {
		public void emp() {
		System.out.println("Employee");

	}
	public void empId(int id) {
		System.out.println("Employee ID"+id);
	}
	
	public void empName(String Name) {
		System.out.println("Employee Name"+Name);
	}

	
	public void empSalary(float Salary) {
		System.out.println("Employee Salary ="+Salary);
	}
	
	public static void main(String[] args) {
		gitProject gp = new gitProject();
		gp.emp();
		gp.empId(100);
		gp.empName("Greens");
		gp.empSalary(50000.2334567f);

	}
}
