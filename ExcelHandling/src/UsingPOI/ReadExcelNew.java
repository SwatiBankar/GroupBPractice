package UsingPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelNew {

	public static void main(String[] args) throws Exception {
		File excelfile=new File("ExcelFileFolder/Sheetk1.xlsx");
		FileInputStream fis=new FileInputStream(excelfile);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		String data0=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is :"+data0);
		
		String data1=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is :"+data1);
		
		workbook.close();
		fis.close();

	}
	

}
