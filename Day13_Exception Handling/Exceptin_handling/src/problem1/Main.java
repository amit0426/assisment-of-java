package problem1;

		import java.awt.desktop.SystemSleepEvent;
import java.util.InputMismatchException;
import java.util.Scanner;
		class Main {
		public static void main(String args[]) {
		try {

			
			System.out.println("start of main..");
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			
			String message = null;
			int num3 = num1 / num2;
			
			if(num3 > 10){
				
			message = "Welcome to Exception Handling ";
			
			}else {
				throw new NumberFormatException();
			}
			
			System.out.println("Message is :"+message.toUpperCase());
			System.out.println("end of main");
			
			
			
			
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("num 2 should not be 0");
			
			
		}	catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Please Enter Valid Number ");
			
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("String value is null");
		}
	
		
		System.out.println("end of main");
		}
		}
		
		
		
