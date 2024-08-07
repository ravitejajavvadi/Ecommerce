package selenium.Ecommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
//		WebDriver driver= new InternetExplorerDriver();
//		driver.get("https://adactinhotelapp.com/index.php");

		
//		WebDriver driver= new FirefoxDriver();
//		driver.get("https://adactinhotelapp.com/index.php");
		
		
		
		String title=driver.getTitle();
		System.out.println("The Application Titile::"+title);
		 
		
		
		
//		Data Types:
//			
//			1. Int   -> 1 2 3 4 5 6 7 8 9 10,150,11546
//			2. String  -> "fhds%^$^%5465><"
//			3. boolean  -->true/false
//			4. char --> 'a'
		
//		int i=1;
//		System.out.println("the value integer::"+i);
//		
//		String s="ram";
//		System.out.println("the value string ::"+s);
//		
//		boolean result= true;
//		System.out.println("the value boolean::"+result);
//		
//		char c='a';
//		System.out.println("the value char::"+c);
		
		
	}

}
