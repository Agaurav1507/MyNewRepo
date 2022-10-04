package Newrevision1;

public class primitivecasting {

	public static void main(String[] args) {
        
		int i=20;
		long d=50;
		short s=100;
		
		//implicite widening
		double w=i;
		double t=d;
		long l=s;
		
		//expicite widening
		
		double h=(double) i;
		double q=(double) d;
		long g=(long) s;
		
		//explicite narrowing
		
		short r=(short) i;
		short u=(short) d;
		byte b=(byte)s;
		
	}

}
