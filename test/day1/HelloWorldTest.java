package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		HelloWorld h = new HelloWorld();
		
		String actual = h.getMessage();
		String expected = "Hello World!";
		
		assertEquals(actual, expected);
	}

}
