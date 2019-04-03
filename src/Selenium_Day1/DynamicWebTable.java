package Selenium_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table");
		Thread.sleep(2000);
		//*[@id="content"]/table/tbody/tr[1]/td[1]
		//*[@id="content"]/table/tbody/tr[2]/td[1]
		//*[@id="content"]/table/tbody/tr[3]/td[1]
		//*[@id="content"]/table/tbody/tr[4]/td[1]
		
		
		//Method 1 by using for loop
		String beforeXpath = "//*[@id='content']/table/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=1; i<=5;i++){
		
			String text=driver.findElement(By.xpath(beforeXpath +i+afterXpath)).getText();
			System.out.println("text=="+text);
			if(text.contains("Taiwan")){
				String xpath="//*[@id='content']/table/tbody/tr["+i+"]/td[6]/a";
				System.out.println("xptht=="+xpath);
				driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td[6]/a")).click();
				break;
			}
		}
		
		//Method 2 by using customize xpath 
		//for freecrm website
		//driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		
	}

}
