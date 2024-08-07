package selenium.Ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	   driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	   
	   String value=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[3]/span")).getText();
	   System.out.println("WebTable Text ::"+value);
	   
	   
	   
	   
	 //FindElements
	                                 //Handling Row Values
		
//	 		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
//	 		System.out.println("Number of Rows in Table::"+rows.size());
	 		

//	 		for(WebElement e:rows) {
//	 			
//	 			
//	 			System.out.println("row_data ::"+e.getText());
//	 		}
	 		
	 		
	                              //Handling the Headers 		
//	 		List<WebElement>headers=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr[1]/th"));
//	 		for(WebElement h:headers) {
//	 			System.out.println("header of the Table::"+h.getText());
//	 		}
	 		
	 		                        //Handling Cell Values
	 		
//	 		List<WebElement>cellvalues=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr[2]/td"));
//	 		System.out.println("Number of cells  in Table::"+cellvalues.size());
	 		
	             
//	 		
	 		                           /*Dynamic WebTable handling Data*/
	 		
	 		List<WebElement>cellcount=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td[3]"));
	 		 System.out.println("size of rows ::"+cellcount.size());
	 		 for(int i=1;i<cellcount.size();i++) { 
	 			 
	 			String country_name= cellcount.get(i).getText();
	 			if(country_name.equalsIgnoreCase("Austria")) {
	 				System.out.println("Country Name Prescent");
	 				
	 			}
	 			
	 			 
	 		 }

	}

}
