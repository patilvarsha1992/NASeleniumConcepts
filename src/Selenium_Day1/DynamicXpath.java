package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpath {

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
		
		driver.get("https://leadferret.com/search");
		
		//absolute xpath
		driver.findElement(By.xpath("//input[@id='titleInput']")).sendKeys("engineer");
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click(); //contain is use when need to search by word in sentence
		driver.findElement(By.xpath("//span[text()='SalesNexus']")).click();//text is used when need to find exact text
		
		//this should use when every time your refreshing the page and id is changing
		//Dynamib id: input
		//id = test_123
		//by.id("test_123") (id you use by id then you have to change id every time)
		
		
		//Starts with
		//id = test_234
		//id = test_345
		
		//Ends with
		//id = 234_test
		//id = 345_test
		
		driver.findElement(By.xpath("//input[contains(@id,'test_')")).sendKeys("varsha");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')")).sendKeys("varsha");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test')")).sendKeys("varsha");

		//Method 2 by using customize xpath 
				//for freecrm website
				//driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		//ul[@role='listbox']//li/descendant::div[@class='sbl1']
				
	}

}
