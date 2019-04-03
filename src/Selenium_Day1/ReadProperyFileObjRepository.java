package Selenium_Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperyFileObjRepository {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/jaideo/Documents/varsha-workspace/Naveen_Automation/src/Selenium_Day1/ConfigFileRegisterFormData.properties");
		
		prop.load(ip);
		WebDriver driver=null;
		
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
			 driver= new ChromeDriver();	
			
		}else if(browserName.equals("ff")){
			System.setProperty("webdriver.gecko.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/geckodriver");
			driver= new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.id(prop.getProperty("lastname_id"))).sendKeys(prop.getProperty("lastname"));
		

	}

}
