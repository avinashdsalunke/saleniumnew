package Rsources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	 private XSSFSheet sheet;

	  public ExcelData(String filepath, String sheetname) throws IOException {

	    FileInputStream xl = new FileInputStream(filepath);

	    XSSFWorkbook workbook1 = new XSSFWorkbook(xl);

	    sheet = workbook1.getSheet(sheetname);
	    xl.close();
	  }

	  public String getdata(int rownumber, int columnnumber) {

	    XSSFRow row = sheet.getRow(rownumber);

	    XSSFCell cell = row.getCell(columnnumber);
	    cell.setCellType(CellType.STRING);
	    return cell.getStringCellValue();
	  }

	  public Integer rowcount() {
	    return sheet.getLastRowNum();
	  }

	   public ExcelData(String filepath ,int rownumber, int columnnumber,int index, String data) throws IOException {
	    
	     FileInputStream xl = new FileInputStream(filepath);
	          XSSFWorkbook workbook1 = new XSSFWorkbook(xl);
	          sheet = workbook1.getSheetAt(index);
	          Row row = sheet.getRow(rownumber);
	          Cell cell = row.createCell(columnnumber);
	          cell.setCellValue(data);
	          FileOutputStream fos = new FileOutputStream(filepath);
	          workbook1.write(fos)	;     
	}
}
