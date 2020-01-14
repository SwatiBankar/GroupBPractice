package UsingPOI;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		File excelfile=new File("Input/TestData.xlsx");
		FileInputStream fis=new FileInputStream( excelfile);
		//we have creat XSSF Object to open xlsx excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		//System.out.println(sheet.getCell(0,0).getContents());
		Iterator <Row> rowIt=sheet.iterator();
		while(rowIt.hasNext())
		{
			Row row=rowIt.next() ;
			
			Iterator<Cell> cellIterator=row.cellIterator();
			while(cellIterator.hasNext())
			{
				Cell cell=cellIterator.next();
				System.out.println(cell.toString());
				
			}
			System.out.println();
			
		}
         workbook.close();
         fis.close();
	}

}
