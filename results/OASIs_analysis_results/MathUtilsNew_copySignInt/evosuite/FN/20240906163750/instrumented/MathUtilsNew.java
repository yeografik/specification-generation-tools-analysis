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
package org.apache.commons.math3.util;

import java.util.Arrays;
import org.apache.commons.math3.exception.MathArithmeticException;
import java.util.Map;
import java.util.HashMap;

/**
 * Miscellaneous utility functions.
 *
 * @see ArithmeticUtils
 * @see Precision
 * @see MathArrays
 */
public final class MathUtilsNew {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    public static int copySignInt(int magnitude, int sign) throws MathArithmeticException {
        int result;
        if ((magnitude >= 0 && sign >= 0) || (magnitude < 0 && sign < 0)) {
            // Sign is OK.
            result = magnitude;
        } else if (sign >= 0 && magnitude == Integer.MIN_VALUE) {
            // throw new MathArithmeticException(LocalizedFormats.OVERFLOW);
            throw new IllegalArgumentException("didn't work");
        } else {
            // Flip sign.
            result = -magnitude;
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", (true));
        //instrumentation
        map0.put("result", result);
        //instrumentation
        map0.put("sign", sign);
        //instrumentation
        map0.put("magnitude", magnitude);
        //instrumentation
        instrMap.put(jjj, map0);
        //instrumentation
        jjj = jjj + 1;
        //instrumentation
        return result;
    }
}
