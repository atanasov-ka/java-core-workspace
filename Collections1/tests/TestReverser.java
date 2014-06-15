import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;


public class TestReverser {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReverse() {

		Collection<String> myStrings = new ArrayList<String>();
		myStrings.add("first");
		myStrings.add("second");
		myStrings.add("third");
		CollectionReverser.reverse(myStrings);
		assertEquals("[third, second, first]", myStrings.toString());
	}

}
