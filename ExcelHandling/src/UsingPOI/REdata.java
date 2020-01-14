package UsingPOI;

import Library.ExcelDataConfig;

public class REdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelDataConfig excel=new ExcelDataConfig("ExcelFileFolder/Sheetk1.xlsx");
		System.out.println(excel.getData(1, 0, 1));

	}

}
