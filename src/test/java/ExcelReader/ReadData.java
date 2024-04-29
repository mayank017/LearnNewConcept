package ExcelReader;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadData {
    public static void ReaddatafromExcel() {
        try {
            FileInputStream fis = new FileInputStream("path to excel file");
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
            int row = xssfSheet.getLastRowNum();
            int cell = xssfSheet.getRow(1).getLastCellNum();



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
