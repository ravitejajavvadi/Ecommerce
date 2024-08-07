package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("http://jqueryui.com/droppable/");
	  
/*Shifted to Inside Iframe*/
	
	//************Method-1*********/   
//index  
		driver.switchTo().frame(0);
	   String value=driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
		System.out.println("text value::"+value);
		
	//*************Method-2***************/	
	   
//webelement   
		WebElement ele= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		
		String value1 =driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
		System.out.println("text value::"+value1);
		
		
	}

}
