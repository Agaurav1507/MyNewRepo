package Revision;

public class methodoverloading {
	
	public static int disp(int num1,int num2) {
		int result=num1+num2;
		return result;
	}
	
	public static void disp(double d,float f) {
		
		double result=d*f;
		System.out.println(result);
	}

	public static void main(String[] args) {
            
		methodoverloading.disp(5500.50d, 5412.012f);
		
		System.out.println(methodoverloading.disp(500, 1000));
	}

}
