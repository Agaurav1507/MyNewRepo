package Parameterization;

import org.testng.annotations.Test;

public class Example2 {


	@Test(enabled=true)
	
	public void login() {
		System.out.println("i am login method");
	}
	
	@Test(enabled=false)
	
	public void logout() {
		System.out.println("i am logout method");
	}
	
	@Test(enabled=true)
	
	public void sendmail() {
		System.out.println("i am send mail");
	}

}

/**
By default for each @Test enabled will set as enabled=true
enabled=true---> consider for execution
enabled=false---> don;t consider for execution
*/