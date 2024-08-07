package selenium.Ecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingRaadibuttonAndCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.get("https://demo.automationtesting.in/Register.html");
	
		//radio button	
	boolean	status=driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
	
	if(status==false) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	
	 //Checkbox
	boolean result=driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected();

	if(result==false) {
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
	}
	}

}
