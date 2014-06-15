import java.util.HashSet;
import java.util.Set;


public class OnOffCollection<T> {
	private Set<T> set = new HashSet<T>();
	
	public OnOffCollection() {
	}
	
	public void add (T aItem) {
		if (set.contains(aItem))
			set.remove(aItem);
		else
			set.add(aItem);
	}
	
	public boolean isEmpty()
	{
		return set.isEmpty();
	}
	
	public void clear(){
		set.clear();
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		for (T item : set) {
			strBuilder.append(item.toString());
		}
		
		return strBuilder.toString();
	}
}
