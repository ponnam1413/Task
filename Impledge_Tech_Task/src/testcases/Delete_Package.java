package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import libraries.LoginUtils;

public class Delete_Package extends LoginUtils
{
	@Test
	public void delete_Package() throws Throwable
	{
		driver.findElement(By.xpath("//span[text()='Packages']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-icon[text()='add'])[2]")).click();
		Thread.sleep(1000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()=' FirstName_LastName 10 x 5 x 3 ']"))).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//mat-icon[text()='delete'])[1]")).click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//span[text()=' Delete Package Type']")).click();

		if (driver.findElement(By.xpath("//span[text()='FirstName_LastName has been successfully deleted']")).isDisplayed())
		{
			System.out.println("Package Deleted Successful");
		} else 
		{
			System.out.println("Package Not Deleted");
		}

	}
}
