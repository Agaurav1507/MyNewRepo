package Newrevision1;

abstract class animals {
	
	animals(){
		
		System.out.println("class animals constructor");
		
	}
	
	static void method() {
		System.out.println("new method");
	}
	
	static void method2() {
		
	}
	
}

class tiger extends animals {
	
	
	static void method2() {
		System.out.println("method2 animals");
	}
	
	static void method() {
		System.out.println("tiger method");
	}
}


public class Abstraction {

	public static void main(String[] args) {
             
		tiger t=new tiger();
		t.method();
		t.method2();
		
		animals a=new tiger();
		
	
	}

}
