package selenium.Ecommerce;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.linkText("New User Register Here")).click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window ID::"+parentwindow);
		driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();
		Set<String>handles=driver.getWindowHandles();
		
                                         //Method-1//		
//		for(String s:handles) {
//			
//			if(!parentwindow.equals(s)) {
//				System.out.println("child widnow id::"+s);
//				driver.switchTo().window(s);
//				String childwidnow_title=driver.getTitle();
//				System.out.println("child window title::"+childwidnow_title);
//				driver.switchTo().window(parentwindow);
//				System.out.println("parent widnow title::"+driver.getTitle());
//				
//			}
		
		
		//****************************//Method-2//
		
		int count=0;
		for(String h:handles) {
			
			count++;
			System.out.println("count value::"+count);
			if(count==2) {
				driver.switchTo().window(h);
				String childwidnow_title=driver.getTitle();
				System.out.println("child window title::"+childwidnow_title);
				driver.switchTo().window(parentwindow);
				
		//redirect to the parent window//		
				driver.switchTo().defaultContent();
				
			}
			else {
				continue;
			}
		}
		
	  }
		
	}


