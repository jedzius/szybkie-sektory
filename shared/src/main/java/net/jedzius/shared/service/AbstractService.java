package net.jedzius.shared.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractService<V, T> {

    private final Map<V, T> objectMap = new ConcurrentHashMap<>();

    public T findByKey(V v) {
        return this.objectMap.get(v);
    }

    public T add(V v,T t) {
        this.objectMap.put(v, t);
        return t;
    }

    public void remove(V v) {
        this.objectMap.remove(v);
    }

    public List<T> findAll() {
        return this.objectMap.values().stream().toList();
    }

    public Map<V, T> getMapEntries() {
        return this.objectMap;
    }

    public abstract void enableRegistry();
}
