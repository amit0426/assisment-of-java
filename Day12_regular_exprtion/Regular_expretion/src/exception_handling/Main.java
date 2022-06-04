package exception_handling;

public class Main{
public static void main(String args[]){
	try {
		//code that may raise exception
//		int data=100/0;
//		System.out.println(data);
//		String s = null;
//		System.out.println(s.length());
		//rest code of the program
		
		String s="abc";
		int i=Integer.parseInt(s);//NumberFormatException
		int a[]=new int[5];
		a[10]=50; 
		
		
		//ArrayIndexOutOfBoundsException

		
	}
//	catch (Exception e) {
//		// TODO: handle exception
//		System.out.println("There are some thing went wrong please try find");
//	}
	
		catch (ArithmeticException e) {
		// TODO: handle exceptiondf
		System.out.println("it Arithmetic exception"+e);
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("hello there are null exception");
	}catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("there are number format exception");
	}catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("Array indexout of bounds exception");
	}
	System.out.println("rest of the code");


}
}
