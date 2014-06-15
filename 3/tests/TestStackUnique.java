import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.aatanasov.problems3.StackImplUnique;


public class TestStackUnique {

	private StackImplUnique mStack;
	
	@Before
	public void setUp() throws Exception {
		mStack = new StackImplUnique();
	}

	@Test
	public void testPushUnique() {
		assertEquals(true, mStack.pushUnique(2));
		assertEquals(false, mStack.pushUnique(2));
	}

}
