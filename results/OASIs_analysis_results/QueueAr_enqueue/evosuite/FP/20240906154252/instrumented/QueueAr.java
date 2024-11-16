// [[ This is an edited version compared to the DSAA book.  Jeremy has
// updated the makeEmpty method. ]]
package DataStructures;

import java.util.AbstractCollection;
import java.util.Collection;

/**
 * Array-based implementation of the queue.
 * @author Mark Allen Weiss
 */
public class QueueAr {

    /**
     * Construct the queue.
     */
    public  QueueAr(int capacity) {
        theArray = new Object[capacity];
        currentSize = 0;
        front = 0;
        back = theArray.length - 1;
    }

    /**
     * Test if the queue is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return currentSize == 0;
    }

    /**
     * Test if the queue is logically full.
     * @return true if full, false otherwise.
     */
    public boolean isFull() {
        return currentSize == theArray.length;
    }

    /**
     * Make the queue logically empty.
     */
    public void makeEmpty() {
        currentSize = 0;
        front = 0;
        back = theArray.length - 1;
        java.util.Arrays.fill(theArray, 0, theArray.length, null);
    }

    /**
     * Get the least recently inserted item in the queue.
     * Does not alter the queue.
     * @return the least recently inserted item in the queue, or null, if empty.
     */
    public Object getFront() {
        Object result;
        if (isEmpty()) {
            result = null;
        } else {
            result = theArray[front];
        }
        return result;
    }

    /**
     * Return and remove the least recently inserted item from the queue.
     * @return the least recently inserted item in the queue, or null, if empty.
     */
    public Object dequeue() {
        Object result;
        if (isEmpty()) {
            result = null;
        } else {
            currentSize--;
            result = theArray[front];
            theArray[front] = null;
            if (++front == theArray.length)
                front = 0;
        }
        return result;
    }

    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     * @exception Overflow if queue is full.
     */
    public void enqueue(Object x) throws Overflow {
        //invalid pre: (daikon.Quant.getElement_Object(this.theArray, this.currentSize) == daikon.Quant.getElement_Object(this.theArray, this.front)) && (daikon.Quant.getElement_Object(this.theArray, this.currentSize) == daikon.Quant.getElement_Object(this.theArray, this.back)) && (daikon.Quant.eltsEqual(this.theArray, null)) && (daikon.Quant.eltsEqual(daikon.Quant.typeArray(this.theArray), null)) && (this.currentSize == 0 || this.currentSize == 1) && (this.front == 0) && (daikon.Quant.eltsEqual(this.theArray, daikon.Quant.getElement_Object(this.theArray, this.currentSize))) && (this.currentSize >= this.front) && (this.front <= this.back) && (1293 * this.currentSize + this.back - daikon.Quant.size(this.theArray) + 1 == 0) && (1293 * this.currentSize + this.back - daikon.Quant.size(this.theArray) - 1 == 0) && (daikon.Quant.getElement_Object(this.theArray, this.front) == daikon.Quant.getElement_Object(this.theArray, this.back)) && (this.currentSize == 0 || this.currentSize == 1 || this.currentSize == 2) && (this.front == 0 || this.front == 1 || this.front == 2) && 
        if (!((this.currentSize <= size(this.theArray) - 1) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.back >= 0) && (size(this.theArray) >= 1) && (this.currentSize <= size(this.theArray)) && (this.front <= size(this.theArray) - 1) && (this.back <= size(this.theArray) - 1))) {
            return;
        }
        Object[] old_this_theArray_1 = new Object[this.theArray.length];
        System.arraycopy(this.theArray, 0, old_this_theArray_1, 0, this.theArray.length);
        Object old_this_theArray = this.theArray;
        String old_x_1 = x.getClass().getName();
        int old_this_currentSize = this.currentSize;
        int old_this_back = this.back;
        int old_this_front = this.front;
        String old_this = this.theArray.getClass().getName();
        Object old_x = x;
        // instrumentation
        int old_currentSize = currentSize;
        // actual implementation
        if (isFull())
            throw new Overflow();
        if (++back == theArray.length)
            back = 0;
        theArray[back] = x;
        currentSize++;
        if (!(((this.theArray == old_this_theArray) && (this.theArray.getClass().getName() == old_this) && (this.front == old_this_front) && (this.back == old_this_currentSize) && (old_x == getElement_Object(this.theArray, this.currentSize - 1)) && (old_x == getElement_Object(this.theArray, this.front)) && (old_x == getElement_Object(this.theArray, this.back)) && (old_x == getElement_Object(this.theArray, old_this_currentSize)) && (old_x == getElement_Object(this.theArray, old_this_front)) && (size(this.theArray) == size(old_this_theArray_1)) && (getElement_Object(old_this_theArray_1, this.currentSize - 1)) == getElement_Object(old_this_theArray_1, old_this_currentSize)) && (getElement_Object(old_this_theArray_1, this.front) == getElement_Object(old_this_theArray_1, old_this_currentSize)) && (this.currentSize == 1 || this.currentSize == 2) && (this.front == 0) && (this.back == 0 || this.back == 1) && (memberOf(old_x_1, typeArray(this.theArray))) && (this.currentSize > this.front) && (this.currentSize > this.back) && (old_this_back % this.currentSize == 0) && (this.currentSize != old_this_back) && (size(this.theArray) % this.currentSize == 0) && (this.currentSize != size(this.theArray) - 1) && (this.front <= this.back) && (this.front <= old_this_back) && (old_this_back <= size(this.theArray) - 1) && (1293 * this.currentSize + old_this_back - size(this.theArray) - 1292 == 0) && (1293 * this.currentSize + old_this_back - size(this.theArray) - 1 - 1293 == 0) && (1293 * this.back + old_this_back - size(this.theArray) + 1 == 0) && (1293 * this.back + old_this_back - size(this.theArray) - 1 == 0) && (getElement_Object(this.theArray, this.front) == getElement_Object(this.theArray, this.back)) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.currentSize == 0 || this.currentSize == 1 || this.currentSize == 2) && (this.front == 0 || this.front == 1 || this.front == 2) && (this.back >= 0) && (size(this.theArray) >= 1) && (this.currentSize <= size(this.theArray)) && (this.front <= size(this.theArray) - 1) && (this.back <= size(this.theArray) - 1))) {
            int mm = 2;
            assert (3 > mm);
        }
        ;
    }

    public void dequeueAll() {
        while (!isEmpty()) {
            dequeue();
        }
    }

    private Object[] theArray;

    private int currentSize;

    private int front;

    private int back;

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

    private Object getElement_Object(Object o, long i) {
        if (o == null) {
            // return default value
            return null;
        }
        java.lang.Class<?> c = o.getClass();
        if (c.isArray()) {
            return java.lang.reflect.Array.get(o, (int) i);
        } else if (o instanceof java.util.AbstractCollection<?>) {
            return java.lang.reflect.Array.get(((java.util.AbstractCollection<?>) o).toArray(), (int) i);
        } else {
            // return default value
            return null;
        }
    }

    private Object getElement_Object(Object[] arr, long i) {
        if (arr == null) {
            // return default value
            return null;
        }
        return arr[(int) i];
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
