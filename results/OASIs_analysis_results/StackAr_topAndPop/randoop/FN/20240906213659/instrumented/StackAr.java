package DataStructures;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * Array-based implementation of the stack.
 * @author Mark Allen Weiss
 */
public class StackAr {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

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
        if (isEmpty())
            throw new Underflow();
        theArray[topOfStack--] = null;
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
        //invalid pre: (this.topOfStack == -1 || this.topOfStack == 0 || this.topOfStack == 1) && 
        if (!((this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.topOfStack >= -1) && (this.topOfStack <= size(this.theArray) - 1))) {
            //instrumentation
            return null;
        }
        Object[] old_this_theArray_1 = new Object[this.theArray.length];
        System.arraycopy(this.theArray, 0, old_this_theArray_1, 0, this.theArray.length);
        int old_this_topOfStack = this.topOfStack;
        Object old_this_theArray = this.theArray;
        Object old_this = this.theArray.getClass().getName();
        int old_topOfStack = topOfStack;
        Object old_top = top();
        Object result;
        if (isEmpty()) {
            result = null;
        } else {
            result = top();
            theArray[topOfStack--] = null;
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((this.theArray == old_this_theArray) && (this.theArray.getClass().getName() == old_this) && (size(this.theArray) == size(old_this_theArray_1)) && (this.topOfStack == -1 || this.topOfStack == 0) && (this.theArray.getClass().getName() != result.getClass().getName()) && (this.topOfStack <= old_this_topOfStack) && (memberOf(result.getClass().getName(), typeArray(old_this_theArray_1))) && (old_this_topOfStack <= size(this.theArray) - 1) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.topOfStack >= -1) && (this.topOfStack <= size(this.theArray) - 1)));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("old_top", old_top);
        //instrumentation
        map0.put("old_topOfStack", old_topOfStack);
        //instrumentation
        map0.put("old_this", old_this);
        //instrumentation
        map0.put("old_this_theArray", old_this_theArray);
        //instrumentation
        map0.put("old_this_topOfStack", old_this_topOfStack);
        //instrumentation
        map0.put("old_this_theArray_1", old_this_theArray_1);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        ;
        //instrumentation
        return result;
    }

    private Object[] theArray;

    private int topOfStack;

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
