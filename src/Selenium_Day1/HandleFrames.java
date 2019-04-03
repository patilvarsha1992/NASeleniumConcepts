package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFrames {

	public static void main(String[] args) {
		String browser= "Chrome";
		WebDriver driver =null; //webdriver is interface
		if (browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/geckodriver");
			driver= new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
			driver= new ChromeDriver();
		}
		
		//maximize window
		driver.manage().window().maximize();
		
		//delete all the cookies
		driver.manage().deleteAllCookies();
		
		//Dynamiv wait
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// implicit wait
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//2 way to find iframe
		//1. by name
		//2. by frame no. always start from 0
		
		
		//what is frame method (overloaded method): int and string
		//now o days frames are gone acc to w3 standard
//		driver.switchTo().frame(0);
		driver.switchTo().frame("iframeResult");
//		WebElement iframe= driver.findElement(By.id("iframeResult"));
		driver.findElement(By.name("firstname")).sendKeys("varsha");;
		

	}

}
