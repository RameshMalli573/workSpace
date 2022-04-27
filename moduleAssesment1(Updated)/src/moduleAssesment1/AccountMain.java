package moduleAssesment1;

public class AccountMain {
	public static void main(String[] args) {
		String name = "Ram";
		String createdDate = "04/04/22";
		String city = "torento";
		String state = "ontaria";
		String zipCode = "78654";
		String phoneNumber = "9876643210";
		String houseNumber = "653";
		String street = "Park Lane";
		String type = "Current";
		String status = "Active";

		Account account = new Account(name, createdDate, city, state, zipCode, phoneNumber, houseNumber, street, type, status);
		System.out.println(account.getDetails());
		
	}
}
