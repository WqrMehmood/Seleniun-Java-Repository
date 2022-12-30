package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;

public class Data_Fetch_Using_Loop {

  public static void main (String[] args) throws IOException {

    String excelfilepath = "./Data/EmployData.xlsx";
    FileInputStream inputstream = new FileInputStream(excelfilepath);

    XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
    XSSFSheet sheet = workbook.getSheet("Sheet1");

    //Using for loop

   /* int rows = sheet.getLastRowNum();
    int cols = sheet.getRow(1).getLastCellNum();

    for (int r = 0; r <= rows; r++)  //loop for getting rows count
    {
      XSSFRow row = sheet.getRow(r);

      for (int c = 0; c < cols; c++)     //loop for getting cols count
      {
        XSSFCell cell = row.getCell(c);

        switch (cell.getCellType()) {

          case STRING:
            System.out.print(cell.getStringCellValue());
            break;
          case NUMERIC:
            System.out.print(cell.getNumericCellValue());
            break;
          case BOOLEAN:
            System.out.print(cell.getBooleanCellValue());
            break;
        }
        System.out.print(" | ");

      }
      System.out.println();
    }*/

    //Using Iterator

    Iterator iterator =sheet.iterator();

    while (iterator.hasNext()){
      XSSFRow row=(XSSFRow) iterator.next();

      Iterator celliterator=row.cellIterator();

      while (celliterator.hasNext()){

        XSSFCell cell=(XSSFCell) celliterator.next();

        switch (cell.getCellType()){

          case STRING:
            System.out.print(cell.getStringCellValue());
            break;
          case NUMERIC:
            System.out.print(cell.getNumericCellValue());
            break;
          case BOOLEAN:
            System.out.print(cell.getBooleanCellValue());
            break;

        }
        System.out.print(" | ");

      }
      System.out.println();
    }

  }
}

//jkhjs


