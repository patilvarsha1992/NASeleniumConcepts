package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderFeature {
	
	//Task Register 5 user using single test case (use data provider concept with data driven framwork read data from xlxs file 
	
	static WebDriver driver;
	@BeforeMethod
	public void luanchBroswer(){
		System.setProperty("webdriver.chrome.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		driver= new ChromeDriver();
		driver.get("");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
	}
	
	@Test
	public static void getData(){
		driver.findElement(By.id("first_name")).sendKeys("");
		driver.findElement(By.id("last_name")).sendKeys("");
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("confirm_pass")).sendKeys("");
		driver.findElement(By.id("submitReg")).click();
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}

}
