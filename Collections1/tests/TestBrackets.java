import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestBrackets {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsValid() {
		assertTrue(BracketsValidator.isValid("()"));
		assertFalse(BracketsValidator.isValid("()()())))((())("));
		assertFalse(BracketsValidator.isValid("())(()"));
	}

}
