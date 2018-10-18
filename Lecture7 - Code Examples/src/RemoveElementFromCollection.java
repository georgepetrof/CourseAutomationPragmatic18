import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElementFromCollection {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Ivan");
		names.add("Maria");
		names.add("Joro");
		names.add("Stefka");
		names.add("Joro");
		names.add("Ivan");
		System.out.println(names);
//		names.remove("Joro");
//		System.out.println(names);
		
		//this wont work, you need to use iterator
//		for (String curName : names) {
//			if(curName.equals("Stefka")) {
//				names.remove(curName);
//			}
//		}
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String curName = iter.next();
			System.out.println("The current string is: " + curName);
			if(curName.equals("Joro")) {
				iter.remove();
			}
		}
		
		System.out.println(names);
		
	}

}
