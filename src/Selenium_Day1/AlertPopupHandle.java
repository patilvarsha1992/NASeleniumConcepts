package Selenium_Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandle {

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
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.name("proceed")).click();
			
			//handle popup/alert/javascript pop
			Alert alert= driver.switchTo().alert();
			String alertMsg= alert.getText();
			
			//validation 
			if (alertMsg.equals("Please enter a valid user name")){
				System.out.println("error msg is correct");
			} else
				System.out.println("error msg is not correct");

			alert.accept();// click on
//			alert.dismiss();//click on cancel
			
			//to check popup displaying proper erroe msg
		 
			
			
	}

}
