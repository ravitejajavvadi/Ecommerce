package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnatotaionsDemo {

	
	
	 
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class will always execute prior to Before Method and Test Method ");
	}
	 
	@AfterClass
	public void afterClass() {
	System.out.println("After Class will always execute later to After Method and Test method");
	}
	 
	@BeforeTest
	public void beforeTest() {
	System.out.println("Before Test will always execute prior to Before Class, ,Before Method and Test Method ");
	}
	 
	@AfterTest
	public void afterTest() {
	System.out.println("After Test will always execute later to After Method, After Class ");
	}
	 
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Suite will always execute prior to all annotations or tests in the suite");
	}
	 
	@AfterSuite
	public void afterSuite() {
	System.out.println("After suite will always execute at last when all the annotations or test in the suite have run.");
	}
	 

}
