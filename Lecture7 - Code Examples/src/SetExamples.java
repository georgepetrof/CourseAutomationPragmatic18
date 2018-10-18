import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExamples {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		Set<String> otherNames = new LinkedHashSet<>();
		
		otherNames.add("Ivan");
		otherNames.add("Maria");
		otherNames.add("Joro");
		otherNames.add("Stefka");
		otherNames.add("Daniel");
		otherNames.add("Toi");
		
		
		names.add("Ivan");
		names.add("Maria");
		names.add("Joro");
		names.add("Stefka");
		names.add("Joro");
		names.add("Ivan");
		
		for (String currentName : names) {
			System.out.println(currentName);
		}
		
//		names.addAll(otherNames);
//		names.retainAll(otherNames);
//		names.removeAll(otherNames);
		
//		names.clear();
		
		Object[] array = names.toArray();
		
		for (Object object : array) {
			
		}
		
		System.out.println("The size of the collection is: " + names.size());
		
		System.out.println(names);
		
		
	}

}
