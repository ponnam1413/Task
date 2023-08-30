package libraries;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.AppUtils;

public class LoginUtils extends LoginPage
{
	String uid = "kloudship.qa.automation@mailinator.com";
	String pwd = "Password1";

	@BeforeTest
	public void login()
	{
		driver.findElement(By.xpath("(//input[@placeholder='Email'])[1]")).sendKeys(uid);
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();

		LoginPage lp = new LoginPage();
		lp.isAdminModuleDisplayed();
	}

	@AfterTest
	public void logout()
	{
		driver.findElement(By.xpath("//mat-icon[text()='more_vert']")).click();
		driver.findElement(By.xpath("//button[text()=' Logout ']")).click();

	}
}
