package examples;

import java.lang.Math;
import java.util.Map;
import java.util.HashMap;

public class SimpleMethods {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    /**
     * Absolute value.
     * @param x number from which absolute value is requested
     * @return abs(x)
     */
    public int abs(final int x) {
        int old_x = x;
        final int i = x >>> 31;
        int result = (x ^ (~i + 1)) + i;
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((result >= 0) && (result >= old_x)));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("i", i);
        //instrumentation
        map0.put("old_x", old_x);
        //instrumentation
        map0.put("x", x);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        //instrumentation
        return result;
    }
}
