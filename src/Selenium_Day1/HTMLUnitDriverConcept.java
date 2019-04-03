package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
/*
		+Test execution using HtmlUnitDriver is very fast. Since it is the fastest implementation of Selenium WebDriver.
		+Being headless and fast, it is an ideal choice for web scrapping.
		+Its browser - htmlUnit is Java based. Hence, it is platform independent.
		+It also supports JavaScript execution through in-built Rhino javascript engine.
		+ how to test without opening browser - and HTMLUnitDriver
		========================================================

		Limitations of HtmlUnitDriver:

		-Being non-GUI makes it difficult to create scripts and debug issues while scripting.
		-The Rhino javascript engine of HtmlUnitDriver makes it unsuitable to emulate other popular browser's javascript behaviour.
		
		*/
//		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://ui.cogmento.com/");
		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		
		//dynamic wait 
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Thread.sleep(2000);
		System.out.println("before login title-"+driver.getTitle());
		driver.findElement(By.name("email")).sendKeys("patilvarsha1992@gmail.com");
		System.out.println("entered username");
		driver.findElement(By.name("password")).sendKeys("Br1lliant");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		Thread.sleep(2000);
		System.out.println("after login title-"+driver.getTitle());
		

	}

}
