package com.innominds;

public class ReportingDetails {
	int year;
	int Total_worked;
	int Male;
	int Female;
	public int getYear() {
		return year;
	}
	
	public ReportingDetails(int year, int total_worked, int male, int female) {
		super();
		this.year = year;
		Total_worked = total_worked;
		Male = male;
		Female = female;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTotal_worked() {
		return Total_worked;
	}
	public void setTotal_worked(int total_worked) {
		Total_worked = total_worked;
	}
	public int getMale() {
		return Male;
	}
	public void setMale(int male) {
		Male = male;
	}
	public int getFemale() {
		return Female;
	}
	public void setFemale(int female) {
		Female = female;
	}
	@Override
	public String toString() {
		return year + ","  + Total_worked + ", " + Male + ", "
				+ Female ;
	}

}
