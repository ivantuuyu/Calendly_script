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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.WaitTypes;

public class Entergrid {

	WebDriver driver;
	String baseUrl;
	
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ivantuuyu\\Desktop\\Selenium\\Selenium_JAVA\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://codepen.io/jshlfts32/full/bjambP/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {
		if(isElementPresent(By.xpath("//*[@id='number']"))){
			System.out.println("Element is present");
			driver.findElement(By.xpath("//*[@id='number']")).sendKeys("20");
			driver.findElement(By.xpath("//*[@id='start']")).click();
			}else{
			System.out.println("Element is not present");
			}
		 
				
		
	}
	
	private boolean isElementPresent(By xpath) {
		// TODO Auto-generated method stub
		return false;
	}

	@After
	public void tearDown() throws Exception {
	}
}
	
