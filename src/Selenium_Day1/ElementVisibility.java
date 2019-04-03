package Selenium_Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://register.freecrm.com/register/");
		
//		//isDisplay() method
		boolean b1=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println("isDisplay--"+ b1);
		
		
		//isenable() method
//		boolean b2=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
//		System.out.println("isenable--"+ b2);//false
//				
//		//isenable() method
//		driver.findElement(By.id("uid-firstName-9")).sendKeys("sugar");
//		driver.findElement(By.id("uid-lastName-11")).sendKeys("throw");
//		driver.findElement(By.id("uid-email-13")).sendKeys("asb@gmail.com");
//		driver.findElement(By.id("uid-password-15")).sendKeys("dffh2Sjjk");
//		boolean b3=driver.findElement(By.id("signup-app")).isEnabled();
//		System.out.println("isenable--"+ b3);  
				
	 
		//isselected() method
		boolean b3=driver.findElement(By.id("terms")).isSelected();
		System.out.println("isselected--"+ b3);//false
		
		driver.findElement(By.id("terms")).click();
		boolean b4=driver.findElement(By.id("terms")).isSelected();
		System.out.println("isselected--"+ b4);//
			
		driver.findElement(By.id("terms")).click();
		boolean b5=driver.findElement(By.id("terms")).isSelected();
		System.out.println("isselected--"+ b5);//
					
	}

}
