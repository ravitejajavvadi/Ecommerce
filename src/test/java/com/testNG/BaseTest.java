package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	String name="ravi";  //global variable: we can use anywhere in the project  and classes and methods.
	
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class : Browser Launching ");
	}
	 
	@AfterClass
	public void afterClass() {
	System.out.println("After Class : Browser Close");
	}
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println(" Before Method:: User Login");
	}
	 
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method : User Log out ");
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority=2,groups="smoke")

	@Parameters({"url","emailid","browser","env","Username","pwd"})
	public  void verifyhomepage() {
	 System.out.println("Thread count ID ::"+Thread.currentThread().threadId());
		String url="";
		String emailid="";
		String browser="";
		String env="";
		String username="";
		String pwd="";
		int i;
		System.out.println("global variable::"+name);
		
		System.out.println("parameter data from URL::"+url);
	    System.out.println("Parameter data from Browser::"+browser);
		System.out.println("parameter data email id::"+emailid);
		System.out.println("parameter data Env::"+env);
		System.out.println("parameter data usernmae::"+username);
		System.out.println("TestNG Xml PWD::"+pwd);
		
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
		System.out.println(" Verify the home page modules");
}
		
	

	@Test(priority=1,groups="regression")
	public void verifyregistration() {
		 System.out.println("Thread count ID ::"+Thread.currentThread().threadId());

		System.out.println("verify the user registration");
		System.out.println("local variabble::"+name);
	}

	@Test(priority=3,groups="regression")
	public void verifyUSercreation() {
		 System.out.println("Thread count ID ::"+Thread.currentThread().threadId());

		System.out.println("before try block");
        try {
        	Assert.assertEquals(false, true);
        }
        catch(Exception e) {
          	System.out.println("verify the user creation");
        	e.getMessage();
        }
	
	}
	
	@Test(groups="sanity")
	public void Verifytitleofthepage() {
		 System.out.println("Thread count ID ::"+Thread.currentThread().threadId());

		System.out.println("verify the title of the page");
	}
	
	@Test(groups="sanity")
	public void Workrequest() {
		 System.out.println("Thread count ID ::"+Thread.currentThread().threadId());

		System.out.println("verify the workrequesst");
	}
}
