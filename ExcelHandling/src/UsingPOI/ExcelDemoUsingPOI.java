package UsingPOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Workbook;

public class ExcelDemoUsingPOI {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream file= new FileInputStream("/Input/TestData.xlsx");
			//HSSF class for xlx file code reading
			HSSFWorkbook book= new HSSFWorkbook(file);
			HSSFSheet sheet=(HSSFSheet) book.getSheet("TestData");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
