package com.problem3;

public class Level {

	public Level() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q) Why multiple inheritance is not supported in java?
		
//		1.
// Because reduce the complexity and simplify the language
// we made three class A,B,C  
// c inherits A and B class
// A and B have same method and you call from child class Object
// amibiguty call the method of A or B class		
// complile time better than runtime errors 		
		
		
//		C obj = new C();
//		obj.hello();
//		give compile time error
		
		

	}

}
/*
class A {
	
	void helo() {
		System.out.println("I am A");
	}
}

class B {
	void imB() {
		System.out.println("I am B");
	}
}
class c extends A,B{
	void imC() {
		System.out.println("I am c");
		
	}
	
}
*/