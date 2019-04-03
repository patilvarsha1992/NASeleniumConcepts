package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFeature {
	

		WebDriver driver=null;

//	    public void luanchBrowser(){
//			System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
//			WebDriver driver= new ChromeDriver();
////			driver.get("https://www.google.com/");
//			
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			
//			driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//			
//		}
//		
		@Test
	    public void getTitle() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
			WebDriver driver;
			driver= new ChromeDriver();
			driver.get("http://yahoo.com");
			Assert.assertEquals(driver.getTitle(), "Yahoo");//assert is use to check actual result and acpected result 
			Assert.assertEquals(driver.getTitle(), "Yahoo","title is not matched");//if not match the will print title is not match
			System.out.println(driver.getTitle());
			System.out.println("Login test");
			
		}

	


}
