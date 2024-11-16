package examples;

import java.util.AbstractCollection;
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
    public MyMap() {
        keys = new LinkedList<K>();
        data = new LinkedList<V>();
    }

    /**
     * Element with key `k'.
     */
    public V item(K k) {
        // require
        // has_key (k)
        if (!keys.contains(k))
            throw new IllegalArgumentException("invalid key");
        int i = keys.indexOf(k);
        V result = data.get(i);
        // ensure
        // across keys.sequence.domain as j some
        // k = keys.sequence[j.item] and Result = data.sequence[j.item]
        // end
        return result;
    }

    /**
     * Number of elements in map.
     */
    public int count() {
        if (!((this.keys != null) && (this.data != null))) {
            return 0;
        }
        Object old_this_keys = this.keys;
        LinkedList<K> old_this_keys_1 = (LinkedList) this.keys.clone();
        Object old_this_data = this.data;
        LinkedList<V> old_this_data_1 = (LinkedList) this.data.clone();
        int result = keys.size();
        assert ((this.keys == old_this_keys) && (pairwiseEqualK(this.keys, old_this_keys_1)) && (this.data == old_this_data) && (pairwiseEqualV(this.data, old_this_data_1)) && (result >= 0) && (this.keys != null) && (this.data != null));
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
        // require
        // modify (current)
        // do
        int result = indexOfKey(k);
        if (result >= 0) {
            data.set(result, v);
        } else {
            keys.add(k);
            data.add(v);
            result = keys.size() - 1;
        }
        // ensure
        // key_set: keys.sequence[Result] = k
        // data_set: data.sequence[Result] = v
        // other_keys_unchanged: keys.sequence.interval (1, Result-1) = old keys.sequence.interval (1,
        // Result-1)
        // other_keys_unchanged: keys.sequence.interval (Result+1, keys.sequence.count) = old
        // keys.sequence.interval (Result+1, keys.sequence.count)
        // other_data_unchanged: data.sequence.interval (1, Result-1) = old data.sequence.interval (1,
        // Result-1)
        // other_data_unchanged: data.sequence.interval (Result+1, data.sequence.count) = old
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
        // ensure
        // result_is_index: old keys.sequence[Result] = k
        // key_removed: not keys.sequence.has (k)
        // other_keys_unchanged: keys.sequence.interval (1, Result-1) = old keys.sequence.interval (1,
        // Result-1)
        // other_keys_unchanged: keys.sequence.interval (Result, keys.sequence.count) = old
        // keys.sequence.interval (Result+1, keys.sequence.count+1)
        // other_data_unchanged: data.sequence.interval (1, Result-1) = old data.sequence.interval (1,
        // Result-1)
        // other_data_unchanged: data.sequence.interval (Result, data.sequence.count) = old
        // data.sequence.interval (Result+1, data.sequence.count+1)
        return result;
    }

    /**
     * Index of key `k'.
     */
    private int indexOfKey(K k) {
        int result = keys.indexOf(k);
        // ensure
        // 0 <= Result and Result <= count
        // Result > 0 implies keys.sequence[Result] = k
        // Result > 0 implies keys.sequence.to_bag.occurrences (k) = 1
        // Result = 0 implies not keys.sequence.has (k)
        // Result = 0 implies keys.sequence.to_bag.occurrences (k) = 0
        return result;
    }

    private boolean pairwiseEqualK(AbstractCollection<K> seq1, AbstractCollection<K> seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        @SuppressWarnings("cast") // cast is redundant (except in JSR 308)
        Object[] seq1a = (Object[]) seq1.toArray();
        Object[] seq2a = (Object[]) seq2.toArray();
        return pairwiseEqual(seq1a, seq2a);
    }
    
    private boolean pairwiseEqualV(AbstractCollection<V> seq1, AbstractCollection<V> seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        @SuppressWarnings("cast") // cast is redundant (except in JSR 308)
        Object[] seq1a = (Object[]) seq1.toArray();
        Object[] seq2a = (Object[]) seq2.toArray();
        return pairwiseEqual(seq1a, seq2a);
    }
    
    private boolean pairwiseEqual(Object[] seq1, Object[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        assert seq1 != null && seq2 != null; // because sameLength() = true
        for (int i = 0 ; i < seq1.length ; i++) {
            if (ne(seq1[i], seq2[i])) {
            return false;
            }
        }
        return true;
    }
    
    private boolean sameLength(Object[] seq1, Object[] seq2) {
        return ((seq1 != null) && (seq2 != null) && seq1.length == seq2.length);
    }

    private boolean ne(Object x, Object y) {
        return x != y;
    }
}
