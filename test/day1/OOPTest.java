package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class OOPTest {
	
	@Test
	public void test() {
		Mobile m1 = new Mobile(10, 10, 4, 20);
		Mobile m2 = new Mobile(15, 15, 8, 10);
		
		Person p1 = new Person("John");
		Person p2 = new Person("James");
		
		Vehicle v1 = new Vehicle(2);
		Vehicle v2 = new Vehicle(4);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(v1);
		System.out.println(v2);
	}
}
