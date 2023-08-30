package libraries;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils
{
	public void login(String uid,String pwd)
	{
		driver.findElement(By.xpath("(//input[@placeholder='Email'])[1]")).sendKeys(uid);
		driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}
	
	
	public void isAdminModuleDisplayed()
	{
		if (driver.findElement(By.xpath("//mat-chip[text()='Admin ']")).isDisplayed())
		{
			System.out.println("Admin Module Displayed Successful");
		} else 
		{
			System.out.println("Admin Module Not Displayed");
		}
	}
	
	public void logout()
	{
		driver.findElement(By.xpath("//mat-icon[text()='more_vert']")).click();
		driver.findElement(By.xpath("//button[text()=' Logout ']")).click();
	}
	
}
