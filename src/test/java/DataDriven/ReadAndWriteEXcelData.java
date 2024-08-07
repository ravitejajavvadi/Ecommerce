package DataDriven;

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
		
		//Read the Data from File
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook wbk= new XSSFWorkbook(fis);
		
		XSSFSheet sh= wbk.getSheet("sheet1");
		int totalRows= sh.getLastRowNum();
		
		System.out.println("Total Rows in the Sheet::"+totalRows);
		for(int r=0;r<=totalRows;r++) {
		       XSSFRow rowData=sh.getRow(r);
		       int i= rowData.getLastCellNum();
		       System.out.println(" row number:"+r +"== Last Cell number for this row:: "+i);
		    	
		 //create the Cell and set the value 
		       XSSFCell cell  =rowData.createCell(i);
		       cell.setCellValue("PASS");		        		       
	      		
	    }
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		wbk.write(file);
		wbk.close();
		file.close();
		System.out.println("Write Operation Completed...........");
		
		
	
		

	}

}
