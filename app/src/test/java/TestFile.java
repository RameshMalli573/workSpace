import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestFile {
	 @Test(expected = ArithmeticException.class)
	 public void testDivide() {
		 Calculator calc = new Calculator();
		 int val = calc.subtract(9,0);
		 assertEquals(9,val);
	 }
}
