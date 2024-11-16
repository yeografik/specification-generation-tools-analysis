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

import java.math.BigInteger;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.exception.util.Localizable;
import java.util.Map;
import java.util.HashMap;

/**
 * Some useful, arithmetics related, additions to the built-in functions in
 * {@link Math}.
 */
public final class ArithmeticUtilsNew {

    //instrumentation
    private static Map<Integer, HashMap<String, Object>> instrMap = new HashMap<Integer, HashMap<String, Object>>();

    //instrumentation
    private static int jjj = 0;

    /**
     * Private constructor.
     */
    public  ArithmeticUtilsNew() {
    }

    /**
     * Subtract two long integers, checking for overflow.
     *
     * @param a Value.
     * @param b Value.
     * @return the difference {@code a - b}.
     * @throws MathArithmeticException if the result can not be represented as a
     * {@code long}.
     * @since 1.2
     */
    public long subAndCheck(long a, long b) throws IllegalArgumentException {
        long old_b = b;
        long old_a = a;
        long result;
        if (b == Long.MIN_VALUE) {
            if (a < 0) {
                result = a - b;
            } else {
                // throw new MathArithmeticException(LocalizedFormats.OVERFLOW_IN_ADDITION, a, -b);
                throw new IllegalArgumentException("didn't work");
            }
        } else {
            // use additive inverse
            result = addAndCheck(a, -b);
        }
        //instrumentation
        HashMap<String, Object> map0 = new HashMap<String, Object>();
        //instrumentation
        map0.put("assert_result0", ((result - old_a + old_b == 0)));
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

    /**
     * Add two long integers, checking for overflow.
     *
     * @param a Addend.
     * @param b Addend.
     * @param pattern Pattern to use for any thrown exception.
     * @return the sum {@code a + b}.
     * @throws MathArithmeticException if the result cannot be represented
     * as a {@code long}.
     * @since 1.2
     */
    private long addAndCheck(long a, long b) throws IllegalArgumentException {
        final long result = a + b;
        if (!((a ^ b) < 0 | (a ^ result) >= 0)) {
            throw new IllegalArgumentException("didn't work addAndCheck");
        }
        return result;
    }
}
