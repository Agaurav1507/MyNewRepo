package Annotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example {
	
@Test
public void loginlogouttest() {
	
	int a=10;
	int b=12;
	int add= a+b;
	
	System.out.println("Addition is :-   " +add);

}
	

/**
@BeforeTest/@AfterTest--> behalf of all the @Test method executed only once either in the staring
or at the end
*/

}
