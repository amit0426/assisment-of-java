package Problem3;



import java.util.Scanner;

public class Main {
	static Size pizza;
	
	public Main(Size pizza) {
		// TODO Auto-generated constructor stub
		
		
		this.pizza = pizza;
	}
	
	
	
	public void order() 
	{
		
		switch(pizza)
		{
		case SMALL:
			System.out.println("i am small");
			break;
		case LARGE:
			System.out.println("i am large");
			break;
		case MEDIUM:
			System.out.println("i am medium");
			break;
		case EXTRALARGE:
			System.out.println("i am extralarge");
			break;
			
			default:
				System.out.println(" i have nothing");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your size");
		String size = scan.next();
		Size main = Size.valueOf(size);
		Main s = new Main(main);
		s.order();
//		Main main = new Main();
//		oridinal(SMALL);

		
	}


	

}
