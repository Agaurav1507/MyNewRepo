package Newrevision1;

class constructor10 {
	
	int num;
	double num2;
	char s;
	
	
	constructor10(int num,double num2,char s){
		System.out.println("constructor10 constructor");
	}
	
	
	
	void display() {
		
		System.out.println(this.num=num);
		this.num2=num2;
		this.s=s;
	
		System.out.println("constructor10 display method");
	}
	
	
	constructor10(int num1){
		
		System.out.println("num1 constructor");
	}
	
}

class constructoroverloading {
	
	constructoroverloading(int num1){
		
		
		System.out.println("call num1");
	}
	
	constructoroverloading(int num1,int num2){
		
		this(20);
		System.out.println("call num1 num2");
	}
	
	void dislay() {
		
		System.out.println("display method of constructoroverloading");
	}
	
}


public class constructor {

	
	public static void main(String[] args) {
      
		constructor10 cons=new constructor10(100,200.02,'z');
		
		cons.display();
//		
//		System.out.println("**************************************");
//		
//		constructoroverloading consover=new constructoroverloading(20,40);
//		
//		consover.dislay();
//		
//		System.out.println("*******************************************");
		
	}
}
	



