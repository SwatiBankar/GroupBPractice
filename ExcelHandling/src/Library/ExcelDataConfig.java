package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public  ExcelDataConfig(String excelPath) 
	{
		try {
			File file=new File( excelPath);
			FileInputStream fis=new FileInputStream(file);
			 workbook=new XSSFWorkbook(fis);
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}
	public String getData(int sheetNumber,int row,int column)
	{
		sheet=workbook.getSheetAt(sheetNumber);
		String  data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
