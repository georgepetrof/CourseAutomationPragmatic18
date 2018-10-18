import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExamples {
	public static void main(String[] args) {
		Map<String, Person> phoneBook = new HashMap<>();
		
		phoneBook.put("Ivan Ivanov", new Person("Vankata Ivanov","24232434", "vanipicha91"));
		phoneBook.put("Maria Ivanov", new Person("Maria Ivanov","3333333", "mimi"));
		phoneBook.put("Joro Ivanov", new Person("Joro Ivanov","111111", "jorkata"));
		phoneBook.put("Stefka Ivanov", new Person("Stefka Ivanov","7777777", "stefka"));

		Set<String> allNames = phoneBook.keySet();
		
		for (String curName : allNames) {
			System.out.println(curName);
		}
		
		
		Collection<Person> allPeople = phoneBook.values();
		
		for (Person curPerson : allPeople) {
			System.out.println(curPerson.getName() + " " + curPerson.getViberAccount());
		}
		
		System.out.println("-----------------------------------");
		Set<Entry<String, Person>> allEntries = phoneBook.entrySet();
		
		for (Entry<String, Person> curEntry : allEntries) {
			System.out.println("The key is: " + curEntry.getKey() + " and the value is: " + curEntry.getValue());
		}
		
	}
}
