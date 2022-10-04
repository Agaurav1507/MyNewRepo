package AllprogRevision;

public class CheckforPrimeNum {

	public static void main(String[] args) {
           
		int num=9;
		int count=0;
	   for(int i=1;i<=num;i++) {
		    
		   if(num%i==0) {
			   count++;
		   }
		 }
	   
	   if(count==2) {
		   System.out.println("number is prime");
	   }else {
		   System.out.println("Not a prime");
	   }
	}

}
