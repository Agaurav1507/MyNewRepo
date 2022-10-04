package Interface;

interface test {
	
	
	public void m1();
	
	public void m2();
	
}

class check implements test {
	
	public void m1() {
		
		System.out.println("Abstract method 1");
	}
	
	
}


public class interface9 {

	public static void main(String[] args) {
		
		check c=new check();
		
		c.m1();

	}

}
