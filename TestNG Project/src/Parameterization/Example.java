package Parameterization;

import org.testng.annotations.Test;

public class Example {
	
	@Test(invocationCount=5)
	
	public void param1() {
		System.out.println("i am parameterized method");
	}

}

/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/