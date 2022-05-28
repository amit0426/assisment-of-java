package com.masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student i = new Student();
		System.out.println("Enter Your name");
		String n = scan.next();
		
		
		i.setName(n);
//		Character ch = new Character('a')
		
		System.out.println("Enter your marks");
		int m = scan.nextInt();
//		int m = 300;
		
		if(m >= 500)
		{
			i.setGrade('A');
			i.setMarks(m);
		}
		if(m < 500 && m>400)
		{
			i.setGrade('B');
			i.setMarks(m);
		}
		
		if(m <= 400)
		{
			i.setGrade('C');
			i.setMarks(m);
			
		}
		
		else
		{
			System.out.println("Enter Valid number");
		}
		System.out.println("Please Enter Your roll Number");
		int r = scan.nextInt();
		i.setRoll(r);
		
		
		
		
		

		 System.out.println(i.displayDetails());
	}

}



class Student{
	private int  roll;
	private  String name;
	private int marks;
	private char grade;



	void Student(){
		
	}
	
	


	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
//		if(marks >= 500)
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
//	data*********************************
	
	public String displayDetails() {
//		Student j = new Student(int 3,String "amit",int 499,char 'A');
		return toString();
		
	}
	
	private char calculateGrade(char grade,int marks) {
		return grade;
			
		
		
		
	}


	@Override
	public String toString() {
		return "Student details =>   roll is =" + roll + ", name is =" + name + ", marks is =" + marks + ", grade is =" + grade ;
	}
	
	
	
	
}


