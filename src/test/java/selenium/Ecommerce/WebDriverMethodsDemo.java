package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
	//getTitle	
//	/**	String title=driver.getTitle();
//		System.out.println("The Application Titile::"+title);
//		 
//
//	//getCurrentURL
//		
//		String pageurl=driver.getCurrentUrl();
//		System.out.println("Current Page URL ::"+pageurl);**/
//		
  //getpagesource
//		String pagesource = driver.getPageSource();
//		System.out.println("page source ::"+pagesource);
			
	}

}
