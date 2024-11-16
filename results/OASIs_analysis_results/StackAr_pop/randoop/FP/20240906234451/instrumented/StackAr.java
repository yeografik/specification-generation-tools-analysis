package DataStructures;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Arrays;

/**
 * Array-based implementation of the stack.
 * @author Mark Allen Weiss
 */
public class StackAr {

    /**
     * Construct the stack.
     * @param capacity the capacity.
     */
    public  StackAr(int capacity) {
        theArray = new Object[capacity];
        topOfStack = -1;
    }

    /**
     * Test if the stack is logically empty.
     * @return true if empty, false otherwise.
     * @observer // annotation added by Jeremy
     */
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    /**
     * Test if the stack is logically full.
     * @return true if full, false otherwise.
     * @observer // annotation added by Jeremy
     */
    public boolean isFull() {
        return topOfStack == theArray.length - 1;
    }

    /**
     * Make the stack logically empty.
     */
    public void makeEmpty() {
        java.util.Arrays.fill(theArray, 0, topOfStack + 1, null);
        topOfStack = -1;
    }

    /**
     * Get the most recently inserted item in the stack.
     * Does not alter the stack.
     * @return the most recently inserted item in the stack, or null, if empty.
     * @observer // annotation added by Jeremy
     */
    public Object top() {
        if (isEmpty())
            return null;
        return theArray[topOfStack];
    }

    /**
     * Remove the most recently inserted item from the stack.
     * @exception Underflow if stack is already empty.
     */
    public void pop() throws Underflow {
        //invalid pre: (this.topOfStack == 0 || this.topOfStack == 1 || this.topOfStack == 2) && 
        if (!((size(this.theArray) >= 1) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.topOfStack >= -1) && (this.topOfStack <= size(this.theArray) - 1))) {
            return;
        }
        Object[] old_this_theArray_1 = new Object[this.theArray.length];
        System.arraycopy(this.theArray, 0, old_this_theArray_1, 0, this.theArray.length);
        int old_this_topOfStack = this.topOfStack;
        Object old_this_theArray = this.theArray;
        Object old_this = this.theArray.getClass().getName();
        int old_topOfStack = topOfStack;
        if (isEmpty())
            throw new Underflow();
        theArray[topOfStack--] = null;
        if (!(((this.theArray == old_this_theArray) && (this.theArray.getClass().getName() == old_this) && (size(this.theArray) == size(old_this_theArray_1)) && (this.topOfStack == -1 || this.topOfStack == 0 || this.topOfStack == 1) && (size(this.theArray) >= 1) && (getElement_Object(this.theArray, old_this_topOfStack) == null) && (this.topOfStack < old_this_topOfStack) && (this.topOfStack < size(this.theArray) - 1) && (old_this_topOfStack <= size(this.theArray) - 1) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.topOfStack >= -1) && (this.topOfStack <= size(this.theArray) - 1)))) {
            int mm = 2;
            assert (3 > mm);
        }
    }

    /**
     * Insert a new item into the stack, if not already full.
     * @param x the item to insert.
     * @exception Overflow if stack is already full.
     */
    public void push(Object x) throws Overflow {
        if (isFull())
            throw new Overflow();
        theArray[++topOfStack] = x;
    }

    /**
     * Return and remove most recently inserted item from the stack.
     * @return most recently inserted item, or null, if stack is empty.
     */
    public Object topAndPop() {
        if (isEmpty())
            return null;
        Object topItem = top();
        theArray[topOfStack--] = null;
        return topItem;
    }

    private Object[] theArray;

    private int topOfStack;

    private Object[] copy() {
        Object[] newArray = new Object[this.theArray.length];
        for (int i = 0; i < this.theArray.length; i++) newArray[i] = this.theArray[i];
        return newArray;
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
}
