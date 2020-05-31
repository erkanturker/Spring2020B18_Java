package day_39ExcelWriteAndRead;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
FileInputStream: helps us to read file
WorkBook(I) : designed for excelfile, reads excel files
implemented by XSSFWorkBook
classSheet(I): helps to get spreadsheets from excel file
implemented by XSSFSheet class
Cell(I): helps us to retrive specific cell
 */

public class ExcelRead {
    public static void main (String[] args) throws IOException {
        String filepath ="/Users/turker/Desktop/Class Notes/Java/20ExcelWriteandRead/TestData.xlsx";
        String sheetName= "Sheet1";
        FileInputStream file = new FileInputStream ( filepath ); //read file

        Workbook excelFile = WorkbookFactory.create ( file );

        Sheet sheet = excelFile.getSheet ( sheetName );

        Cell cell = sheet.getRow ( 1 ).getCell ( 0 );

        Cell cell1 = sheet.getRow ( 1 ).getCell ( 2 );

        String cellDataSalary = cell1.toString ();

        String cellDataName= cell.getStringCellValue ();

        System.out.println (cellDataName);
        System.out.println (cellDataSalary);



    }
}
