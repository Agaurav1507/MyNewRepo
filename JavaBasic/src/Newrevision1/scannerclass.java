package Newrevision1;

import java.util.Scanner;

public class scannerclass {
	
	private static int addnumber(int num1,int num2) {
		
		return num1+num2;
	}

	public static void main(String[] args) {
		
		
         
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		
		
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		
		System.out.println("enter num2");
		num2=sc.nextInt();
		
		System.out.println("the result is");
		
		System.out.println(addnumber(num1,num2));
		
	}

}
