package iProblem;

public interface Shape {
	void draw();

}
class Rectangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
		System.out.println("i am drawrect by implement by Shape");
		
		
	}
	
}


class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("i am drawcircle implement by Shape ");
		
	}
	
}
