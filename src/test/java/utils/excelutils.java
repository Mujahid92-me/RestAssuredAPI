package utils;

import java.io.IOException;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public excelutils(String excelpath,String sheetname)
	{
		try {
			 workbook = new XSSFWorkbook(excelpath);
			 sheet= workbook.getSheet(sheetname);
			 
		}
		catch(IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
		
	}
	
	public  Object getCellData(int rownum,int colnum)
	{			
			//below is used for any kind of data 
			DataFormatter format = new DataFormatter();
			Object obj = format.formatCellValue(sheet.getRow(rownum).getCell(colnum));
			System.out.println("cell value"+obj);
			return obj;
			
			
		
	}
	public  void  getRowCount()
	{
		
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);
	
	}

}
