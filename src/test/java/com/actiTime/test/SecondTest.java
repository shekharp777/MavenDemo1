package com.actiTime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
	}
	
	@Test
	public void test02()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.close();
		
	}

}
