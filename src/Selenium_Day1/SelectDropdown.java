package Selenium_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

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
		
		driver.get("https://leadferret.com/search");
		
		//handle drop down
		//select method use to select item from dropdown
		
		Select select = new Select(driver.findElement(By.name("tbl_contact_Last_name_filter")));
		select.selectByVisibleText("Includes");
				
		
	}
	

}
