package com.random;

public class HashAndEquals {

	int age;
	
	
	public HashAndEquals(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	
	@Override
	public boolean equals( Object obj )
	{
		boolean flag = false;
		HashAndEquals emp = ( HashAndEquals )obj;
		if( emp.age == age )
			flag = true;
		return flag;
	}
	
	public static void main(String[] args){
		HashAndEquals obj1 = new HashAndEquals(22);
		HashAndEquals obj2 = new HashAndEquals(22);
		HashAndEquals obj3 = obj2;
		//obj3.age = 25;
		
		System.out.println("Hashcode obj1 " + obj1.hashCode());
		
		if(obj1.equals(obj2)){
			System.out.println("Equal");
		}
		
		if(obj3 == obj2){
			System.out.println("Equal");
		}
	}

}
