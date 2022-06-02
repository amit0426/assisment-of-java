package Problem1;

public interface X {
  
	abstract void a();
	default void b() {
		System.out.println("i am b");
		
	}
	
	static void c() {
		System.out.println("i am c");
		
	}
	void f();

}
