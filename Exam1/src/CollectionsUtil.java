import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsUtil {
	public static List<Integer> sort(List<Integer> aList) {
		List<Integer> tmp = new LinkedList<>(aList);
		Collections.sort(tmp);
		return tmp;
	}

	public static List<Integer> reverse(List<Integer> aList) {
		List<Integer> tmp = new LinkedList<>(aList);
		Collections.reverse(tmp);
		return tmp;
	}
	
	public static boolean isMonotonous (List<Integer> aList)
	{
		return aList.equals(sort(aList)) || aList.equals(reverse(sort(aList)));
	}
}
