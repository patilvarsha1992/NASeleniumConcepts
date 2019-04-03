package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitOrdynamicWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");

		WebDriver driver= new ChromeDriver();
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);//wait for to load page 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);// wait for page elements to load if elements loaded within 1 sec then
//		then it immediately perform next action. wont wait for 3 sec to complete. thats why its called dynamic wait.
		
		
		//static wait
		Thread.sleep(3000);//even though page is loaded in 1 sec still it will wait for 3 sec.

	}

}
