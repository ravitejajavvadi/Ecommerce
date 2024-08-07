package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
	//id	
//		driver.findElement(By.id("username")).sendKeys("Admin");
		
	//name
		
//		driver.findElement(By.name("")).clear();)
//		driver.findElement(By.name("password")).sendKeys("abc123");
//		Thread.sleep(4000);
	//class
//		driver.findElement(By.className("login_button")).click();
		
	
	//linkText
//		driver.findElement(By.linkText("New User Register Here")).click();
		
	
	//partialLinkText
//		driver.findElement(By.partialLinkText("New User")).click();
		
		
//absolute xpath [/]: /html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("xpath_username");
		
//Relative Xpath [//]:  //input[@id='password']		, //span[@id='password_span']  []

		// syntax : //tagname[@attributename='value']		
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sdf");
		
	String labeltext=driver.findElement(By.xpath("//table[@class='login']/tbody/tr[7]/td[1]")).getText();
	System.out.println("label text::"+labeltext);
		
//contains:-
	driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();

	
	}

}
