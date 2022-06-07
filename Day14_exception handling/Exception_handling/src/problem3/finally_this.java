package problem3;

public class finally_this {
	
	public static void main(String[] args) {
		try {
			
			int a = 10;
			int b = 0;
			int result = a/b;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error :"+e.getMessage());
		}finally {
			System.out.println("Finished :   ");
		}
	}

}
