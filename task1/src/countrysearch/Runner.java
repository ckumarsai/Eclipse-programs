package countrysearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Runner {
	static Comparator<Employee> nameComparator=Comparator.comparing(Employee::getname);
	static Comparator<Employee> countryComparator=Comparator.comparing(Employee::getcountry);

	public static void main(String[] args) {
		List<Employee> listEmployee=new ArrayList<Employee>();
		
		Employee obj1=new Employee("saikumar",1,"india");
		Employee obj2=new Employee("yash",2,"england");
		Employee obj3=new Employee("harsha",3,"africa");
		
		listEmployee.add(obj1);
		listEmployee.add(obj2);
		listEmployee.add(obj3);
		System.out.println(listEmployee);
		
		listEmployee.sort(countryComparator);
		System.out.println(listEmployee);
	}
}



