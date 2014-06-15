import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.aatanasov.problems3.Time;

public class TestTime {
	private Time t;

	@Before
	public void setUp() {
		t = Time.now();
	}

	@Test
	public void test() {
		assertEquals("", t.toString());
	}
}
