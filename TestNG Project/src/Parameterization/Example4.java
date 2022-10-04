package Parameterization;

import org.testng.annotations.Test;

public class Example4 {

	@Test(dependsOnMethods="signin",enabled=true)
	
	public void login() {
		System.out.println("login method");
	}
	
	@Test(dependsOnMethods="login",enabled=true)
	
	public void checknotification() {
		System.out.println("check notification");
	}
	
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	
	public void signin() {
		System.out.println("signin method");
		
		int i=10/0;
	}
}
