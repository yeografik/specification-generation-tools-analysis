package examples;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ArrayList;

// functional correctness of various operations on the queue and client code using the queue.
public class RingBuffer<G> {

    // feature -- Model
    /**
     * Arrays used to store data.
     */
    private ArrayList<G> data;

    /**
     * Index of first element.
     */
    private int start;

    /**
     * Index of next free position.
     */
    private int free;

    /**
     * Capacity
     */
    private int capacity_;

    /**
     * Initializes empty buffer with capacity `n'.
     */
    public  RingBuffer(int n) {
        if (!(n > 0))
            throw new IllegalArgumentException("parameter must be positive");
        data = new ArrayList<G>(n + 1);
        // Dummy position
        data.add(null);
        start = 1;
        free = 1;
        capacity_ = n;
    // ensure
    // empty_buffer: is_empty
    // capacity_set: capacity = n
    // boolean empty_buffer = is_empty();
    // boolean capacity_set = capacity() == n;
    //assert (empty_buffer && capacity_set);
    }

    /**
     * Current item of buffer.
     */
    public Object item() {
        // not_empty: not is_empty
        if (isEmpty())
            throw new IllegalStateException("empty buffer");
        Object result = data.get(start);
        // assert (result == data.get(start));
        return result;
    }

    /**
     * Number of items in buffer.
     */
    public int count() {
        int result;
        if (free > start)
            result = free - start;
        else
            result = (data.size() - 1) - start + free;
        return result;
    // ensure
    // definition: Result = sequence.count
    }

    public int dataCount() {
        return capacity_ + 1;
    }

    /**
     * Maximum capacity of buffer.
     */
    public int capacity() {
        return capacity_;
    // ensure
    // definition: Result = capacity_
    }

    /**
     * Is buffer empty?
     */
    public boolean isEmpty() {
        return start == free;
    // ensure
    // definition: Result = sequence.is_empty
    }

    /**
     * Is buffer full?
     */
    public boolean isFull() {
        boolean result;
        if (start == 1)
            result = free == dataCount();
        else
            result = free == start - 1;
        // definition: Result = (count = capacity)
        return result;
    }

    /**
     * Adds `a_value' to end of buffer.
     */
    public void extend(G a_value) {
        //invalid pre: (this.start == 1 || this.start == 2) && (daikon.Quant.size(this.data) == 1 || daikon.Quant.size(this.data) == 2 || daikon.Quant.size(this.data) == 3) && (this.start <= this.free) && (this.start == 1 || this.start == 2 || this.start == 3) && (this.free == 1 || this.free == 2 || this.free == 3) && 
        if (!((this.data != null) && (this.capacity_ >= 1) && (size(this.data) >= 1))) {
            return;
        }
        ArrayList<G> old_this_data_1 = new ArrayList(this.data);
        String old_a_value = a_value.getClass().getName();
        int old_this_free = this.free;
        int old_this_capacity_ = this.capacity_;
        Object old_this_data = this.data;
        int old_this_start = this.start;
        // modify_model ("sequence", Current)
        if (isFull())
            throw new IllegalStateException("buffer is full");
        data.add(a_value);
        if (free == dataCount())
            free = 1;
        else
            free = free + 1;
        if (!(((this.data == old_this_data) && (this.start == old_this_start) && (this.capacity_ == old_this_capacity_) && (size(this.data) - 1 == size(old_this_data_1)) && (this.start == 1 || this.start == 2) && (size(this.data) == 2 || size(this.data) == 3 || size(this.data) == 4) && (memberOf(old_a_value, typeArray(this.data))) && (this.start != this.free) && (this.start <= old_this_free) && (this.free != old_this_free) && (this.data != null) && (this.start == 1 || this.start == 2 || this.start == 3) && (this.free == 1 || this.free == 2 || this.free == 3) && (this.capacity_ >= 1) && (size(this.data) >= 1)))) {
            int mm = 2;
            assert (3 > mm);
        }
    // ensure
    // definition: sequence = old sequence.extended (a_value)
    }

    /**
     * Removes current item from buffer.
     */
    public void remove() {
        // modify_model ("sequence", Current)
        if (isEmpty())
            throw new IllegalStateException("buffer is empty");
        if (start == dataCount())
            start = 1;
        else
            start++;
    // ensure
    // definition: sequence = old sequence.but_first
    }

    /**
     * Removes all elements from buffer.
     */
    public void wipeOut() {
        // require
        // modify_model ("sequence", Current)
        start = free;
    // ensure
    // empty: is_empty
    // boolean empty = is_empty();
    // assert (empty);
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
