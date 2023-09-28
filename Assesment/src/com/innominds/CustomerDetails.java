package com.innominds;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CustomerDetails {

	public static void main(String[] args) throws IOException {
		List<Integer>total_workers=Arrays.asList(685,654,706,680,609,525,576,685);
		List<Double>Car_truck_van=Arrays.asList(0.797,0.769,0.775,0.776,0.806,0.768,0.737,0.68);
		
		List<ReportingDetails> myList = new ArrayList<>();
		for(int years=2012;years<=2020;years++) {
			Random rd =new Random();
			int total_worker= total_workers.get(rd.nextInt(total_workers.size()));
			for (int male =0; male <=1; male++) {
				for(int female=0 ; female<=1; female++) {
					Double car_truck_van = Car_truck_van.get((int) rd.nextDouble(Car_truck_van.size()));
					
					ReportingDetails r = new ReportingDetails(years,total_worker,male,female);
					//Reports r = new Reports();
						myList.add(r);
						
					
				}
			}
		}
		 File file = new File("sk.csv");
		 FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);

	        bw.write("year,Totalworked ,Male ,Female");
	        
	        bw.newLine();
	        for(int i=0;i<myList.size();i++)
	        {
	            bw.write(myList.get(i)+",");
	            bw.newLine();
	        }
//	        bw.write("\nApplication");
	        bw.write("");
	       
	       
	        bw.newLine();
	        bw.close();
	        fw.close();
		System.out.println(myList);
		System.out.println(" ");

	}

}
