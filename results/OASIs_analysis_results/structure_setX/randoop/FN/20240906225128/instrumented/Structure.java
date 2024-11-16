package examples;

import java.util.Map;
import java.util.HashMap;

public class Structure {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    private int var62;

    public  Structure() {
        clear();
    }

    public  Structure(int x) {
        var62 = ((x) + 1);
    }

    public void clear() {
        var62 = ((0) + 1);
    }

    public int foo() {
        return var62;
    }

    public void setX(int y) {
        int old_y = y;
        var62 = ((y) + 1);
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((this.var62 - old_y - 1 == 0)));
        //instrumentation
        map0.put("old_y", old_y);
        //instrumentation
        map0.put("y", y);
        //instrumentation
        map0.put("this.var62", this.var62);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
    }
}
