package Java_Maven.Java_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest {
	
	
	
	
	@Test
	public void openBrowser()
	{
		
		 WebDriver driver;	
		
		
	        System.setProperty(
	            "webdriver.chrome.driver",
	            "C:\\Users\\Hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        // Instantiate a ChromeDriver class.
	         driver = new ChromeDriver();
	  
	        // Maximize the browser
	        driver.manage().window().maximize();
	   
	        // Launch Website
	        driver.get("https://www.geeksforgeeks.org/");
	    
		
		
	}
	

}
