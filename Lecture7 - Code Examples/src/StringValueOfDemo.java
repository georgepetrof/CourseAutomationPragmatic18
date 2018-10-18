
public class StringValueOfDemo {
	public static void main(String[] args) {
		String name = "Ivan Petrov";
		
		int length = name.length();
		System.out.println(length);
		
		String value = "235.34";
		
		System.out.println(value + 2);
		
		Double doubleValueOfTheString = Double.valueOf(value);
		double primitiveValueOfTheString = Double.parseDouble(value);

		System.out.println(doubleValueOfTheString + 2);
		
		
		char pFromPetrov = name.charAt(5);
		System.out.println(pFromPetrov);
		
		String vanSubString = name.substring(1, 4 );
		System.out.println(vanSubString);
		
		String otherName = "      Other Ivan Petrov                 ";
		System.out.println(otherName);
		String trimmedString = otherName.trim();
		System.out.println(trimmedString);
		
		
		System.out.println(trimmedString.toLowerCase());
		System.out.println(trimmedString.toUpperCase());

	}

}
