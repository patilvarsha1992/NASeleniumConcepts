package Selenium_Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSerachText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("testing");
		Thread.sleep(3000);//is imp 
		List<WebElement> googleSuggetions= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("no of suggestions == "+ googleSuggetions.size());
		for( int i=0; i<=googleSuggetions.size();i++){
			
			System.out.println(googleSuggetions.get(i).getText());
			if(googleSuggetions.get(i).getText().contains("testing center")){
				googleSuggetions.get(i).click();
			}
		}
	
		
	}
}
