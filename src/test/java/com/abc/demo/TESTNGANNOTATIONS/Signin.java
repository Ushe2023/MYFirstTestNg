
//24-oct-2023
package com.abc.demo.TESTNGANNOTATIONS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signin {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Testing Gmail Application started");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Testing Gmail Applicated stopped");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Signin functionality is about to get executed");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Signin functionality is about to get stopped");
	}
	

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Signin class is about to get executed");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Signin class is about to get stopped");
	}

	@BeforeMethod
	public void setUp()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("After Method");
	}
	
	@Test
	public void checkForValidData()
	{
		System.out.println("Signin valid data");
	}
	
	@Test
	public void checkForInValidData()
	{
		System.out.println("Signin invalid data");
	}
	
}




