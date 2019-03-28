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
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChangeView {
	WebDriver driver;
	String baseUrl;
	
	

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ivantuuyu\\Desktop\\Selenium\\Selenium_JAVA\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://codepen.io/jshlfts32/details/bjambP";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	
	@Test
	public void test() throws InterruptedException {
		WebElement changeView = driver.findElement(By.xpath("//*[@id='view-switcher-button']"));
		changeView.click();
		
		Thread.sleep(2000);
		WebElement editorView = driver.findElement(By.xpath("//*[@id='pen-link']"));
		editorView.click();
		
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
