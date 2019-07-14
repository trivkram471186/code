package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	Factorial f = new Factorial();
	
	@Test
	public void test() {
		int actual = f.calculateFactorial(5);
		int expected = 120;
		
		assertEquals(actual, expected);
	}

}
