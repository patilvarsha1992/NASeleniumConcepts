package Selenium_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
//		WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","/Users/jaideo/Documents/varsha-workspace/SeleniumJars/geckodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		//validation point - to check what is expected and what we are getting
		//validation point very imp in every testcase
		if(title.equals("Google")){  //case sensitive
			System.out.println("correct title");
		}else{
			System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl()); //get current url
//		System.out.println(driver.getPageSource()); //get page source code might interviewer ask
		
        driver.quit(); //to close current window
		
	
	}

}
