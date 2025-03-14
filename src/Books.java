import java.util.HashMap;
import java.util.Map;

public class Books<K, V> {
    private Map<K, V> Books;

    public Books() {
        Books = new HashMap<K, V>();
    }

    public void add(K key, V value) {
        if (Books.containsKey(key)) {
//            Books.put(key, Books.get(key) + value);
            V oldValue = Books.get(key);
            Number newValue = oldValue.doubleValue() + value.doubleValue();
            Books.put(key, (V) newValue);
        }
    }


}


