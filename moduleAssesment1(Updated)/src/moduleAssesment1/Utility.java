package moduleAssesment1;

public class Utility {
	public static void validateDepositAmount(int amount) {
		if(amount <= 0) throw new IllegalArgumentException("Amount Should Be Greater Than Zero");
	}
	public static void validateWithdrawAmount(int balance,int amount) {
		if(amount > balance) throw new IllegalArgumentException("Amount Should Be Lesser than Or Equal To Balance Amount");
	}
}
