package Selenium_Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		//*****task find all no of link and name of links
		driver.get("https://leadferret.com/search");
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for( int i=0; i<=linklist.size();i++){
			System.out.println(linklist.get(i).getText());
		}
		
	}

}
