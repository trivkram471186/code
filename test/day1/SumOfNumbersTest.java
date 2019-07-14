package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	SumOfNumbers s = new SumOfNumbers();
	
	@Test
	public void test() {		
		Integer actual = s.sumOfEvenNumbers(1, 10);
		Integer expected = 30;
		
		assertEquals(actual, expected);
	}

	@Test
	public void test2()
	{
		Integer actual = s.sumOfOddNumbers(1, 10);
		Integer expected = 25;
		
		assertEquals(actual, expected);	
	}
}
