package Calendly;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingPages {

	WebDriver driver;
	String baseUrl; 
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ivantuuyu\\Desktop\\Selenium\\Selenium_JAVA\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://codepen.io/jshlfts32/full/bjambP/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL is: " + currentUrl);
		
		String urlToNavigate = "https://codepen.io/login";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigating to Login ");
		currentUrl = driver.getCurrentUrl();
		System.out.println("URL is: " + currentUrl);
		
		 Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("URL is: " + currentUrl);
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println("Navigate forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("URL is: " + currentUrl);
		
		 Thread.sleep(3000);
			
		driver.navigate().back();
		System.out.println("Navigate back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("URL is: " + currentUrl);
			
		driver.navigate().refresh();
		System.out.println("Navigate Refresh ");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh ");
		
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	

}
