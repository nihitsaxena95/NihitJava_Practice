package mockstmt;
import mockstmt.Mock1;
import static org.mockito.*;
import static org.junit.*;

public class MockTest1 {
	
	@Test
	public void test() {
		Mock1 m1 = mock(Mock1.class);
		Mockito.when(m1.geek()).thenReturn("Hello World");
		System.out.println(m1.geek());
	}
}
