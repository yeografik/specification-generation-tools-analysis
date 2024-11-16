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
public class Envelope {

    /**
     *   Creates an <code>Envelope</code> for a region defined by maximum and minimum values.
     *
     * @param  x1  the first x-value
     * @param  x2  the second x-value
     * @param  y1  the first y-value
     * @param  y2  the second y-value
     */
    public Envelope(double x1, double x2, double y1, double y2) {
        init(x1, x2, y1, y2);
    }

    /**
     *   Initialize an <code>Envelope</code> for a region defined by maximum and minimum values.
     *
     * @param  x1  the first x-value
     * @param  x2  the second x-value
     * @param  y1  the first y-value
     * @param  y2  the second y-value
     */
    public void init(double x1, double x2, double y1, double y2) {
        if (x1 < x2) {
            minx = x1;
            maxx = x2;
        } else {
            minx = x2;
            maxx = x1;
        }
        if (y1 < y2) {
            miny = y1;
            maxy = y2;
        } else {
            miny = y2;
            maxy = y1;
        }
    }

    /**
     *  the minimum x-coordinate
     */
    private double minx;

    /**
     *  the maximum x-coordinate
     */
    private double maxx;

    /**
     *  the minimum y-coordinate
     */
    private double miny;

    /**
     *  the maximum y-coordinate
     */
    private double maxy;

    /**
     * Gets the maximum extent of this envelope across both dimensions.
     *
     * @return the maximum extent of this envelope
     */
    public double maxExtent() {
        if (!((lte(this.minx, this.maxx)) && (lte(this.miny, this.maxy)))) {
            return 0.0;
        }
        double old_this_maxx_1 = this.maxx;
        double old_this_maxy_1 = this.maxy;
        double old_this_minx_1 = this.minx;
        double old_this_miny_1 = this.miny;
        // instrumentation
        double old_this_minx = this.minx;
        // instrumentation
        double old_this_maxx = this.maxx;
        // instrumentation
        double old_this_miny = this.miny;
        // instrumentation
        double old_this_maxy = this.maxy;
        // instrumentation
        boolean old_this_isEnvelopeNull = this.isEnvelopeNull();
        // instrumentation
        double old_this_getWidth = this.getWidth();
        // instrumentation
        double old_this_getHeight = this.getHeight();
        double result;
        if (isEnvelopeNull()) {
            result = 0.0;
        } else {
            double w = getWidth();
            double h = getHeight();
            if (w > h) {
                result = w;
            } else {
                result = h;
            }
        }
        assert ((eq(this.minx, old_this_minx_1)) && (eq(this.maxx, old_this_maxx_1)) && (eq(this.miny, old_this_miny_1)) && (eq(this.maxy, old_this_maxy_1)) && (ne(this.minx, result)) && (lte(this.minx, this.maxx)) && (lte(this.miny, this.maxy)));
        return result;
    }

    /**
     *   Returns <code>true</code> if this <code>Envelope</code> is a "null"
     *   envelope.
     *
     * @return    <code>true</code> if this <code>Envelope</code> is uninitialized
     *       or is the envelope of the empty geometry.
     */
    public boolean isEnvelopeNull() {
        return maxx < minx;
    }

    /**
     *   Returns the difference between the maximum and minimum x values.
     *
     * @return    max x - min x, or 0 if this is a null <code>Envelope</code>
     */
    public double getWidth() {
        if (isEnvelopeNull()) {
            return 0;
        }
        return maxx - minx;
    }

    /**
     *   Returns the difference between the maximum and minimum y values.
     *
     * @return    max y - min y, or 0 if this is a null <code>Envelope</code>
     */
    public double getHeight() {
        if (isEnvelopeNull()) {
            return 0;
        }
        return maxy - miny;
    }

    private boolean ne(double d1, double d2) {
        return !eq(d1, d2);
    }

    private boolean lte(double d1, double d2) {
        return (d1 <= d2) || eq(d1, d2);
    }
    
    private boolean eq(double d1, double d2) {
        double DEFAULT_RELATIVE_RATIO = .0001;
        double minRatio = 1 - DEFAULT_RELATIVE_RATIO;
        double maxRatio = 1 + DEFAULT_RELATIVE_RATIO;
        boolean exactComparisons = (DEFAULT_RELATIVE_RATIO == 0.0);
    
    
        // NaNs are not considered equal.
        if (Double.isNaN(d1) && Double.isNaN(d2)) {
            return false;
        }
    
        // if zero was specified for a ratio, don't do the divide.  You might
        // get slightly different answers.  And this should be faster.
        if (exactComparisons) {
            return d1 == d2;
        }
    
        // slightly more efficient for matches and catches positive and negative
        // infinity (which match in this test, but not below)
        if (d1 == d2) {
            return true;
        }
    
        // When one number is 0, require that the other is less than the square of the fuzzy ratio.
        // This heuristic accommodates roundoff errors in floating-point values.
    
        if (d1 == 0.0 || d2 == 0.0) {
    
        double zeroTolerance = Math.pow((maxRatio - 1), 2);
    
        if (d1 == 0.0) {
    
            return Math.abs(d2) < zeroTolerance;
    
        } else {
    
            return Math.abs(d1) < zeroTolerance;
        }
        }
    
        double ratio = d1 / d2;
        return (ratio >= minRatio) && (ratio <= maxRatio);
    }
}
