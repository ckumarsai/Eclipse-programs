package com.reporting;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustDetails {
	
	private static final String DELIMITER = ",";
	  private static final String SEPARATOR = "\n";
	    
	private static final String HEADER = "year,total_worked,male,female";
	public static void main(String[] args) {
		ReportDetails f = new ReportDetails(2012,600,290,310);
		ReportDetails f1 = new ReportDetails(2013,685,359,326);
		ReportDetails f2 = new ReportDetails(2014,654,347,307);
		ReportDetails f3 = new ReportDetails(2015,706,383,323);
		ReportDetails f4 = new ReportDetails(2016,680,354,326);
		ReportDetails f5 = new ReportDetails(2017,609,316,293);
		
		 List FieldList = new ArrayList();
		 
		 FieldList.add(f);
		 FieldList.add(f1);
		 FieldList.add(f2);
		 FieldList.add(f3);
		 FieldList.add(f4);
		 FieldList.add(f5);
		 
		 FileWriter file = null;
	      
	      try
	      {
	        file = new FileWriter("ReportDetails.csv");
	        //Add header
	        file.append(HEADER);
			//Add a new line after the header
	       file.append(SEPARATOR);
	        //Iterate through bookList
	        Iterator it = FieldList.iterator();
	        while(it.hasNext())
	        {
	        	ReportDetails b = (ReportDetails)it.next();
	         // file.append(b.getMale());
	         //
	          //file.append(b.getAuthor());
	         
	          file.append(String.valueOf(b.getYear()));
	          file.append(DELIMITER);
	          file.append(String.valueOf(b.getTotal_worked()));
	          file.append(DELIMITER);
	          file.append(String.valueOf(b.getMale()));
	          file.append(DELIMITER);
	          file.append(String.valueOf(b.getFemale()));
	          file.append(SEPARATOR);
	        }
	      
	        file.close();
	      }
	      catch(Exception e)
	      {
	        e.printStackTrace();
	      }
	    }
		 
		
	}