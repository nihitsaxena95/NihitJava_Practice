package mockstmt;
import java.sql.Connection;
import java.sql.Statement;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class mocktest {
@InjectMocks private Mocki m;
@Mock private Connection con;
@Mock private Statement stmt;

@Before
public void setup() {
	MockitoAnnotations.initMocks(this);
}

@Test
public void test() throws Exception {
	Mockito.when(con.createStatement()).thenReturn(stmt);
	Mockito.when(con.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
	int val = m.executeQuery("");
	Assert.assertEquals(val,1);
	Mockito.verify(con.createStatement(),Mockito.times(1));
}
}
