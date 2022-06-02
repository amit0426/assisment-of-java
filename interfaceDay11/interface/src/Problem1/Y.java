package Problem1;

public interface Y {
	
	abstract void d();
	default void e() {
		System.out.println("i am e");
		
	}
	static void f() {
		System.out.println("i am f");
		
	}
	

}
