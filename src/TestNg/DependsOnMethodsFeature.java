package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethodsFeature {
	WebDriver driver;

    public void luanchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.qtpselenium.com/login");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
	}
	//Testcase does not run in order it will run any testcase if you want in order the there is one annotation priority
	@Test()
    public void login(){
		driver.findElement(By.name("username")).sendKeys("patilvarsha1992@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bupkar11");
		driver.findElement(By.xpath("//button[@class='btn btn-default button-new text-right']")).click();
		System.out.println("@Test - login" );
		System.out.println("clicked");
	}
	
	@Test(dependsOnMethods="login")
    public void getTitle(){
		driver.getTitle();
	}
	
	//output
//	===============================================
//			Default suite
//			Total tests run: 2, Failures: 1, Skips: 1
//			==========================================

}
