package com.design.orgchart;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee vicePresident = new Employee.EmployeeBuilder()
								 			 .setName("Rajeev")
								 			 .setAddress(null)
								 			 .setPhoneNumber(null)
								 			 .setTitle("Vice President")
								 			 .setSocialSecurity(1234567891)
								 			 .setUserId(1)
								 			 .build();
		Employee e1 = new Employee.EmployeeBuilder()
	 			 .setName("E1")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("E1")
	 			 .setSocialSecurity(12345678)
	 			 .setUserId(2)
	 			 .build();
		
		Employee e2 = new Employee.EmployeeBuilder()
	 			 .setName("e2")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("Vice President")
	 			 .setSocialSecurity(1234567891)
	 			 .setUserId(3)
	 			 .build();
		Employee m1 = new Employee.EmployeeBuilder()
	 			 .setName("M1")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("m1")
	 			 .setSocialSecurity(123456)
	 			 .setUserId(11)
	 			 .build();
		
		Employee m2 = new Employee.EmployeeBuilder()
	 			 .setName("M2")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("m2")
	 			 .setSocialSecurity(123456)
	 			 .setUserId(11)
	 			 .build();
		
		Employee e3 = new Employee.EmployeeBuilder()
	 			 .setName("E3")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("E3")
	 			 .setSocialSecurity(1235)
	 			 .setUserId(3)
	 			 .build();
		
		Employee e4 = new Employee.EmployeeBuilder()
	 			 .setName("E3")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("E3")
	 			 .setSocialSecurity(1235)
	 			 .setUserId(3)
	 			 .build();
		
		Employee e5 = new Employee.EmployeeBuilder()
	 			 .setName("E3")
	 			 .setAddress(null)
	 			 .setPhoneNumber(null)
	 			 .setTitle("E3")
	 			 .setSocialSecurity(1235)
	 			 .setUserId(3)
	 			 .build();
		
		vicePresident.addReport(e1);
		vicePresident.addReport(e2);
		
		e1.addReport(m1);
		e2.addReport(m2);
		
		m1.addReport(e3);
		m1.addReport(e4);
		
		e4.addReport(e5);
		
		System.out.println("max depth = " + vicePresident.maxDepth(vicePresident,0,0));
															  
	}

}
