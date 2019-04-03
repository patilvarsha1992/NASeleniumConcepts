package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityFeature {
	WebDriver driver;
	
	@BeforeTest
	
	// to check report 
	//1. refresh the project
	//2. go to test-output folder
	//3. right click on index.html file
	//4.go to properties
	//5.copy location and go to browser and paste
	public void luanchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		}
	
	@Test(priority=1)
	public void getTitle(){
		System.out.println("title -- "+driver.getTitle());
		System.out.println("@Test - Check title");
	}
	
	@Test(priority=3)
	public void checkLogo(){
		boolean b =driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println("@Test - Check Logo" );
	}
	
	@Test(priority=2)
	public void checkGmailLink(){
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("@Test - Check Gmail link");
	}
	
//	@AfterMethod
//	public void quit(){
//		driver.quit();
//	}

}
