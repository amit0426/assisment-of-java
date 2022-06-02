package Problem1;

public class Demo {
	
	public static void main(String[] args) {
//		***********************
		X x = new Zimpl();
		x.a();
		x.b();
		X.c();
		
		// i used interface static and defoult and abstract both are call this type switchation
		// **************************
		Y y = new Zimpl();
		y.d();
		y.e();
		Y.f();
		
		Z z = new Zimpl();
		z.g();
		
		
		
		
	
	}

}
