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
	public static void main(String[] args) {
		gitProject gp = new gitProject();
		gp.emp();
		gp.empId(100);
		gp.empName("Greens");
	}
}
