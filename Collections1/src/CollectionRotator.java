import java.util.Collection;


public class CollectionRotator {
	public static <T> void rotate (Collection<T> input, int step)
	{
		Object [] array = input.toArray();
		for (int i = 0; i < Math.abs(step); ++i)
		{
			if (step > 0)
			{
				putLastToFirst(array);
			}
			else
			{
				putFirstToLast(array);
			}
		}
		input.clear();
		for (int i = 0; i < array.length; i++) {
			T item = (T) array[i];
			input.add(item);
		}
	}
		
	private static <T> void putLastToFirst(T[] array)
	{
		int indexLast = array.length - 1;
		T first = array[indexLast];
		T temp = null;
		T temp2 = null;
		for (int i = 0; i < array.length; i++) {
			temp2 = array[i];
			if (i > 0) {
				array[i] = temp;
			}
			temp = temp2;
		}
		array[0] = first;
	}
	
	private static <T> void putFirstToLast(T[] array) {
		int indexFirst = 0;
		T last = array[indexFirst];
		T temp = null;
		T temp2 = null;
		for (int i = array.length - 1; i >= 0; i--) {
			temp2 = array[i];
			if (i < array.length - 1) {
				array[i] = temp;
			}
			temp = temp2;
		}
		array[array.length - 1] = last;
		
	}
}
