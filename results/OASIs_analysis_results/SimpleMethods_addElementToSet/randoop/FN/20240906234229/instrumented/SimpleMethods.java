package examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class SimpleMethods {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    /**
     * Add element to non-null set
     * @param intSet set of integers
     * @param element integer value to add to set
     */
    public void addElementToSet(HashSet<Integer> intSet, int element) {
        if (intSet != null) {
            intSet.add(element);
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", (true));
        //instrumentation
        map0.put("element", element);
        //instrumentation
        map0.put("intSet", intSet);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
    }
}
