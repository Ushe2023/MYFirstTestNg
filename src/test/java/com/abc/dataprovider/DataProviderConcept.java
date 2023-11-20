package com.abc.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	
	@DataProvider(parallel = true)
	public Object[][] pleaseProvideTheData()
	{
//		2 data(Username and Password) --> 4 combinations
//		2-D Array
		Object myData[][] = { {"Raju123@gmail.com", "Welcome@1234"}, {"Raju123@gmail.com", "fsdf"}, 
				{"sdghsag", "Welcome@1234"}, {"fsadf", "asfasdf"} };
		
		return myData;	
	}
}
