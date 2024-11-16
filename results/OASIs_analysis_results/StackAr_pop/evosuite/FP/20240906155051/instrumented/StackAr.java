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
        //invalid pre: (daikon.Quant.eltsEqual(this.theArray, null)) && (daikon.Quant.pairwiseEqual(daikon.Quant.typeArray(this.theArray), new String[] { null, null, null })) && (daikon.Quant.eltsEqual(daikon.Quant.typeArray(this.theArray), null)) && (this.topOfStack == 0) && (daikon.Quant.size(this.theArray) == 3) && (daikon.Quant.eltsEqual(this.theArray, daikon.Quant.getElement_Object(this.theArray, this.topOfStack))) && (this.topOfStack == -1 || this.topOfStack == 0 || this.topOfStack == 1) && 
        if (!((this != null) && (this.theArray != null) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.topOfStack <= size(this.theArray) - 1))) {
            return;
        }
        ;
        int old_this_topOfStack = this.topOfStack;
        Object[] old_this_theArray_1 = new Object[this.theArray.length];
        System.arraycopy(this.theArray, 0, old_this_theArray_1, 0, this.theArray.length);
        Object old_this_theArray = this.theArray;
        String old_this = this.theArray.getClass().getName();
        int old_topOfStack = topOfStack;
        if (isEmpty())
            throw new Underflow();
        theArray[topOfStack--] = null;
        if (!(((this.theArray == old_this_theArray) && (this.theArray.getClass().getName() == old_this) && (pairwiseEqual(this.theArray, old_this_theArray_1)) && (this.theArray != null) && (eltsEqual(this.theArray, null)) && (pairwiseEqual(typeArray(this.theArray), new String[] { null, null, null })) && (eltsEqual(typeArray(this.theArray), null)) && (this.topOfStack == -1) && (size(this.theArray) == 3) && (eltsEqual(this.theArray, getElement_Object(this.theArray, old_this_topOfStack))) && (this.theArray != null) && (this.theArray.getClass().getName() == java.lang.Object[].class.getName()) && (this.topOfStack == -1 || this.topOfStack == 0 || this.topOfStack == 1) && (this.topOfStack <= size(this.theArray) - 1)))) {
            int mm = 2;
            assert (3 > mm);
        }
        ;
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

    private boolean pairwiseEqual(String[] seq1, String[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        for (int i = 0; i < seq1.length; i++) {
            if (ne(seq1[i], seq2[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean sameLength(String[] seq1, String[] seq2) {
        return ((seq1 != null) && (seq2 != null) && seq1.length == seq2.length);
    }

    private boolean ne(String x, String y) {
        return x != y;
    }

    private boolean eltsEqual(String[] arr, String elt) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (ne(arr[i], elt)) {
                return false;
            }
        }
        return true;
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
        for (int i = 0; i < arr.length; i++) {
            if (ne(arr[i], elt)) {
                return false;
            }
        }
        return true;
    }

    private boolean pairwiseEqual(AbstractCollection<Object> seq1, AbstractCollection<Object> seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        // cast is redundant (except in JSR 308)
        @SuppressWarnings("cast") Object[] seq1a = (Object[]) seq1.toArray();
        Object[] seq2a = (Object[]) seq2.toArray();
        return pairwiseEqual(seq1a, seq2a);
    }

    private boolean pairwiseEqual(Object[] seq1, Object[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        for (int i = 0; i < seq1.length; i++) {
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
