package Utils;

public class Excell_Utils_Test {

  public static void main(String[] args)throws Exception{

    //getting records from previous class "Excell.Utils"
    String excelPath="./Data/MyData.xlsx";
    String sheetName="Sheet1";

    //making an object for Excell_Utils
    Excell_Utils excell=new Excell_Utils(excelPath, sheetName);

    excell.getRowCount();
    excell.getCellData(1,0);
    excell.getCellData(1,1);
    excell.getCellData(1,2);
    excell.getCellData(1,3);





  }

}
