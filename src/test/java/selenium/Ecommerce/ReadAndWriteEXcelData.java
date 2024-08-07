package selenium.Ecommerce;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteEXcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook wbk= new XSSFWorkbook(fis);
		XSSFSheet sh= wbk.getSheet("sheet1");
		int totalRows= sh.getLastRowNum();
		
				
		for(int r=0;r<=totalRows;r++) {
		       XSSFRow rowData=sh.getRow(r);
		       int i= rowData.getLastCellNum();
		    		  
		       XSSFCell cell  =rowData.createCell(i+1);
		       cell.setCellValue("Fail");		        		       
	      		
	    }
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		wbk.write(file);
		System.out.println("Write Operation Completed...........");
		
		
	
		

	}

}
