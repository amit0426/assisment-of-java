package com.Iproblem;

public class Apache extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		
		System.out.println("running safely");
	}
	
	public static void main(String[] args) {
		Bike bike1 = new Apache();
		bike1.run();
		
	}
	
	

}
