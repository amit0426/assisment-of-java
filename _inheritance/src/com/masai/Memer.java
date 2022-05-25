package com.masai;





public class Memer {
	String Name;
	int Age;
	String Phone_number;
	String Adress;
	double Salary;
	
//	public  Memer(String string, int i, int j, String string2, int k) {
//		super();
//		
//	}
	
public Memer() {
		// TODO Auto-generated constructor stub
	
	
	super();
	}

public static void main(String[] args) {
	 
	 Memer m = new Memer();
	  System.out.println();
	 m.setAge(20);
	 m.setName("Amit Kumar");
	 m.setSalary(100000);
	 m.setAdress("220 Govind vihar colony vikas nagar mathura");
	 m.setPhone_number("9761785380");
	 
	 System.out.println("Name :"+""+m.getName());
	 System.out.println("Age : "+ m.getAge());
	 System.out.println("Phone number:"+m.getPhone_number());
	 
	 System.out.println("Adress :"+" "+m.getAdress());
	 System.out.println("Salary"+m.getSalary());
	 System.out.println(m.printSalary());
	 
	 Manager j = new Manager();
	 
	 j.jay();
	 
	 Employee e = new Employee();
	 e.setSpecialisation("Software Developer");
	 e.setDepartment("Enginerring");
	 
	 System.out.println("Specialisation :"+e.getSpecialisation());
	 System.out.println("Department :"+ e.getDepartment());
	 

	
}
//	setter**************************************************************
	public void setAdress(String adress) {
		Adress = adress;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
//	getter method**************************************************************
	public String getAdress() {
		return Adress;
	}
	public int getAge() {
		return Age;
	}
	public String getName() {
		return Name;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public double getSalary() {
		return Salary;
	}
	
	
	

	
	
	
    double printSalary() {
	return Salary;
    }

	
	
}


//classes**************************************************

class Main extends Memer{
	
	public Main() {
		super();
	}
	
	 
}


 class Employee extends Main{
	 
	 String Specialisation;
	 String Department;
	
//	 public Employee(String string, int i, int j, String string2, int k) {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	 
	 public Employee() {
		 super();
	 }
	 
	 public void setDepartment(String department) {
		Department = department;
	}
	 
	 public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	 }
	 
	 
//	 getter***************
	 
	 public String getDepartment() {
		return Department;
	}
	 
	 public String getSpecialisation() {
		return Specialisation;
	}
	 
 } 
 
 
// 4.***************
	 class Manager extends Employee
	 {

		public Manager() {
			super();
			// TODO Auto-generated constructor stub
		}
		 
//		public Manager() {
//			// TODO Auto-generated constructor stub
//		}

		public void jay(){
			 Memer m = new Memer();
			  System.out.println();
			 m.setAge(20);
			 m.setName("Amit Kumar");
			 m.setSalary(100000);
			 m.setAdress("220 Govind vihar colony vikas nagar mathura");
			 m.setPhone_number("9761785380");
			 
			 System.out.println("Name :"+""+m.getName());
			 System.out.println("Age : "+ m.getAge());
			 System.out.println("Phone number:"+m.getPhone_number());
			 
			 System.out.println("Adress :"+" "+m.getAdress());
			 System.out.println("Salary"+m.getSalary());
			 System.out.println(m.printSalary());
		}
	 }
	
	 


