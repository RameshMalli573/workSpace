package moduleAssesment1;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	Account account;

	@Before
	public void init() {
		String name = "Ramesh";
		String createdDate = "04/04/22";
		String city = "windsor";
		String state = "ontaria";
		String zipCode = "65451";
		String phoneNumber = "9876543210";
		String houseNumber = "453";
		String street = "Park Lane";
		String type = "savings";
		String status = "Active";

		account = new Account(name, createdDate, city, state, zipCode, phoneNumber, houseNumber, street, type, status);
	}

	@Test
	public void testDepositWithPositiveValues() {
		boolean depositStatus = account.deposit(5);
		assertEquals(true, depositStatus);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDepositWithNegativeValues() {
		boolean depositStatus = account.deposit(-1);
		assertEquals(false, depositStatus);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWitndrawWithValidAmount() {
		int witndrawAmount = 4;
		int witndrawStatus = account.withdraw(witndrawAmount);
		assertEquals(witndrawAmount, witndrawStatus);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testWitndrawWithInvalidAmount() {
		int witndrawAmount = 7;
		int witndrawStatus = account.withdraw(witndrawAmount);
		assertEquals(witndrawAmount, witndrawStatus);
	}

}
