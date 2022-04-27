package bank;

public class Account {
	static int accountCounter = 100000;
	private enum types{
		FD,SB;
	}
	private int accountNumber;
	private String openingDate;
	private types type;
	private double balance;
	private int id;
	
	//constructor
	public Account(int id, String openingDate, double balance) {
		this.accountNumber = generateNewAccountNumber();
		this.openingDate = openingDate;
		this.type = types.FD;
		this.balance = balance;
		this.id = id;
	}
	private int generateNewAccountNumber() {
		return ++accountCounter;
	}
	public String getDetailsAsString() {
		String res = new String();
		res += "Account Number : " + accountNumber + ", ";
		res += "Customer ID : " + id + ", ";
		res += "Account Type : " + type + ", ";
		res += "Account Creation Date : " + openingDate + ", ";
		res += "Account Balance : " + balance + ".";
		
		return res;
	}
	
}

//2. Create a Class Account 
//a. Having Instance variables for Account Number(int), Account opening date(String), Account Type(enum with constants SB, FD), Account Balance(double) and Customer(Type Customer) 
//b. Method which generates Account number using a counter (static variable). Account number starts from 100000. 
//c. Constructor which takes all Account details (except Account number) as arguments and sets the values. Account number is set using the above method. 
//d. Method which formats the details as given below in to a string and returns the string 
//
//Account Number : 100001 
//Customer ID : 1001 
//Account Type : SB 
//Account creation Date : 01/05/2011 
//Account Balance : Rs. 500 
