import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.MaxSumScalar;

public class Tests {

	private MaxSumScalar ms;

	@Before
	public void setUp() throws Exception {
		ms = new MaxSumScalar();
		System.out.println("This is setup");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is teardown");
	}

	@Test
	public void testSum() {
				
		assertEquals(1, ms.sum(new int[]{1}, new int[]{2}));
		
	}

	@Test
	public void testCountDigits() {
		assertEquals(5, ms.getNumberOfDigits(12345));
		assertEquals(7, ms.getNumberOfDigits(1234554));
		assertEquals(5, ms.getNumberOfDigits(-12345));
		assertEquals(1, ms.getNumberOfDigits(0));
	}
	
	@Test
	public void testGlueString() {
		assertEquals("Hello", ms.stichMeUp(" ", "Hello"));
		assertEquals("Hello World", ms.stichMeUp(" ", "Hello", "World"));
		assertEquals("Hello World , Bai Pesho!!!", ms.stichMeUp(" ", "Hello", "World", ",", "Bai", "Pesho!!!"));
	}
	
	@Test
	public void testReducerOfPaths() {
		assertEquals("/", ms.reduceFilePath("///"));
	}

}
