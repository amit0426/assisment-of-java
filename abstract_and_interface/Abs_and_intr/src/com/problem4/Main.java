package com.problem4;

import java.util.Scanner;

//import com.problem2.ScienceStudent;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("amit");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length :");
		int l = scan.nextInt();
		
		System.out.println("Enter Width :");
		int w = scan.nextInt();
		
		System.out.println("Enter Side ");
		int s = scan.nextInt();
		System.out.println("Enter radius");
		int r = scan.nextInt();
		
		Area a = new Area();
	 int d =	a.rectangleArea(l, w);
		int e =a.circleArea(r);
	 int f =	a.squreArea(s);
System.out.println("Rectange Area :  "+d);
System.out.println("Circle Area :  "+e);
System.out.println("squre Area :   "+f);
		
		
		
	}

}
