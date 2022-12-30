package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell_Utils {

  static XSSFWorkbook workbook;
  static XSSFSheet sheet;

  //made a constructor

    public Excell_Utils(String excelPath, String sheetName) throws Exception{

    workbook = new XSSFWorkbook(excelPath);
    sheet = workbook.getSheet(sheetName);

     }

    /*public static void main(String[] args) throws Exception {
      //how to get data from excell sheet in Rest Assured
      getRowCount();
      getCellData();

    }*/

    //how to read cell data from excell sheet

    public static void getCellData(int rowNum, int colNum) throws Exception{

      //getting odata from excel sheet in the form of get row and cell number

      //No need of this part after making constructor above
    /*String excelpath="./Data/MyData.xlsx";
    XSSFWorkbook workbook=new XSSFWorkbook(excelpath);
    XSSFSheet sheet=workbook.getSheet("Sheet1");*/

      //for getting any value wether it is string or numeric
      DataFormatter formatter = new DataFormatter();
      Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

      //double value=sheet.getRow(1).getCell(2).getNumericCellValue();
      System.out.println(value);


    }

    public static void getRowCount() throws Exception {

      //how to add excell file on rest assusred + how to read data from excell sheet

      String prodir = System.getProperty("user.dir");
      System.out.println(prodir);

      //No need of this part after making constructor above
      /*String excelpath = "./Data/MyData.xlsx";
      XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
      XSSFSheet sheet = workbook.getSheet("Sheet1");*/

      int rowCount = sheet.getPhysicalNumberOfRows();
      System.out.println("No of Rows " + rowCount);


    }


  }


