package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class firsttest {

	@Test (expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		First f = new First();
		f.multi(1000, 5);
	}
	@Test
	public void testAdd() {
		First f = new First();
		assertEquals("10+5 must be 15",15,f.add(10, 5));
	}
	
	@Test
	public void testMultiply() {
		First f = new First();
		assertEquals("10*5 must be 50",50,f.multi(10, 5));
	}
	
	@Test
	public void testsub() {
		First f = new First();
		assertEquals("10-5 must be 5",5,f.sub(10, 5));
	}

}
