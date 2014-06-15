import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.aatanasov.problems3.Pair;


public class TestPair {

	private Pair p;
	
	@Before
	public void setUp() {
		p = new Pair(null, null);
	}
	
	@Test
	public void test() {
		
		assertEquals("Equals", new Pair(0, 0).toString());
		assertNotEquals("Equals", new Pair(0, 1).toString());
	}

}
