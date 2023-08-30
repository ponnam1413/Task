package testcases;

import org.testng.annotations.Test;

import libraries.AddPackage;
import libraries.LoginUtils;

public class Add_Package extends LoginUtils
{
	@Test
	public void addPackageTest() throws Throwable
	{
		AddPackage add = new AddPackage();
		add.addPackage("FirstName_LastName","10","5","3");
	}
}
