package pdfwordcount;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Readxls {
	private static final Logger logger = Logger.getLogger("Readxls");
	private static Map<String, Integer> salaries = new HashMap<>();

	public static void main(String[] args) {

		// Read salary file
		Scanner sc = new Scanner(System.in);
		logger.info("enter empId");
		String userEmpId = sc.next();


		try (Stream<String> lines = Files
				.newBufferedReader(Paths.get("C:\\Users\\schinthakunta\\Downloads\\Book1.xls")).lines();
				Stream<String> records = Files
						.newBufferedReader(Paths.get("C:\\Users\\schinthakunta\\Downloads\\Book2.xls")).lines()) {

			lines.forEach(line -> {
				String tokens[] = line.split(",");
				String empId = line.split(",")[0];
				Integer sal = Integer.parseInt(tokens[1]);

				if (salaries.containsKey(empId)) {
					salaries.put(empId, sal + salaries.get(empId));
				} else {
					salaries.put(empId, sal);
				}
			});
			Iterator<String> recordsIterator = records.iterator();
			while (recordsIterator.hasNext()) {
				String record = recordsIterator.next();

//					System.out.println("line is: "+record);
				String empId = record.split(",")[0];


				if (userEmpId.equals(empId)) {
//					logger.info("empId is: "+empId+" total sal is:"+salaries.get(empId));
					System.out.println("employee details are: " + record + "\n"+ " total sal:" + salaries.get(empId));
					return;
				}       
			}
			logger.info("could not find employeed in the database: " + userEmpId);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	}
}