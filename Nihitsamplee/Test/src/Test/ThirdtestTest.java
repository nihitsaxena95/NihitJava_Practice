package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class ThirdtestTest {

	@Test
	public void testlist() {
		Thirdtest th = new Thirdtest();
		assertEquals("Size is 5",5,th.testlist().size());
	}
}