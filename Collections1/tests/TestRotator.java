import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestRotator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRotate() {
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		ls.add(9);
		ls.add(10);
		System.out.println(ls.toString());
		CollectionRotator.rotate(ls, -12);
		System.out.println(ls.toString());
	}

}
