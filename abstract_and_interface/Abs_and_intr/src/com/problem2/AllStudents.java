package com.problem2;

import java.util.Scanner;

public class AllStudents  {
	

	


	

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Enter name :");
//	    String name = scan.next();
//	    
//	    System.out.println("Enter adress :");
//	    
//	    String adress = scan.next();
//	    
//		
//		System.out.println("Enter Physics :");
//		
//		int n = scan.nextInt();
//		System.out.println("Enter chemistry number :");
//		
//		int c = scan.nextInt();
//		System.out.println("Enter maths number:");
//		
//		int m = scan.nextInt();
//		
//		System.out.println("Enter History marks");
//		int h = scan.nextInt();
//		
//		System.out.println("Enter civics marks");
//		int civi = scan.nextInt();
//		
//		Student history = new HistoryStudent(name, adress, h, civi);
//		Student science = new ScienceStudent(name,adress,n,c,m);
//		
//		AllStudents s = new AllStudents(m, c, m);
//		s.getPercentage();
		
		
		
		
		
		
		
		
		
		
		///science student details
				Scanner sc = new Scanner(System.in);

				Student student= new ScienceStudent();

				System.out.println("enter science  student name : ");
				student.name=sc.next();

				System.out.println("enter science  student Address : ");
				student.address=sc.next();
				
				ScienceStudent student1=(ScienceStudent)student;

				System.out.println("enter science  student physics marks  : ");
				student1.phisicsMarks=sc.nextInt();

				System.out.println("enter science  student chemistry marks  : ");
				student1.chemistryMarks=sc.nextInt();

				System.out.println("enter science  student maths marks  : ");
				student1.mathsMarks=sc.nextInt();

				double p= student.getPercentage();

				System.out.println("science student marks percentage is : "+p);
				
				///history student details
				Student student2= new HistoryStudent();

				System.out.println("enter history  student name : ");
				student2.name=sc.next();

				System.out.println("enter history  student Address : ");
				student2.address=sc.next();
				
				HistoryStudent student3=(HistoryStudent)student2;
				System.out.println("enter student history marks  : ");
				student3.historyMarks=sc.nextInt();
				System.out.println("enter student civics  marks  : ");
				student3.civicsMarks=sc.nextInt();
				double p1=(double) student2.getPercentage();
				System.out.println("history student marks percentage is : "+p1);

		
		
		
		
		
	
	     
	
	     
	   
	     
	     
		
		
	    
	    

		
		
		
	}
	

}
