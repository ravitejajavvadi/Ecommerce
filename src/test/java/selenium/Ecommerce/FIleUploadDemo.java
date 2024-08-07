package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIleUploadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/input-type-file/");
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,700)");

		
		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\DELL\\eclipse-workspace\\Ecommerce\\src\\test\\java\\selenium\\Ecommerce\\data.txt");

//		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

}
