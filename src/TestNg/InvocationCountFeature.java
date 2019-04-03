package TestNg;

import org.testng.annotations.Test;

public class InvocationCountFeature { //same testcase will run 10 times
	@Test(invocationCount=10)
    public void getText(){
		System.out.println("@Test - Get Text");
	}
	
	//output===============================================
//	Default suite
//	Total tests run: 10, Failures: 0, Skips: 0
//	===============================================

	
}
