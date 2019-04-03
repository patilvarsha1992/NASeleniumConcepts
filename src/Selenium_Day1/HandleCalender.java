package Selenium_Day1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.airbnb.com/");
		Thread.sleep(2000);
//		driver.findElement(By.id("hotel-checkin-hp-hotel")).click();;
		driver.findElement(By.xpath("//*[@id='checkin_input']")).click();
		
//		driver.findElement(By.xpath("//*[@id='MagicCarpetSearchBar']/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[4]/td[7]")).click();
		
		
		
		String date ="March-31-2019";
		String [] dateSplit =date.split("-");
		String month= dateSplit[0];
		String date1= dateSplit[1];
		String day= dateSplit[2];
		
		String beforeXpath= "//*[@id='MagicCarpetSearchBar']/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[";
		String afterXpath="]/td[";
		final int totalCol=7;
		String dayVal=null;
		boolean flag=false;
		for(int row=1;row<=7;row++ ){
			for(int col=1;col<=totalCol;col++){
				try{
					dayVal=driver.findElement(By.xpath(beforeXpath+row+afterXpath+col+"]")).getText();
					
				}catch(NoSuchElementException e){
					System.out.println("eneter valid data");
					flag= false;
					break;
				}
				if(dayVal.equals(date1)){
					driver.findElement(By.xpath(beforeXpath+row+afterXpath+col+"]")).click();
					flag= true;
					break;
				}
				
			}
			if(flag){
				break;
			}
			
			
		}
		
		
	}

}
//*[@id="MagicCarpetSearchBar"]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/strong
//*[@id="MagicCarpetSearchBar"]/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div/strong


