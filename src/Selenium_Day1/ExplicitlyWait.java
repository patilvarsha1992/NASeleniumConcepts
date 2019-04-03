package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		
		
		clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_2']")),20);

	}
	//Explicitly wait - use when you have to wait for particular element to load (if element is load in 1 sec then it will immediately perform next action
	//explicitly wait is a dynamic wait
	//diff between implicitly and explicitly
	// imp wait - wait for to load all elements of webpage
	//exp wait - wait to load particular element 
	
	public static void clickOn(WebDriver driver,WebElement locator,int timeout ){
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
			
	}

}
