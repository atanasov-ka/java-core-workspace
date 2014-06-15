import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestOnOff {

	private OnOffCollection<String> col;
	
	@Before
	public void setUp() throws Exception {
		col = new OnOffCollection<>();
	}

	@Test
	public void testAdd() {
		col.add("first");
		assertFalse(col.isEmpty());
		col.add("first");
		assertTrue(col.isEmpty());
		col.add("first");
		assertFalse(col.isEmpty());
	}

	@Test
	public void testIsEmpty() {
		assertTrue(col.isEmpty());
	}

}
