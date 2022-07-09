package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("D:\\Desktop\\CreatCustomer.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("CreatCustomer").getRow(1).getCell(4).setCellValue("Selenium");

FileOutputStream fos = new FileOutputStream("D:\\Desktop\\CreatCustomer.xlsx");
wb.write(fos);
wb.close();
	}

}
