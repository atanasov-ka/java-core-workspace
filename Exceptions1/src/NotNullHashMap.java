import java.util.HashMap;


public class NotNullHashMap<K, V> extends HashMap<K, V>{
	private boolean isCanPutNull;
	public <K, V>NotNullHashMap (boolean isCanPutNull) {
		this.isCanPutNull = isCanPutNull;
	}
	
	@Override
	public V put(K key, V value) {
		if (isCanPutNull && (key == null || value == null))
			throw new HashMapNullException("Cannot put Null inside");
			
		return super.put(key, value);
	}	
}
