package selenium.Ecommerce;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GetScreenShotHandling {
	
	public  void takescreeshot1(WebDriver driver1) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver1;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File des=new File("./screenshots/image1.png");
		FileUtils.copyFile(source,des);
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
		driver.get("https://adactinhotelapp.com/index.php");
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File source= ts.getScreenshotAs(OutputType.FILE);
//		File des=new File("./screenshots/image1.png");
//		FileUtils.copyFile(source,des);
//		
//		GetScreenShotHandling.takescreeshot1(driver);
		
		GetScreenShotHandling ob= new GetScreenShotHandling();
		ob.takescreeshot1(driver);
		
		
		}
		

	}

