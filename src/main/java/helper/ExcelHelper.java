package helper;

import Entities.Product;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

  public void WriteProductDataToExcel(Object data) {
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet spreadsheet = workbook.createSheet("Product");
    XSSFRow row;

    List<Product> products = new ArrayList<>();
    products.add(new Product(1, "Oreo", "10000", "Cake", Arrays.asList("A01")));
    products.add(new Product(2, "Chocobite", "15000", "Cake", Arrays.asList("A02")));

    int rowid = 0;
    for (Product product : products) {
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

    try {
      FileOutputStream out = new FileOutputStream("./src/main/resources/data.xlsx");
      workbook.write(out);
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
