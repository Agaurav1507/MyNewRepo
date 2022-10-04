package Newrevision1;

public class Wrapperclasses {

	public static void main(String[] args) {
          
		Integer i=20;  //autoboxing
		
		int a=500;
		
		Integer s=a;  //autoboxing
		
		Integer d=new Integer(a);//explicite boxing
		
		System.out.println(d);
		
		int v=d.intValue();//unboxing
		
		System.out.println(v);
		
		
	}

}
