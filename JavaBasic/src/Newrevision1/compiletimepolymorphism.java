package Newrevision1;

public class compiletimepolymorphism {
	
	static void display() {
		
		System.out.println("display method");
	}
	
	static int display(int num1) {
		
		return num1;
	}
	
	static double display(double num1) {
		
		return num1;
	}

	public static void main(String[] args) {
              
		compiletimepolymorphism.display();
		
		System.out.println(compiletimepolymorphism.display(200));
		
		System.out.println(compiletimepolymorphism.display(200.025d));
		
	}

}
