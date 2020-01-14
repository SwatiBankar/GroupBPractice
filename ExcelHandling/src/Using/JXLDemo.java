package Using;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLDemo {

	public static void main(String[] args)  {
		String path=System.getProperty("user.dir");
		File file=new File(path + "./Input/Test.sheet1.xls");
		
		
		try {
			
			//workbook is abstract class present in jxl
			Workbook book= Workbook.getWorkbook(file);
			//sheet is the interface of jxl
			Sheet sheet=book.getSheet(0);
			System.out.println(sheet.getCell(0,0).getContents());
		} catch (BiffException | IOException e ) {
		    System.err.println("unable to open excel file");
		    e.printStackTrace();
		}
	}

}
