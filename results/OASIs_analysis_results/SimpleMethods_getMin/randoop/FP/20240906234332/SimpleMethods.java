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
        int old_b = b;
        int old_a = a;
        final int result;
        if (a <= b) {
            result = a;
        } else {
            result = b;
        }
        assert ((result <= old_a) && (result <= old_b));
        return result;
    }
}
