package examples;

import java.util.Map;
import java.util.HashMap;

public class SimpleMethods {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

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
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((result <= old_a) && (result <= old_b)));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("old_a", old_a);
        //instrumentation
        map0.put("old_b", old_b);
        //instrumentation
        map0.put("b", b);
        //instrumentation
        map0.put("a", a);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        //instrumentation
        return result;
    }
}
