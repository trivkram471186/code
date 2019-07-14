package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkValidatorTest {

	@Test
	public void test() {
		MarkValidator m = new MarkValidator();
		boolean actual = m.isPass(40);
		boolean expected = true;
		
		assertEquals(actual, expected);
	}

	@Test
	public void test2() {
		MarkValidator m = new MarkValidator();
		boolean actual = m.isPass(39);
		boolean expected = false;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void test3() {
		MarkValidator m = new MarkValidator();
		String actual = m.markGrade(39);
		String expected = "D";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void test4() {
		MarkValidator m = new MarkValidator();
		String actual = m.markGrade(91);
		String expected = "A";
		
		assertEquals(actual, expected);
	}

	@Test
	public void testMarkGradeUsingSwitch() {
		MarkValidator m = new MarkValidator();
		String actual = m.markGradeUsingSwitch(91);
		String expected = "A";
		
		assertEquals(actual, expected);
	}


}
