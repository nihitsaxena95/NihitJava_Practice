package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ForthtestTest {

	@Test
	public void prttest() {
		String mess = "Baap";
		Forthtest ft = new Forthtest(mess);
		assertEquals(mess,ft.prtmess());
	}

}
