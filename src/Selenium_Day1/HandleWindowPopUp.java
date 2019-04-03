package Selenium_Day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Types of popup
		//1 alerts:- Javascrip popup -- Altert API(accept,dismiss)
		//2 File uplaod -Browse button (By sendkey)
		//3. Browser popup -advertisment popup (windowhandler API - getWindowHandle method)
		//window id is always unique
		//set does not have index that why we use iterator
		
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
		Set<String> handle=driver.getWindowHandles();
		
		Iterator <String> it=  handle.iterator();
		String parentWindowId= it.next();
		String childWindowId= it.next();
		
		System.out.println("child ID-"+ childWindowId);
		System.out.println("parent ID-"+ parentWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child Title-"+ driver.getTitle());
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowId);
		System.out.println("parent Tilte-"+ driver.getTitle());
		
		
		


	}

}
