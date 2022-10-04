package AllprogRevision;

import java.util.Scanner;

public class FindOddEvenNum {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		double num=sc.nextDouble();
		
		System.out.println("Result:");
		
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
