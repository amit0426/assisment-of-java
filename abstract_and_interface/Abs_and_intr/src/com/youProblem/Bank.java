package com.youProblem;

abstract class Bank {
	abstract int getRateOfinterest();
	

}

class SBI extends Bank{

	int rateOfinterest = 7;
	@Override
	int getRateOfinterest() {
		// TODO Auto-generated method stub
		return rateOfinterest;
	}
	
}

 class PNB extends Bank {

	 int rateOfinterest = 8;
	@Override
	int getRateOfinterest() {
		// TODO Auto-generated method stub
		return rateOfinterest;
	}
	 
 }

 class  ICICI  extends Bank{
	 int rateOfinterest = 9;

	@Override
	int getRateOfinterest() {
		// TODO Auto-generated method stub
		return rateOfinterest;
	}
	 
 }
 
