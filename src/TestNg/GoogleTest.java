package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	@BeforeMethod
    public void luanchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
	}
	//Testcase does not run in order it will run any testcase if you want in order the there is one annotation priority
	@Test
    public void checkLogo(){
		boolean b =driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println("@Test - Check Logo" + b);
	}
	
	@Test
    public void checkGmailLink(){
		boolean b =driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("@Test - Check Gmail link"+ b);
	}
	
	
	@AfterMethod
	public void quitBrowser(){
		
		System.out.println("@AfterMethod - quit");
		driver.quit();
	}
}
