package Parameterization;

import org.testng.annotations.Test;

public class Example3 {
	
	@Test(dependsOnMethods="signin",enabled=true)
	
	public void login() {
		System.out.println("login method");
	}
	
	@Test(dependsOnMethods="login",enabled=false)
	
	public void checknotification() {
		System.out.println("check notification method");
	}
	
	@Test(enabled=true)
	
	public void signin() {
		System.out.println("sign in method");
	}

}
