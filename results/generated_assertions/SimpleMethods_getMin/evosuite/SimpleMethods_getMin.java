package examples;

public class SimpleMethods {

    /**
     * Compute the minimum of two values
     *
     * @param a first value
     * @param b second value
     * @return a if a is lesser or equal to b, b otherwise
     */
    public int getMin(final int a, final int b) {
        //invalid pre: (a == -1134 || a == 0 || a == 3112) && (b == 0 || b == 1159) && 
        final int result;
        if (a <= b) {
            result = a;
        } else {
            result = b;
        }
        assert ((result == -1134 || result == 0 || result == 1159));
        return result;
    }
}
