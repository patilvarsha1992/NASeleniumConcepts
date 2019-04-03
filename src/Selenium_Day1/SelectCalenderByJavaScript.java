package Selenium_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orbitz.com/");
		Thread.sleep(2000);;
//		driver.findElement(By.id("checkin_input")).click();
		WebElement element= driver.findElement(By.id("hotel-checkin-hp-hotel"));
		String dateVal="03/28/2019";
		SelectDate(dateVal, element, driver);
	

	}
	 public static void SelectDate(String dateVal, WebElement element, WebDriver driver) {
		 System.out.println("called method");
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",  element);
	        
	        
	 }

}
