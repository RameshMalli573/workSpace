package mathematics;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void testForAdd() {
		Maths maths = new Maths();
		int result = maths.add(45, 5);
		assertEquals(50, result);
	}
	
	@Test
	public void testForSubtract() {
		Maths maths = new Maths();
		int result = maths.subtract(45, 5);
		assertEquals(40, result);
	}

}
