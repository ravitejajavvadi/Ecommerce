package selenium.Ecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollOperationsAndJavaScriptMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.get("https://adactinhotelapp.com/index.php");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		//To scroll down
//		js.executeScript("window.scrollBy(0,200)");
//		Thread.sleep(3000);
		//To scroll up
//		js.executeScript("window.scrollBy(0,-100)");
		
  //ScrollintoView Method	
		
//		driver.findElement(By.linkText("New User Register Here")).click();
//		WebElement ele=driver.findElement(By.xpath("//a[text()=\"www.adactin.com\"]"));
//		js.executeScript("arguments[0].scrollIntoView(true)",ele);
//		ele.click();
		
		
	//Using JavaScript how to enter Data in the Textbox
		
		WebElement user_name=driver.findElement(By.id("username"));		
		js.executeScript("arguments[0].setAttribute('value','ravi')",user_name);
		
	//How to Click the Element Using JavaScript
		
		WebElement link=driver.findElement(By.xpath("//a[@href=\"Register.php\"]"));
		js.executeScript("arguments[0].click()",link);

		
		
		
	}

}
