/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jts;

import java.util.Map;
import java.util.HashMap;

/**
 * <p>Operations on boolean primitives and Boolean objects.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 2.0
 */
public class Angle {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    /**
     * Returns whether an angle must turn clockwise or counterclockwise
     * to overlap another angle.
     *
     * @param ang1 an angle (in radians)
     * @param ang2 an angle (in radians)
     * @return whether a1 must turn CLOCKWISE, COUNTERCLOCKWISE or NONE to
     * overlap a2.
     */
    public static int getTurn(double ang1, double ang2) {
        //invalid pre: daikon.Quant.fuzzy.eq(ang1, -167.29857535600271) || daikon.Quant.fuzzy.eq(ang1, 0.0)) && (daikon.Quant.fuzzy.eq(ang2, -167.29857535600271) || daikon.Quant.fuzzy.eq(ang2, 1.0)) &&
        double crossproduct = Math.sin(ang2 - ang1);
        int result;
        if (crossproduct > 0) {
            result = 1;
        } else if (crossproduct < 0) {
            result = -1;
        } else {
            result = 0;
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((result == -1 || result == 0 || result == 1)));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("crossproduct", crossproduct);
        //instrumentation
        map0.put("ang2", ang2);
        //instrumentation
        map0.put("ang1", ang1);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        //instrumentation
        return result;
    }
}
