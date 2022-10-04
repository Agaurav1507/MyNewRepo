package AllprogRevision;

import java.util.Scanner;

public class countofdigits {

	public static void main(String[] args) {
              
		Scanner sc=new Scanner(System.in);
		
		int n;
		int i=0;
		
		System.out.println("Enter the number");
		
		n=sc.nextInt();
		
		while(n>0) {
			
			n=n/10;
			i++;
		}
		
		System.out.println("number of digits are = "+i);
		
	}

}
