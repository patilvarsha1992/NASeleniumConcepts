package Selenium_Day1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default&gmb=exp&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
//		driver.findElement(By.xpath("//div[@id='lang-chooser']/div[1]/div[1]/div[9]")).click();
//		System.out.println(driver.findElement(By.xpath("//*[@id='lang-chooser']/div[2]/div[9]/content")).getText());
//		List<WebElement> listElement=driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed qs41qe']//div//content"));
//		System.out.println(listElement.size());
//		
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
//		System.out.println(driver.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label")).getText());
		List<WebElement> listElement=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		System.out.println(listElement.size());
//		select particular value
//		for(int i=0;i<=listElement.size();i++){
//			System.out.println(listElement.get(i).getText());
//			if(listElement.get(i).getText().equals("Angular")){
//				listElement.get(i).click();
//				break;
//			}
//			//select all
//			for(int i=0;i<=listElement.size();i++){
//				System.out.println(listElement.get(i).getText());
//			    listElement.get(i).click();	
//		    }
			//isselected method
//		boolean b= driver.findElement(By.xpath("//input[@value='HTML']")).isSelected();//true
//		System.out.println("boolean value=" +b);
			for(int i=0;i<=listElement.size();i++){
//				System.out.println(listElement.get(i).getText());
				boolean b= listElement.get(i).isSelected();//true
				System.out.println("boolean value=" +b);
//				if (listElement.get(i).isSelected()){
//					listElement.get(i).click();	
//				}else{
//					listElement.get(i).click();
//				}
		    }
			
//			Thread.sleep(3000);
					
		
	}

}
