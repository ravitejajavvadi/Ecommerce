package selenium.Ecommerce;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registrationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
//implicityWait:-		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get("https://adactinhotelapp.com/index.php");
		WebElement link=driver.findElement(By.linkText("New User Register Here"));
//		driver.findElement(By.linkText("New User Register Here")).click();
		

//		driver.findElement(By.id("full_name")).sendKeys("ram");
		
//		driver.findElement(By.xpath("//table[@class='login']/tbody/tr[5]/td[2]/input")).sendKeys("ravi");
//		WebElement ele=driver.findElement(By.xpath("//table[@class='login']/tbody/tr[5]/td[2]/input"));
		
//		String s="ram";
//		ele.click();
//		ele.getText();
//		ele.sendKeys("dsfs");
		
//ExplicityWait:-
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000));
//		
//		wait.until(ExpectedConditions.textToBePresentInElement(link, "Forgot Password?"));
//		wait.until(ExpectedConditions.elementToBeClickable(link)).click();
//		WebElement ele=driver.findElement(By.xpath("//table[@class='login']/tbody/tr[5]/td[2]/input"));
//		wait.until(ExpectedConditions.visibilityOf((ele))).sendKeys("testdata");
		
//		wait.until(ExpectedConditions.visibilityOf((ele))).click();
//		String value =wait.until(ExpectedConditions.visibilityOf((ele))).getText();
		

//FluintWait:-
		
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofMillis(30))
		        .pollingEvery(Duration.ofMillis(10))
		        .ignoring(NoSuchElementException.class);
		
		link.click();
		fluentWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src=\"captch.php\"]"))); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
















