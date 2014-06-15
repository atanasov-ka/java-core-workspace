import java.util.Stack;


public class BracketsValidator {
	public static boolean isValid(String aInput) {
		final char open = '(';
		final char close = ')';
		Stack<Object> stack = new Stack<Object>(); 
		
		for (int i = 0; i < aInput.length(); ++i)
		{
			Character ch = aInput.charAt(i);
			if (ch.equals(open))
			{
				stack.push("open");
			}
			else if (ch.equals(close))
			{
				if (stack.isEmpty())
					return false;
				stack.pop();
			}
		}
		
		return stack.isEmpty();
	}
}
