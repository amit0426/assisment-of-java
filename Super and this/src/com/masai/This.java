package com.masai;

public class This {
	
	//1. it use for a reference variable that refers
	//to the current object
	
	//this ************state
	//                  behaviourr
	//                  object

	//1.this can be used to refer current class instance variable .
	//2. this can be used to invoke current class method (implicitly

	//3. this() can be invoke current class constructor
	//4. this can be passed as an argument in th method call
	
	//5. this can be return the current class instance from the method

	public static void main(String[] args) {
		Student s = new Student(111,"amit",5000);
		Student s1 = new Student(112,"amik",5200);
		s.display();
		s.display();
		
		
	}
	


}


class Student {
	int roll;
	String name ;
	
	float fee;
	
	Student(int roll,String name, float fee){
		this.roll = roll;
		this.name = name;
		this.fee = fee;
		
		
	}
	
	void display() {
		System.out.println(roll +" "+ name + " " + fee);
	}
}
