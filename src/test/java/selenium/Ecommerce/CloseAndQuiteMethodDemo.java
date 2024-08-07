package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuiteMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@href=\"Register.php\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"http://www.adactin.com/HotelApp/TermsConditions.html\"]")).click();
		Thread.sleep(4000);
		String title=driver.getTitle();
		System.out.println("title of the terms & Conditions page::"+title);

//		driver.close();
		
		driver.quit();

	}

}
