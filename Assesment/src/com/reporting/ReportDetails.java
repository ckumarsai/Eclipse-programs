package com.reporting;

//public class ReportDetails {
//
//}
public class ReportDetails {
	int year;
	int Total_worked;
	int Male;
	int Female;
	
	public ReportDetails(int year, int total_worked, int male, int female) {
		super();
		this.year = year;
		Total_worked = total_worked;
		Male = male;
		Female = female;
	}

	public int getYear() {
		return year;
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
		return "Fields [year=" + year + ", Total_worked=" + Total_worked + ", Male=" + Male + ", Female=" + Female
				+ "]";
	}
}
