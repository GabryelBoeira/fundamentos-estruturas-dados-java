package com.gabryel.maps;

import com.gabryel.sets.Set;

public interface Map<K, V> {

    V put(K key, V value);

    V get(K key);

    V remove(K key);

    boolean containsKey(K key);

    boolean containsValue(V value);

    Set<K> keySet();

    Set<Entry<K, V>> entrySet();

    int size();

}
