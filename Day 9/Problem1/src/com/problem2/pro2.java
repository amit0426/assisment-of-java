package com.problem2;

import java.util.Scanner;

public class pro2 {
	public static void main(String[] args) {
//		Parent c = new Child();
		Child c = new Child();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter number");
		
				int n = scan.nextInt();
			
				
				if(n>0 && n<10)
				{
					
					 if(n==1) 
					{
						 c.setNumber(n);
						c.method1();
						
						
						
					}
						
					
					
					else if(n==2)
					{
						c.setNumber(n);
						c.method2();
					}
					else if(n==3) 
					{
						c.setNumber(n);
						c.method3();
						
					}
					else if(n==4)
					{
						c.setNumber(n);
						c.method4();
					}
					
				}
				
				else
				{
					c.setNumber(n);
					System.out.println("Enter Valid number"+" "+c.getNumber());
				}
				
				
				
				
		
		
	}
	

}

class Parent{
	
	int number;
	void method1() {
		System.out.println("I belong to parant class method1"+" "+getNumber());
		
	}
	
	
public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


final void method2() {
	
	System.out.println("I belong to parant class method2"+" "+getNumber());
		
	}
 void method3() {
	 
	 System.out.println("I belong to parant class method3"+" "+getNumber());
	
}



}
 
  final class Child extends Parent{

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("I belong to child class method1"+" "+getNumber());
	}

	@Override
	void method3() {
		// TODO Auto-generated method stub
		System.out.println("I belong to child class method3"+" "+getNumber());
	}
	
	void method4() {
		System.out.println("I belong to child class method4"+" "+getNumber());
		
	}
}
