package helper;

import Entities.Product;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteDataToExcel {
  // Java program to write data in excel sheet using java code


    // any exceptions need to be caught
    public static void main(String[] args) throws Exception
    {
      // workbook object
      XSSFWorkbook workbook = new XSSFWorkbook();

      // spreadsheet object
      XSSFSheet spreadsheet = workbook.createSheet("Product");

      // creating a row object
      XSSFRow row;

      // This data needs to be written (Object[])
      List<Product> products = new ArrayList<>();
      products.add(new Product(1, "Oreo", "10000", "Cake",  Arrays.asList("A01")));
      products.add(new Product(2, "Chocobite", "15000", "Cake",  Arrays.asList("A02")));


      // writing the data into the sheets...
      int rowid = 0;
      for (Product product :  products) {
        row = spreadsheet.createRow(rowid++);

        Cell cell0 = row.createCell(0);
        cell0.setCellValue(String.valueOf(product.getId()));

        Cell cell1 = row.createCell(1);
        cell1.setCellValue(product.getName());

        Cell cell2 = row.createCell(2);
        cell2.setCellValue(product.getPrice());

        Cell cell3 = row.createCell(3);
        cell3.setCellValue(product.getPortfolio());

        Cell cell4 = row.createCell(4);
        cell4.setCellValue(product.getCoupon().toString());
      }

      // .xlsx is the format for Excel Sheets...
      // writing the workbook into the file...
      FileOutputStream out = new FileOutputStream("./src/main/resources/data.xlsx");
      workbook.write(out);
      out.close();
    }
  }


