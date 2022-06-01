package com.problem1;

import java.util.Scanner;

public class Demo {

	private int amount;

	public  Hotal provideFood(int amount) {
		
		if(amount > 1000)
		{
			TajHotal t = new TajHotal();
		
			
			
			return t;
		}
		else if(amount > 200 && amount < 1000 )
		{
			return new RoadSideHotel();
		}
		return null;

		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your amount");
		int n = scan.nextInt();
		Demo demo = new  Demo();
		Hotal hotal = demo.provideFood(n);
		
		if(hotal instanceof TajHotal)
		{
			((TajHotal)hotal).welcomeDrink();
			hotal.chickenBiryani();
			hotal.masalaDosa();
			
			
		}
		else if(hotal instanceof RoadSideHotel) {
			hotal.chickenBiryani();
			hotal.masalaDosa();
			
		}
		
	}
	
}
