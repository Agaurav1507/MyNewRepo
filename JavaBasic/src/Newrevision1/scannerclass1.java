package Newrevision1;

import java.util.Scanner;

public class scannerclass1 {

	public static void main(String[] args) {
               
		int num1;
		int num2;
		char op;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter num1");
		num1=sc.nextInt();
		System.out.println("enter num2");
		num2=sc.nextInt();
		System.out.println("enter the operation to perform");
		op=sc.next().charAt(0);
		
		
		switch(op) {
		
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			
		    default:
		    System.out.println("invalid op");
		}
	}

}
