package Utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excell_Fetch {



  public static void main(String[] args) throws Exception {
      //how to get data from excell sheet in Rest Assured
      getRowCount();
      getCellData();

    }

  //how to read cell data from excell sheet

  public static void getCellData() throws Exception{

    //getting odata from excel sheet in the form of get row and cell number

    String excelpath="./Data/MyData.xlsx";
    XSSFWorkbook workbook=new XSSFWorkbook(excelpath);
    XSSFSheet sheet=workbook.getSheet("Sheet1");

    //for getting any value wether it is string or numeric
    DataFormatter formatter = new DataFormatter();
    Object value = formatter.formatCellValue(sheet.getRow(1).getCell(0));

    //double value=sheet.getRow(1).getCell(2).getNumericCellValue();
    System.out.println(value);


  }

  public static void getRowCount() throws Exception {

    //how to add excell file on rest assusred + how to read data from excell sheet

    String prodir = System.getProperty("user.dir");
    System.out.println(prodir);

      String excelpath = "./Data/MyData.xlsx";
      XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
      XSSFSheet sheet = workbook.getSheet("Sheet1");

    int rowCount = sheet.getPhysicalNumberOfRows();
    System.out.println("No of Rows " + rowCount);


  }


}


