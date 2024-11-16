package examples;

import java.lang.Math;

public class SimpleMethods {

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public int abs(final int x) {
        //invalid pre: (x == -1834 || x == 0) &&
        int old_x = x;
        final int i = x >>> 31;
        int result = (x ^ (~i + 1)) + i;
        if (!(((result == 0 || result == 1834)))) {
            int mm = 2;
            assert (3 > mm);
        }
        return result;
    }
}
