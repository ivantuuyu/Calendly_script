package Calendly;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {


	WebDriver driver;
	String baseUrl; 
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ivantuuyu\\Desktop\\Selenium\\Selenium_JAVA\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://codepen.io/jshlfts32/details/bjambP";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
		
	}

	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/a[2]")).click();
		System.out.println("Click on login");
		driver.findElement(By.xpath("//*[@id='login-email-field']")).sendKeys("testemail@gmail.com");
		System.out.println("Sending user name");
		driver.findElement(By.xpath("//*[@id='login-password-field_']")).sendKeys("test");
		System.out.println("Sending passowrd");
				
	}
	
	@After
	public void tearDown() throws Exception {
	//	driver.quit();
	}

}
