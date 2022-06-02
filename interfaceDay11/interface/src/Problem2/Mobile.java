package Problem2;

import java.util.Scanner;

public class Mobile {
	String nameOfmobile;
	int model;
	
	
public	String searchOutdatModel(String... nameofmobilemodel) {
		
	String hold = "";
		for(String x : nameofmobilemodel)
		{
			hold +=x+"  ";
		}
	
		return hold+"  _OUtDATED";
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter model name");
		String name = scan.next();
		System.out.println("Enter your mobile number");
		String mobilenumbe = scan.next();
		
		
//		String[] outdatedModels = {"note4","note5","note6","note7"};
		 Mobile n = new Mobile();
		 String argument = n.searchOutdatModel(name,mobilenumbe);
//		n.searchOutdatModel(args)
		 
		 System.out.println(argument);

		
	}

}
