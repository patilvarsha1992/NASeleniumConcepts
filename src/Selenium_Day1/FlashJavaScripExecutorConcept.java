package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class FlashJavaScripExecutorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Highlight an Element
2. DrawBorder around an Element
3. Generate custom Alert during Test Execution
4. Click on an Element by using JaveScript
5. Refresh browser by using JavaScript
6. Get Title by using JavaScript
7. Get InnerText of page by using JavaScript
8. Scroll Into View and Scroll Page Down

Download this Libray from here:
https://drive.google.com/open?id=0B2i...

========================================================

+Must have feature Highlight element Selenium for better execution.
In Automation, testing sometimes element highlighter plays very important role. 

It helps us to track our execution flow which step is being processed. Some tools like QTP, Sahi etc. you will get this inbuilt feature. 

For Selenium, we have to write small code, which simply highlights element based on our parameter values. let’s get started and see Highlight element Selenium using CSS values.

In Selenium, we can use JavascriptExecutor (interface) to execute Javascript code into webdriver.

--Refer this video - how to highlight an Element using JS:
https://www.youtube.com/watch?v=PGPlL...

 */
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://leadferret.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.get("https://leadferret.com/");
		WebElement element=driver.findElement(By.id("navbarSigninButton"));
		
		flash(element, driver);
	}
	
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }
	

}
