package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcelUtility {

	private static FileInputStream fileInputStream;

	private static Workbook workbook;

	private static FileOutputStream fileoutputstream;

	public static String getcellvalue(String sheetname, int rownum, int cellnum) throws IOException {

		FileInputStream fis = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		Workbook wb = new XSSFWorkbook(fis);
		
		String value=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
//		Cell cell=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);
//		
//		switch(cell.getCellType()) {
//		
//		case cell.CELL_TYPE_STRING:
//			return cell.getStringCellValue();
//			
//		case cell.CELL_TYPE_NUMERIC:
//			return " " + (int) cell.getNumericCellValue();
//			
//		case cell.CELL_TYPE_BLANK:
//			return " ";
//			
//		default:
//			throw new RuntimeException("There is no support for this type of cell");
//		}
		
		return value;

	}

	public void UpdateCellValue(String sheetName, int rowNum, int cellNum, String input) throws IOException {
		/* Identify the path and name of excel file */

		FileInputStream fis = new FileInputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		/* Create an instance of required workbook class */
		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);

		row.createCell(cellNum).setCellValue(input);
		FileOutputStream fos = new FileOutputStream("F:\\AUTOMATIONCLASSES\\Excel files\\Automation-sheet1.xlsx");

		workbook.write(fos);
		fos.flush();
		fos.close();

	}

}
