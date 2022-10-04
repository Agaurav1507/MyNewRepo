package Newrevision1;

class vehicle {
	
	vehicle(){
		
		System.out.println("call vehicle constructor");
	}
	
	void display() {
		
		System.out.println("vehicle display method");
	}
}

class cars extends vehicle {
	
	cars(){
		System.out.println("call cars constructor");
	}
	
	void display() {
		System.out.println("cars display method");
	}
}

class bikes extends vehicle {
	
	bikes(){
		System.out.println("call bikes constructor");
	}
	
	void display() {
		System.out.println("bikes display method");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		  
		bikes b=new bikes();
		
		b.display();
		
		System.out.println("****************************************");
		
		vehicle v=b;
		
		v.display();
		
		
		bikes b1= (bikes) new vehicle();
		

	}

}
