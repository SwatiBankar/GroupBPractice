package UsingPOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelcopyprogram {

	public static void main(String[] args) throws IOException {
		File excelfile=new File("Input/TestData.xlsx");
		FileInputStream fis=new FileInputStream(excelfile);
		 XSSFWorkbook workbook=new XSSFWorkbook(fis);
		 XSSFSheet sheet=workbook.getSheetAt(0);
		 Iterator<Row> rowItr=sheet.iterator();
		 while(rowItr.hasNext())
		 {
			 Row row= rowItr.next();
			 Iterator<Cell> celliterator=row.cellIterator();
			 while(celliterator.hasNext())
			 {
				 Cell cell=celliterator.next();
				 System.out.println(cell.toString());
				 
			 }
			 System.out.println();
		 }
		 workbook.close();
		 fis.close();
		 
		
	}

}
