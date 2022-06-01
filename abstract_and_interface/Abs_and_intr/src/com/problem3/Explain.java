package com.problem3;
import java.util.function.BinaryOperator;

public interface Explain {
	
//	An interface is a reference type in java
//	it is similar to class
//	it is a collection of abstract
//	A class implements an interface 
//	inheriting the abstract methods of interface;
//	interface may also contain constants
//	defalut methods and static methods
//	it is similar to class but class describes the attributes and behaviors of an object
//	
	
	void print();
	
		
		
	
	

}


class A implements Explain{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("I am inter face exaple");
		
	}
	

	
	
	
}