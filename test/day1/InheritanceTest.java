package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class InheritanceTest {

	@Test
	public void test() {
		Shape circle = new Circle();
		Shape rectangle = new Rectangle(5, 10);
		
		circle.draw();
		rectangle.draw();
	
	}
}

