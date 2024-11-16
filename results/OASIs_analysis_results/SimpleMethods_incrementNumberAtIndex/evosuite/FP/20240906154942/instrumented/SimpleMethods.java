package examples;

import java.util.Arrays;

public class SimpleMethods {

    /**
     * Increment the value of element in a non-null array at a given index
     * @param intArray array of integers
     * @param ind index at which the element will be incremented
     */
    public void incrementNumberAtIndex(int[] intArray, int ind) {
        //invalid pre: (daikon.Quant.pairwiseEqual(intArray, new int[] { -144, 0, 0, 0, 0, 0 }) && (daikon.Quant.subsetOf(intArray, new long[] { -144, 0 })) && (ind == 0) && (daikon.Quant.size(intArray) == 6) && (daikon.Quant.getElement_int(intArray, ind) == -144) && 
        if (!((this != null) && (intArray != null))) {
            return;
        }
        ;
        int old_ind = ind;
        // instrumentation
        int old_value = intArray[ind];
        // actual method
        intArray[ind] = intArray[ind] + 1;
        if (!((pairwiseEqual(intArray, new int[] { -143, 0, 0, 0, 0, 0 }) && (subsetOf(intArray, new long[] { -143, 0 })) && (getElement_int(intArray, old_ind) == -143)))) {
            int mm = 2;
            assert (3 > mm);
        }
        ;
    }

    private boolean pairwiseEqual(int[] seq1, int[] seq2) {
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

    private boolean sameLength(int[] seq1, int[] seq2) {
        return ((seq1 != null) && (seq2 != null) && seq1.length == seq2.length);
    }

    private boolean ne(int x, int y) {
        return x != y;
    }

    private boolean subsetOf(int[] seq1, long[] seq2) {
        if (seq1 == null) {
            return false;
        }
        if (seq2 == null) {
            return false;
        }
        for (int i = 0; i < seq1.length; i++) {
            if (!memberOf(seq1[i], seq2)) {
                return false;
            }
        }
        return true;
    }

    private boolean memberOf(int elt, long[] arr) {
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

    private boolean eq(long x, long y) {
        return x == y;
    }

    private boolean eq(int x, int y) {
        return x == y;
    }

    private int getElement_int(int[] arr, long i) {
        if (arr == null) {
            // return default value
            return Integer.MAX_VALUE;
        }
        return arr[(int) i];
    }
}
