package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void test() {
		Temperature t = new Temperature();
		Double actual = t.convertToCelcius(212.0);
		Double expected = 100.0;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void test2() {
		Temperature t = new Temperature();
		Double actual = t.convertToFarenheit(100.0);
		Double expected = 212.0;
		
		assertEquals(actual, expected);
	}

}
