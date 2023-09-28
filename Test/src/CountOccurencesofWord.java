import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOccurencesofWord {
	public static void main(String[] args) {
		
		String str="sai jaikeerth hari sai aditya ken 2 jaikeerth yashwanth ziya jai harsha";
		
		List<String> students = Arrays.asList(str.split(" "));
		System.out.println("students are: "+students);
		
		HashMap<String, Integer> map=new HashMap<>();
		
		for(String word:students) {
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}
}





