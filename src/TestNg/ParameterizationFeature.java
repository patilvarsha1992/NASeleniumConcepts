package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationFeature {
	WebDriver driver;
	@Test()
	@Parameters({"browser","url","username","pass"})
	public void login(String browser,String url,String username,String pass){
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
			driver= new ChromeDriver();
		}else{
			System.setProperty("webdriver.gecko.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/geckodriver");
			driver= new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}
