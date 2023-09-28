import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Feilds {

	 static  int Taxicab_motorcycle_other_means = 0;
	 static int Bicycles = 0;
	 static double workeds;

	public static void main(String[] args) throws IOException {
		List<Integer>total_workers=Arrays.asList(685,654,706,680,609,525,576,685);
		List<Double>Car_truck_van=Arrays.asList(0.797,0.769,0.775,0.776,0.806,0.768,0.737,0.68);
		List<Double>Walked=Arrays.asList(0.123,0.159,0.136,0.109,0.1,0.144,0.124,0.116,0.219);
		
		List<Double>Worked_at_home=Arrays.asList(0.123,0.159,0.136,0.109,0.1,0.144,0.124,0.116,0.219);
		List<Double>public_Tronsport=Arrays.asList(0.028,0.025,0.026,0.025,0.0,0.0,0.0,0.0);
		List<Double>Worked_in_state_of_residence=Arrays.asList(0.942,0.936,0.946,0.965,0.974,1.0,1.0,0.913,0.931);


		List<Reports> myList = new ArrayList<>();
		for(int years=2012;years<=2020;years++) {
			Random rd =new Random();
			int total_worker= total_workers.get(rd.nextInt(total_workers.size()));
//			 double Walkeds= Walked.get((int)rd.nextDouble(Walked.size()));
			 //double Worked_at_homes= Worked_at_home.get((int)rd.nextDouble(Walked.size()));
			 //double Worked_in_state_of_residences= Worked_in_state_of_residence.get((int)rd.nextDouble(Walked.size()));
			 
			 
			for (int male =0; male <=1; male++) {
				for(int female=0 ; female<=1; female++) {
					//for(int Workers_16_years_and_over_who_did_not_work_at_homes=500;Workers_16_years_and_over_who_did_not_work_at_homes<=1000;Workers_16_years_and_over_who_did_not_work_at_homes++) {
					double car_truck_van = Car_truck_van.get((int) rd.nextDouble(Car_truck_van.size()));
					 double Walkeds= Walked.get((int)rd.nextDouble(Walked.size()));
					 double Worked_at_homes= Worked_at_home.get((int)rd.nextDouble(Walked.size()));
					 double public_Tronsports=public_Tronsport.get((int) rd.nextDouble(public_Tronsport.size()));
					 double Worked_in_state_of_residences=Worked_in_state_of_residence.get((int) rd.nextDouble(Worked_in_state_of_residence.size()));
					 

					  
					
						Reports r = new Reports(years,total_worker,male,female,car_truck_van,public_Tronsports,Walkeds,Bicycles,Taxicab_motorcycle_other_means,workeds,Worked_at_homes,Worked_in_state_of_residences);
						//r.setWalked(rd.nextDouble());
						r.setBicycle(0);
    					//r.setPublic_Tronsport(rd.nextDouble());
						myList.add(r);
						
					
				}
			}
		}
		
		
//		List<Reports> myList1 = new ArrayList<>();
//		for(double Worked_in_state_of_residences=0.0;Worked_in_state_of_residences<0;Worked_in_state_of_residences++) {
//			Random rd =new Random();
//			 Reports r1=new Reports(Worked_in_state_of_residences);
//			 myList.add(r1); 
//		}
		
		
		 File file = new File("sai.csv");
	        FileWriter fw = new FileWriter(file);
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.newLine();
	        bw.write("years,total_worker,male,female,car_truck_van,public_Tronsports,Walkeds,Bicycles,Taxicab_motorcycle_other_means,workeds,Worked_at_homes,Worked_in_state_of_residences");
//	        bw.write("year,total_worked,public_Tronsport");
	        
	        bw.newLine();
	        for(int i=0;i<myList.size();i++)
	        {
	            bw.write(myList.get(i)+",");
//	            bw.write(myList.get(i));
	        	Reports r = myList.get(i);
//	            System.out.println(myList.get(i)+",");
//	            bw.write(r.getBicycle()+",");
//	            bw.write(r.getTaxicab_motorcycle_other_means()+",");
//	            bw.write(r.getPublic_Tronsport()+"");
	            bw.newLine();
	        }
	        bw.write("\nApplication");
	       
	       
	        bw.newLine();
	        bw.close();
	        fw.close();
		System.out.println(myList);
	}

}
