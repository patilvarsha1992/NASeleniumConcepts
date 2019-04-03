package Selenium_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to launch safari browser need to do
		// 1. add safari extension from seleniumhq site - SafariDriver - DEPRECATED - use Apple's SafariDriver with Safari 10+ 
		// 2. enable remote automation from develop. to get develop menu - go to preference->advance-> check show develop menu in tool bar
		// then go to develop menu and enable allow remote automation
		WebDriver driver= new SafariDriver(); 
		//for safari browser no need to set property 
		
		
		

	}

}
