package Newrevision1;

class world {
	
	world(){
		System.out.println("world constructor");
	}
	
	static void display() {
		
		System.out.println("world display method");
	}
	
}

class india extends world {
	
	india(){
		System.out.println("india constructor");
	}
	
	static void display() {
		
		System.out.println("india display method");
		
	}
}

class newzealand extends world {
	
	newzealand(){
		System.out.println("newzealand constructor");
	}
	
	static void display() {
		System.out.println("newzealand display method");
	}
}


public class runtimepolymorphism {

	public static void main(String[] args) {
		
		newzealand n=new newzealand();
		
		world w=new newzealand();
		
		w.display();
		
		
	}

}
