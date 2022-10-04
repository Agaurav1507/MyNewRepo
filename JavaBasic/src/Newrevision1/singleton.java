package Newrevision1;

public class singleton {
	
	private singleton() {
		
		System.out.println("singleton constructor");
	}
	
	static singleton s=new singleton();
	
	public static singleton display() {
		return s;
	}
	
	void display1() {
		System.out.println("display method");
	}

	public static void main(String[] args) {
          
		singleton.display().display1();
	}

}
