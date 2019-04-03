package Selenium_Day1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.tokens.DirectiveToken;



public class BrokenLinksAndImages {
	public static void main(String[] args) throws MalformedURLException, IOException{
		System.setProperty("webdriver.chrome.driver", "/Users/jaideo/Documents/varsha-workspace/SeleniumJars/chromedriver");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.amazon.com/");
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("href")));//adding all href tag in same list(linklist)
		
		System.out.println("Total link size"+"--->"+linklist.size());
		
		List<WebElement> activeLinks = new ArrayList<>();
		
		for(int i=0;i<linklist.size();i++){
			try{
				if(linklist.get(i).getAttribute("href")!= null && (!linklist.get(i).getAttribute("href").contains("javascript"))){
					activeLinks.add(linklist.get(i));
				}
			}catch(StaleElementReferenceException e){

			}
		}
		System.out.println("active link size"+"--->"+activeLinks.size());
		for(int j=0;j< activeLinks.size();j++){
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String msg= connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+ msg);
			
		}
		
		
	
	}

	private static WebElement get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
