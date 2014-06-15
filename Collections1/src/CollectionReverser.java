import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionReverser {
	public static <T> void reverse (Collection<T> aInput)
	{
		List<T> list = new ArrayList<>(aInput);
		Collections.reverse(list);
		
		aInput.clear();
		for (int i = 0; i < list.size(); i++) {
			aInput.add(list.get(i));
		}
		
	}
}
