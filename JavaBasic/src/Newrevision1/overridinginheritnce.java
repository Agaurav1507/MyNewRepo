package Newrevision1;

class overriding {
	
	overriding(){
		
		System.out.println("overrinding1");
	}
	
	void display() {
		
		System.out.println("display method of overriding1");
	}
}

class overriding2 extends overriding {
	
	overriding2(){
		
	}
	
	void display() {
		System.out.println("display method of overriding 2");
	}
}

public class overridinginheritnce {

	public static void main(String[] args) {
		

	}

}
