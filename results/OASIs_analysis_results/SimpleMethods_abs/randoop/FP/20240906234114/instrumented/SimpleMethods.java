package examples;

import java.lang.Math;

public class SimpleMethods {

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public int abs(final int x) {
        int old_x = x;
        final int i = x >>> 31;
        int result = (x ^ (~i + 1)) + i;
        if (!(((result >= 0) && (result >= old_x)))) {
            int mm = 2;
            assert (3 > mm);
        }
        return result;
    }
}
