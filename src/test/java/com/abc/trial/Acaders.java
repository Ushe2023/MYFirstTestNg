
//testngListener.xml is the testng file

package com.abc.trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abc.ItestListners.MyListener;
@Listeners(MyListener.class)
public class Acaders {

	
	@Parameters({"emailid", "pas"})
	@Test(priority=2)
	public void signin(String MyEmail,String MyPwd) {
		
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.acaders.com/");
//		Thread.sleep(3000);
		
		WebElement EmailWeb = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement PwdWeb = driver.findElement(By.xpath("//input[@name='password']"));
		
		EmailWeb.sendKeys(MyEmail);
		PwdWeb.sendKeys(MyPwd);
		
	}
	
	@Test(priority=1)
	public void End() {
		System.out.println("2nd Method: Success");
	}
	
}
