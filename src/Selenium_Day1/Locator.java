package Selenium_Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator {

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
		
		driver.get("https://leadferret.com/register");
		
		//8 type of Locator
		
		//1. id (priority 1)
		driver.findElement(By.id("first_name")).sendKeys("sugar");
		
		//2. xpath (priority 2)
		//should not use if its absolute path bcz its start from top node eg-/html/div/span/name/ (/mean absolute)
		//should use when it relative path  eg;-//*[@id="signUpForm"]/fieldset/legend  (// mean relative)
		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("throw");
		
		//3. name (priority 3)
		driver.findElement(By.name("phone")).sendKeys("818");
		
		//4.linktext (priority 4)
		driver.findElement(By.linkText("Tutorial videos")).click();
		
		//5.partiallinktext (priority 5) not recommended to use
		//find by link text name
		driver.findElement(By.partialLinkText("YouTube page")).click();
		
		//6.css selector (priority 2) 
		// if id is there ---(#idname)
		//if class is there-- .(classname)
		driver.findElement(By.cssSelector("#pass")).sendKeys("pass");
		
		//7.class (priority 6) not recommended to use bcz classname can be duplicates
		driver.findElement(By.className("input-xlarge")).sendKeys("sugar@gmail.com");
				

		
		// check check box
		driver.findElement(By.id("terms")).click();

		//8.tagname
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for( int i=0; i<=linklist.size();i++){
			System.out.println(linklist.get(i).getText());
		}
		
		
	}

}
