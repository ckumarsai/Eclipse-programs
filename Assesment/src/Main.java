import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		final String driver="com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/saikumar";
		final String USER = "root";
		final String PASS = "saikumar123";
		int ch;
		do {
		System.out.println("Enter the choice");
		System.out.println("1.Create the table");
		System.out.println("2.Insert the values  into table");
		System.out.println("3.Retreive the values from the table");
		Scanner scn = new Scanner(System.in);
		
		ch = scn.nextInt();
		if (ch == 1) {
			try {
				String sql_query = "" + "create table Population(" + "Year int," + "Male int,"
						+ "Female double," + "Car double,"+"PublicTransport double,"+"walked int,"
						+"Bicycle int)";
				Class.forName(driver);
				Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement st = con.createStatement();
				st.executeUpdate(sql_query);
				System.out.println("Table Created Successfully");
				con.close();
			} catch (SQLException se) {
				System.out.println(" Class is already created ");
			}
		}
		if (ch == 2) {
           try {
        	   String sql_query1="insert into population values(2012,290,310,0.717,0.028,0.123,0)";
        	   String sql_query2="insert into population values(2013,359,326,0.769,0.025,0.159,0)";
        	   String sql_query3="insert into population values(2014,347,307,0.775,0.026,0.136,0)";
        	   String sql_query4="insert into population values(2015,383,323,0.776,0.025,0.109,0)";
        	   String sql_query5="insert into population values(2016,354,326,0.806,0,0.1,0)";
        	   Class.forName(driver);
			   Connection con = DriverManager.getConnection(DB_URL, USER,PASS);
			   Statement st = con.createStatement();
				st.addBatch(sql_query1);
				st.addBatch(sql_query2);
				st.addBatch(sql_query3);
				st.addBatch(sql_query4);
				st.addBatch(sql_query5);
				int[] updateCount = st.executeBatch();
				System.out.println("The number of rows inserted :" + updateCount.length);

				con.close();

			} catch (SQLException se) {
				se.printStackTrace();

			} catch (ClassNotFoundException cfse) {
				cfse.printStackTrace();
			}
        	   
          }
		
		if (ch == 3) {
			try {
				Class.forName(driver);
				Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
				Statement st = con.createStatement();
				String sqlQuery = "select * from population";
				boolean flag = false;
				ResultSet rs = st.executeQuery(sqlQuery);
				System.out.println("YEAR\tMALE\tFEMALE\tCAR\tPUBLICTRANSPORT\tWALKED\tBICYCLE\t");
				System.out.println("------------------------------------------------------------------");
				while (rs.next()) {
					flag = true;
					System.out.println(rs.getInt(1) + "\t" + rs.getInt(2) + "\t" + rs.getInt(3) + "\t"
							+ rs.getDouble(4)+"\t"+rs.getDouble(5)+"\t"+rs.getDouble(6)+"\t"+rs.getInt(7));
				}
				if (flag == false) {
					System.out.println("No Records found");
				}
				con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		}while(ch!=0);
		
		
	
	for(int year =2012; year<=2022 ;year++) {
		for(int total_workers =100 ; total_workers <=1000;total_workers++) {
			System.out.println(year);
			System.out.println(total_workers);
		}
	}
		
		
		
		
	}

}