import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicHashTable<K,V>{

    //private Object[] values = new Object[101];
    private Object[] values = new Object[128];

    public void put(K key,V value){
        values[calculatePosition(key)] = value;
    }

    public V get(K key){
        return (V)values[calculatePosition(key)];
    }

    private int calculatePosition(K key) {
        int hash = key.hashCode();
        // % or reminder is the most expensive arithmetic operator
        //int pos = hash % values.length;
        int pos = hash & 127;
        if(pos < 0) pos += values.length;
        return pos;
    }

    @Override
    public String toString() {
        return Stream.of(values).filter(Objects::nonNull)
                .map(Objects::toString)
                .collect(Collectors.joining(",","{","}"));
    }
}
