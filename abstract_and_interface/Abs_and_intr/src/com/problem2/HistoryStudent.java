package com.problem2;

public class HistoryStudent extends Student {
	
	double historyMarks;
	double civicsMarks;
	
	
	 void Student (){
		
	}
	
  	public HistoryStudent() {
//		super(name, address);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}



//	@Override
	   double getPercentage() {
			double total =historyMarks+civicsMarks;
			double marksPercent=(total/2);
			return marksPercent;
	}

}
