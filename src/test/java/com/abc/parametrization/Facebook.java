package com.abc.parametrization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {

	@Parameters({"email", "password"})
	@Test
//	public void invalidData(@Optional("Raju123@gmail.com") String myEmail, @Optional ("optionalpwd")String myPassword)
	
	public void invalidData(String myEmail, String myPassword)
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys(myEmail);
		
		WebElement Pwd=driver.findElement(By.id("pass"));
		Pwd.sendKeys(myPassword);
	}
}
