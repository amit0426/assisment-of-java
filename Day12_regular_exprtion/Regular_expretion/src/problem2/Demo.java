package problem2;

import java.util.Scanner;
import java.util.regex.*;

public class Demo {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		
		String name = scan.next();
		
		System.out.println("Enter your Mobile Number");
		String mobileNum = scan.next();
		System.out.println("Enter Your Adhar Number");
		
		String adhar = scan.next();
		Demo demo = new Demo();
		
		if(demo.validate(name,mobileNum,adhar)== true) {
			Citizen citizen = new Citizen();
			citizen.setAadharNumber(adhar);
			citizen.setMobileNumber(mobileNum);
			citizen.setName(name);
			
			System.out.println("Name :"+citizen.getName());
			System.out.println("Mobile Numer :"+citizen.getMobileNumber());
			System.out.println("Adhar Number :"+citizen.getAadharNumber());
			
		
		}
		else {
			System.out.println("the appropriate validation error message.");
		}
		
		
		
	}
	
	public boolean validate(String name,String mobileNum,String aadharCard) {
		
		if(!name.equals("") && (name != null) && name.matches("^[a-zA-Z]*$")) {
			return true;
		}
//		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
//		Matcher match = ptrn.matcher(mobileNum);
//		
//		return (match.find() && match.group().equals(mobileNum));
//		
		if(mobileNum.matches("\\\\d{10}")) {
			return true;
		}
		if(aadharCard.matches("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$")) {
			return true;
		}
		
		return false;
	}

}
