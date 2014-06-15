import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class BoundedQueue<T> implements Queue<T>{
	@SuppressWarnings("unused")
	private Queue<T> queue;
	private final int limit;
	public BoundedQueue(int limit)
	{
		this.limit = limit;
		this.queue = new LinkedList<>();
	}
	
	public int getLimit() {
		return limit;
	}
	@Override
	public int size() {
		return queue.size();
	}
	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	@Override
	public boolean contains(Object o) {
		return queue.contains(o);
	}
	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}
	@Override
	public Object[] toArray() {
		return queue.toArray();
	}
	@Override
	public <K> K[] toArray(K[] a) {
		return queue.toArray(a);
	}
	@Override
	public boolean remove(Object o) {
		return queue.remove(o);
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		return queue.containsAll(c);
	}
	@Override
	public boolean addAll(Collection<? extends T> c) {
		return queue.addAll(c);
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		return queue.removeAll(c);
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		return queue.retainAll(c);
	}
	@Override
	public void clear() {
		queue.clear();
	}
	@Override
	public boolean add(T e) {
		if (size() == getLimit())
		{
			queue.poll();
		}
		return queue.add(e);
	}
	@Override
	public boolean offer(T e) {
		return queue.offer(e);
	}
	@Override
	public T remove() {
		return queue.remove();
	}
	@Override
	public T poll() {
		return queue.poll();
	}
	@Override
	public T element() {
		return queue.element();
	}
	@Override
	public T peek() {
		return queue.peek();
	}
	
}
