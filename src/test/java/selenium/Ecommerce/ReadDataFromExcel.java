package selenium.Ecommerce;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*Excel file ---> workbook--->sheets---->Rows--->cells
		
		FileInputStream -->reading
		FileOutputStream -->writing
	
		Classes:
			XSSFWorkbook -->workbook
			XSSFSheet -->sheet
			XSSFRow --->row
			XSSFCell--->cell
		
		1. How Read data from Excel File******************/
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		XSSFWorkbook wbk= new XSSFWorkbook(fis);
		XSSFSheet sh= wbk.getSheet("sheet1");
		int totalRows= sh.getLastRowNum();
		int totalcells=sh.getRow(1).getLastCellNum();
		System.out.println("total rows ::"+totalRows);
		System.out.println("total cells ::"+totalcells);
		
		for(int r=0;r<=totalRows;r++) {
			       XSSFRow rowData=sh.getRow(r);
			       		       
			      		
			for(int c=0;c<totalcells;c++) {
				//rowData.getCell(c).toString();
				XSSFCell rowdata=rowData.getCell(c);
				System.out.print(rowdata.toString()+"\t");
			}
			System.out.println();
		}
		
	wbk.close();
	fis.close();
		
			
			
			
			
	}

}
