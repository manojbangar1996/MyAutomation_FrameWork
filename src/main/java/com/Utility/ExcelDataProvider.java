package com.Utility;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider extends BaseClass
{
	XSSFWorkbook wb;
	 
	public ExcelDataProvider() throws Exception
	{
		//String path=config.getExcelPath();
	String path="C:\\Testing WorkSpace2\\Automation_Framework\\TestData\\LoginData.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		wb=new XSSFWorkbook(file);
	}
	public String getStringData_Excel(String SheetName,int row,int cell)
	{
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	}
}
