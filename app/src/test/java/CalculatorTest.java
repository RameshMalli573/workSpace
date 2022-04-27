

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest{
	Calculator calc;
 @Before//this is used to to run it before every test case
 public void init() {
	 calc = new Calculator();
 }
 @Test
 public void testAdd() {
	 //Calculator calc = new Calculator();
	 int val = calc.add(3,4);
	 assertEquals(7,val);
 }
 @Test
 public void testWithZero() {
	 //Calculator calc = new Calculator();
	 int val = calc.add(0,4);
	 assertEquals(4,val);
 }
 @Test
 public void testSubstract() {
	 //Calculator calc = new Calculator();
	 int val = calc.subtract(7,3);
	 assertEquals(4,val);
 }
 @Test(expected = ArithmeticException.class)
 public void testDivide() {
	 int val = calc.divide(9,0);
	 assertEquals(9,val);
 }

}
