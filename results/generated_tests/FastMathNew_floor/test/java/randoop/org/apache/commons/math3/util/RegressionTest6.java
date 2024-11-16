package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((-3.8d));
        double double14 = fastMathNew0.floor(1.2d);
        double double16 = fastMathNew0.floor(3.1d);
        double double18 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-11.0d) + "'", double18 == (-11.0d));
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 8L);
        double double14 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) (-10L));
        double double16 = fastMathNew0.floor(10.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 1L);
        double double12 = fastMathNew0.floor((double) (short) 10);
        double double14 = fastMathNew0.floor((double) (-7L));
        double double16 = fastMathNew0.floor((double) (-6));
        double double18 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-11.0d) + "'", double18 == (-11.0d));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor(8.4d);
        double double16 = fastMathNew0.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (short) 0);
        double double14 = fastMathNew0.floor(4.8d);
        double double16 = fastMathNew0.floor(3.1d);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor(7.1d);
        double double22 = fastMathNew0.floor((double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 5.0d + "'", double22 == 5.0d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((-1.2d));
        double double10 = fastMathNew0.floor((-5.4d));
        double double12 = fastMathNew0.floor((double) (short) 1);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((-100.0d));
        double double18 = fastMathNew0.floor((double) 100.0f);
        double double20 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (-3L));
        double double20 = fastMathNew0.floor((double) (-9L));
        double double22 = fastMathNew0.floor((-10.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-10.0d) + "'", double22 == (-10.0d));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((double) (-6));
        double double14 = fastMathNew0.floor((double) (short) 10);
        double double16 = fastMathNew0.floor((double) 0);
        double double18 = fastMathNew0.floor((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1.0f));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor(32.0d);
        double double18 = fastMathNew0.floor((double) (-2L));
        double double20 = fastMathNew0.floor((double) 6);
        double double22 = fastMathNew0.floor((double) (-4L));
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.0d) + "'", double18 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor((double) (-9L));
        double double14 = fastMathNew0.floor(4.8d);
        double double16 = fastMathNew0.floor((-8.0d));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (byte) 0);
        double double8 = fastMathNew0.floor((double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor((-10.0d));
        double double20 = fastMathNew0.floor((double) 6L);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((-1.0d));
        double double8 = fastMathNew0.floor(2.7d);
        double double10 = fastMathNew0.floor((-2.0d));
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor(2.7d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor((-2.1d));
        double double22 = fastMathNew0.floor((-8.0d));
        double double24 = fastMathNew0.floor((double) '4');
        double double26 = fastMathNew0.floor((double) 2L);
        java.lang.Class<?> wildcardClass27 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.0d) + "'", double20 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-8.0d) + "'", double22 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.0d + "'", double26 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((-10.0d));
        double double18 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((double) 10);
        double double10 = fastMathNew0.floor((-8.0d));
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor((-2.0d));
        double double16 = fastMathNew0.floor((double) 0.0f);
        double double18 = fastMathNew0.floor((-8.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) (-10L));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) (-1L));
        double double6 = fastMathNew0.floor((-11.0d));
        double double8 = fastMathNew0.floor(5.3d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor(9.6d);
        double double12 = fastMathNew0.floor((double) (short) -1);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) (short) 10);
        double double18 = fastMathNew0.floor((double) (-4L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((double) (-5L));
        double double18 = fastMathNew0.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.0d) + "'", double16 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((-7.3d));
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((double) 0);
        double double22 = fastMathNew0.floor((double) 'a');
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 10);
        double double14 = fastMathNew0.floor(7.0d);
        double double16 = fastMathNew0.floor((double) 5L);
        double double18 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(8.0d);
        double double12 = fastMathNew0.floor((-6.9d));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor((double) (-6L));
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor(6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) 10);
        double double14 = fastMathNew0.floor((double) 100.0f);
        double double16 = fastMathNew0.floor((double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((double) '#');
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(9.6d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (byte) 10);
        double double10 = fastMathNew0.floor(10.5d);
        double double12 = fastMathNew0.floor((double) (short) 100);
        double double14 = fastMathNew0.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-7L));
        double double16 = fastMathNew0.floor((double) (-10));
        double double18 = fastMathNew0.floor(9.6d);
        double double20 = fastMathNew0.floor(5.3d);
        double double22 = fastMathNew0.floor((double) (-1L));
        double double24 = fastMathNew0.floor(8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.0d + "'", double24 == 8.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor((double) 100);
        double double16 = fastMathNew0.floor((double) 1L);
        double double18 = fastMathNew0.floor((double) 3);
        double double20 = fastMathNew0.floor((double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(8.0d);
        double double12 = fastMathNew0.floor((double) 1.0f);
        double double14 = fastMathNew0.floor((double) 2L);
        double double16 = fastMathNew0.floor((-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((double) 0);
        double double16 = fastMathNew0.floor((double) (byte) 100);
        double double18 = fastMathNew0.floor((double) (-6L));
        double double20 = fastMathNew0.floor((double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((-2.1d));
        double double10 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor(7.1d);
        double double10 = fastMathNew0.floor((double) (-8));
        double double12 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 7L);
        double double8 = fastMathNew0.floor((double) (-5));
        double double10 = fastMathNew0.floor((double) (-100));
        double double12 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) 10);
        double double10 = fastMathNew0.floor((-5.0d));
        double double12 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-5.0d) + "'", double10 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) 100L);
        double double8 = fastMathNew0.floor(10.0d);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (-1));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1.0f));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((double) (-2));
        double double16 = fastMathNew0.floor((double) 6L);
        double double18 = fastMathNew0.floor((double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((-3.8d));
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (short) 10);
        double double20 = fastMathNew0.floor(52.0d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((-100.0d));
        double double10 = fastMathNew0.floor(4.0d);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 7);
        double double16 = fastMathNew0.floor(3.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((double) 0L);
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((-6.0d));
        double double10 = fastMathNew0.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-6.0d) + "'", double8 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) (-9));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(10.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (-6L));
        double double20 = fastMathNew0.floor((double) ' ');
        double double22 = fastMathNew0.floor((double) (-4L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor((double) 10L);
        double double6 = fastMathNew0.floor((double) (-5));
        double double8 = fastMathNew0.floor((double) (short) 10);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 7L);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-5.0d) + "'", double6 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1L));
        double double12 = fastMathNew0.floor((double) 9);
        double double14 = fastMathNew0.floor((-4.6d));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((-10.0d));
        double double10 = fastMathNew0.floor((double) 8L);
        double double12 = fastMathNew0.floor(9.6d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (-100));
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((-6.0d));
        double double14 = fastMathNew0.floor((-6.0d));
        double double16 = fastMathNew0.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-6.0d) + "'", double14 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor((double) 3L);
        double double14 = fastMathNew0.floor((double) (-5));
        double double16 = fastMathNew0.floor((double) (-10L));
        double double18 = fastMathNew0.floor((double) (-4L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 1L);
        double double12 = fastMathNew0.floor((double) (-4));
        double double14 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 7L);
        double double8 = fastMathNew0.floor((-5.0d));
        double double10 = fastMathNew0.floor((-3.0d));
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor((-5.0d));
        double double16 = fastMathNew0.floor((double) (short) 100);
        double double18 = fastMathNew0.floor(2.7d);
        double double20 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((double) 4L);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) (-9));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor((double) 'a');
        double double18 = fastMathNew0.floor((-9.3d));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor(8.4d);
        double double14 = fastMathNew0.floor((-2.0d));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor(1.0d);
        double double20 = fastMathNew0.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(3.1d);
        double double10 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((-10.5d));
        double double16 = fastMathNew0.floor((double) (-10L));
        double double18 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-11.0d) + "'", double14 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((-1.0d));
        double double10 = fastMathNew0.floor((double) (short) 10);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor(100.0d);
        double double16 = fastMathNew0.floor((double) (-100));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 4L);
        double double6 = fastMathNew0.floor((double) (-6));
        double double8 = fastMathNew0.floor((double) 6L);
        double double10 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.0d + "'", double8 == 6.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor((double) (short) -1);
        double double12 = fastMathNew0.floor(3.1d);
        double double14 = fastMathNew0.floor((double) (short) 0);
        double double16 = fastMathNew0.floor((double) 4L);
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((-3.8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((-3.8d));
        double double10 = fastMathNew0.floor((double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) '4');
        double double18 = fastMathNew0.floor(5.0d);
        double double20 = fastMathNew0.floor((double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor((double) 7);
        double double22 = fastMathNew0.floor(4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((double) 1L);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) 100.0f);
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((double) (-5));
        double double12 = fastMathNew0.floor(100.0d);
        double double14 = fastMathNew0.floor((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-5.0d) + "'", double10 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((-10.5d));
        double double6 = fastMathNew0.floor((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-11.0d) + "'", double4 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((-4.0d));
        double double12 = fastMathNew0.floor((double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor((-8.0d));
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor(100.0d);
        double double16 = fastMathNew0.floor((double) 5L);
        double double18 = fastMathNew0.floor((-2.1d));
        double double20 = fastMathNew0.floor((double) (short) 10);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor((double) 1L);
        double double8 = fastMathNew0.floor((-9.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((-1.0d));
        double double8 = fastMathNew0.floor((-9.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor((double) (-3));
        double double14 = fastMathNew0.floor((double) (short) 100);
        double double16 = fastMathNew0.floor((-1.2d));
        double double18 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(6.9d);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((-1.0d));
        double double12 = fastMathNew0.floor(52.0d);
        double double14 = fastMathNew0.floor((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (byte) 0);
        double double4 = fastMathNew0.floor((double) '#');
        double double6 = fastMathNew0.floor((double) 4L);
        double double8 = fastMathNew0.floor((double) (-1L));
        double double10 = fastMathNew0.floor((double) (-100));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor(9.6d);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (-5L));
        double double16 = fastMathNew0.floor((double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor(35.0d);
        double double16 = fastMathNew0.floor((double) 0);
        double double18 = fastMathNew0.floor((double) (byte) -1);
        double double20 = fastMathNew0.floor((double) (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-6.0d) + "'", double20 == (-6.0d));
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(9.6d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor(8.4d);
        double double14 = fastMathNew0.floor((-2.0d));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((-10.0d));
        double double22 = fastMathNew0.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-10.0d) + "'", double20 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor(52.0d);
        double double16 = fastMathNew0.floor((double) 100.0f);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor((-10.0d));
        double double12 = fastMathNew0.floor((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((-7.3d));
        double double16 = fastMathNew0.floor((double) (short) 100);
        double double18 = fastMathNew0.floor(8.0d);
        double double20 = fastMathNew0.floor((double) (-10L));
        double double22 = fastMathNew0.floor((double) 9L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-10.0d) + "'", double20 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.0d + "'", double22 == 9.0d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 8);
        double double10 = fastMathNew0.floor((double) 100.0f);
        double double12 = fastMathNew0.floor((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-1.0f));
        double double14 = fastMathNew0.floor((-6.0d));
        double double16 = fastMathNew0.floor(7.1d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-6.0d) + "'", double14 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor(32.0d);
        double double16 = fastMathNew0.floor((double) ' ');
        double double18 = fastMathNew0.floor((double) 9);
        double double20 = fastMathNew0.floor((double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((-6.0d));
        java.lang.Class<?> wildcardClass5 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-6.0d) + "'", double4 == (-6.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((double) '#');
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(8.4d);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) (-10L));
        double double16 = fastMathNew0.floor((-7.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor((-10.0d));
        double double12 = fastMathNew0.floor((-5.4d));
        double double14 = fastMathNew0.floor((double) 6L);
        double double16 = fastMathNew0.floor((double) (-10));
        double double18 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) '4');
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((double) 7L);
        double double18 = fastMathNew0.floor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1.0f));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-11.0d) + "'", double14 == (-11.0d));
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((double) 4);
        double double12 = fastMathNew0.floor((-2.1d));
        double double14 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((-6.0d));
        double double14 = fastMathNew0.floor((double) (-4L));
        double double16 = fastMathNew0.floor((double) (-10L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) (byte) 10);
        double double8 = fastMathNew0.floor((double) (-4L));
        double double10 = fastMathNew0.floor((-100.0d));
        double double12 = fastMathNew0.floor((double) (byte) 0);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor(32.0d);
        double double10 = fastMathNew0.floor((double) (byte) 1);
        double double12 = fastMathNew0.floor(2.0d);
        double double14 = fastMathNew0.floor(10.0d);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((-10.5d));
        double double14 = fastMathNew0.floor(10.5d);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-11.0d) + "'", double12 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((double) (short) 1);
        double double6 = fastMathNew0.floor((double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((double) '4');
        double double12 = fastMathNew0.floor((double) 9);
        double double14 = fastMathNew0.floor((double) (-10L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor((double) 10.0f);
        double double20 = fastMathNew0.floor((double) 2);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) (short) 100);
        double double14 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor((double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((double) 100);
        double double6 = fastMathNew0.floor((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1L));
        double double12 = fastMathNew0.floor((double) (-4));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((double) 4L);
        double double14 = fastMathNew0.floor((-11.0d));
        double double16 = fastMathNew0.floor((double) 4L);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor(97.0d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-11.0d) + "'", double14 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((-5.4d));
        double double14 = fastMathNew0.floor((-6.9d));
        double double16 = fastMathNew0.floor((-3.8d));
        double double18 = fastMathNew0.floor((double) (-10L));
        double double20 = fastMathNew0.floor((-4.0d));
        double double22 = fastMathNew0.floor(1.2d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((-100.0d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor((-9.3d));
        double double16 = fastMathNew0.floor((double) 0.0f);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((double) (-5));
        double double22 = fastMathNew0.floor((double) 2);
        double double24 = fastMathNew0.floor(7.0d);
        java.lang.Class<?> wildcardClass25 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-5.0d) + "'", double20 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor(32.0d);
        double double16 = fastMathNew0.floor((double) 10.0f);
        double double18 = fastMathNew0.floor(8.4d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (byte) 0);
        double double4 = fastMathNew0.floor((-8.7d));
        double double6 = fastMathNew0.floor((-8.7d));
        double double8 = fastMathNew0.floor(9.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor((-10.0d));
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 1L);
        double double12 = fastMathNew0.floor((double) (short) 10);
        double double14 = fastMathNew0.floor((-7.0d));
        double double16 = fastMathNew0.floor((double) (byte) 10);
        double double18 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) 3);
        double double12 = fastMathNew0.floor((double) 100.0f);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor(3.1d);
        double double18 = fastMathNew0.floor((double) (-10L));
        double double20 = fastMathNew0.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((-10.5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-11.0d) + "'", double16 == (-11.0d));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((double) 100.0f);
        double double16 = fastMathNew0.floor((double) 2L);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor(7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.0d + "'", double18 == 7.0d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((-5.4d));
        double double8 = fastMathNew0.floor((double) (short) 0);
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) (byte) 10);
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor((double) (-9));
        double double18 = fastMathNew0.floor((double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.0d + "'", double18 == 7.0d);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor((double) (-8));
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) (-6L));
        double double14 = fastMathNew0.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((-1.0d));
        double double10 = fastMathNew0.floor((double) (short) 10);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor(100.0d);
        double double16 = fastMathNew0.floor((double) 10L);
        double double18 = fastMathNew0.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 0);
        double double6 = fastMathNew0.floor((double) 6);
        java.lang.Class<?> wildcardClass7 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((-2.0d));
        double double8 = fastMathNew0.floor((double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-2.0d) + "'", double6 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor((double) (-100));
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((double) 10);
        double double12 = fastMathNew0.floor(32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor(3.1d);
        double double20 = fastMathNew0.floor((double) (-2));
        double double22 = fastMathNew0.floor((double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.0d) + "'", double20 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((-3.0d));
        double double12 = fastMathNew0.floor((double) (byte) 1);
        double double14 = fastMathNew0.floor((double) 1);
        double double16 = fastMathNew0.floor((-9.3d));
        double double18 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((double) (-6));
        double double14 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 10L);
        double double6 = fastMathNew0.floor((double) (-8L));
        double double8 = fastMathNew0.floor((double) 6L);
        double double10 = fastMathNew0.floor((double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.0d + "'", double8 == 6.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor((double) '4');
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((-8.7d));
        double double16 = fastMathNew0.floor(52.0d);
        double double18 = fastMathNew0.floor((double) (byte) 10);
        double double20 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1.0f));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) (short) 100);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor((double) (-100));
        double double18 = fastMathNew0.floor((double) 0);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((double) 0);
        double double16 = fastMathNew0.floor((double) 1L);
        double double18 = fastMathNew0.floor((double) 3);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor((-8.0d));
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor((double) (-9));
        double double16 = fastMathNew0.floor((-8.7d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor((-10.0d));
        double double20 = fastMathNew0.floor((double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.0d + "'", double20 == 9.0d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-7L));
        double double16 = fastMathNew0.floor((double) 2);
        double double18 = fastMathNew0.floor((double) 'a');
        double double20 = fastMathNew0.floor((double) 2);
        double double22 = fastMathNew0.floor((double) ' ');
        double double24 = fastMathNew0.floor((-3.0d));
        double double26 = fastMathNew0.floor((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.0d) + "'", double24 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 3);
        double double12 = fastMathNew0.floor((double) 2L);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) 5L);
        double double18 = fastMathNew0.floor((double) (-3L));
        double double20 = fastMathNew0.floor((double) (-1.0f));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 10);
        double double16 = fastMathNew0.floor((double) (-6L));
        double double18 = fastMathNew0.floor((double) (-4L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) (byte) 100);
        double double6 = fastMathNew0.floor((double) 7L);
        java.lang.Class<?> wildcardClass7 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(9.6d);
        double double18 = fastMathNew0.floor((-7.0d));
        double double20 = fastMathNew0.floor(52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(9.6d);
        double double6 = fastMathNew0.floor((-8.7d));
        double double8 = fastMathNew0.floor((double) 3);
        double double10 = fastMathNew0.floor(5.0d);
        double double12 = fastMathNew0.floor((double) 4L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((double) 10);
        double double10 = fastMathNew0.floor((-8.0d));
        double double12 = fastMathNew0.floor((-4.6d));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) '#');
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (-8));
        double double20 = fastMathNew0.floor((double) (-4L));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(9.6d);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) (-9L));
        double double18 = fastMathNew0.floor(10.5d);
        double double20 = fastMathNew0.floor((double) (-100L));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-100.0d) + "'", double20 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor(8.0d);
        double double20 = fastMathNew0.floor(10.5d);
        double double22 = fastMathNew0.floor(52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(8.4d);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((double) 1.0f);
        double double16 = fastMathNew0.floor(6.9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) (byte) 10);
        double double8 = fastMathNew0.floor((double) (-4L));
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor(9.6d);
        double double14 = fastMathNew0.floor((double) (short) 10);
        double double16 = fastMathNew0.floor((double) 0L);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(6.9d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((double) 0);
        double double8 = fastMathNew0.floor((-10.0d));
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 5L);
        double double14 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) (-6L));
        double double14 = fastMathNew0.floor(5.3d);
        double double16 = fastMathNew0.floor((double) 6L);
        double double18 = fastMathNew0.floor((double) 1L);
        double double20 = fastMathNew0.floor((double) 5L);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((double) 10);
        double double10 = fastMathNew0.floor((-8.0d));
        double double12 = fastMathNew0.floor((double) (-100));
        double double14 = fastMathNew0.floor((double) 'a');
        double double16 = fastMathNew0.floor((double) 0);
        double double18 = fastMathNew0.floor((-1.2d));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.0d) + "'", double18 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor(8.0d);
        double double20 = fastMathNew0.floor((double) (short) 100);
        double double22 = fastMathNew0.floor((double) 2);
        double double24 = fastMathNew0.floor((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 5L);
        double double4 = fastMathNew0.floor(7.0d);
        double double6 = fastMathNew0.floor((double) (short) 1);
        double double8 = fastMathNew0.floor((double) 0.0f);
        double double10 = fastMathNew0.floor((double) '#');
        double double12 = fastMathNew0.floor((double) (short) 1);
        double double14 = fastMathNew0.floor(97.0d);
        double double16 = fastMathNew0.floor(2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 7.0d + "'", double4 == 7.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 1L);
        double double12 = fastMathNew0.floor((double) (short) 10);
        double double14 = fastMathNew0.floor((-7.0d));
        double double16 = fastMathNew0.floor((double) (byte) 10);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (short) -1);
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) (byte) 10);
        double double8 = fastMathNew0.floor((double) (-4L));
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor(9.6d);
        double double14 = fastMathNew0.floor((double) (short) 10);
        double double16 = fastMathNew0.floor((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (byte) 0);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor(2.0d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((double) 3);
        double double18 = fastMathNew0.floor((double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor((-10.0d));
        double double20 = fastMathNew0.floor((double) 6L);
        double double22 = fastMathNew0.floor((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor((double) (-1.0f));
        double double20 = fastMathNew0.floor(2.7d);
        double double22 = fastMathNew0.floor((double) 4);
        double double24 = fastMathNew0.floor(9.6d);
        double double26 = fastMathNew0.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 9.0d + "'", double24 == 9.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 52.0d + "'", double26 == 52.0d);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((double) (-1L));
        double double14 = fastMathNew0.floor((double) (-1));
        double double16 = fastMathNew0.floor((-1.2d));
        double double18 = fastMathNew0.floor((-9.3d));
        double double20 = fastMathNew0.floor((-4.6d));
        double double22 = fastMathNew0.floor((-4.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-5.0d) + "'", double20 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) (-10L));
        double double16 = fastMathNew0.floor((double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor(8.0d);
        double double20 = fastMathNew0.floor((double) (short) 100);
        double double22 = fastMathNew0.floor((double) (-3L));
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.0d) + "'", double22 == (-3.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) (-6));
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) (-9L));
        double double10 = fastMathNew0.floor((double) (-4L));
        double double12 = fastMathNew0.floor((double) (-9));
        double double14 = fastMathNew0.floor((-9.0d));
        double double16 = fastMathNew0.floor((double) 0);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-6.0d) + "'", double4 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-9.0d) + "'", double8 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 3);
        double double12 = fastMathNew0.floor((double) 2L);
        double double14 = fastMathNew0.floor((double) 4);
        double double16 = fastMathNew0.floor(0.0d);
        double double18 = fastMathNew0.floor((-8.7d));
        double double20 = fastMathNew0.floor((double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9.0d) + "'", double18 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((-10.0d));
        double double10 = fastMathNew0.floor((double) (-1));
        double double12 = fastMathNew0.floor((-3.8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) 4L);
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor(8.0d);
        double double20 = fastMathNew0.floor(3.1d);
        double double22 = fastMathNew0.floor((double) (-1.0f));
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) 100.0f);
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((-11.0d));
        double double12 = fastMathNew0.floor(100.0d);
        double double14 = fastMathNew0.floor(52.0d);
        double double16 = fastMathNew0.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.0d) + "'", double16 == (-5.0d));
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) (short) 0);
        double double10 = fastMathNew0.floor((double) (-6));
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor((-1.2d));
        double double16 = fastMathNew0.floor(35.0d);
        double double18 = fastMathNew0.floor((double) 2L);
        double double20 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-11.0d) + "'", double20 == (-11.0d));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (-6));
        double double14 = fastMathNew0.floor(3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (-3));
        double double18 = fastMathNew0.floor((double) (-8));
        double double20 = fastMathNew0.floor((double) (short) 100);
        double double22 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.0d) + "'", double16 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 3);
        double double12 = fastMathNew0.floor((double) 2L);
        double double14 = fastMathNew0.floor((double) 4);
        double double16 = fastMathNew0.floor(0.0d);
        double double18 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) (byte) 10);
        double double8 = fastMathNew0.floor((double) (-4L));
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor(9.6d);
        double double14 = fastMathNew0.floor((double) (short) 10);
        double double16 = fastMathNew0.floor(7.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((-1.0d));
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((double) 1);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor(32.0d);
        double double16 = fastMathNew0.floor((-7.0d));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-7.0d) + "'", double16 == (-7.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor(5.3d);
        double double14 = fastMathNew0.floor((double) 1L);
        double double16 = fastMathNew0.floor(35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-100L));
        double double8 = fastMathNew0.floor(8.4d);
        double double10 = fastMathNew0.floor((double) 10L);
        double double12 = fastMathNew0.floor((-9.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor((double) 7);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (byte) 0);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) (short) -1);
        double double12 = fastMathNew0.floor((double) 100.0f);
        double double14 = fastMathNew0.floor((double) (-1L));
        double double16 = fastMathNew0.floor((double) (short) 0);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((-8.7d));
        double double12 = fastMathNew0.floor((-5.4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((-7.3d));
        double double14 = fastMathNew0.floor(1.2d);
        double double16 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-8.0d) + "'", double12 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (byte) 0);
        double double18 = fastMathNew0.floor((double) 9);
        double double20 = fastMathNew0.floor(32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((-2.1d));
        double double10 = fastMathNew0.floor((double) 6L);
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor((double) 1L);
        double double8 = fastMathNew0.floor((-3.0d));
        double double10 = fastMathNew0.floor(97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((double) 10);
        double double10 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor((double) (-9L));
        double double14 = fastMathNew0.floor((-3.8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (byte) -1);
        double double20 = fastMathNew0.floor((double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(8.0d);
        double double12 = fastMathNew0.floor((-6.9d));
        double double14 = fastMathNew0.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 3);
        double double12 = fastMathNew0.floor((double) (-5L));
        double double14 = fastMathNew0.floor((double) 1L);
        double double16 = fastMathNew0.floor((double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((-100.0d));
        double double10 = fastMathNew0.floor((double) 6L);
        double double12 = fastMathNew0.floor((double) 1.0f);
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (byte) 0);
        double double18 = fastMathNew0.floor((double) 9);
        double double20 = fastMathNew0.floor((double) 8L);
        double double22 = fastMathNew0.floor((double) 0L);
        double double24 = fastMathNew0.floor(8.4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 8.0d + "'", double24 == 8.0d);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) (-5));
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (-2));
        double double14 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-2.0d) + "'", double12 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) 100);
        double double16 = fastMathNew0.floor((double) (byte) 1);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(8.0d);
        double double12 = fastMathNew0.floor((-6.9d));
        double double14 = fastMathNew0.floor((double) (-9L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 8.0d + "'", double10 == 8.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) 100L);
        double double18 = fastMathNew0.floor((-11.0d));
        double double20 = fastMathNew0.floor((double) 1.0f);
        double double22 = fastMathNew0.floor(0.0d);
        double double24 = fastMathNew0.floor((-2.1d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-11.0d) + "'", double18 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-3.0d) + "'", double24 == (-3.0d));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 8L);
        double double14 = fastMathNew0.floor(3.1d);
        double double16 = fastMathNew0.floor((double) (short) 100);
        double double18 = fastMathNew0.floor((double) 10);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor((-10.5d));
        double double14 = fastMathNew0.floor(35.0d);
        double double16 = fastMathNew0.floor(5.3d);
        double double18 = fastMathNew0.floor((double) (-2L));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-11.0d) + "'", double12 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.0d) + "'", double18 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(6.0d);
        double double16 = fastMathNew0.floor(3.0d);
        double double18 = fastMathNew0.floor((double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) (short) 0);
        double double16 = fastMathNew0.floor(0.0d);
        double double18 = fastMathNew0.floor(9.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) (short) 1);
        double double14 = fastMathNew0.floor(100.0d);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor((-4.0d));
        double double16 = fastMathNew0.floor((double) 0.0f);
        double double18 = fastMathNew0.floor((double) 10L);
        double double20 = fastMathNew0.floor((double) (short) 100);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor((double) (-1.0f));
        double double20 = fastMathNew0.floor(5.0d);
        double double22 = fastMathNew0.floor(0.0d);
        double double24 = fastMathNew0.floor((double) (-5L));
        double double26 = fastMathNew0.floor((double) '#');
        double double28 = fastMathNew0.floor((-6.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5.0d) + "'", double24 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-6.0d) + "'", double28 == (-6.0d));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor((double) (-6L));
        double double8 = fastMathNew0.floor((double) 0.0f);
        double double10 = fastMathNew0.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-9.0d));
        double double8 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor((double) 7);
        double double22 = fastMathNew0.floor((double) (-10L));
        double double24 = fastMathNew0.floor((-2.0d));
        double double26 = fastMathNew0.floor(2.0d);
        double double28 = fastMathNew0.floor((-7.3d));
        double double30 = fastMathNew0.floor((double) (short) -1);
        java.lang.Class<?> wildcardClass31 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-10.0d) + "'", double22 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-2.0d) + "'", double24 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 2.0d + "'", double26 == 2.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-8.0d) + "'", double28 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (short) -1);
        double double10 = fastMathNew0.floor((double) (-6L));
        double double12 = fastMathNew0.floor((double) 100.0f);
        double double14 = fastMathNew0.floor((double) 2L);
        double double16 = fastMathNew0.floor((-7.3d));
        double double18 = fastMathNew0.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-5.0d) + "'", double18 == (-5.0d));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (-4));
        double double16 = fastMathNew0.floor((double) 2);
        double double18 = fastMathNew0.floor((double) 'a');
        double double20 = fastMathNew0.floor((double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((double) 100.0f);
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor((double) 8L);
        double double16 = fastMathNew0.floor(0.0d);
        double double18 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 4);
        double double14 = fastMathNew0.floor((-10.5d));
        double double16 = fastMathNew0.floor(7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-11.0d) + "'", double14 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.0d + "'", double16 == 7.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((-2.1d));
        double double10 = fastMathNew0.floor((double) 10.0f);
        double double12 = fastMathNew0.floor((double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(52.0d);
        double double12 = fastMathNew0.floor((double) (short) 0);
        double double14 = fastMathNew0.floor((double) 0L);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor(8.4d);
        double double14 = fastMathNew0.floor((double) (byte) 0);
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor(9.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (-7));
        double double14 = fastMathNew0.floor((double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (-6L));
        double double20 = fastMathNew0.floor((double) ' ');
        double double22 = fastMathNew0.floor((double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) (-4));
        double double18 = fastMathNew0.floor((-3.0d));
        double double20 = fastMathNew0.floor((double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((-9.0d));
        double double12 = fastMathNew0.floor((double) (-10));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) (byte) 10);
        double double8 = fastMathNew0.floor((double) (-4L));
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor(9.6d);
        double double14 = fastMathNew0.floor((double) (-10L));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor((double) 9L);
        double double18 = fastMathNew0.floor((double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor((double) (-8));
        double double8 = fastMathNew0.floor((double) 100L);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) '#');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((-3.8d));
        double double16 = fastMathNew0.floor((double) (-6L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) (-6L));
        double double16 = fastMathNew0.floor((double) (byte) 100);
        double double18 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-6.0d) + "'", double14 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) (byte) 10);
        double double14 = fastMathNew0.floor((-3.8d));
        double double16 = fastMathNew0.floor(0.0d);
        double double18 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((double) (byte) 10);
        double double12 = fastMathNew0.floor((double) (-9L));
        double double14 = fastMathNew0.floor(4.8d);
        double double16 = fastMathNew0.floor(6.9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 1L);
        double double12 = fastMathNew0.floor((double) (short) 10);
        double double14 = fastMathNew0.floor((double) 0L);
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor((double) 10L);
        double double6 = fastMathNew0.floor(10.0d);
        java.lang.Class<?> wildcardClass7 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 2L);
        double double12 = fastMathNew0.floor((-10.0d));
        double double14 = fastMathNew0.floor((double) (short) -1);
        double double16 = fastMathNew0.floor((double) (short) 0);
        double double18 = fastMathNew0.floor(5.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((-1.2d));
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((-6.9d));
        double double14 = fastMathNew0.floor((double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 8);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((-1.0d));
        double double22 = fastMathNew0.floor(100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(6.9d);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((-11.0d));
        double double12 = fastMathNew0.floor((-2.1d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor((double) (-1L));
        double double16 = fastMathNew0.floor((double) (-5L));
        double double18 = fastMathNew0.floor(7.0d);
        double double20 = fastMathNew0.floor((double) '#');
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.0d) + "'", double16 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.0d + "'", double18 == 7.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) 100.0f);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-6));
        double double12 = fastMathNew0.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) (short) 0);
        double double10 = fastMathNew0.floor((double) 2);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((-7.3d));
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((double) 0);
        double double22 = fastMathNew0.floor((double) 4);
        double double24 = fastMathNew0.floor((-3.8d));
        double double26 = fastMathNew0.floor((double) 100);
        double double28 = fastMathNew0.floor((double) (byte) -1);
        double double30 = fastMathNew0.floor((double) 100);
        double double32 = fastMathNew0.floor((double) ' ');
        java.lang.Class<?> wildcardClass33 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 32.0d + "'", double32 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((-4.6d));
        double double14 = fastMathNew0.floor((double) 1L);
        double double16 = fastMathNew0.floor((double) 'a');
        double double18 = fastMathNew0.floor((-2.1d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) (byte) 10);
        double double20 = fastMathNew0.floor((double) 6L);
        double double22 = fastMathNew0.floor((double) (-10));
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-10.0d) + "'", double22 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor((-5.4d));
        double double12 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-1.0d));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-10L));
        double double16 = fastMathNew0.floor(1.2d);
        double double18 = fastMathNew0.floor((double) 100L);
        double double20 = fastMathNew0.floor((double) 100L);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 6);
        double double18 = fastMathNew0.floor(5.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((double) 8L);
        double double14 = fastMathNew0.floor((double) (-7));
        double double16 = fastMathNew0.floor((double) (-100L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-6.9d));
        double double12 = fastMathNew0.floor((double) 10);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.0d) + "'", double10 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 1);
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor(1.0d);
        double double18 = fastMathNew0.floor((double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 10);
        double double16 = fastMathNew0.floor((-2.0d));
        double double18 = fastMathNew0.floor(9.0d);
        double double20 = fastMathNew0.floor((-7.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-7.0d) + "'", double20 == (-7.0d));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((-10.0d));
        double double18 = fastMathNew0.floor((-3.0d));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) 9);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 9);
        double double14 = fastMathNew0.floor((double) (-5));
        double double16 = fastMathNew0.floor((double) 6);
        double double18 = fastMathNew0.floor((double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 9.0d + "'", double8 == 9.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor(5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((double) (-10L));
        double double14 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((-5.4d));
        double double14 = fastMathNew0.floor(5.3d);
        double double16 = fastMathNew0.floor((-1.0d));
        double double18 = fastMathNew0.floor((double) 4);
        double double20 = fastMathNew0.floor((-4.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor((double) 5);
        double double12 = fastMathNew0.floor((double) 100L);
        double double14 = fastMathNew0.floor((double) (-4L));
        double double16 = fastMathNew0.floor((-4.0d));
        double double18 = fastMathNew0.floor(35.0d);
        double double20 = fastMathNew0.floor((double) 2);
        double double22 = fastMathNew0.floor((-2.1d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.0d) + "'", double22 == (-3.0d));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((-3.8d));
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor((double) 0L);
        double double14 = fastMathNew0.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor(7.1d);
        double double10 = fastMathNew0.floor((double) (-6));
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) (short) 0);
        double double18 = fastMathNew0.floor((double) 3L);
        double double20 = fastMathNew0.floor(4.8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor((-2.1d));
        double double22 = fastMathNew0.floor(100.0d);
        double double24 = fastMathNew0.floor((double) (-7L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.0d) + "'", double20 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-7.0d) + "'", double24 == (-7.0d));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((-100.0d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor(9.6d);
        double double16 = fastMathNew0.floor((double) (short) 100);
        double double18 = fastMathNew0.floor(10.5d);
        double double20 = fastMathNew0.floor((-1.0d));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(1.2d);
        double double10 = fastMathNew0.floor((double) 10L);
        double double12 = fastMathNew0.floor((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((double) (-1L));
        double double14 = fastMathNew0.floor(4.0d);
        double double16 = fastMathNew0.floor((double) 1L);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor(5.0d);
        java.lang.Class<?> wildcardClass7 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) (-3L));
        double double10 = fastMathNew0.floor((double) 1);
        double double12 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) 100L);
        double double8 = fastMathNew0.floor(10.0d);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((double) (-1));
        double double12 = fastMathNew0.floor((double) (short) 1);
        double double14 = fastMathNew0.floor((-2.0d));
        double double16 = fastMathNew0.floor((double) (byte) -1);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 100);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) '4');
        double double10 = fastMathNew0.floor((double) 9);
        double double12 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor((double) '#');
        double double16 = fastMathNew0.floor((double) (-10L));
        double double18 = fastMathNew0.floor(4.0d);
        double double20 = fastMathNew0.floor((double) 10);
        double double22 = fastMathNew0.floor(7.0d);
        double double24 = fastMathNew0.floor((double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.0d + "'", double22 == 7.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 6.0d + "'", double24 == 6.0d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((double) (-9));
        double double6 = fastMathNew0.floor((double) (-9));
        double double8 = fastMathNew0.floor((double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((-1.0d));
        double double8 = fastMathNew0.floor(2.7d);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor(9.6d);
        double double14 = fastMathNew0.floor((double) (-2));
        double double16 = fastMathNew0.floor((-5.4d));
        double double18 = fastMathNew0.floor(8.4d);
        double double20 = fastMathNew0.floor((-9.0d));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor(9.0d);
        double double14 = fastMathNew0.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 1.0f);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (byte) 0);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) (short) -1);
        double double12 = fastMathNew0.floor((double) (-1L));
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor((double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(6.0d);
        double double16 = fastMathNew0.floor((double) 6);
        double double18 = fastMathNew0.floor((double) 10L);
        double double20 = fastMathNew0.floor((double) (-4));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((-7.3d));
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((double) 0);
        double double22 = fastMathNew0.floor((double) 4);
        double double24 = fastMathNew0.floor((-3.8d));
        double double26 = fastMathNew0.floor((double) 100);
        double double28 = fastMathNew0.floor((double) (byte) -1);
        double double30 = fastMathNew0.floor((double) 100);
        double double32 = fastMathNew0.floor(10.5d);
        double double34 = fastMathNew0.floor((double) 4L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor((-10.0d));
        double double18 = fastMathNew0.floor((double) 100L);
        double double20 = fastMathNew0.floor((double) 7L);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((-4.6d));
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor((double) (-6));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor((double) 100);
        double double16 = fastMathNew0.floor((-11.0d));
        double double18 = fastMathNew0.floor((double) '#');
        double double20 = fastMathNew0.floor(2.0d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-11.0d) + "'", double16 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) 0);
        double double8 = fastMathNew0.floor(8.0d);
        double double10 = fastMathNew0.floor(52.0d);
        double double12 = fastMathNew0.floor((double) (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((double) (-1L));
        double double14 = fastMathNew0.floor((double) (-1));
        double double16 = fastMathNew0.floor((-1.2d));
        double double18 = fastMathNew0.floor((double) 4L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((-6.0d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor((-7.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((double) 0);
        double double8 = fastMathNew0.floor((-10.0d));
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor((-4.0d));
        double double16 = fastMathNew0.floor((-1.0d));
        double double18 = fastMathNew0.floor((-2.1d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor(5.3d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((double) (-8));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor((double) 100L);
        double double14 = fastMathNew0.floor((double) (-100L));
        double double16 = fastMathNew0.floor((double) 10.0f);
        double double18 = fastMathNew0.floor((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(1.2d);
        double double10 = fastMathNew0.floor((-2.0d));
        double double12 = fastMathNew0.floor(3.0d);
        double double14 = fastMathNew0.floor(2.0d);
        double double16 = fastMathNew0.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 2.0d + "'", double14 == 2.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((double) (-100L));
        double double12 = fastMathNew0.floor((double) (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((-8.7d));
        double double12 = fastMathNew0.floor((double) (-1L));
        double double14 = fastMathNew0.floor((-3.0d));
        double double16 = fastMathNew0.floor(6.9d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((double) (-10L));
        double double14 = fastMathNew0.floor((double) (-100L));
        double double16 = fastMathNew0.floor(100.0d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor((double) 1L);
        double double8 = fastMathNew0.floor((double) (-5));
        double double10 = fastMathNew0.floor((double) (-100L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor(97.0d);
        double double20 = fastMathNew0.floor((double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((-7.3d));
        double double14 = fastMathNew0.floor(1.2d);
        double double16 = fastMathNew0.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-8.0d) + "'", double12 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 8L);
        double double18 = fastMathNew0.floor((double) 2L);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) 100.0f);
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((double) (-5));
        double double12 = fastMathNew0.floor(100.0d);
        double double14 = fastMathNew0.floor(8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-5.0d) + "'", double10 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((-3.0d));
        double double12 = fastMathNew0.floor((double) (short) 1);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor((double) 5);
        double double12 = fastMathNew0.floor((double) 100L);
        double double14 = fastMathNew0.floor((-2.0d));
        double double16 = fastMathNew0.floor((double) 100L);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((double) (short) 1);
        double double6 = fastMathNew0.floor((double) (byte) 0);
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((-9.0d));
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) 6L);
        double double10 = fastMathNew0.floor((double) 5L);
        double double12 = fastMathNew0.floor((double) 10L);
        double double14 = fastMathNew0.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.0d + "'", double8 == 6.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(10.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor((-10.0d));
        double double12 = fastMathNew0.floor((double) 4L);
        double double14 = fastMathNew0.floor((double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (short) 100);
        double double8 = fastMathNew0.floor((-4.6d));
        double double10 = fastMathNew0.floor((double) (-10));
        double double12 = fastMathNew0.floor((double) 1);
        double double14 = fastMathNew0.floor((double) (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) 0);
        double double8 = fastMathNew0.floor(8.0d);
        double double10 = fastMathNew0.floor(52.0d);
        double double12 = fastMathNew0.floor(7.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((-3.8d));
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor((double) 0L);
        double double14 = fastMathNew0.floor((-1.0d));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor(2.7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(9.6d);
        double double18 = fastMathNew0.floor((-7.0d));
        double double20 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((-100.0d));
        double double10 = fastMathNew0.floor(4.0d);
        double double12 = fastMathNew0.floor(3.1d);
        double double14 = fastMathNew0.floor((double) (-8));
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((-100.0d));
        double double10 = fastMathNew0.floor(4.0d);
        double double12 = fastMathNew0.floor(3.1d);
        double double14 = fastMathNew0.floor((double) (-8));
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor(3.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-7L));
        double double14 = fastMathNew0.floor(7.1d);
        double double16 = fastMathNew0.floor((double) 2);
        double double18 = fastMathNew0.floor((double) (-8));
        double double20 = fastMathNew0.floor((double) 2);
        double double22 = fastMathNew0.floor((double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.0d + "'", double22 == 9.0d);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((-6.0d));
        double double14 = fastMathNew0.floor((double) 10L);
        double double16 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-11.0d) + "'", double16 == (-11.0d));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) (short) 0);
        double double16 = fastMathNew0.floor(35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor((double) (-4L));
        double double8 = fastMathNew0.floor((double) 4L);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-4.0d) + "'", double6 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((-7.3d));
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((double) 0);
        double double22 = fastMathNew0.floor((double) 4);
        double double24 = fastMathNew0.floor((-3.8d));
        double double26 = fastMathNew0.floor((double) 1);
        double double28 = fastMathNew0.floor((double) 2L);
        double double30 = fastMathNew0.floor(9.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.0d + "'", double28 == 2.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 9.0d + "'", double30 == 9.0d);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor(2.7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) 1L);
        double double16 = fastMathNew0.floor(1.2d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 8);
        double double10 = fastMathNew0.floor((-3.8d));
        double double12 = fastMathNew0.floor((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-1.0f));
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) '#');
        double double20 = fastMathNew0.floor((double) 0L);
        double double22 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (byte) 0);
        double double4 = fastMathNew0.floor((double) (byte) 0);
        double double6 = fastMathNew0.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) (-9L));
        double double18 = fastMathNew0.floor((double) 8L);
        double double20 = fastMathNew0.floor((double) 10);
        double double22 = fastMathNew0.floor(97.0d);
        double double24 = fastMathNew0.floor((double) 2L);
        java.lang.Class<?> wildcardClass25 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 8.0d + "'", double18 == 8.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((-8.0d));
        double double6 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-8.0d) + "'", double4 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((double) (-1L));
        double double14 = fastMathNew0.floor(4.0d);
        double double16 = fastMathNew0.floor((double) 1L);
        double double18 = fastMathNew0.floor((-10.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) (short) 0);
        double double8 = fastMathNew0.floor((-6.0d));
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 'a');
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-6.0d) + "'", double8 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(2.7d);
        double double10 = fastMathNew0.floor((double) (-2));
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor(9.6d);
        double double12 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((-3.0d));
        double double12 = fastMathNew0.floor((double) (byte) 1);
        double double14 = fastMathNew0.floor((double) 1);
        double double16 = fastMathNew0.floor((double) (-2L));
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) 1.0f);
        double double16 = fastMathNew0.floor((double) 10L);
        double double18 = fastMathNew0.floor(100.0d);
        double double20 = fastMathNew0.floor((double) (byte) 100);
        double double22 = fastMathNew0.floor((double) 3L);
        double double24 = fastMathNew0.floor((-7.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 3.0d + "'", double22 == 3.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-8.0d) + "'", double24 == (-8.0d));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor(100.0d);
        double double6 = fastMathNew0.floor((double) 6L);
        double double8 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor((-9.3d));
        double double14 = fastMathNew0.floor(7.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(1.2d);
        double double10 = fastMathNew0.floor((-2.0d));
        double double12 = fastMathNew0.floor((double) 0.0f);
        double double14 = fastMathNew0.floor((-100.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((double) (-3L));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(10.5d);
        double double16 = fastMathNew0.floor((-6.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) (-9));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-7L));
        double double14 = fastMathNew0.floor((-10.0d));
        double double16 = fastMathNew0.floor((-5.0d));
        double double18 = fastMathNew0.floor((double) (short) 100);
        double double20 = fastMathNew0.floor((double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.0d) + "'", double16 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.0d + "'", double20 == 9.0d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) (byte) 10);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) (-4));
        double double10 = fastMathNew0.floor((double) 10L);
        double double12 = fastMathNew0.floor((double) 7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(6.9d);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((-8.7d));
        double double12 = fastMathNew0.floor(35.0d);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) '#');
        double double18 = fastMathNew0.floor((double) 100L);
        double double20 = fastMathNew0.floor(1.0d);
        double double22 = fastMathNew0.floor(9.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 6.0d + "'", double6 == 6.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.0d + "'", double22 == 9.0d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((-1.2d));
        double double10 = fastMathNew0.floor((-5.4d));
        double double12 = fastMathNew0.floor(7.0d);
        double double14 = fastMathNew0.floor((double) (-100L));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((-3.8d));
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-3L));
        double double8 = fastMathNew0.floor(52.0d);
        double double10 = fastMathNew0.floor((double) (-6L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.0d) + "'", double6 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((-3.8d));
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (-2));
        double double20 = fastMathNew0.floor((double) 100);
        double double22 = fastMathNew0.floor((double) 4L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.0d) + "'", double18 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 8);
        double double10 = fastMathNew0.floor((-11.0d));
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 6L);
        double double16 = fastMathNew0.floor((-9.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((-1.2d));
        double double10 = fastMathNew0.floor((-5.4d));
        double double12 = fastMathNew0.floor((double) (short) 1);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor(52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 8);
        double double10 = fastMathNew0.floor((-11.0d));
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((double) (short) 10);
        double double14 = fastMathNew0.floor((double) (-7));
        double double16 = fastMathNew0.floor((double) (-1L));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 4);
        double double16 = fastMathNew0.floor((double) (-9));
        double double18 = fastMathNew0.floor((-10.0d));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-9.0d) + "'", double16 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (-6));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) (-6L));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-6.0d) + "'", double8 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor((-10.0d));
        double double12 = fastMathNew0.floor((-5.4d));
        double double14 = fastMathNew0.floor((double) 6L);
        double double16 = fastMathNew0.floor((double) 6L);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) (-1.0f));
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor(32.0d);
        double double18 = fastMathNew0.floor((double) (-2L));
        double double20 = fastMathNew0.floor((double) 6);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-2.0d) + "'", double18 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(2.7d);
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((double) (-1));
        double double14 = fastMathNew0.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (byte) 0);
        double double4 = fastMathNew0.floor((double) '#');
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (short) 10);
        double double10 = fastMathNew0.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 4L);
        double double6 = fastMathNew0.floor((double) (-6));
        double double8 = fastMathNew0.floor((double) 6L);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((-6.0d));
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.0d + "'", double8 == 6.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(8.4d);
        double double10 = fastMathNew0.floor((double) 7L);
        double double12 = fastMathNew0.floor((double) (-4));
        double double14 = fastMathNew0.floor(5.0d);
        double double16 = fastMathNew0.floor(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.0d + "'", double10 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) 1.0f);
        double double16 = fastMathNew0.floor((double) 5L);
        double double18 = fastMathNew0.floor((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-9.0d));
        double double8 = fastMathNew0.floor((double) 2);
        double double10 = fastMathNew0.floor((double) 10L);
        double double12 = fastMathNew0.floor((double) (-9L));
        double double14 = fastMathNew0.floor(5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(1.2d);
        double double10 = fastMathNew0.floor((double) 10L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(3.0d);
        double double10 = fastMathNew0.floor(10.5d);
        double double12 = fastMathNew0.floor((double) (-8));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-8.0d) + "'", double12 == (-8.0d));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((-7.3d));
        double double18 = fastMathNew0.floor((double) 0);
        double double20 = fastMathNew0.floor((double) 0);
        double double22 = fastMathNew0.floor((double) 4);
        double double24 = fastMathNew0.floor((-3.8d));
        double double26 = fastMathNew0.floor((double) 100);
        double double28 = fastMathNew0.floor((double) (byte) -1);
        double double30 = fastMathNew0.floor((double) 100);
        double double32 = fastMathNew0.floor(6.9d);
        double double34 = fastMathNew0.floor((double) (-4L));
        double double36 = fastMathNew0.floor((double) 100);
        double double38 = fastMathNew0.floor(97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-8.0d) + "'", double16 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-4.0d) + "'", double24 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 6.0d + "'", double32 == 6.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-4.0d) + "'", double34 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 97.0d + "'", double38 == 97.0d);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((-7.3d));
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor(10.5d);
        double double22 = fastMathNew0.floor(7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7.0d + "'", double22 == 7.0d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor((double) 9L);
        double double18 = fastMathNew0.floor(4.8d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((-1.2d));
        double double10 = fastMathNew0.floor((-5.4d));
        double double12 = fastMathNew0.floor(7.0d);
        double double14 = fastMathNew0.floor((double) 5);
        double double16 = fastMathNew0.floor(32.0d);
        double double18 = fastMathNew0.floor((double) 2L);
        double double20 = fastMathNew0.floor((double) (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor((double) 7);
        double double22 = fastMathNew0.floor((double) (-10L));
        double double24 = fastMathNew0.floor((double) (short) -1);
        double double26 = fastMathNew0.floor((-4.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.0d + "'", double20 == 7.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-10.0d) + "'", double22 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-4.0d) + "'", double26 == (-4.0d));
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((double) (-3L));
        double double12 = fastMathNew0.floor((double) (-4));
        double double14 = fastMathNew0.floor((-7.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor(6.0d);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((-11.0d));
        double double22 = fastMathNew0.floor((double) (-1.0f));
        double double24 = fastMathNew0.floor(35.0d);
        double double26 = fastMathNew0.floor((double) 10);
        double double28 = fastMathNew0.floor(7.1d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-11.0d) + "'", double20 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 7.0d + "'", double28 == 7.0d);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((-1.0d));
        double double10 = fastMathNew0.floor((double) (short) 10);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (-9L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor((-8.0d));
        double double8 = fastMathNew0.floor(8.4d);
        double double10 = fastMathNew0.floor((-7.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((-9.3d));
        double double10 = fastMathNew0.floor((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (byte) 0);
        double double4 = fastMathNew0.floor((double) (byte) 10);
        double double6 = fastMathNew0.floor((double) 4L);
        double double8 = fastMathNew0.floor((double) 0);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(9.6d);
        double double6 = fastMathNew0.floor((double) (-3L));
        double double8 = fastMathNew0.floor((double) (byte) 0);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-3.0d) + "'", double6 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) '4');
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((double) (-6));
        double double18 = fastMathNew0.floor((double) 100);
        double double20 = fastMathNew0.floor((double) (-6L));
        double double22 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-6.0d) + "'", double20 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) (-3));
        double double12 = fastMathNew0.floor(7.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) '4');
        double double14 = fastMathNew0.floor((double) (-3));
        double double16 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 9);
        double double14 = fastMathNew0.floor((double) (-9));
        double double16 = fastMathNew0.floor((-3.0d));
        double double18 = fastMathNew0.floor((double) 10);
        double double20 = fastMathNew0.floor((double) 2);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 9.0d + "'", double12 == 9.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.0d) + "'", double16 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-1.0f));
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) '#');
        double double20 = fastMathNew0.floor((double) 0L);
        double double22 = fastMathNew0.floor(0.0d);
        double double24 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-2.1d));
        double double12 = fastMathNew0.floor((-9.0d));
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (-6L));
        double double20 = fastMathNew0.floor((double) ' ');
        double double22 = fastMathNew0.floor((-4.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-3.0d) + "'", double10 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor((double) (-1.0f));
        double double20 = fastMathNew0.floor(5.0d);
        double double22 = fastMathNew0.floor(0.0d);
        double double24 = fastMathNew0.floor((double) (-5L));
        double double26 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5.0d) + "'", double24 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(1.0d);
        double double8 = fastMathNew0.floor((-11.0d));
        double double10 = fastMathNew0.floor((double) 100.0f);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((-9.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-11.0d) + "'", double8 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor((-8.0d));
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor(100.0d);
        double double16 = fastMathNew0.floor((double) 100);
        double double18 = fastMathNew0.floor((double) (-7));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-7L));
        double double14 = fastMathNew0.floor(7.1d);
        double double16 = fastMathNew0.floor((double) 2);
        double double18 = fastMathNew0.floor((double) (-8));
        double double20 = fastMathNew0.floor((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor(52.0d);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) 2L);
        double double20 = fastMathNew0.floor((double) (short) 10);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) 10.0f);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 8);
        double double18 = fastMathNew0.floor((-5.4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((-1.2d));
        double double10 = fastMathNew0.floor((-5.4d));
        double double12 = fastMathNew0.floor(7.0d);
        double double14 = fastMathNew0.floor((double) (-100L));
        double double16 = fastMathNew0.floor((-2.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-2.0d) + "'", double8 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100);
        double double12 = fastMathNew0.floor((double) 100L);
        double double14 = fastMathNew0.floor((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-7));
        double double12 = fastMathNew0.floor(7.1d);
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.0d) + "'", double10 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) 1L);
        double double18 = fastMathNew0.floor(9.6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor((double) 100);
        double double20 = fastMathNew0.floor(6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 6.0d + "'", double20 == 6.0d);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor((double) 1L);
        double double8 = fastMathNew0.floor((double) (-5));
        double double10 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((-5.4d));
        double double14 = fastMathNew0.floor((-6.9d));
        double double16 = fastMathNew0.floor((-3.8d));
        double double18 = fastMathNew0.floor((double) (-10L));
        double double20 = fastMathNew0.floor((-4.0d));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-4.0d) + "'", double20 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) '4');
        double double14 = fastMathNew0.floor((double) (-3));
        double double16 = fastMathNew0.floor(0.0d);
        double double18 = fastMathNew0.floor((-5.0d));
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-5.0d) + "'", double18 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) 100L);
        double double18 = fastMathNew0.floor((-100.0d));
        double double20 = fastMathNew0.floor((double) 1);
        double double22 = fastMathNew0.floor((double) (short) 1);
        double double24 = fastMathNew0.floor((double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-2.0d) + "'", double24 == (-2.0d));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor(2.7d);
        double double22 = fastMathNew0.floor((double) 'a');
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 1L);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor((double) 1);
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((-8.7d));
        double double14 = fastMathNew0.floor((double) '#');
        double double16 = fastMathNew0.floor((double) (-10L));
        double double18 = fastMathNew0.floor(4.0d);
        double double20 = fastMathNew0.floor((double) 10);
        double double22 = fastMathNew0.floor((double) (-100L));
        double double24 = fastMathNew0.floor((double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-100.0d) + "'", double22 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 9.0d + "'", double24 == 9.0d);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((double) 4);
        double double12 = fastMathNew0.floor((-2.1d));
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((-2.1d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-3.0d) + "'", double16 == (-3.0d));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(8.0d);
        double double6 = fastMathNew0.floor((double) (byte) 1);
        double double8 = fastMathNew0.floor((double) (-4));
        double double10 = fastMathNew0.floor((double) (-1));
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor(3.0d);
        double double10 = fastMathNew0.floor(4.8d);
        double double12 = fastMathNew0.floor((double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-2.0d) + "'", double12 == (-2.0d));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((-100.0d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor((-9.3d));
        double double16 = fastMathNew0.floor((double) 0.0f);
        double double18 = fastMathNew0.floor(100.0d);
        double double20 = fastMathNew0.floor((double) 2);
        double double22 = fastMathNew0.floor((double) 1);
        double double24 = fastMathNew0.floor((-5.0d));
        double double26 = fastMathNew0.floor((double) (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5.0d) + "'", double24 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-7.0d) + "'", double26 == (-7.0d));
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor(32.0d);
        double double12 = fastMathNew0.floor(10.5d);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((-10.5d));
        double double18 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-11.0d) + "'", double16 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((double) 0);
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(2.0d);
        double double12 = fastMathNew0.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (short) 100);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((-6.9d));
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-7.0d) + "'", double10 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 7L);
        double double8 = fastMathNew0.floor((double) (-5));
        double double10 = fastMathNew0.floor((double) (byte) 100);
        double double12 = fastMathNew0.floor(5.0d);
        double double14 = fastMathNew0.floor((double) (-10));
        double double16 = fastMathNew0.floor((-100.0d));
        double double18 = fastMathNew0.floor((-100.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.0d + "'", double6 == 7.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((-1.0d));
        double double8 = fastMathNew0.floor(2.7d);
        double double10 = fastMathNew0.floor((-2.0d));
        double double12 = fastMathNew0.floor(10.0d);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor((double) 3L);
        double double14 = fastMathNew0.floor((double) (-5));
        double double16 = fastMathNew0.floor((double) (short) -1);
        double double18 = fastMathNew0.floor((double) (-10L));
        double double20 = fastMathNew0.floor(5.0d);
        double double22 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 5.0d + "'", double20 == 5.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(8.4d);
        double double10 = fastMathNew0.floor(2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((-9.3d));
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor(35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-9.0d));
        double double8 = fastMathNew0.floor((double) (-3L));
        double double10 = fastMathNew0.floor((double) 1.0f);
        double double12 = fastMathNew0.floor((double) (short) -1);
        double double14 = fastMathNew0.floor((double) 0L);
        double double16 = fastMathNew0.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor((double) 100L);
        double double14 = fastMathNew0.floor((double) (-100L));
        double double16 = fastMathNew0.floor((-2.0d));
        double double18 = fastMathNew0.floor((-5.0d));
        double double20 = fastMathNew0.floor((double) 0L);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-5.0d) + "'", double18 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor(3.0d);
        double double20 = fastMathNew0.floor((-7.0d));
        double double22 = fastMathNew0.floor(6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-7.0d) + "'", double20 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.0d + "'", double22 == 6.0d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor((-2.1d));
        double double22 = fastMathNew0.floor((-11.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.0d) + "'", double20 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-11.0d) + "'", double22 == (-11.0d));
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) (-9));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor((double) 'a');
        double double18 = fastMathNew0.floor((-9.3d));
        double double20 = fastMathNew0.floor((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9.0d) + "'", double12 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((-100.0d));
        double double18 = fastMathNew0.floor(5.3d);
        double double20 = fastMathNew0.floor((double) (byte) -1);
        double double22 = fastMathNew0.floor((double) 2);
        double double24 = fastMathNew0.floor((double) (-2L));
        double double26 = fastMathNew0.floor(32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-2.0d) + "'", double24 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 32.0d + "'", double26 == 32.0d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(9.6d);
        double double6 = fastMathNew0.floor((-8.7d));
        double double8 = fastMathNew0.floor((double) 6);
        double double10 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 6.0d + "'", double8 == 6.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor(6.0d);
        double double16 = fastMathNew0.floor((-4.0d));
        double double18 = fastMathNew0.floor(32.0d);
        double double20 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((-3.8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 9.0d + "'", double20 == 9.0d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-7L));
        double double16 = fastMathNew0.floor((double) 2);
        double double18 = fastMathNew0.floor((double) 'a');
        double double20 = fastMathNew0.floor((double) 2);
        double double22 = fastMathNew0.floor(2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-7.0d) + "'", double14 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((double) 7L);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor(0.0d);
        double double22 = fastMathNew0.floor((double) (byte) 10);
        double double24 = fastMathNew0.floor((double) (-100L));
        double double26 = fastMathNew0.floor((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-100.0d) + "'", double24 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor(8.4d);
        double double10 = fastMathNew0.floor((double) 7L);
        double double12 = fastMathNew0.floor((double) (-4));
        double double14 = fastMathNew0.floor(3.1d);
        double double16 = fastMathNew0.floor((double) (-1));
        double double18 = fastMathNew0.floor((-6.0d));
        double double20 = fastMathNew0.floor((double) (-3L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 8.0d + "'", double8 == 8.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.0d + "'", double10 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.0d) + "'", double20 == (-3.0d));
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) 10);
        double double14 = fastMathNew0.floor((double) 100.0f);
        double double16 = fastMathNew0.floor((double) (-1.0f));
        double double18 = fastMathNew0.floor((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor(5.0d);
        double double10 = fastMathNew0.floor((double) 6L);
        double double12 = fastMathNew0.floor((-3.8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) (-5L));
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor((double) (byte) 1);
        double double16 = fastMathNew0.floor(3.1d);
        double double18 = fastMathNew0.floor((double) (-100));
        double double20 = fastMathNew0.floor((double) (-10L));
        double double22 = fastMathNew0.floor((double) 10L);
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-10.0d) + "'", double20 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) 9L);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (-10L));
        double double10 = fastMathNew0.floor((double) 4);
        double double12 = fastMathNew0.floor((-6.0d));
        double double14 = fastMathNew0.floor((double) 10L);
        double double16 = fastMathNew0.floor((-11.0d));
        double double18 = fastMathNew0.floor(1.2d);
        double double20 = fastMathNew0.floor((double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 9.0d + "'", double4 == 9.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-10.0d) + "'", double8 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-11.0d) + "'", double16 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.0d) + "'", double20 == (-2.0d));
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor(5.3d);
        double double14 = fastMathNew0.floor(9.6d);
        double double16 = fastMathNew0.floor(8.0d);
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) (byte) 0);
        double double12 = fastMathNew0.floor((double) (-100));
        double double14 = fastMathNew0.floor((double) (-100));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor(7.1d);
        double double10 = fastMathNew0.floor((double) 2);
        double double12 = fastMathNew0.floor((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (short) 100);
        double double8 = fastMathNew0.floor((-10.5d));
        double double10 = fastMathNew0.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-11.0d) + "'", double8 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((double) 4L);
        double double14 = fastMathNew0.floor((-2.0d));
        double double16 = fastMathNew0.floor((-10.0d));
        double double18 = fastMathNew0.floor((double) 0.0f);
        double double20 = fastMathNew0.floor((double) 'a');
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (byte) 0);
        double double4 = fastMathNew0.floor((-8.7d));
        double double6 = fastMathNew0.floor(10.0d);
        double double8 = fastMathNew0.floor(5.0d);
        double double10 = fastMathNew0.floor((double) 5L);
        double double12 = fastMathNew0.floor((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9.0d) + "'", double4 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.0d + "'", double8 == 5.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) (-1L));
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor(2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 0);
        double double12 = fastMathNew0.floor((double) (-6L));
        double double14 = fastMathNew0.floor(8.0d);
        double double16 = fastMathNew0.floor((-100.0d));
        double double18 = fastMathNew0.floor((-6.9d));
        double double20 = fastMathNew0.floor((double) (-5L));
        double double22 = fastMathNew0.floor((-3.8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 8.0d + "'", double14 == 8.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-5.0d) + "'", double20 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor((double) (short) 1);
        double double6 = fastMathNew0.floor((-7.0d));
        double double8 = fastMathNew0.floor((double) (-1.0f));
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor(10.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-7.0d) + "'", double6 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 0L);
        double double18 = fastMathNew0.floor((double) ' ');
        double double20 = fastMathNew0.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (short) 10);
        double double12 = fastMathNew0.floor((double) 1L);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(0.0d);
        double double10 = fastMathNew0.floor(5.3d);
        double double12 = fastMathNew0.floor(6.0d);
        double double14 = fastMathNew0.floor((double) 10);
        double double16 = fastMathNew0.floor((-2.0d));
        double double18 = fastMathNew0.floor(9.0d);
        double double20 = fastMathNew0.floor((-3.0d));
        double double22 = fastMathNew0.floor((double) 4L);
        double double24 = fastMathNew0.floor(3.1d);
        double double26 = fastMathNew0.floor(0.0d);
        java.lang.Class<?> wildcardClass27 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 5.0d + "'", double10 == 5.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-2.0d) + "'", double16 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 9.0d + "'", double18 == 9.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.0d) + "'", double20 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 3.0d + "'", double24 == 3.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((double) 0);
        double double16 = fastMathNew0.floor((double) (byte) 100);
        double double18 = fastMathNew0.floor((double) (-6L));
        double double20 = fastMathNew0.floor((double) (short) -1);
        double double22 = fastMathNew0.floor(6.9d);
        double double24 = fastMathNew0.floor((-2.0d));
        double double26 = fastMathNew0.floor((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-6.0d) + "'", double18 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 6.0d + "'", double22 == 6.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-2.0d) + "'", double24 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) (-4L));
        double double6 = fastMathNew0.floor((double) (-100));
        double double8 = fastMathNew0.floor((double) 0L);
        double double10 = fastMathNew0.floor((double) 6);
        double double12 = fastMathNew0.floor((-4.6d));
        double double14 = fastMathNew0.floor(9.6d);
        double double16 = fastMathNew0.floor((-4.6d));
        java.lang.Class<?> wildcardClass17 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-4.0d) + "'", double4 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-100.0d) + "'", double6 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-5.0d) + "'", double16 == (-5.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-6.0d));
        double double8 = fastMathNew0.floor(4.0d);
        double double10 = fastMathNew0.floor((-10.0d));
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor(4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-10.0d) + "'", double10 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 1L);
        double double12 = fastMathNew0.floor((double) (-4));
        double double14 = fastMathNew0.floor((-7.3d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor(4.8d);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) 100L);
        double double16 = fastMathNew0.floor((-10.0d));
        double double18 = fastMathNew0.floor(3.1d);
        double double20 = fastMathNew0.floor((-1.2d));
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-10.0d) + "'", double16 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-2.0d) + "'", double20 == (-2.0d));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (byte) 10);
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor(7.0d);
        double double14 = fastMathNew0.floor((double) (-1));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor(7.1d);
        double double10 = fastMathNew0.floor((double) 2);
        double double12 = fastMathNew0.floor((double) 8);
        double double14 = fastMathNew0.floor((-100.0d));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.0d + "'", double8 == 7.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.0d + "'", double10 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 8.0d + "'", double12 == 8.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((double) 10);
        double double12 = fastMathNew0.floor((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) 4);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 8);
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor(7.1d);
        double double12 = fastMathNew0.floor((-5.0d));
        double double14 = fastMathNew0.floor((-10.5d));
        double double16 = fastMathNew0.floor((double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 8.0d + "'", double6 == 8.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.0d + "'", double10 == 7.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-5.0d) + "'", double12 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-11.0d) + "'", double14 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) 2);
        double double8 = fastMathNew0.floor(4.0d);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor((double) 4L);
        double double6 = fastMathNew0.floor((double) (-6));
        double double8 = fastMathNew0.floor(4.8d);
        double double10 = fastMathNew0.floor((double) (byte) 0);
        double double12 = fastMathNew0.floor((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-6.0d) + "'", double6 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (byte) 10);
        double double10 = fastMathNew0.floor(10.5d);
        double double12 = fastMathNew0.floor((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(97.0d);
        double double6 = fastMathNew0.floor((double) 1L);
        double double8 = fastMathNew0.floor((double) (-5));
        double double10 = fastMathNew0.floor((double) (-6));
        double double12 = fastMathNew0.floor((double) 6);
        double double14 = fastMathNew0.floor((-11.0d));
        double double16 = fastMathNew0.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-5.0d) + "'", double8 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-6.0d) + "'", double10 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-11.0d) + "'", double14 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(3.0d);
        double double16 = fastMathNew0.floor((double) 1);
        double double18 = fastMathNew0.floor((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-100));
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-9.0d));
        double double8 = fastMathNew0.floor((double) (-3L));
        double double10 = fastMathNew0.floor((double) 1.0f);
        java.lang.Class<?> wildcardClass11 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-3.0d) + "'", double8 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor(6.0d);
        double double16 = fastMathNew0.floor(10.5d);
        double double18 = fastMathNew0.floor(0.0d);
        double double20 = fastMathNew0.floor((double) (-7));
        double double22 = fastMathNew0.floor((double) 9L);
        double double24 = fastMathNew0.floor(7.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-7.0d) + "'", double20 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 9.0d + "'", double22 == 9.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7.0d + "'", double24 == 7.0d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) (-1L));
        double double8 = fastMathNew0.floor(1.2d);
        double double10 = fastMathNew0.floor((double) 10L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 6);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor((double) (-3));
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(6.0d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor(32.0d);
        double double16 = fastMathNew0.floor((-7.0d));
        double double18 = fastMathNew0.floor((-9.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-3.0d) + "'", double4 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-7.0d) + "'", double16 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-9.0d) + "'", double18 == (-9.0d));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) 3L);
        double double12 = fastMathNew0.floor((double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) (-4));
        double double14 = fastMathNew0.floor(6.9d);
        double double16 = fastMathNew0.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 6.0d + "'", double14 == 6.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) (byte) 10);
        double double14 = fastMathNew0.floor((-3.8d));
        double double16 = fastMathNew0.floor((-5.4d));
        double double18 = fastMathNew0.floor((double) 100);
        double double20 = fastMathNew0.floor((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-4.0d) + "'", double14 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-6.0d) + "'", double16 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) (byte) 10);
        double double8 = fastMathNew0.floor((double) 1);
        double double10 = fastMathNew0.floor(9.6d);
        double double12 = fastMathNew0.floor((double) (short) 100);
        double double14 = fastMathNew0.floor(5.3d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9.0d + "'", double10 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 5.0d + "'", double14 == 5.0d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 'a');
        double double14 = fastMathNew0.floor((double) 100.0f);
        double double16 = fastMathNew0.floor(100.0d);
        double double18 = fastMathNew0.floor((double) (-3L));
        double double20 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-3.0d) + "'", double18 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (byte) 0);
        double double18 = fastMathNew0.floor((double) (-4L));
        double double20 = fastMathNew0.floor(8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-4.0d) + "'", double18 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 8.0d + "'", double20 == 8.0d);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (-100));
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) (-1L));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor(100.0d);
        double double12 = fastMathNew0.floor((-100.0d));
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((double) (byte) 0);
        double double18 = fastMathNew0.floor((double) (short) 0);
        double double20 = fastMathNew0.floor((double) 10.0f);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) 1L);
        double double16 = fastMathNew0.floor(52.0d);
        double double18 = fastMathNew0.floor((double) (-7));
        double double20 = fastMathNew0.floor((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) 3);
        double double16 = fastMathNew0.floor((double) 10);
        double double18 = fastMathNew0.floor((double) (short) -1);
        double double20 = fastMathNew0.floor((-2.1d));
        double double22 = fastMathNew0.floor(100.0d);
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-3.0d) + "'", double20 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) 7);
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor((double) (-1.0f));
        double double20 = fastMathNew0.floor(2.7d);
        double double22 = fastMathNew0.floor((double) 4);
        double double24 = fastMathNew0.floor(9.6d);
        double double26 = fastMathNew0.floor(10.0d);
        java.lang.Class<?> wildcardClass27 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.0d + "'", double12 == 7.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 9.0d + "'", double24 == 9.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((-8.7d));
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.7d);
        double double8 = fastMathNew0.floor((double) (-8L));
        double double10 = fastMathNew0.floor((-1.2d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor((double) 5L);
        double double18 = fastMathNew0.floor((double) 3L);
        double double20 = fastMathNew0.floor((double) 3);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 5.0d + "'", double16 == 5.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 3.0d + "'", double20 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((-1.0d));
        double double10 = fastMathNew0.floor((double) (short) 10);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (-5L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-5.0d) + "'", double14 == (-5.0d));
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((-7.3d));
        double double16 = fastMathNew0.floor((double) 4);
        double double18 = fastMathNew0.floor((double) (-10));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-8.0d) + "'", double14 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-10.0d) + "'", double18 == (-10.0d));
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 100);
        double double14 = fastMathNew0.floor((double) 4L);
        double double16 = fastMathNew0.floor((double) 100L);
        double double18 = fastMathNew0.floor((double) 4);
        double double20 = fastMathNew0.floor((double) (short) -1);
        double double22 = fastMathNew0.floor(2.7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 4L);
        double double4 = fastMathNew0.floor(8.0d);
        double double6 = fastMathNew0.floor((double) (byte) 1);
        double double8 = fastMathNew0.floor((double) (-4));
        double double10 = fastMathNew0.floor((-8.0d));
        double double12 = fastMathNew0.floor(1.0d);
        double double14 = fastMathNew0.floor((-100.0d));
        java.lang.Class<?> wildcardClass15 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8.0d + "'", double4 == 8.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-100.0d) + "'", double14 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((-7.3d));
        double double12 = fastMathNew0.floor(6.9d);
        double double14 = fastMathNew0.floor((-8.7d));
        double double16 = fastMathNew0.floor((-3.8d));
        double double18 = fastMathNew0.floor((double) (-7L));
        double double20 = fastMathNew0.floor((double) 2L);
        double double22 = fastMathNew0.floor(4.8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-8.0d) + "'", double10 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9.0d) + "'", double14 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor((-8.0d));
        double double8 = fastMathNew0.floor((double) (byte) 0);
        double double10 = fastMathNew0.floor(0.0d);
        double double12 = fastMathNew0.floor(32.0d);
        double double14 = fastMathNew0.floor((double) (short) 10);
        double double16 = fastMathNew0.floor((double) (-1L));
        double double18 = fastMathNew0.floor((double) 0);
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((-100.0d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor((-9.3d));
        double double16 = fastMathNew0.floor((double) 0.0f);
        double double18 = fastMathNew0.floor(100.0d);
        double double20 = fastMathNew0.floor((double) 2);
        double double22 = fastMathNew0.floor((double) 1);
        double double24 = fastMathNew0.floor((-5.0d));
        double double26 = fastMathNew0.floor((double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-5.0d) + "'", double24 == (-5.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor(2.0d);
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor((double) 10);
        double double14 = fastMathNew0.floor(100.0d);
        double double16 = fastMathNew0.floor((double) (-4L));
        double double18 = fastMathNew0.floor((-6.9d));
        double double20 = fastMathNew0.floor((double) 4);
        double double22 = fastMathNew0.floor((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-4.0d) + "'", double16 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-7.0d) + "'", double18 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((double) 0L);
        double double6 = fastMathNew0.floor((double) 10);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((double) 10);
        double double12 = fastMathNew0.floor((-10.0d));
        double double14 = fastMathNew0.floor((double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-10.0d) + "'", double12 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((double) (-100));
        double double10 = fastMathNew0.floor((double) 100L);
        double double12 = fastMathNew0.floor((-4.0d));
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 8L);
        double double18 = fastMathNew0.floor((double) 2L);
        double double20 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-4.0d) + "'", double12 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 2.0d + "'", double18 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 3);
        double double4 = fastMathNew0.floor((-10.5d));
        double double6 = fastMathNew0.floor((double) (-8L));
        double double8 = fastMathNew0.floor((double) (short) 1);
        java.lang.Class<?> wildcardClass9 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-11.0d) + "'", double4 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-8.0d) + "'", double6 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor((double) 100L);
        double double6 = fastMathNew0.floor((double) 1);
        double double8 = fastMathNew0.floor((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(52.0d);
        double double8 = fastMathNew0.floor((double) (short) 100);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-1.0f));
        double double14 = fastMathNew0.floor((double) (-2L));
        double double16 = fastMathNew0.floor(6.0d);
        double double18 = fastMathNew0.floor((double) '#');
        double double20 = fastMathNew0.floor((double) 0L);
        java.lang.Class<?> wildcardClass21 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-2.0d) + "'", double14 == (-2.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 6.0d + "'", double16 == 6.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-1.0f));
        double double16 = fastMathNew0.floor((double) 9L);
        double double18 = fastMathNew0.floor((double) 6L);
        double double20 = fastMathNew0.floor((-6.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 9.0d + "'", double16 == 9.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 6.0d + "'", double18 == 6.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-6.0d) + "'", double20 == (-6.0d));
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor(100.0d);
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor(4.0d);
        double double14 = fastMathNew0.floor((double) (short) 0);
        double double16 = fastMathNew0.floor((double) 3L);
        double double18 = fastMathNew0.floor((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 3.0d + "'", double16 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor(10.0d);
        double double10 = fastMathNew0.floor((double) ' ');
        double double12 = fastMathNew0.floor((double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 6.0d + "'", double12 == 6.0d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(3.1d);
        double double12 = fastMathNew0.floor((double) 1L);
        double double14 = fastMathNew0.floor(0.0d);
        double double16 = fastMathNew0.floor(35.0d);
        double double18 = fastMathNew0.floor((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 3.0d + "'", double10 == 3.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((-10.0d));
        double double4 = fastMathNew0.floor((double) (byte) 0);
        double double6 = fastMathNew0.floor((double) (byte) 100);
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor((double) (-9));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.0d) + "'", double2 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor((double) 10);
        double double6 = fastMathNew0.floor((double) (-10));
        double double8 = fastMathNew0.floor((double) (-8));
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-10.0d) + "'", double6 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-8.0d) + "'", double8 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) 10L);
        double double10 = fastMathNew0.floor((-100.0d));
        double double12 = fastMathNew0.floor((-1.0d));
        double double14 = fastMathNew0.floor(9.6d);
        double double16 = fastMathNew0.floor((double) (short) 100);
        double double18 = fastMathNew0.floor(10.5d);
        double double20 = fastMathNew0.floor(100.0d);
        double double22 = fastMathNew0.floor((double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 9.0d + "'", double14 == 9.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(3.0d);
        double double8 = fastMathNew0.floor((double) 4);
        double double10 = fastMathNew0.floor((-1.2d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.0d + "'", double6 == 3.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-2.0d) + "'", double10 == (-2.0d));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(97.0d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor(1.2d);
        double double12 = fastMathNew0.floor((double) ' ');
        double double14 = fastMathNew0.floor((double) (-10L));
        double double16 = fastMathNew0.floor(1.2d);
        double double18 = fastMathNew0.floor((double) 3L);
        double double20 = fastMathNew0.floor((double) (-9));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-9.0d) + "'", double20 == (-9.0d));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(10.0d);
        double double14 = fastMathNew0.floor((double) 3L);
        double double16 = fastMathNew0.floor((-100.0d));
        double double18 = fastMathNew0.floor(5.3d);
        double double20 = fastMathNew0.floor((double) (byte) -1);
        double double22 = fastMathNew0.floor((double) (-3L));
        double double24 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3.0d + "'", double14 == 3.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-100.0d) + "'", double16 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 5.0d + "'", double18 == 5.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-3.0d) + "'", double22 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(8.4d);
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 0L);
        double double8 = fastMathNew0.floor((-100.0d));
        double double10 = fastMathNew0.floor(4.0d);
        double double12 = fastMathNew0.floor(3.1d);
        double double14 = fastMathNew0.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor(6.9d);
        double double12 = fastMathNew0.floor((double) (-6));
        double double14 = fastMathNew0.floor(4.0d);
        double double16 = fastMathNew0.floor((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 6.0d + "'", double10 == 6.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-6.0d) + "'", double12 == (-6.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor((-10.5d));
        double double8 = fastMathNew0.floor((double) (-100L));
        double double10 = fastMathNew0.floor((double) (short) 0);
        double double12 = fastMathNew0.floor((double) (byte) 10);
        double double14 = fastMathNew0.floor((double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-11.0d) + "'", double6 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-100.0d) + "'", double8 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) 8L);
        double double4 = fastMathNew0.floor(1.0d);
        double double6 = fastMathNew0.floor(10.5d);
        double double8 = fastMathNew0.floor((double) 'a');
        double double10 = fastMathNew0.floor((double) 0L);
        double double12 = fastMathNew0.floor(0.0d);
        double double14 = fastMathNew0.floor((double) (-3L));
        double double16 = fastMathNew0.floor((double) 0L);
        double double18 = fastMathNew0.floor((double) ' ');
        java.lang.Class<?> wildcardClass19 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-3.0d) + "'", double14 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor(1.0d);
        double double4 = fastMathNew0.floor(52.0d);
        double double6 = fastMathNew0.floor((double) 5L);
        double double8 = fastMathNew0.floor((double) (short) 1);
        double double10 = fastMathNew0.floor((double) (-4));
        double double12 = fastMathNew0.floor((double) (-7L));
        double double14 = fastMathNew0.floor(7.1d);
        double double16 = fastMathNew0.floor((double) 2);
        double double18 = fastMathNew0.floor((double) (-8));
        double double20 = fastMathNew0.floor((-8.0d));
        double double22 = fastMathNew0.floor((double) (-4));
        java.lang.Class<?> wildcardClass23 = fastMathNew0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 5.0d + "'", double6 == 5.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-4.0d) + "'", double10 == (-4.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.0d + "'", double14 == 7.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-8.0d) + "'", double18 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-8.0d) + "'", double20 == (-8.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-4.0d) + "'", double22 == (-4.0d));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) '4');
        double double4 = fastMathNew0.floor(0.0d);
        double double6 = fastMathNew0.floor((double) 9L);
        double double8 = fastMathNew0.floor((double) (byte) -1);
        double double10 = fastMathNew0.floor((-8.7d));
        double double12 = fastMathNew0.floor((-3.0d));
        double double14 = fastMathNew0.floor(97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9.0d + "'", double6 == 9.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-9.0d) + "'", double10 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-3.0d) + "'", double12 == (-3.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.math3.util.FastMathNew fastMathNew0 = new org.apache.commons.math3.util.FastMathNew();
        double double2 = fastMathNew0.floor((double) (-1));
        double double4 = fastMathNew0.floor((double) (-100L));
        double double6 = fastMathNew0.floor(0.0d);
        double double8 = fastMathNew0.floor((double) 0);
        double double10 = fastMathNew0.floor((-10.5d));
        double double12 = fastMathNew0.floor((double) (-7L));
        double double14 = fastMathNew0.floor(100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-100.0d) + "'", double4 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-11.0d) + "'", double10 == (-11.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-7.0d) + "'", double12 == (-7.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }
}

