package bank;

public class Customer {
	static int counter = 1000;
	private int id;
	private String name;
	private String address;
	private String mobNo;
	private String emailId;
	
	public Customer(String name,String address,String mobNo,String emailId) {
		this.id = generateNewId();
		this.name = name;
		this.address = address;
		this.emailId = emailId;
		this.mobNo = mobNo;
	}
	private int generateNewId() {
		return ++counter;
	}
	public void printDetails() {
		System.out.println("Customer ID : " + id);
		System.out.println("Customer Name : " + name);
		System.out.println("Customer Address : " + address);
		System.out.println("Customer emailId : " + emailId);
		System.out.println("Customer Mobile : " + mobNo);
		
	}
	public String getDetailsAsString() {
		String res = new String();
		res += "Customer ID : " + id + ", ";
		res += "Customer Name : " + name + ", ";
		res += "Customer Address : " + address + ", ";
		res += "Customer Email : " + emailId + ", ";
		res += "Customer Mobile : " + mobNo + ".";
		
		return res;
	}

}


//1. Create a class Customer 
//a. Having Instance variables Customer id(int), Customer Name(String), Customer Address(String), Customer Telephone(String) and Customer Email id(String) 
//b. Method which generates Customer Id using a counter (static variable). Customer ID starts from 1000. 
//c. Constructor which takes values for the above fields(except Customer id) and sets the values 
//d. Method which formats the details as given below in to a string and returns the string 
//Customer ID : 1001 
//Customer Name : First Customer 
//Customer Address : HSR, Bangalore 
//Customer Email : first@melior.in 
//Customer Phone : 9999911111 
//e. Method which displays the Customer details 

//
//String res = new String();
//res += "Customer ID : " + id + ", ";
//res += "Customer Name : " + name + ", ";
//res += "Customer Address : " + address + ", ";
//res += "Customer Enail : " + emailId + ", ";
//res += "Customer Mobile : " + mobNo + ", ";
