package com.masai;

public class TS {
	
	public static void main(String[] args) {
		
		Hen h = new Hen();
		h.printColor();
	}
	
	//What is the use of �this� and �super� keyword in
//	java explain with example.
	
	
	// super keyword 
	
	//*1.it is use for referrence variable which is used to refer immediate
	// immediate parent class object ;
	//2. super can be use to refer immediate parent class instance variable 
	//3. super can be used to invoke immediate parent class method 
	//4. super() can be used to invoke immediate parent class constructor;
	
	
	
	String color = "white";
	
}

class Hen extends TS {
	String color = "black";
	void printColor() {
		System.out.println(color);
		
		System.out.println(super.color);
	}
}









