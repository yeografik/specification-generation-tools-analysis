package examples;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * This class implements the MAP [K, V] class from the file map.e in the Eiffel project AutoProof
 *
 * @author Facundo Molina (with modifications by N. Aguirre)
 */
public class MyMap<K, V> {

    /**
     * Keys of this map.
     */
    private LinkedList<K> keys;

    /**
     * Values of this map.
     */
    private LinkedList<V> data;

    /**
     * Initializes empty map.
     */
    public  MyMap() {
        keys = new LinkedList<K>();
        data = new LinkedList<V>();
    }

    /**
     * Element with key `k'.
     */
    public V item(K k) {
        // has_key (k)
        if (!keys.contains(k))
            throw new IllegalArgumentException("invalid key");
        int i = keys.indexOf(k);
        V result = data.get(i);
        // end
        return result;
    }

    /**
     * Number of elements in map.
     */
    public int count() {
        int result = keys.size();
        return result;
    }

    /**
     * Is there a key `k' in the map?
     */
    public boolean hasKey(K k) {
        boolean result = keys.indexOf(k) >= 0;
        return result;
    }

    /**
     * Is there a value `v' in the map?
     */
    public boolean hasValue(V v) {
        int i = 0;
        boolean result = false;
        while (i < data.size() && !result) {
            result = data.get(i) == v;
            i++;
        }
        return result;
    }

    /**
     * Extends map with key `k' mapped to `v'. Returns index of key `k' (ghost value).
     */
    public int extend(K k, V v) {
        //invalid pre: (k.getClass().getName() == v.getClass().getName()) && (k.getClass().getName() == java.lang.String.class.getName()) && (v.getClass().getName() == java.lang.String.class.getName()) && 
        if (!((this.keys != null) && (this.data != null))) {
            return 0;
        }
        // require
        // modify (current)
        // do
        LinkedList<K> old_this_keys_1 = (LinkedList) this.keys.clone();
        LinkedList<V> old_this_data_1 = (LinkedList) this.data.clone();
        Object old_this_keys = this.keys;
        String old_v = v.getClass().getName();
        Object old_this_data = this.data;
        String old_k = k.getClass().getName();
        int result = indexOfKey(k);
        if (result >= 0) {
            data.set(result, v);
        } else {
            keys.add(k);
            data.add(v);
            result = keys.size() - 1;
        }
        if (!(((this.keys == old_this_keys) && (this.data == old_this_data) && (result == 0 || result == 1 || result == 2) && (size(this.keys) == 1 || size(this.keys) == 2 || size(this.keys) == 3) && (size(this.data) == 1 || size(this.data) == 2 || size(this.data) == 3) && (memberOf(old_k, typeArray(this.keys))) && (memberOf(old_v, typeArray(this.data))) && (size(this.keys) >= size(old_this_keys_1)) && (size(this.keys) - 1 <= size(old_this_keys_1)) && (size(this.keys) - 1 >= size(old_this_keys_1) - 1) && (size(this.data) >= size(old_this_data_1)) && (size(this.data) - 1 <= size(old_this_data_1)) && (size(this.data) - 1 >= size(old_this_data_1) - 1) && (this.keys != null) && (this.data != null)))) {
            int mm = 2;
            assert (3 > mm);
        }
        // data.sequence.interval (Result+1, data.sequence.count)
        return result;
    }

    /**
     * Removes element mapped to `k'. Returns index of removed key `k' (ghost value).
     */
    public int remove(K k) {
        // require
        // has_key (k)
        // not_empty: count > 0
        // modify (Current)
        boolean has_key = hasKey(k);
        boolean not_empty = count() > 0;
        if (!has_key)
            throw new IllegalArgumentException();
        if (!not_empty)
            throw new IllegalStateException();
        // do
        int result = indexOfKey(k);
        keys.remove(result);
        data.remove(result);
        // data.sequence.interval (Result+1, data.sequence.count+1)
        return result;
    }

    /**
     * Index of key `k'.
     */
    private int indexOfKey(K k) {
        int result = keys.indexOf(k);
        // Result = 0 implies keys.sequence.to_bag.occurrences (k) = 0
        return result;
    }

    private int size(Object o) {
        if (o == null) {
            // return default value
            return Integer.MAX_VALUE;
        }
        java.lang.Class<?> c = o.getClass();
        if (c.isArray()) {
            return java.lang.reflect.Array.getLength(o);
        } else if (o instanceof Collection<?>) {
            return ((Collection<?>) o).size();
        } else {
            // return default value
            return Integer.MAX_VALUE;
        }
    }

    private int size(Collection<?> o) {
        if (o == null) {
            // return default value
            return Integer.MAX_VALUE;
        }
        return o.size();
    }

    private String[] typeArray(Object[] seq) {
        if (seq == null) {
            return null;
        }
        String[] retval = new String[seq.length];
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == null) {
                retval[i] = null;
            } else {
                retval[i] = seq[i].getClass().toString();
            }
        }
        return retval;
    }

    private String[] typeArray(Object seq) {
        if (seq == null) {
            return null;
        }
        return typeArray(toObjArray(seq));
    }

    private Object[] toObjArray(Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof java.util.AbstractCollection<?>) {
            @SuppressWarnings({ "unchecked" }) AbstractCollection<Object> ac = (AbstractCollection<Object>) o;
            Object[] result = ac.toArray(new java.lang.Object[] {});
            return result;
        } else if (o.getClass().isArray()) {
            return (Object[]) o;
        } else {
            throw new IllegalArgumentException("not an array or collection: " + o);
        }
    }

    private boolean memberOf(String elt, String[] arr) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (eq(arr[i], elt)) {
                return true;
            }
        }
        return false;
    }

    private boolean eq(String x, String y) {
        return x == y;
    }
}
