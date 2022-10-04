package Parameterization;

import org.testng.annotations.Test;

public class Example5 {

	@Test(dependsOnMethods="signin",enabled=true)
	
	public void login() {
		System.out.println("login method");
	}
	
	@Test(dependsOnMethods="login",enabled=true,timeOut=3000)
	
	public void checknotification() {
		
		System.out.println("check notificaton");
		
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	
	public void signin() {
		System.out.println("signin method");
		
		int i=10/0;
	}
}
