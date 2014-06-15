import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hackbulgaria.aatanasov.problems3.StackImp;


public class TestStack {

	private StackImp mStack;
	@Before 
	public void setUp() {
		mStack = new StackImp();
	}
	
	@Test
	public void testPush() {
		assertEquals (1, mStack.push(2).length());
		assertEquals (2, mStack.push(new Integer(2)).length());
		assertEquals (6, mStack.push(new String("ala-bala"))
				.push(new String("ala-bala2"))
				.push(new String("ala-bala3"))
				.push(new String("ala-bala4")).length());
		assertEquals ("ala-bala4", mStack.peek());
	}

	@Test
	public void testPop() {
		assertEquals (1, mStack.push(2).push(3).push(7).pop().pop().length());
		assertEquals (new Integer(2), mStack.peek());
	}

	@Test
	public void testLength() {
		assertEquals (0, mStack.length());
		assertEquals (1, mStack.push(2).push(3).push(7).pop().pop().length());
	}

	@Test
	public void testPeek() {
		assertEquals (null, mStack.peek());
		assertEquals (1, mStack.push(2).length());
	}

}
