package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils 
{
	
	public static WebDriver driver;
	
	public String url = "https://ecs-qa.kloudship.com";
	
	
	@BeforeSuite
	public void launchApp()
	{
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);	
	}
	
	@AfterSuite
	public void closeApp()
	{
		driver.close();
	}
}
