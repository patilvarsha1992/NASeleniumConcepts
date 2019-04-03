package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://leadferret.com/search");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
		Thread.sleep(3000);//static wait
		driver.findElement(By.linkText("Blog")).click();
		
	}

}
