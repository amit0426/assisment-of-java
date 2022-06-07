package problem1;

import java.util.Scanner;

public class AccountDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter deposit amount");
		int depo = scan.nextInt();
		
		System.out.println("Enter widhdraw amount");
		int with = scan.nextInt();
		Account acount = new Account("783026487485578");
		acount.deposit(depo);
		
		
		try {
			if(acount.Balance > 5000) {
				acount.withdraw(with);
				
			}
			else {
				throw new InsufficientFundException();
			}
			
		} catch (InsufficientFundException e) {
			// TODO: handle exception
			System.out.println("insufficientFundException");
			acount.withdraw(with);
		}
		
	}

}
