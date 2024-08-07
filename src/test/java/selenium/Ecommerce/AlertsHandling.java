package selenium.Ecommerce;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
//		driver.findElement(By.xpath("//div[@id=\"CancelTab\"]/button")).click();
		
	//Alert Class::
//		Alert alert= driver.switchTo().alert();
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		String alertext=alert.getText();
//		System.out.println("Alert Text Message::"+alertext);
		
//		alert.accept();   //click on the OK Button
		
//		alert.dismiss();  //click on the cancel button.
		
		
		///*****-----------------------------------------******/
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"Textbox\"]/button"))).click();
//		driver.findElement(By.xpath("//div[@id=\"CancelTab\"]/button")).click();
		
		
		//Alert Class::
//		         wait.until(ExpectedConditions.alertIsPresent());
				Alert alert1= driver.switchTo().alert();
						String s=alert1.getText();
						System.out.println("alert text ::"+s);
						
				alert1.sendKeys("test data");
				
		

		
	}

}
