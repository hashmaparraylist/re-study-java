package io.github.ha.restudy.java.generic;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class GenericClass<K, V> {

    private Map<K, V> map = new HashMap<>();

    public V put(K key, V value) {
       return map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public <T> T genericMethod(T t) {
        return t;
    }

}
