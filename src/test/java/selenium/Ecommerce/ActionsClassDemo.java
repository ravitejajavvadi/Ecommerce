package selenium.Ecommerce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']//a[5]")).click();
		Thread.sleep(2000);
		
	WebElement mobilesAndAcce=driver.findElement(By.xpath("//div[@id='nav-subnav']//a[2]"));
	
	Actions a=new Actions(driver);
	a.moveToElement(mobilesAndAcce).build().perform();
	Thread.sleep(2000);
	
	WebElement mobileBrand=driver.findElement(By.xpath("//div[@class='mega-menu']/div[3]//a[contains(text(),'OnePlus')]"));
	a.click(mobileBrand).perform();

		

	}

}
