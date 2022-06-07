package problem3;

public class Fin {
	
//	* final keyword can be used with class method and variable .
//	final class cannot be inherited a final method cannot be overridden and a final variable cannot
//	be reassigned.
	
//	finally=> key word is used to create a block of code that follows a try block

	
	final int value = 10;
	public static final int BOXWIDTH = 5;
	static final String title = "amit";
	
	public void changeValue() {
//		value = 12;  // will give an error
	}
	
	public void displayValue() {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		Fin f = new Fin();
		f.changeValue();
		f.displayValue();
		
		
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The final field Fin.value cannot be assigned
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
