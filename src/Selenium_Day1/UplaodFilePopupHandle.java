package Selenium_Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UplaodFilePopupHandle {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(50000);
		
		driver.findElement(By.id("uploadfile_0")).sendKeys("/Users/jaideo/Desktop/Testng_interview_questions.docx");


	}

}
