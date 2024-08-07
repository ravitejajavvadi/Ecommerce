package selenium.Ecommerce;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFileDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
Properties prop= new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Ecommerce\\src\\test\\java\\selenium\\Ecommerce\\config.properties");
		prop.load(ip);
		String username =prop.getProperty("username");
		String url = prop.getProperty("url");
		String pwd =prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(pwd);
	    System.out.println(username);
	    
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
//	    driver.get("www.daaz.com");
	    driver.get(url);
	    
	    driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.className("login_button")).click();
		Thread.sleep(3000);
	     System.out.println(driver.getTitle());
	
	}
	

}
