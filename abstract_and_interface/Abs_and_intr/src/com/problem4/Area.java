package com.problem4;

public class Area extends Shape {
	
	
	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
//		return super.rectangleArea(length, breadth);
		return length*breadth;
	}
	
	
	
	@Override
	public int squreArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}
	
	
	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return 2*radius;
	}
	

}
