package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForthtestTestTest1 {

	@Test
	public void test() {
		String mess="Baap no 1";
		String mess1 ="hi"+"Baap no 1";
		Forthtest ft = new Forthtest(mess);
		assertEquals(mess1,ft.modmess());
	}

}
