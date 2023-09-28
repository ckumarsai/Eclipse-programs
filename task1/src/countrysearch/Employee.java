package countrysearch;

public class Employee {
	String name;
	int id;
	String country;
	
	public  String getname() {
		return name;
		
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getcountry() {
		return country;
	}
	public  void setcountry(String country) {
		this.country=country;
	}
	public Employee(String name, int id, String country) {
		super();
		this.name = name;
		this.id = id;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", country=" + country + "]";
	}
}
 