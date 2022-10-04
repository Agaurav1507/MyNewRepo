package Newrevision1;

class encap {
	
	private int ssn;
	private String empname;
	private double empage;
	
	private int id=202;
	
	private static void display(double num2) {
		
	}
	
	private static int display1(int num1) {
		
		return num1;
	}
	
	public int getid() {
		return id;
	}
	
	public void getdisplay() {
		System.out.println("display private method");
	}
	
	public int getdisplay(int num1) {
		return num1;
	}
	
	//setter method
	
	public void id(int a) {
		
		id=a;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
           
		encap e=new encap();
		
		System.out.println(e.getid());
		
		e.getdisplay();
		
		System.out.println(e.getdisplay(200));
		
		
	}

}
