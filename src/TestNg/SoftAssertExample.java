package TestNg;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAssertExample {
	SoftAssert softAssert= new SoftAssert();
	
	@Test
	public void Test1(){
		System.out.println("enter url");
		Assert.assertEquals(true, true);
//		Assert.assertEquals(true, false); //hard assert-i am expecting true value but getting false so this test cases will marked as failed and wont go to next step
		
		System.out.println("enter user name");
		System.out.println("enter password");
		Assert.assertEquals(true, true);//softAssert- even this test case gets failed it will run all the below steps
		
		System.out.println("get title");
		softAssert.assertEquals(true, false);
		System.out.println("create user");
		softAssert.assertEquals(true, false);
		System.out.println("delete user");
		
		softAssert.assertAll();//  this will create one obj and store all failed test case in it and assertAll marked them as failed
	}
	
	@Test
	public void Test2(){
		System.out.println("logout");
		softAssert.assertEquals(true, false);
		softAssert.assertAll();
	}
	
//	@AfterClass  //doesnot maked testcases as failed dont use this
//	public void quit(){
//		softAssert.assertAll();
//	}
}
