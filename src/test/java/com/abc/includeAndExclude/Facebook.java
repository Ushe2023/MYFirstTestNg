package com.abc.includeAndExclude;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Facebook {
	
	@Test(groups={"login"})
	public void loginWithValidData()
	{
		System.out.println("Login page testing with valid data");
	}
	
	@Test(groups={"login"})
	public void loginWithInvalidData()
	{
		System.out.println("Login page testing with invalid data");
	}
	
	@Test(groups={"search"})
	public void searchWithValidData()
	{
		System.out.println("search page testing with valid data");
	}
	
	@Test(groups={"search"})
	public void searchWithInalidData()
	{
		System.out.println("Search page testing with valid data");
	}
	

}
