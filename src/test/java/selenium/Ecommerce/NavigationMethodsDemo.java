package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://adactinhotelapp.com/index.php");
		driver.navigate().to("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.xpath("//a[@href=\"Register.php\"]")).click();
		Thread.sleep(3000);

		//Refresh()
		driver.navigate().refresh();
		
		//back()
		Thread.sleep(3000);
		driver.navigate().back();
		
		//forward()
		driver.navigate().forward();
	}

}
