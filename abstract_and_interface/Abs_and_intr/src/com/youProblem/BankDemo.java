package com.youProblem;

public class BankDemo {
	public static void main(String[] args) {
		Bank bank1 = new PNB();
		int j = bank1.getRateOfinterest();
	     
		System.out.println("Rate of interest of PNB" +" :   "+ j);
		
		
		Bank bank2 = new ICICI();
		int k = bank2.getRateOfinterest();
		
		System.out.println("Rate of interest of ICICI" +"  :  " +k);
		
		Bank bank3 = new SBI();
		int i = bank3.getRateOfinterest();
		System.out.println("Rate of interest of SBI" + "  :  "+i);
		
		
	}

}
