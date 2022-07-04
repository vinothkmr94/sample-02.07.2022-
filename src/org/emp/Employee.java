package org.emp;

public class Employee {
	public void empId() {
	System.out.println("001");
	}
	public void empName() {
		System.out.println("vinoth");
	}
	public void empDob() {
	System.out.println("25.03.1991");
	}
	public void empPhone() {
	System.out.println("9894266171");
	}
	public void empEmail() {
	System.out.println("vinothkmr94@gmail.com");
	}
	public void empAddress() {
	System.out.println("c 76/1 "
			+ "Nehru Nagaer "
			+ "Vasandhapuram Road "
			+ "Vellore-1");
	}
	public static void main(String[] args) {
		Employee a = new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
		a.empEmail();
		a.empAddress();
	}
}
