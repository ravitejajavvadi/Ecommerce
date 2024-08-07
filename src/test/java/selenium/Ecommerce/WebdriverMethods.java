package selenium.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
//idDispyed	
		boolean result= driver.findElement(By.xpath("//a[@href='Register.php']")).isDisplayed();
//		System.out.println("element is displayed::"+result);
		if(result==true) {
			System.out.println("element is displayed::"+result);	
		}
		else {
			System.out.println("element not displyed");
		}
		
//isEnabled
    	boolean	res1=driver.findElement(By.name("username")).isEnabled();
    	if(result==true) {
			System.out.println("element is enabled::"+res1);	
		}
		else {
			System.out.println("element not enabled"+res1);
		}
    	
  //isSelected
    	
//    driver.findElement(By.xpath("//a[@href='Register.php']")).click();
//    boolean	res2=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
//    if(res2==true) {
//		System.out.println("Checkbox is selected:"+res2);	
//	}
//	else {
//		System.out.println("Checkbox not selected::"+res2);
//	}
    
    
    //getAttribute:
    
    String name=driver.findElement(By.id("username")).getAttribute("type");
    String color=driver.findElement(By.id("username")).getCssValue("color");
    System.out.println("attribute name::"+name);
    System.out.println("attribute color::"+color);
    	
	}

}
