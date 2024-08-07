package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {

	/*Access Modifiers:
		public  : we can access anywhere in the project
		private : we can access on the class level
		protected : it can access with class, package, child class, and relation between the other package child class. 
		default : it cab access only with in package 
		
		
		private =Access modifier
		int= data type
		i= variable
		= => assignment operator
		10= value
	*/	
	
	
	public static WebDriver driver;
	public static int i=10;
	
	@BeforeSuite
    public static void LaunchBrowser() {
		System.out.println("before suite");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
	}
	
	
	@AfterSuite
	public void BrowserClose() {
	driver.quit();
	System.out.println("After suite");
		
	}
}
