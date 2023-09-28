
public class Reports {
	int year;
	int Total_worked;
	int Male;
	int Female;
	double car;
	double public_Tronsport;
	double Walked;
	int Bicycle;
	int Taxicab_motorcycle_other_means; 
    double worked;
    double Worked_at_home;
    double Worked_in_state_of_residence;
    int Worked_outside_state_of_residence;
    int Workers_16_years_and_over_who_did_not_work_at_home;
    double _12am_to_4_59_am;
    double __5am_to_5_29_am;
    double _530am_to_5_59am; 
    double _6am_to_6_29am;
    double _630am_to_6_59_am;
    double _7am_to_7_29am;
    double _730am_to_7_59_am;
    double _8_am_to_8_29am;
    double _830am_to_8_59am;
    double _9am_to_11_59_pm;
    double Less_than_10_minutes;
    double _10_to_14_minutes;
    double _15_to_19_minutes;
    double _20_to_24_minutes;
    double _25_to_29_minutes;
    double _30_to_34_minutes;
    double _35_to_44_minutes;
    double _45_to_59_minutes;
    double _60_or_more_minutes;
    double  Mean_travel_time_to_work_minutes;
    double _No_vehicle_available;        
    double _1_vehicle_available;       
    double _2_vehicles_available;     
    double _3_or_more_vehicles_available;       
    double No_vehicle_available;    
    double _Vehicle_Available;         
    double _1_to_4_years;          
    double _5_to_17_years;            
    int _18_to_24_years;            
    int _25_to_34_years;            
    int _35_to_44_years;            
    int _45_to_54_years;            
    int _55_to_64_years;            
    int _65_to_74_years;            
    int _75_years_and_over;    
    int _Population_Migrated_to_37201;            
    int _Male;           
    int _Female;            
    int White;            
    int Black_or_African_American;            
    int American_Indian_and_Alaska_Native;            
    int Asian;            
    int Native_Hawaiian_and_Other_Pacific_Islander;           
    int Some_other_race_Less_than_high_school_graduate;        
    int High_school_graduate_includes_equivalency;       
    int Some_college_or_associates_degree;        
    int Bachelors_degree;        
    int Graduate_or_professional_degree;        
    int _$_1_to_$_9_999_or_loss;        
    int _$_10_000_to_$_14_999;        
    int _$_15_000_to_$_24_999;        
    int _$_25_000_to_$34_999;        
    int _$_35_000_to_$_49_999;        
    int _$_50_000_to_$_64_999;        
    int _$_65_000_to_$_74_999;        
    int _$_75_000_or_more;        
    int _Householder_lived_in_owner_occupied_housing_units;        
    int _Householder_lived_in_renter_occupied_housing_units;        
    int _Native;        
    int _Foreign_born;    
    int _recommended_zip_good_recommendation;
    
	public Reports(int year, int total_worked, int male, int female, double car) {
		super();
		this.year = year;
		Total_worked = total_worked;
		Male = male;
		Female = female;
		this.car = car;
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
	public double getCar() {
		return car;
	}
	public void setCar(double car) {
		this.car = car;
	}
	public double getPublic_Tronsport() {
		return public_Tronsport;
	}
	public void setPublic_Tronsport(double public_Tronsport) {
		this.public_Tronsport = public_Tronsport;
	}
	public double getWalked() {
		return Walked;
	}
	public void setWalked(double walked) {
		Walked = walked;
	}
	public int getBicycle() {
		return Bicycle;
	}
	public void setBicycle(int bicycle) {
		Bicycle = bicycle;
	}
	public int getTaxicab_motorcycle_other_means() {
		return Taxicab_motorcycle_other_means;
	}
	public void setTaxicab_motorcycle_other_means(int taxicab_motorcycle_other_means) {
		Taxicab_motorcycle_other_means = taxicab_motorcycle_other_means;
	}
	public double getWorked() {
		return worked;
	}
	public void setWorked(double worked) {
		this.worked = worked;
	}
	public double getWorked_at_home() {
		return Worked_at_home;
	}
	public void setWorked_at_home(double worked_at_home) {
		Worked_at_home = worked_at_home;
	}
	public double getWorked_in_state_of_residence() {
		return Worked_in_state_of_residence;
	}
	public void setWorked_in_state_of_residence(double worked_in_state_of_residence) {
		Worked_in_state_of_residence = worked_in_state_of_residence;
	}
	public int getWorked_outside_state_of_residence() {
		return Worked_outside_state_of_residence;
	}
	public void setWorked_outside_state_of_residence(int worked_outside_state_of_residence) {
		Worked_outside_state_of_residence = worked_outside_state_of_residence;
	}
	public int getWorkers_16_years_and_over_who_did_not_work_at_home() {
		return Workers_16_years_and_over_who_did_not_work_at_home;
	}
	public void setWorkers_16_years_and_over_who_did_not_work_at_home(
			int workers_16_years_and_over_who_did_not_work_at_home) {
		Workers_16_years_and_over_who_did_not_work_at_home = workers_16_years_and_over_who_did_not_work_at_home;
	}
	public double get_12am_to_4_59_am() {
		return _12am_to_4_59_am;
	}
	public void set_12am_to_4_59_am(double _12am_to_4_59_am) {
		this._12am_to_4_59_am = _12am_to_4_59_am;
	}
	public double get__5am_to_5_29_am() {
		return __5am_to_5_29_am;
	}
	public void set__5am_to_5_29_am(double __5am_to_5_29_am) {
		this.__5am_to_5_29_am = __5am_to_5_29_am;
	}
	public double get_530am_to_5_59am() {
		return _530am_to_5_59am;
	}
	public void set_530am_to_5_59am(double _530am_to_5_59am) {
		this._530am_to_5_59am = _530am_to_5_59am;
	}
	public double get_6am_to_6_29am() {
		return _6am_to_6_29am;
	}
	public void set_6am_to_6_29am(double _6am_to_6_29am) {
		this._6am_to_6_29am = _6am_to_6_29am;
	}
	public double get_630am_to_6_59_am() {
		return _630am_to_6_59_am;
	}
	public void set_630am_to_6_59_am(double _630am_to_6_59_am) {
		this._630am_to_6_59_am = _630am_to_6_59_am;
	}
	public double get_7am_to_7_29am() {
		return _7am_to_7_29am;
	}
	public void set_7am_to_7_29am(double _7am_to_7_29am) {
		this._7am_to_7_29am = _7am_to_7_29am;
	}
	public double get_730am_to_7_59_am() {
		return _730am_to_7_59_am;
	}
	public void set_730am_to_7_59_am(double _730am_to_7_59_am) {
		this._730am_to_7_59_am = _730am_to_7_59_am;
	}
	public double get_8_am_to_8_29am() {
		return _8_am_to_8_29am;
	}
	public void set_8_am_to_8_29am(double _8_am_to_8_29am) {
		this._8_am_to_8_29am = _8_am_to_8_29am;
	}
	public double get_830am_to_8_59am() {
		return _830am_to_8_59am;
	}
	public void set_830am_to_8_59am(double _830am_to_8_59am) {
		this._830am_to_8_59am = _830am_to_8_59am;
	}
	public double get_9am_to_11_59_pm() {
		return _9am_to_11_59_pm;
	}
	public void set_9am_to_11_59_pm(double _9am_to_11_59_pm) {
		this._9am_to_11_59_pm = _9am_to_11_59_pm;
	}
	public double getLess_than_10_minutes() {
		return Less_than_10_minutes;
	}
	public void setLess_than_10_minutes(double less_than_10_minutes) {
		Less_than_10_minutes = less_than_10_minutes;
	}
	public double get_10_to_14_minutes() {
		return _10_to_14_minutes;
	}
	public void set_10_to_14_minutes(double _10_to_14_minutes) {
		this._10_to_14_minutes = _10_to_14_minutes;
	}
	public double get_15_to_19_minutes() {
		return _15_to_19_minutes;
	}
	public void set_15_to_19_minutes(double _15_to_19_minutes) {
		this._15_to_19_minutes = _15_to_19_minutes;
	}
	public double get_20_to_24_minutes() {
		return _20_to_24_minutes;
	}
	public void set_20_to_24_minutes(double _20_to_24_minutes) {
		this._20_to_24_minutes = _20_to_24_minutes;
	}
	public double get_25_to_29_minutes() {
		return _25_to_29_minutes;
	}
	public void set_25_to_29_minutes(double _25_to_29_minutes) {
		this._25_to_29_minutes = _25_to_29_minutes;
	}
	public double get_30_to_34_minutes() {
		return _30_to_34_minutes;
	}
	public void set_30_to_34_minutes(double _30_to_34_minutes) {
		this._30_to_34_minutes = _30_to_34_minutes;
	}
	public double get_35_to_44_minutes() {
		return _35_to_44_minutes;
	}
	public void set_35_to_44_minutes(double _35_to_44_minutes) {
		this._35_to_44_minutes = _35_to_44_minutes;
	}
	public double get_45_to_59_minutes() {
		return _45_to_59_minutes;
	}
	public void set_45_to_59_minutes(double _45_to_59_minutes) {
		this._45_to_59_minutes = _45_to_59_minutes;
	}
	public double get_60_or_more_minutes() {
		return _60_or_more_minutes;
	}
	public void set_60_or_more_minutes(double _60_or_more_minutes) {
		this._60_or_more_minutes = _60_or_more_minutes;
	}
	public double getMean_travel_time_to_work_minutes() {
		return Mean_travel_time_to_work_minutes;
	}
	public void setMean_travel_time_to_work_minutes(double mean_travel_time_to_work_minutes) {
		Mean_travel_time_to_work_minutes = mean_travel_time_to_work_minutes;
	}
	public double get_No_vehicle_available() {
		return _No_vehicle_available;
	}
	public void set_No_vehicle_available(double _No_vehicle_available) {
		this._No_vehicle_available = _No_vehicle_available;
	}
	public double get_1_vehicle_available() {
		return _1_vehicle_available;
	}
	public void set_1_vehicle_available(double _1_vehicle_available) {
		this._1_vehicle_available = _1_vehicle_available;
	}
	public double get_2_vehicles_available() {
		return _2_vehicles_available;
	}
	public void set_2_vehicles_available(double _2_vehicles_available) {
		this._2_vehicles_available = _2_vehicles_available;
	}
	public double get_3_or_more_vehicles_available() {
		return _3_or_more_vehicles_available;
	}
	public void set_3_or_more_vehicles_available(double _3_or_more_vehicles_available) {
		this._3_or_more_vehicles_available = _3_or_more_vehicles_available;
	}
	public double getNo_vehicle_available() {
		return No_vehicle_available;
	}
	public void setNo_vehicle_available(double no_vehicle_available) {
		No_vehicle_available = no_vehicle_available;
	}
	public double get_Vehicle_Available() {
		return _Vehicle_Available;
	}
	public void set_Vehicle_Available(double _Vehicle_Available) {
		this._Vehicle_Available = _Vehicle_Available;
	}
	public double get_1_to_4_years() {
		return _1_to_4_years;
	}
	public void set_1_to_4_years(double _1_to_4_years) {
		this._1_to_4_years = _1_to_4_years;
	}
	public double get_5_to_17_years() {
		return _5_to_17_years;
	}
	public void set_5_to_17_years(double _5_to_17_years) {
		this._5_to_17_years = _5_to_17_years;
	}
	public int get_18_to_24_years() {
		return _18_to_24_years;
	}
	public void set_18_to_24_years(int _18_to_24_years) {
		this._18_to_24_years = _18_to_24_years;
	}
	public int get_25_to_34_years() {
		return _25_to_34_years;
	}
	public void set_25_to_34_years(int _25_to_34_years) {
		this._25_to_34_years = _25_to_34_years;
	}
	public int get_35_to_44_years() {
		return _35_to_44_years;
	}
	public void set_35_to_44_years(int _35_to_44_years) {
		this._35_to_44_years = _35_to_44_years;
	}
	public int get_45_to_54_years() {
		return _45_to_54_years;
	}
	public void set_45_to_54_years(int _45_to_54_years) {
		this._45_to_54_years = _45_to_54_years;
	}
	public int get_55_to_64_years() {
		return _55_to_64_years;
	}
	public void set_55_to_64_years(int _55_to_64_years) {
		this._55_to_64_years = _55_to_64_years;
	}
	public int get_65_to_74_years() {
		return _65_to_74_years;
	}
	public void set_65_to_74_years(int _65_to_74_years) {
		this._65_to_74_years = _65_to_74_years;
	}
	public int get_75_years_and_over() {
		return _75_years_and_over;
	}
	public void set_75_years_and_over(int _75_years_and_over) {
		this._75_years_and_over = _75_years_and_over;
	}
	public int get_Population_Migrated_to_37201() {
		return _Population_Migrated_to_37201;
	}
	public void set_Population_Migrated_to_37201(int _Population_Migrated_to_37201) {
		this._Population_Migrated_to_37201 = _Population_Migrated_to_37201;
	}
	public int get_Male() {
		return _Male;
	}
	public void set_Male(int _Male) {
		this._Male = _Male;
	}
	public int get_Female() {
		return _Female;
	}
	public void set_Female(int _Female) {
		this._Female = _Female;
	}
	public int getWhite() {
		return White;
	}
	public void setWhite(int white) {
		White = white;
	}
	public int getBlack_or_African_American() {
		return Black_or_African_American;
	}
	public void setBlack_or_African_American(int black_or_African_American) {
		Black_or_African_American = black_or_African_American;
	}
	public int getAmerican_Indian_and_Alaska_Native() {
		return American_Indian_and_Alaska_Native;
	}
	public void setAmerican_Indian_and_Alaska_Native(int american_Indian_and_Alaska_Native) {
		American_Indian_and_Alaska_Native = american_Indian_and_Alaska_Native;
	}
	public int getAsian() {
		return Asian;
	}
	public void setAsian(int asian) {
		Asian = asian;
	}
	public int getNative_Hawaiian_and_Other_Pacific_Islander() {
		return Native_Hawaiian_and_Other_Pacific_Islander;
	}
	public void setNative_Hawaiian_and_Other_Pacific_Islander(int native_Hawaiian_and_Other_Pacific_Islander) {
		Native_Hawaiian_and_Other_Pacific_Islander = native_Hawaiian_and_Other_Pacific_Islander;
	}
	public int getSome_other_race_Less_than_high_school_graduate() {
		return Some_other_race_Less_than_high_school_graduate;
	}
	public void setSome_other_race_Less_than_high_school_graduate(int some_other_race_Less_than_high_school_graduate) {
		Some_other_race_Less_than_high_school_graduate = some_other_race_Less_than_high_school_graduate;
	}
	public int getHigh_school_graduate_includes_equivalency() {
		return High_school_graduate_includes_equivalency;
	}
	public void setHigh_school_graduate_includes_equivalency(int high_school_graduate_includes_equivalency) {
		High_school_graduate_includes_equivalency = high_school_graduate_includes_equivalency;
	}
	public int getSome_college_or_associates_degree() {
		return Some_college_or_associates_degree;
	}
	public void setSome_college_or_associates_degree(int some_college_or_associates_degree) {
		Some_college_or_associates_degree = some_college_or_associates_degree;
	}
	public int getBachelors_degree() {
		return Bachelors_degree;
	}
	public void setBachelors_degree(int bachelors_degree) {
		Bachelors_degree = bachelors_degree;
	}
	public int getGraduate_or_professional_degree() {
		return Graduate_or_professional_degree;
	}
	public void setGraduate_or_professional_degree(int graduate_or_professional_degree) {
		Graduate_or_professional_degree = graduate_or_professional_degree;
	}
	public int get_$_1_to_$_9_999_or_loss() {
		return _$_1_to_$_9_999_or_loss;
	}
	public void set_$_1_to_$_9_999_or_loss(int _$_1_to_$_9_999_or_loss) {
		this._$_1_to_$_9_999_or_loss = _$_1_to_$_9_999_or_loss;
	}
	public int get_$_10_000_to_$_14_999() {
		return _$_10_000_to_$_14_999;
	}
	public void set_$_10_000_to_$_14_999(int _$_10_000_to_$_14_999) {
		this._$_10_000_to_$_14_999 = _$_10_000_to_$_14_999;
	}
	public int get_$_15_000_to_$_24_999() {
		return _$_15_000_to_$_24_999;
	}
	public void set_$_15_000_to_$_24_999(int _$_15_000_to_$_24_999) {
		this._$_15_000_to_$_24_999 = _$_15_000_to_$_24_999;
	}
	public int get_$_25_000_to_$34_999() {
		return _$_25_000_to_$34_999;
	}
	public void set_$_25_000_to_$34_999(int _$_25_000_to_$34_999) {
		this._$_25_000_to_$34_999 = _$_25_000_to_$34_999;
	}
	public int get_$_35_000_to_$_49_999() {
		return _$_35_000_to_$_49_999;
	}
	public void set_$_35_000_to_$_49_999(int _$_35_000_to_$_49_999) {
		this._$_35_000_to_$_49_999 = _$_35_000_to_$_49_999;
	}
	public int get_$_50_000_to_$_64_999() {
		return _$_50_000_to_$_64_999;
	}
	public void set_$_50_000_to_$_64_999(int _$_50_000_to_$_64_999) {
		this._$_50_000_to_$_64_999 = _$_50_000_to_$_64_999;
	}
	public int get_$_65_000_to_$_74_999() {
		return _$_65_000_to_$_74_999;
	}
	public void set_$_65_000_to_$_74_999(int _$_65_000_to_$_74_999) {
		this._$_65_000_to_$_74_999 = _$_65_000_to_$_74_999;
	}
	public int get_$_75_000_or_more() {
		return _$_75_000_or_more;
	}
	public void set_$_75_000_or_more(int _$_75_000_or_more) {
		this._$_75_000_or_more = _$_75_000_or_more;
	}
	public int get_Householder_lived_in_owner_occupied_housing_units() {
		return _Householder_lived_in_owner_occupied_housing_units;
	}
	public void set_Householder_lived_in_owner_occupied_housing_units(
			int _Householder_lived_in_owner_occupied_housing_units) {
		this._Householder_lived_in_owner_occupied_housing_units = _Householder_lived_in_owner_occupied_housing_units;
	}
	public int get_Householder_lived_in_renter_occupied_housing_units() {
		return _Householder_lived_in_renter_occupied_housing_units;
	}
	public void set_Householder_lived_in_renter_occupied_housing_units(
			int _Householder_lived_in_renter_occupied_housing_units) {
		this._Householder_lived_in_renter_occupied_housing_units = _Householder_lived_in_renter_occupied_housing_units;
	}
	public int get_Native() {
		return _Native;
	}
	public void set_Native(int _Native) {
		this._Native = _Native;
	}
	public int get_Foreign_born() {
		return _Foreign_born;
	}
	public void set_Foreign_born(int _Foreign_born) {
		this._Foreign_born = _Foreign_born;
	}
	public int get_recommended_zip_good_recommendation() {
		return _recommended_zip_good_recommendation;
	}
	public void set_recommended_zip_good_recommendation(int _recommended_zip_good_recommendation) {
		this._recommended_zip_good_recommendation = _recommended_zip_good_recommendation;
	}
	@Override
	public String toString() {
		return "Reports [year=" + year + ", Total_worked=" + Total_worked + ", Male=" + Male + ", Female=" + Female
				+ ", car=" + car + ", public_Tronsport=" + public_Tronsport + ", Walked=" + Walked + ", Bicycle="
				+ Bicycle + ", Taxicab_motorcycle_other_means=" + Taxicab_motorcycle_other_means + ", worked=" + worked
				+ ", Worked_at_home=" + Worked_at_home + ", Worked_in_state_of_residence="
				+ Worked_in_state_of_residence + ", Worked_outside_state_of_residence="
				+ Worked_outside_state_of_residence + ", Workers_16_years_and_over_who_did_not_work_at_home="
				+ Workers_16_years_and_over_who_did_not_work_at_home + ", _12am_to_4_59_am=" + _12am_to_4_59_am
				+ ", __5am_to_5_29_am=" + __5am_to_5_29_am + ", _530am_to_5_59am=" + _530am_to_5_59am
				+ ", _6am_to_6_29am=" + _6am_to_6_29am + ", _630am_to_6_59_am=" + _630am_to_6_59_am
				+ ", _7am_to_7_29am=" + _7am_to_7_29am + ", _730am_to_7_59_am=" + _730am_to_7_59_am
				+ ", _8_am_to_8_29am=" + _8_am_to_8_29am + ", _830am_to_8_59am=" + _830am_to_8_59am
				+ ", _9am_to_11_59_pm=" + _9am_to_11_59_pm + ", Less_than_10_minutes=" + Less_than_10_minutes
				+ ", _10_to_14_minutes=" + _10_to_14_minutes + ", _15_to_19_minutes=" + _15_to_19_minutes
				+ ", _20_to_24_minutes=" + _20_to_24_minutes + ", _25_to_29_minutes=" + _25_to_29_minutes
				+ ", _30_to_34_minutes=" + _30_to_34_minutes + ", _35_to_44_minutes=" + _35_to_44_minutes
				+ ", _45_to_59_minutes=" + _45_to_59_minutes + ", _60_or_more_minutes=" + _60_or_more_minutes
				+ ", Mean_travel_time_to_work_minutes=" + Mean_travel_time_to_work_minutes + ", _No_vehicle_available="
				+ _No_vehicle_available + ", _1_vehicle_available=" + _1_vehicle_available + ", _2_vehicles_available="
				+ _2_vehicles_available + ", _3_or_more_vehicles_available=" + _3_or_more_vehicles_available
				+ ", No_vehicle_available=" + No_vehicle_available + ", _Vehicle_Available=" + _Vehicle_Available
				+ ", _1_to_4_years=" + _1_to_4_years + ", _5_to_17_years=" + _5_to_17_years + ", _18_to_24_years="
				+ _18_to_24_years + ", _25_to_34_years=" + _25_to_34_years + ", _35_to_44_years=" + _35_to_44_years
				+ ", _45_to_54_years=" + _45_to_54_years + ", _55_to_64_years=" + _55_to_64_years + ", _65_to_74_years="
				+ _65_to_74_years + ", _75_years_and_over=" + _75_years_and_over + ", _Population_Migrated_to_37201="
				+ _Population_Migrated_to_37201 + ", _Male=" + _Male + ", _Female=" + _Female + ", White=" + White
				+ ", Black_or_African_American=" + Black_or_African_American + ", American_Indian_and_Alaska_Native="
				+ American_Indian_and_Alaska_Native + ", Asian=" + Asian
				+ ", Native_Hawaiian_and_Other_Pacific_Islander=" + Native_Hawaiian_and_Other_Pacific_Islander
				+ ", Some_other_race_Less_than_high_school_graduate=" + Some_other_race_Less_than_high_school_graduate
				+ ", High_school_graduate_includes_equivalency=" + High_school_graduate_includes_equivalency
				+ ", Some_college_or_associates_degree=" + Some_college_or_associates_degree + ", Bachelors_degree="
				+ Bachelors_degree + ", Graduate_or_professional_degree=" + Graduate_or_professional_degree
				+ ", _$_1_to_$_9_999_or_loss=" + _$_1_to_$_9_999_or_loss + ", _$_10_000_to_$_14_999="
				+ _$_10_000_to_$_14_999 + ", _$_15_000_to_$_24_999=" + _$_15_000_to_$_24_999 + ", _$_25_000_to_$34_999="
				+ _$_25_000_to_$34_999 + ", _$_35_000_to_$_49_999=" + _$_35_000_to_$_49_999 + ", _$_50_000_to_$_64_999="
				+ _$_50_000_to_$_64_999 + ", _$_65_000_to_$_74_999=" + _$_65_000_to_$_74_999 + ", _$_75_000_or_more="
				+ _$_75_000_or_more + ", _Householder_lived_in_owner_occupied_housing_units="
				+ _Householder_lived_in_owner_occupied_housing_units
				+ ", _Householder_lived_in_renter_occupied_housing_units="
				+ _Householder_lived_in_renter_occupied_housing_units + ", _Native=" + _Native + ", _Foreign_born="
				+ _Foreign_born + ", _recommended_zip_good_recommendation=" + _recommended_zip_good_recommendation
				+ "]";
	}
    
}
