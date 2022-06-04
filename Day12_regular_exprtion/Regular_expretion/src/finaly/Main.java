package finaly;

public class Main {
public static void main(String args[]) {
	
	
	//exaple of finaly keyword first
//	
//try {
////below code do not throw any exception
//int data = 25 / 5;
//System.out.println(data);
//}
////catch won't be executed
//catch (NullPointerException e) {
//System.out.println(e);
//}
////executed regardless of exception occurred or not
//finally {
//System.out.println("finally block is always executed********** it is for necessary code execute");
//}
//System.out.println("rest of the code...");
//}
	
	
	
	//2
	
//	try {
//		System.out.println("Inside the try block");
//		//below code throws divide by zero exception
//		int data = 25 / 0;
//		System.out.println(data);
//		}
//		//cannot handle Arithmetic type exception
//		//can only accept Null Pointer type exception
//		catch (NullPointerException e) {
//		System.out.println(e);
//		}
//		//executes regardless of exception occurred or not
//		finally {
//		System.out.println("finally block is always executed");
//		}
//		System.out.println("rest of the code...");
//		}



//3
	
//	try {
//		System.out.println("Inside try block");
//		//below code throws divide by zero exception
//		int data = 25 / 0;
//		System.out.println(data);
//		}
//		//handles the Arithmetic Exception / Divide by zero exception
//	catch (ArithmeticException e) {
//		System.out.println("Exception handled");
//		System.out.println(e);
//		}
//		//executes regardless of exception occurred or not
//		finally {
//		System.out.println("finally block is always executed");
//		}
//		System.out.println("rest of the code...");
		
		
		
	//4	
		
//		try {
//			System.out.println("I am in try block");
//			System.exit(1);
//			} catch(Exception ex){
//			ex.printStackTrace();
//			} finally {
//			System.out.println("I am in finally block");
//			}
//	int age = 19;
//	
//	validate(13);
//	System.out.println("rest of the code...");
//
//	
//	
//	public static void validate(int age) {
//		
//		if(age<18) {
//		//throw Arithmetic exception if not eligible to vote
//		throw new ArithmeticException("Person is not eligible to vote");
//		}
//		else {
//		System.out.println("Person is eligible to vote!!");
//		}
//		}

	
	
	
	
	
	
	
	
	
	
	//main method
//	public static void main(String args[]){
	//calling the function
//	try {
//	validate(13);
//	} catch (IOException e) {
//	e.printStackTrace();
//	}
//	System.out.println("rest of the code...");
//	}
	
	
	
	
	
	//function to check if person is eligible to vote or not



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}

//public static void validate(int age)throws IOException {
//if(age<18) {
////throw IOException if not eligible to vote
//throw new IOException("Person is not eligible to vote");
//}
//else {
//System.out.println("Person is eligible to vote!!");
//}
//}

}
