package TestNg;


import org.testng.annotations.Test;

public class ExpectedExceptionFeature {
	//output 
	//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0
//===============================================
	//test passed  because i have said that i am expecting this exception "ArithmeticException.class"
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void division(){
		int i =10/0;
		System.out.println("i="+ i);
		
	}

}
