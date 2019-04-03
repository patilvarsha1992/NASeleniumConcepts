package TestNg;

import org.testng.annotations.Test;

public class GroupFeature {
	
	@Test(priority=1,groups="title")
    public void getText(){
		System.out.println("@Test - Get Text");
	}
	
	@Test(priority=2,groups="title")
    public void checkLogo(){
		System.out.println("@Test - Check Logo");
	}
	@Test(priority=3,groups="link")
    public void getlink(){
		System.out.println("@Test - Get Text");
	}
	
	@Test(priority=4,groups="test")
    public void test4(){
		System.out.println("@Test - Test4");
		
	}
	@Test(priority=5,groups="test")
    public void test5(){
		System.out.println("@Test - Test5");
	}
	
	@Test(priority=6,groups="test")
    public void test6(){
		System.out.println("@Test - Test6");
	}
}
