package problem2;

import java.util.Scanner;

public class UserResistration {
	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		try {
			if(userCountry.equals("India")){
				System.out.println("User registration done successfully");
				System.out.println("User Name :  "+username);
				System.out.println("Country Name :"+userCountry);
				
			}else {
				throw new InvalidCountryException();
			}
				
			
		} catch (InvalidCountryException e) {
			// TODO: handle exception
			
			System.out.println("User Outside India cannot be registered");
		}
			
	}
	
	public static void main(String[] args) throws InvalidCountryException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name :");
		String name = scan.next();
		System.out.println("Enter user country Name :   ");
		String country = scan.next();
		
		UserResistration user = new UserResistration();
		user.registerUser(name, country);
		
	}

}
