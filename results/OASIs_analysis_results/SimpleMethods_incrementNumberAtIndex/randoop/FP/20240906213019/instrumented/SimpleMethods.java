package examples;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Arrays;

public class SimpleMethods {

    /**
     * Increment the value of element in a non-null array at a given index
     * @param intArray array of integers
     * @param ind index at which the element will be incremented
     */
    public void incrementNumberAtIndex(int[] intArray, int ind) {
        if (!((intArray != null) && (ind >= 0) && (ind <= size(intArray) - 1))) {
            return;
        }
        int old_ind = ind;
        int[] old_intArray = new int[intArray.length];
        System.arraycopy(intArray, 0, old_intArray, 0, intArray.length);
        // instrumentation
        int old_value = intArray[ind];
        // actual method
        intArray[ind] = intArray[ind] + 1;
        if (!(((lexGT(intArray, old_intArray)) && (pairwiseGTE(intArray, old_intArray)) && (old_ind <= size(intArray) - 1) && (getElement_int(intArray, old_ind) - (getElement_int(old_intArray, old_ind)) - 1 == 0)))) {
            int mm = 2;
            assert (3 > mm);
        }
        ;
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

    private int getElement_int(int[] arr, long i) {
        if (arr == null) {
            // return default value
            return Integer.MAX_VALUE;
        }
        return arr[(int) i];
    }

    private boolean lexGT(int[] seq1, int[] seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        int minlength = (seq1.length < seq2.length) ? seq1.length : seq2.length;
        for (int i = 0; i < minlength; i++) {
            if (lt(seq1[i], seq2[i])) {
                return false;
            } else if (gt(seq1[i], seq2[i])) {
                return true;
            }
        }
        if (seq1.length <= seq2.length) {
            return false;
        }
        return true;
    }

    private boolean gt(int x, int y) {
        return x > y;
    }

    private boolean pairwiseGTE(int[] seq1, int[] seq2) {
        if (!sameLength(seq1, seq2)) {
            return false;
        }
        for (int i = 0; i < seq1.length; i++) {
            if (lt(seq1[i], seq2[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean sameLength(int[] seq1, int[] seq2) {
        return ((seq1 != null) && (seq2 != null) && seq1.length == seq2.length);
    }

    private boolean lt(int x, int y) {
        return x < y;
    }
}
