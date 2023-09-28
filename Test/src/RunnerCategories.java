import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



public class RunnerCategories {
	static Comparator<Categories> viewComparator = Comparator.comparing(Categories::getViews);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit value");
		int limitvalue = sc.nextInt();
		List<Categories> list = new ArrayList<Categories>();
		
		Categories obj1 = new Categories("Categorie","PC",153,"All",5000);
		Categories obj2 = new Categories("Stimulus","S11",1510,"All",4000);
		Categories obj3 = new Categories("Stimulus","S202",3175,"All",4500);
		Categories obj4 = new Categories("Stimulus","EMG_Onset",3978,"EMGL",2555);
		Categories obj5 = new Categories("Stimulus","response",4226,"All",45);
		Categories obj6 = new Categories("Categorie","CC",5785,"All",9045);
		Categories obj7 = new Categories("Stimulus","S11",7141,"All",1452);
		Categories obj8 = new Categories("Stimulus","S202",8807,"All",4524);
		Categories obj9 = new Categories("Stimulus","EMG_Onset",9549,"EMGL",3584);
		Categories obj10 = new Categories("Stimulus","EMG_Onset",9965,"EMGL",4521);
		Categories obj11 = new Categories("Stimulus","response",10249,"All",15365);
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		list.add(obj7);
		list.add(obj8);
		list.add(obj9);
		list.add(obj10);
		list.add(obj11);
		
		list.stream()
		   .sorted(viewComparator.reversed())
		   .limit(limitvalue)
		   .collect(Collectors.toList()).forEach(System.out::println);;
	}
}

