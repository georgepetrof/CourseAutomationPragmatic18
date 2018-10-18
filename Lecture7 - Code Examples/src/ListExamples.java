import java.util.ArrayList;
import java.util.List;

public class ListExamples {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Ivan");
		names.add("Maria");
		names.add("Joro");
		names.add("Stefka");
		names.add("Joro");
		names.add("Ivan");
		
		for(String currentName : names ) {
			System.out.println(currentName);
		}
		
		int indexOfFirstJoro = names.indexOf("Joro");
		String theFirstJoro = names.get(indexOfFirstJoro);
		
		System.out.println("-------------------");
		String returnedName = names.get(4);
		
		System.out.println(returnedName);
	}
}
