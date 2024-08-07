package selenium.Ecommerce;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\mytestdatafiel.xlsx");
		XSSFWorkbook wrb= new XSSFWorkbook();
		XSSFSheet sheet=wrb.createSheet("data");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue("python");
		row1.createCell(2).setCellValue("C#");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Top1");
		row2.createCell(1).setCellValue("Top2");
		row2.createCell(2).setCellValue("Top3");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("2021");
		row3.createCell(1).setCellValue("2022");
		row3.createCell(2).setCellValue("2023");
		
		wrb.write(file);
		wrb.close();
		file.close();
		System.out.println("File is Crated........");
		
		//Test Status UPdate in Excel 
		
	}

}
