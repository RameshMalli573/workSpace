package moduleAssesment1;

import java.time.LocalDate;

public class Account extends Utility {
	private static int accountCounter = 10001;

	private enum Type {
		SAVINGS, DEMAT, CURRENT;
	}

	private enum Status {
		ACTIVE, INACTIVE, CLOSED;
	}

	private String name;
	private int balanceAmount;
	private String createdDate;
	private int accountNumber;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String houseNumber;
	private String street;
	private Type type;
	private Status status;

	public Account(String name, String createdDate, String city, String state, String zipCode, String phoneNumber,
			String houseNumber, String street, String type, String status) {

		this.name = name;
		this.balanceAmount = 0;
		this.accountNumber = generateNewAccountNumber();
		this.createdDate = getTodaysDate();
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.houseNumber = houseNumber;
		this.street = street;
		this.type = Type.valueOf(type.toUpperCase());
		this.status = Status.valueOf(status.toUpperCase());
	}
	private String getTodaysDate() {
	      LocalDate date = LocalDate.now();
	      String str = date.toString();
	      return str;
	}
	public boolean deposit(int amount) {
		Utility.validateDepositAmount(amount);

		this.balanceAmount += amount;
		return true;
	}

	private int generateNewAccountNumber() {
		return accountCounter++;
	}

	public int withdraw(int amount) {
		Utility.validateWithdrawAmount(balanceAmount, amount);
		balanceAmount -= amount;
		return amount;
	}

	public String getDetails() {
		String data = "Name : " + name + "\n" + "Account Number : " + accountNumber + "\n" + "Created_date : " + createdDate + "\n" + "Account Type : " + type
				+ "\n" + "Mobile Number :" + phoneNumber + "\n" + "House Number : " + houseNumber + "\n" + "Street : "
				+ street + "\n" + "City : " + city + "\n" + "State : " + state + "\n" + "Zip Code : " + zipCode + "\n";

		return data;
	}
	public String getStatus() {
		return status.name();
		
	}
	public String getType() {
		return type.name();
	}
	public int getBalance() {
		return balanceAmount;
	}
}

//1.	XYZ Bank wants to create a system to manage accounts.
//2.	Accounts can be SAVINGS, DEMAT or CURRENT type.
//3.	All accounts must have following information:
//a.	Owner name
//b.	Address: City, state, pin, phone number, house number, street
//c.	Balance amount
//d.	Created_date
//e.	Status: ACTIVE or INACTIVE or CLOSED
//4.	Users will be able to deposit and withdraw money from their accounts. The withdrawn amount cannot be greater than current balance.
