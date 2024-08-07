package selenium.Ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
	//Login Action
		
		driver.findElement(By.id("username")).sendKeys("raviteja1994");
		driver.findElement(By.name("password")).sendKeys("Abc@12345");
		driver.findElement(By.className("login_button")).click();
	
	//handling dropdowns
		
		WebElement element=driver.findElement(By.id("location"));
//		element.getText();
//		element.click();
//		
	
		Select se1= new Select(driver.findElement(By.id("location")));
		        //or
		 
		 Select se= new Select(element);
			
//		se.selectByValue("London");
		
//		se.selectByIndex(2);
//		
//		se.selectByVisibleText("New York");
		 
//getFirstSelectedOption:-
		 
		WebElement ele = se.getFirstSelectedOption();
		System.out.println("Selected Frist Dropdwon Option ::"+ele.getText());
		
		
//GetOptions:-
		List<WebElement>elements=se.getOptions();
		for(WebElement obj:elements) {
			
			String dropdownvalue=obj.getText();
			System.out.println("drop down Option Value::"+dropdownvalue);
		}
		
//or

       for(int i=0;i<elements.size();i++) {
    	   
    	  String value= elements.get(i).getText();
    	
	
       }

	}

}
