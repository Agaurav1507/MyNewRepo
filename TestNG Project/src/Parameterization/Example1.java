package Parameterization;

import org.testng.annotations.Test;

public class Example1 {
	
	@Test(priority=1)
	
	public void login() {
		System.out.println("i am login method");
	}
	
	@Test(priority=3)
	
	public void logout() {
		System.out.println("i am logout method");
	}
	
	@Test(priority=2)
	
	public void sendmail() {
		System.out.println("i am send mail");
	}

}

/*
By Default each @Test has priority as 0
lowest priority will get executed first
*/