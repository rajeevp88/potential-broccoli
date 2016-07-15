package com.design.orgchart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8615668967503700594L;
	
	private final String name;
	private final String title;
	private final int userId;
	private final int age;
	private final Address address;
	private final transient int socialSecurity;
	private final Phone phoneNumber;
	
	List<Employee> reports = new ArrayList<Employee>();
	
	private Employee(EmployeeBuilder builder){
		this.name = builder.name;
		this.title = builder.title;
		this.userId = builder.userId;
		this.age = builder.age;
		this.address = builder.address;
		this.socialSecurity = builder.socialSecurity;
		this.phoneNumber = builder.phoneNumber;
		
	}
	
	public String getName() {
		return name;
	}

	public String getTitle() {
		return title;
	}

	public int getUserId() {
		return userId;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public int getSocialSecurity() {
		return socialSecurity;
	}

	public Phone getPhoneNumber() {
		return phoneNumber;
	}
	
	public void addReport(Employee employee){
		if(employee == null) {
			return;
		}
		this.reports.add(employee);
	}
	
	public void addReport(ArrayList<Employee> employeeList){
		if(employeeList == null) {
			return;
		}
		this.reports.addAll(employeeList);
	}
	
	public int maxDepth(Employee employee, int level, int maxDepth){
		if(employee == null){
	         return 0;
	    }else{

	        for(Employee e:employee.reports){
	            maxDepth = maxDepth(e,level+1,maxDepth);
	        }

	        return (maxDepth > level)? maxDepth: level;
	    }
		
		
	}

	public static class EmployeeBuilder {
		
		String name;
		String title;
		int userId;
		int age;
		Address address;
		int socialSecurity;
		Phone phoneNumber;
		
		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public EmployeeBuilder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public EmployeeBuilder setUserId(int userId) {
			this.userId = userId;
			return this;
		}
		
		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public EmployeeBuilder setAddress(Address address) {
			this.address = address;
			return this;
		}
		
		public EmployeeBuilder setSocialSecurity(int socialSecurity) {
			this.socialSecurity = socialSecurity;
			return this;
		}
		
		public EmployeeBuilder setPhoneNumber(Phone phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Employee build(){
			return new Employee(this);
		}
		
	}

}
