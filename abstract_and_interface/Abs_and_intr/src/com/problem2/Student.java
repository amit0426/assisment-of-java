package com.problem2;

public abstract class Student {
	
	String name;
	String address;
	
	
	public Student(String name, String address) {
	
		this.name = name;
		this.address = address;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	 abstract double getPercentage();
	

}
