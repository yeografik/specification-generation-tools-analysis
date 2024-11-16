// [[ This is an edited version compared to the DSAA book.  Jeremy has
// removed the no-arg constructor, inlined the increment method, and
// updated the makeEmpty method. ]]
package DataStructures;

import java.util.AbstractCollection;
import java.util.Collection;

// QueueAr class
//
// ******************PUBLIC OPERATIONS*********************
// void enqueue( x )      --> Insert x
// Object getFront( )     --> Return least recently inserted item
// Object dequeue( )      --> Return and remove least recent item
// boolean isEmpty( )     --> Return true if empty; else false
// boolean isFull( )      --> Return true if capacity reached
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// Overflow thrown for enqueue on full queue
/**
 * Array-based implementation of the queue.
 * @author Mark Allen Weiss
 */
public class QueueAr {

    /**
     * Construct the queue.
     */
    public QueueAr(int capacity) {
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
        if (isEmpty())
            return null;
        return theArray[front];
    }

    /**
     * Return and remove the least recently inserted item from the queue.
     * @return the least recently inserted item in the queue, or null, if empty.
     */
    public Object dequeue() {
        if (isEmpty())
            return null;
        currentSize--;
        Object frontItem = theArray[front];
        theArray[front] = null;
        if (++front == theArray.length)
            front = 0;
        return frontItem;
    }

    /**
     * Insert a new item into the queue.
     * @param x the item to insert.
     * @exception Overflow if queue is full.
     */
    public void enqueue(Object x) throws Overflow {
        if (isFull())
            throw new Overflow();
        if (++back == theArray.length)
            back = 0;
        theArray[back] = x;
        currentSize++;
    }

    public void dequeueAll() {
        //invalid pre: (this.currentSize == 0 || this.currentSize == 1 || this.currentSize == 2) && (this.front == 0 || this.front == 1) && 
        if (!((this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.currentSize >= 0) && (this.front >= 0) && (this.back >= -1) && (this.currentSize <= size(this.theArray)) && (this.front <= size(this.theArray)) && (this.back <= size(this.theArray) - 1))) {
            return;
        }
        Object[] old_this_theArray_1 = new Object[this.theArray.length];
        System.arraycopy(this.theArray, 0, old_this_theArray_1, 0, this.theArray.length);
        Object old_this_theArray = this.theArray;
        int old_this_currentSize = this.currentSize;
        int old_this_back = this.back;
        int old_this_front = this.front;
        Object old_this = this.theArray.getClass().getName();
        while (!isEmpty()) {
            dequeue();
        }
        assert ((this.theArray == old_this_theArray) && (this.theArray.getClass().getName() == old_this) && (this.back == old_this_back) && (size(this.theArray) == size(old_this_theArray_1)) && (eltsEqual(this.theArray, null)) && (eltsEqual(typeArray(this.theArray), null)) && (this.currentSize == 0) && (this.currentSize <= this.front) && (this.currentSize <= old_this_currentSize) && (this.currentSize <= old_this_front) && (this.front >= old_this_front) && (old_this_currentSize <= size(this.theArray)) && (old_this_front <= size(this.theArray)) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.currentSize >= 0) && (this.front >= 0) && (this.back >= -1) && (this.currentSize <= size(this.theArray)) && (this.front <= size(this.theArray)) && (this.back <= size(this.theArray) - 1));
    }

    private Object[] theArray;

    private int currentSize;

    private int front;

    private int back;

    private int size(Object o) {
        if (o == null) {
            return Integer.MAX_VALUE; // return default value
        }
        java.lang.Class<?> c = o.getClass();
        if (c.isArray()) {
            return java.lang.reflect.Array.getLength(o);
        } else if (o instanceof Collection<?>) {
            return ((Collection<?>)o).size();
        } else {
            return Integer.MAX_VALUE; // return default value
        }
    }
    
    private int size(Collection<?> o) {
        if (o == null) {
            return Integer.MAX_VALUE; // return default value
        }
        return o.size();
    }

    private String[] typeArray(Object[] seq) {
        if (seq == null) {
            return null;
        }
        String[] retval = new String[seq.length];
        for (int i = 0 ; i < seq.length ; i++) {
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
            @SuppressWarnings({"unchecked"})
            AbstractCollection<Object> ac = (AbstractCollection<Object>)o;
            Object [] result = ac.toArray(new java.lang.Object []{});
            return result;
        } else if (o.getClass().isArray()) {
            return (Object[])o;
        } else {
            throw new IllegalArgumentException("not an array or collection: " + o);
        }
    }

    private boolean eltsEqual(String[] arr, String elt) {
        if (arr == null) {
            return false;
        }
        for (int i = 0 ; i < arr.length ; i++) {
            if (ne(arr[i], elt)) {
                return false;
            }
        }
        return true;
    }

    private boolean ne(String x, String y) {
        return x != y;
    }

    private boolean eltsEqual(Object arr, Object elt) {
        if (arr == null) {
            return false;
        }
        return eltsEqual(toObjArray(arr), elt);
    }

    private boolean eltsEqual(Object[] arr, Object elt) {
        if (arr == null) {
            return false;
        }
        for (int i = 0 ; i < arr.length ; i++) {
            if (ne(arr[i], elt)) {
                return false;
            }
        }
        return true;
    }

    private boolean ne(Object x, Object y) {
        return x != y;
    }
}
