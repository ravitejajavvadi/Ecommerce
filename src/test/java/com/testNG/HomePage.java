package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePage extends Setup {
//	WebDriver driver;
//	@BeforeSuite
//    public void LaunchBrowser() {
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/index.php");
//	}
	
//	Setup se= new Setup();
	
	
	@Test
	public void verify_title() {
		String title= driver.getTitle();
		System.out.println(title);
		int b=Setup.i;
		
	}
	
	@Test
	public void verify_logo() {
		boolean res=driver.findElement(By.xpath("//img[@src=\"img/AdactIn_logo.png\"]")).isDisplayed();
		if(res==true) {
			System.out.println("logo displayed");
		}
		
	}
	
//	@AfterSuite
//	public void BrowserClose() {
//	driver.quit();
//		
//	}
	
	
}
