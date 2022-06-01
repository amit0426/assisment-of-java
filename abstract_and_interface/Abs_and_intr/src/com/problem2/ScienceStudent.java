package com.problem2;

public  class ScienceStudent extends Student {
	double phisicsMarks;
	double chemistryMarks;
	double mathsMarks;
	
	
	
	public ScienceStudent(double phisicsMarks, double chemistryMarks, double mathsMarks) {
		super();
		this.phisicsMarks = phisicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	
	public ScienceStudent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPercentage(){
		double total =phisicsMarks+chemistryMarks+mathsMarks;
		double marksPercent=(total/3);
		return marksPercent;
	}




}
