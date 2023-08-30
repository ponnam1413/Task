package libraries;

import org.openqa.selenium.By;

import utils.AppUtils;

public class AddPackage extends AppUtils
{
	public void addPackage(String name ,String len ,String wid ,String ht) throws Throwable
	{
		
		driver.findElement(By.xpath("//span[text()='Packages']")).click();
		driver.findElement(By.xpath("(//mat-icon[text()='add'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(len);
		
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-3']")).sendKeys(wid);
		
		driver.findElement(By.xpath("//input[@id='mat-input-4']")).clear();
		driver.findElement(By.xpath("//input[@id='mat-input-4']")).sendKeys(ht);
		
		driver.findElement(By.xpath("//mat-icon[text()='check']")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//span[text()='New package type created']")).isDisplayed())
		{
			System.out.println("Package Added Successful");
		} else 
		{
			System.out.println("Package Not Added");
		}
		
	}
	
}
