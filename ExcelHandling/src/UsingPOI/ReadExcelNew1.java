package UsingPOI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Sheet;

public class ReadExcelNew1 {

	public static void main(String[] args) throws Exception 
	{
		File excelfile=new File("ExcelFileFolder/sheetk1.xlsx");
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		System.out.println(sheet.getLastRowNum());
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total row is :"+rowcount);
		for(int i=0;i<rowcount;i++)
		{
			String data0=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Test Data from excel :"+data0);
			System.out.println("Data from row" +i+"is"+data0);
		}
		
		
		workbook.close();
		fis.close();

	}
	

}
