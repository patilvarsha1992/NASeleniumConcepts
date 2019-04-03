package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	//No main method in testng
	//output
//	@BeforeSuite - setup Chrome 
//	@BeforeTest - Launch Browser
//	@BeforeClass - Enter Url
	
	//testcase always comes in set of 
	//beforemethod
	//test
	//aftermethod
//Test case 1
//	@BeforeMethod - Login
//	@Test - Check Logo
//	@AfterMethod - Logout
	
//Test case 2
//	@BeforeMethod - Login
//	@Test - Get Text
//	@AfterMethod - Logout
	
//	@AfterClass - Quit Browser
//	@AfterTest - Delete Cookies
//	PASSED: checkLogo
//	PASSED: getText
	@BeforeSuite
	public void setUp(){
		System.out.println("@BeforeSuite - setup Chrome ");
		
	}
	
	@BeforeTest
    public void launchBrowser(){
		System.out.println("@BeforeTest - Launch Browser");
	}
	
	@BeforeClass
    public void enterURl(){
		System.out.println("@BeforeClass - Enter Url");
	}
	
	@BeforeMethod
    public void login(){
		System.out.println("@BeforeMethod - Login");
	}
	
	@Test
    public void getText(){
		System.out.println("@Test - Get Text");
	}
	
	@Test
    public void checkLogo(){
		System.out.println("@Test - Check Logo");
	}
	
	
	@AfterMethod
	public void logout(){
		System.out.println("@AfterMethod - Logout");
	}
	
	@AfterClass
    public void quitBrowser(){
		System.out.println("@AfterClass - Quit Browser");
	}
	
	
	@AfterTest
    public void deleteAllCookies(){
		System.out.println("@AfterTest - Delete Cookies");
	}
	
	@AfterSuite
    public void generateTestReport(){
		System.out.println("@AfterSuite - Generate Reports");
	}

}
