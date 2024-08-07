package com.testNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowser {

	
	@Test
	public void launch() {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println("-----Test1 Anatotaion Tag----- ");
	}
	

	@Test
	public void add() {
	
		System.out.println("Welcome to Add method");
		System.out.println("-----Test2 Anatotaion Tag ----");

	}
	

	@Test
	public void print() {
		
		System.out.println("Welcome to print method");
		System.out.println("-----Test3 Anatotaion Tag ----");

	}
	
		

	
	
	
	
}
