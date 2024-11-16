/*
 * Copyright (C) 2011 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package math;

import java.util.Map;
import java.util.HashMap;

public final class IntMath {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    /**
     * Returns {@code x mod m}, a non-negative value less than {@code m}. This differs from {@code x %
     * m}, which might be negative.
     *
     * <p>For example:
     *
     * <pre>{@code
     * mod(7, 4) == 3
     * mod(-7, 4) == 1
     * mod(-1, 4) == 3
     * mod(-8, 4) == 0
     * mod(8, 4) == 0
     * }</pre>
     *
     * @throws ArithmeticException if {@code m <= 0}
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.3">
     *     Remainder Operator</a>
     */
    public int mod(int x, int m) {
        if (!((m >= 1))) {
            //instrumentation
            return 0;
        }
        if (m <= 0) {
            throw new ArithmeticException("Modulus " + m + " must be > 0");
        }
        int old_m = m;
        int result1 = x % m;
        int result;
        if (result1 >= 0) {
            result = result1;
        } else {
            result = result1 + m;
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((result >= 0) && (result < old_m)));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("result1", result1);
        //instrumentation
        map0.put("old_m", old_m);
        //instrumentation
        map0.put("m", m);
        //instrumentation
        map0.put("x", x);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        //instrumentation
        return result;
    }

    public  IntMath() {
    }
}
