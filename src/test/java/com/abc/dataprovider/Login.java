package com.abc.dataprovider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

//	@Test(dataProvider = "pleaseProvideTheData")
	@Test(dataProvider = "pleaseProvideTheData", dataProviderClass = DataProviderConcept.class)
	public void checkLoginPage(String myEmail, String myPassword)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(myEmail);
		driver.findElement(By.id("pass")).sendKeys(myPassword);
		driver.close();
	}
	
}
