package problem1;

import java.time.temporal.TemporalAmount;

import javax.naming.InsufficientResourcesException;

public class Account {
	
	String accountNumber;
	double Balance;
	
	public Account(String accountNumber) {
		// TODO Auto-generated constructor stub
		this.accountNumber= accountNumber;
		
	}
	
	void deposit(int amount) {
		
		this.Balance = amount;
		
	}
	
	
	void withdraw(int amount) {
		if(Balance > 5000) {
			System.out.println(Balance-amount);
			
		}
		
	}

}
