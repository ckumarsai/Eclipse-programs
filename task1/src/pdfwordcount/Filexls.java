package pdfwordcount;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class Filexls {
	private static Map<Integer, Double> salaries = new HashMap<>();

	public static void main(String args[]) throws IOException {
		// obtaining input bytes from a file
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\schinthakunta\\Downloads\\Book2.xls"));
		// creating workbook instance that refers to .xls file
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		// creating a Sheet object to retrieve the object
		HSSFSheet sheet = wb.getSheetAt(0);

		for (Row row : sheet) // iteration over row using for each loop
		{
			Integer empId = (int) row.getCell(0).getNumericCellValue();
			double salary = row.getCell(1).getNumericCellValue();
			String month = row.getCell(2).getStringCellValue();

			if (salaries.containsKey(empId)) {
				salaries.put(empId, salary + salaries.get(empId));
			} else {
				salaries.put(empId, salary);
			}
		}

		// Read data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.next();

		FileInputStream fis1 = new FileInputStream(new File("C:\\Users\\schinthakunta\\Downloads\\Book1.xls"));
		// creating workbook instance that refers to .xls file

		HSSFWorkbook wb1 = new HSSFWorkbook(fis1);
		// creating a Sheet object to retrieve the object
		HSSFSheet empSheet = wb1.getSheetAt(0);

		// evaluating cell type
		for (Row row1 : empSheet) // iteration over row using for each loop\\
		{
			if (row1.getRowNum() == 0)
				continue;

			Integer empId = (int) row1.getCell(0).getNumericCellValue();
			String firstName = row1.getCell(1).getStringCellValue();
			String lastName = row1.getCell(2).getStringCellValue();
			String location = row1.getCell(3).getStringCellValue();

			String designation = row1.getCell(4).getStringCellValue();

			// String empDetails = empId + "," + firstName + "," + lastName + "," + location
			// + "," + designation;

			if (name.equalsIgnoreCase(firstName)) {
				// System.out.println("the employee details are: " + empDetails + "\n" + " total
				// salary:" + salaries.get(empId));
				System.out.println("empId :" + empId + "\n" + "firstName :" + firstName + "\n" + "lastName :" + lastName
						+ "\n" + "location :" + location + "\n" + "designation :" + designation + "\n"
						+ " total salary:" + salaries.get(empId));
				return;

			}

		}
		System.out.println("No match found for name:" + name);

	}
}
