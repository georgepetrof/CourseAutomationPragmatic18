
public class Person {
	private String name;
	private String phoneNumber;
	private String viberAccount;
	//.....
	
	public Person(String name, String phoneNumber, String viberAccount) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.viberAccount = viberAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getViberAccount() {
		return viberAccount;
	}

	public void setViberAccount(String viberAccount) {
		this.viberAccount = viberAccount;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneNumber=" + phoneNumber + ", viberAccount=" + viberAccount + "]";
	}
	
	

}
