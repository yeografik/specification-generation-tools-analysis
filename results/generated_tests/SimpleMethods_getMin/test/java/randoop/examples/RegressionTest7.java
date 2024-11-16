package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin((-3), 4);
        int int15 = simpleMethods0.getMin(4, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 0, 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (short) 1);
        int int21 = simpleMethods0.getMin(35, (int) (short) -1);
        int int24 = simpleMethods0.getMin(52, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin(0, (-1));
        int int15 = simpleMethods0.getMin((int) (byte) 0, 32);
        int int18 = simpleMethods0.getMin(2, 5);
        int int21 = simpleMethods0.getMin(0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin(10, 0);
        int int18 = simpleMethods0.getMin((-10), (int) '#');
        int int21 = simpleMethods0.getMin(3, (int) (byte) -1);
        int int24 = simpleMethods0.getMin(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) (byte) 100, (-100));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (short) 1, 2);
        int int15 = simpleMethods0.getMin((int) 'a', 7);
        int int18 = simpleMethods0.getMin(5, 0);
        int int21 = simpleMethods0.getMin(0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin((-1), 10);
        int int15 = simpleMethods0.getMin(0, (-9));
        int int18 = simpleMethods0.getMin((int) (short) 10, (int) (short) 10);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (-6));
        int int24 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-4));
        int int18 = simpleMethods0.getMin((-7), 3);
        int int21 = simpleMethods0.getMin((-8), (int) (short) 0);
        int int24 = simpleMethods0.getMin((int) (byte) 10, (-7));
        int int27 = simpleMethods0.getMin(100, (int) (byte) -1);
        int int30 = simpleMethods0.getMin((int) (byte) 10, 8);
        int int33 = simpleMethods0.getMin(100, 0);
        int int36 = simpleMethods0.getMin(8, (-10));
        int int39 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass40 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-10) + "'", int36 == (-10));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-10), 7);
        int int15 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(2, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((-8), (-8));
        int int21 = simpleMethods0.getMin((int) 'a', (-8));
        int int24 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 10);
        int int27 = simpleMethods0.getMin((int) ' ', 8);
        int int30 = simpleMethods0.getMin(10, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(7, (-1));
        int int24 = simpleMethods0.getMin(5, 2);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) ' ', 2);
        int int21 = simpleMethods0.getMin((-10), 0);
        int int24 = simpleMethods0.getMin((-10), (-7));
        int int27 = simpleMethods0.getMin(100, 1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin((int) (short) 0, (-5));
        int int18 = simpleMethods0.getMin((-2), 8);
        int int21 = simpleMethods0.getMin(3, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int15 = simpleMethods0.getMin((int) ' ', (int) (byte) 100);
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int21 = simpleMethods0.getMin(97, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-5), 0);
        int int24 = simpleMethods0.getMin((int) '4', 97);
        int int27 = simpleMethods0.getMin((-3), 3);
        int int30 = simpleMethods0.getMin((int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin(35, (int) ' ');
        int int18 = simpleMethods0.getMin(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin((int) 'a', (-4));
        int int27 = simpleMethods0.getMin((-5), (int) (byte) -1);
        int int30 = simpleMethods0.getMin((-7), (int) '4');
        int int33 = simpleMethods0.getMin(6, 7);
        int int36 = simpleMethods0.getMin((-100), 0);
        int int39 = simpleMethods0.getMin(52, (-3));
        java.lang.Class<?> wildcardClass40 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-100) + "'", int36 == (-100));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-3) + "'", int39 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-1));
        int int27 = simpleMethods0.getMin(10, 5);
        int int30 = simpleMethods0.getMin((int) (short) -1, 1);
        int int33 = simpleMethods0.getMin((int) '4', 52);
        int int36 = simpleMethods0.getMin(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin((int) 'a', (-4));
        int int27 = simpleMethods0.getMin((-5), (int) (byte) -1);
        int int30 = simpleMethods0.getMin((-7), (int) '4');
        int int33 = simpleMethods0.getMin(6, 7);
        int int36 = simpleMethods0.getMin((-6), (-5));
        int int39 = simpleMethods0.getMin((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-6) + "'", int36 == (-6));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-100), (int) (short) -1);
        int int24 = simpleMethods0.getMin(10, (int) '4');
        int int27 = simpleMethods0.getMin((int) '#', (int) '4');
        int int30 = simpleMethods0.getMin((-1), 52);
        int int33 = simpleMethods0.getMin((-100), (int) (byte) 100);
        int int36 = simpleMethods0.getMin(0, 97);
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin(1, (int) (short) -1);
        int int9 = simpleMethods0.getMin(5, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 10, (-8));
        int int15 = simpleMethods0.getMin((-9), (int) '#');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin((-7), (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 35);
        int int24 = simpleMethods0.getMin(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(100, (int) (short) 100);
        int int24 = simpleMethods0.getMin((int) '4', (-9));
        int int27 = simpleMethods0.getMin((-10), 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin(1, 4);
        int int18 = simpleMethods0.getMin(9, (int) (byte) 100);
        int int21 = simpleMethods0.getMin(35, (int) (byte) 10);
        int int24 = simpleMethods0.getMin(0, (int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(0, (-9));
        int int18 = simpleMethods0.getMin((int) ' ', (-100));
        int int21 = simpleMethods0.getMin((-1), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin(4, (int) (byte) 10);
        int int27 = simpleMethods0.getMin((-9), (-1));
        int int30 = simpleMethods0.getMin(97, 3);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(1, 2);
        int int24 = simpleMethods0.getMin((int) '#', (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((-8), 35);
        int int21 = simpleMethods0.getMin(1, 5);
        int int24 = simpleMethods0.getMin(35, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(3, 100);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (-3));
        int int24 = simpleMethods0.getMin(35, 100);
        int int27 = simpleMethods0.getMin(9, 4);
        int int30 = simpleMethods0.getMin(0, (-100));
        int int33 = simpleMethods0.getMin((int) (short) 10, (-100));
        int int36 = simpleMethods0.getMin(2, (int) '#');
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin(4, (int) (byte) 10);
        int int15 = simpleMethods0.getMin(52, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((-6), (-100));
        int int24 = simpleMethods0.getMin((-10), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-7), 0);
        int int18 = simpleMethods0.getMin(0, (-4));
        int int21 = simpleMethods0.getMin(8, (int) '#');
        int int24 = simpleMethods0.getMin(52, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) ' ', 2);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(9, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 35);
        int int21 = simpleMethods0.getMin(0, (-5));
        int int24 = simpleMethods0.getMin((-4), 97);
        int int27 = simpleMethods0.getMin(3, (-8));
        int int30 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 1);
        int int33 = simpleMethods0.getMin((int) ' ', 32);
        int int36 = simpleMethods0.getMin(1, 9);
        int int39 = simpleMethods0.getMin((int) (short) -1, 32);
        java.lang.Class<?> wildcardClass40 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin(97, 9);
        int int21 = simpleMethods0.getMin((int) '#', (int) (short) 1);
        int int24 = simpleMethods0.getMin((-7), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(1, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 100);
        int int24 = simpleMethods0.getMin(8, 5);
        int int27 = simpleMethods0.getMin((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin((-5), 100);
        int int24 = simpleMethods0.getMin((-3), (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin(32, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        int int27 = simpleMethods0.getMin((int) (short) 10, (int) ' ');
        int int30 = simpleMethods0.getMin((int) (short) 1, 4);
        int int33 = simpleMethods0.getMin((int) (byte) 1, 10);
        int int36 = simpleMethods0.getMin((-5), 35);
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-5) + "'", int36 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        int int27 = simpleMethods0.getMin((int) (short) 100, (int) '#');
        int int30 = simpleMethods0.getMin((int) (short) 10, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(6, 4);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int27 = simpleMethods0.getMin(0, 52);
        int int30 = simpleMethods0.getMin((int) ' ', (-9));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-9) + "'", int30 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin(52, (int) (short) 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 0);
        int int27 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int30 = simpleMethods0.getMin((-6), (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin(8, (int) (short) 0);
        int int15 = simpleMethods0.getMin(100, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) '4', 100);
        int int9 = simpleMethods0.getMin((int) (byte) 10, (-8));
        int int12 = simpleMethods0.getMin(3, 7);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(10, 7);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (-8));
        int int21 = simpleMethods0.getMin((int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(1, 5);
        int int18 = simpleMethods0.getMin((int) 'a', 6);
        int int21 = simpleMethods0.getMin((int) (byte) 0, 32);
        int int24 = simpleMethods0.getMin(100, 52);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin((int) 'a', (-4));
        int int27 = simpleMethods0.getMin((-5), (int) (byte) -1);
        int int30 = simpleMethods0.getMin((-7), (int) '4');
        int int33 = simpleMethods0.getMin(0, 32);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin((int) ' ', 0);
        int int21 = simpleMethods0.getMin((-2), 35);
        int int24 = simpleMethods0.getMin(100, 6);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin(35, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(97, (int) 'a');
        int int21 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin(3, (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) '4');
        int int27 = simpleMethods0.getMin(1, (-2));
        int int30 = simpleMethods0.getMin(10, 10);
        int int33 = simpleMethods0.getMin(9, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin(10, 52);
        int int24 = simpleMethods0.getMin(97, 97);
        int int27 = simpleMethods0.getMin((-4), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin(6, (int) ' ');
        int int24 = simpleMethods0.getMin((int) '4', (-4));
        int int27 = simpleMethods0.getMin((-1), 2);
        int int30 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int33 = simpleMethods0.getMin((-4), 0);
        int int36 = simpleMethods0.getMin(10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin(1, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-9));
        int int24 = simpleMethods0.getMin(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin(35, (-6));
        int int27 = simpleMethods0.getMin((int) (byte) 100, 3);
        int int30 = simpleMethods0.getMin((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        int int21 = simpleMethods0.getMin(6, 100);
        int int24 = simpleMethods0.getMin((-1), (int) (short) 1);
        int int27 = simpleMethods0.getMin((-7), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (short) 1, 2);
        int int15 = simpleMethods0.getMin((int) (byte) 1, 9);
        int int18 = simpleMethods0.getMin((-9), (-6));
        int int21 = simpleMethods0.getMin((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 0);
        int int24 = simpleMethods0.getMin(97, 10);
        int int27 = simpleMethods0.getMin(0, 2);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin((-1), (int) 'a');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 1);
        int int15 = simpleMethods0.getMin((int) '#', (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-4));
        int int15 = simpleMethods0.getMin(0, (-4));
        int int18 = simpleMethods0.getMin((-2), (int) '4');
        int int21 = simpleMethods0.getMin((-6), 3);
        int int24 = simpleMethods0.getMin((-2), (int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        int int27 = simpleMethods0.getMin(35, (-1));
        int int30 = simpleMethods0.getMin((int) (short) 10, 0);
        int int33 = simpleMethods0.getMin(100, (-3));
        int int36 = simpleMethods0.getMin((-4), (int) (short) 100);
        int int39 = simpleMethods0.getMin(35, 10);
        int int42 = simpleMethods0.getMin(0, (int) '#');
        int int45 = simpleMethods0.getMin((-1), 1);
        java.lang.Class<?> wildcardClass46 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) ' ');
        int int27 = simpleMethods0.getMin((int) 'a', (-1));
        int int30 = simpleMethods0.getMin(0, (-8));
        int int33 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int36 = simpleMethods0.getMin(9, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) 'a');
        int int21 = simpleMethods0.getMin(8, (int) (short) 1);
        int int24 = simpleMethods0.getMin(9, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((int) (short) 10, 1);
        int int24 = simpleMethods0.getMin((-6), (-2));
        int int27 = simpleMethods0.getMin((-4), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin(4, (int) (short) 10);
        int int21 = simpleMethods0.getMin(6, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin(97, 100);
        int int21 = simpleMethods0.getMin((-2), (int) ' ');
        int int24 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int27 = simpleMethods0.getMin((int) (byte) 100, 5);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) -1, 10);
        int int15 = simpleMethods0.getMin(5, (-1));
        int int18 = simpleMethods0.getMin(4, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) -1, (-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int6 = simpleMethods0.getMin((-10), 9);
        int int9 = simpleMethods0.getMin((-1), 10);
        int int12 = simpleMethods0.getMin((-100), 9);
        int int15 = simpleMethods0.getMin(7, 10);
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin(35, 32);
        int int24 = simpleMethods0.getMin((int) '#', (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-1), (-2));
        int int27 = simpleMethods0.getMin((-9), 9);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) '4', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(5, 10);
        int int18 = simpleMethods0.getMin(100, (int) (short) 10);
        int int21 = simpleMethods0.getMin((int) ' ', (int) 'a');
        int int24 = simpleMethods0.getMin(100, 35);
        int int27 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int30 = simpleMethods0.getMin(0, (int) (short) 10);
        int int33 = simpleMethods0.getMin(35, (-100));
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(7, 100);
        int int24 = simpleMethods0.getMin((int) ' ', 0);
        int int27 = simpleMethods0.getMin((-1), (-10));
        int int30 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 0);
        int int33 = simpleMethods0.getMin((-6), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 0, (int) (short) -1);
        int int24 = simpleMethods0.getMin((-10), 100);
        int int27 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(1, (int) (short) 10);
        int int15 = simpleMethods0.getMin(10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 100);
        int int24 = simpleMethods0.getMin((-4), (int) (short) 100);
        int int27 = simpleMethods0.getMin((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(1, 0);
        int int24 = simpleMethods0.getMin((-5), 97);
        int int27 = simpleMethods0.getMin((-5), (-100));
        int int30 = simpleMethods0.getMin(5, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(4, 9);
        int int24 = simpleMethods0.getMin(0, (-4));
        int int27 = simpleMethods0.getMin(35, (-3));
        int int30 = simpleMethods0.getMin(0, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin(0, (int) (short) 10);
        int int21 = simpleMethods0.getMin(5, (-8));
        int int24 = simpleMethods0.getMin(97, 5);
        int int27 = simpleMethods0.getMin(32, (int) '4');
        int int30 = simpleMethods0.getMin((int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(1, 2);
        int int21 = simpleMethods0.getMin((int) (short) 1, 4);
        int int24 = simpleMethods0.getMin(10, 9);
        int int27 = simpleMethods0.getMin(6, 10);
        int int30 = simpleMethods0.getMin((int) (short) 10, (-8));
        int int33 = simpleMethods0.getMin((int) '4', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(0, (-3));
        int int18 = simpleMethods0.getMin(6, 1);
        int int21 = simpleMethods0.getMin(6, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int15 = simpleMethods0.getMin((int) 'a', 0);
        int int18 = simpleMethods0.getMin((-10), 10);
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-100));
        int int24 = simpleMethods0.getMin((int) (byte) 10, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((-6), 9);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-7));
        int int21 = simpleMethods0.getMin(5, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin(97, 1);
        int int18 = simpleMethods0.getMin(8, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin(32, 10);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int18 = simpleMethods0.getMin(100, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin(10, 52);
        int int24 = simpleMethods0.getMin(97, 97);
        int int27 = simpleMethods0.getMin(10, 6);
        int int30 = simpleMethods0.getMin((int) (short) 10, 0);
        int int33 = simpleMethods0.getMin(0, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-7) + "'", int33 == (-7));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin(10, 5);
        int int21 = simpleMethods0.getMin((-7), 10);
        int int24 = simpleMethods0.getMin(1, (int) '4');
        int int27 = simpleMethods0.getMin(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (short) 10, 7);
        int int24 = simpleMethods0.getMin((int) 'a', 4);
        int int27 = simpleMethods0.getMin(100, (-6));
        int int30 = simpleMethods0.getMin(1, 5);
        int int33 = simpleMethods0.getMin((int) (short) -1, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9) + "'", int33 == (-9));
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(8, 100);
        int int6 = simpleMethods0.getMin((-10), 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin(1, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(35, (-3));
        int int27 = simpleMethods0.getMin(0, 32);
        int int30 = simpleMethods0.getMin(0, (int) '#');
        int int33 = simpleMethods0.getMin(0, 9);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 6);
        int int18 = simpleMethods0.getMin((-10), 32);
        int int21 = simpleMethods0.getMin((int) '4', (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        int int24 = simpleMethods0.getMin(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-7), (int) (short) 1);
        int int21 = simpleMethods0.getMin((-6), 100);
        int int24 = simpleMethods0.getMin((-1), 10);
        int int27 = simpleMethods0.getMin(4, 3);
        int int30 = simpleMethods0.getMin(10, (-4));
        int int33 = simpleMethods0.getMin(4, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin((int) ' ', 8);
        int int24 = simpleMethods0.getMin((int) '4', (int) '4');
        int int27 = simpleMethods0.getMin((-9), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(100, (int) (short) 100);
        int int24 = simpleMethods0.getMin((int) '4', (-9));
        int int27 = simpleMethods0.getMin((-8), (-100));
        int int30 = simpleMethods0.getMin(6, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-2), (-2));
        int int24 = simpleMethods0.getMin((-1), (-1));
        int int27 = simpleMethods0.getMin((-9), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin((int) ' ', 100);
        int int21 = simpleMethods0.getMin((-1), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        int int21 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        int int24 = simpleMethods0.getMin((-9), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin(35, 100);
        int int27 = simpleMethods0.getMin((int) (byte) 10, 2);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin((int) 'a', 100);
        int int27 = simpleMethods0.getMin(4, (int) 'a');
        int int30 = simpleMethods0.getMin((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(7, 100);
        int int24 = simpleMethods0.getMin((int) ' ', 0);
        int int27 = simpleMethods0.getMin((-1), (-10));
        int int30 = simpleMethods0.getMin(1, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(5, (int) 'a');
        int int24 = simpleMethods0.getMin((int) '4', (int) (byte) 10);
        int int27 = simpleMethods0.getMin((-10), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(4, (-100));
        int int12 = simpleMethods0.getMin(8, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin((int) ' ', 100);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(97, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((-100), (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (-6));
        int int21 = simpleMethods0.getMin((int) 'a', 5);
        int int24 = simpleMethods0.getMin(0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin((int) 'a', (int) (byte) 10);
        int int15 = simpleMethods0.getMin(7, (-6));
        int int18 = simpleMethods0.getMin(3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin((-1), (-2));
        int int15 = simpleMethods0.getMin(2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 6);
        int int27 = simpleMethods0.getMin(5, 1);
        int int30 = simpleMethods0.getMin((-2), (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int15 = simpleMethods0.getMin(3, (-1));
        int int18 = simpleMethods0.getMin(10, (int) 'a');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((-2), (-1));
        int int27 = simpleMethods0.getMin((int) (byte) 1, 9);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 9);
        int int18 = simpleMethods0.getMin((-6), 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((int) (short) -1, (-1));
        int int21 = simpleMethods0.getMin((int) 'a', (int) '#');
        int int24 = simpleMethods0.getMin(2, (int) (short) 100);
        int int27 = simpleMethods0.getMin(8, (int) (short) -1);
        int int30 = simpleMethods0.getMin((int) '4', (-3));
        int int33 = simpleMethods0.getMin(10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(0, (int) (short) 0);
        int int12 = simpleMethods0.getMin(5, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((-8), 35);
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int24 = simpleMethods0.getMin((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 6);
        int int18 = simpleMethods0.getMin(8, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) '#', 3);
        int int24 = simpleMethods0.getMin((-10), 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(1, 6);
        int int24 = simpleMethods0.getMin(0, (-10));
        int int27 = simpleMethods0.getMin(100, 1);
        int int30 = simpleMethods0.getMin((-6), (int) (short) -1);
        int int33 = simpleMethods0.getMin(5, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (short) -1, (-6));
        int int24 = simpleMethods0.getMin(100, 0);
        int int27 = simpleMethods0.getMin(100, 2);
        int int30 = simpleMethods0.getMin((int) '4', 7);
        int int33 = simpleMethods0.getMin((-4), 10);
        int int36 = simpleMethods0.getMin(100, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int27 = simpleMethods0.getMin((int) '#', (int) (byte) 0);
        int int30 = simpleMethods0.getMin((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin(9, 1);
        int int12 = simpleMethods0.getMin(8, (-4));
        int int15 = simpleMethods0.getMin(4, 35);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(35, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(7, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (-9));
        int int27 = simpleMethods0.getMin(0, 7);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-6), (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) (short) 10, (-8));
        int int24 = simpleMethods0.getMin((int) (byte) 1, (-2));
        int int27 = simpleMethods0.getMin(52, (int) (short) 100);
        int int30 = simpleMethods0.getMin((-4), (int) (short) 10);
        int int33 = simpleMethods0.getMin(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin(6, (int) ' ');
        int int24 = simpleMethods0.getMin((int) '4', (-4));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin((-1), 10);
        int int21 = simpleMethods0.getMin((int) ' ', 8);
        int int24 = simpleMethods0.getMin((-9), 35);
        int int27 = simpleMethods0.getMin((-8), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int15 = simpleMethods0.getMin(0, 6);
        int int18 = simpleMethods0.getMin(35, 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin(100, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(100, (-3));
        int int15 = simpleMethods0.getMin((-7), 2);
        int int18 = simpleMethods0.getMin(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin((int) '4', 7);
        int int24 = simpleMethods0.getMin((-1), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(1, 0);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-100));
        int int21 = simpleMethods0.getMin(9, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int24 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int27 = simpleMethods0.getMin(1, (-1));
        int int30 = simpleMethods0.getMin((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin(8, (int) '4');
        int int21 = simpleMethods0.getMin(100, (int) '#');
        int int24 = simpleMethods0.getMin((-1), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin((int) ' ', 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int6 = simpleMethods0.getMin((-10), 9);
        int int9 = simpleMethods0.getMin((-1), 10);
        int int12 = simpleMethods0.getMin((-100), 9);
        int int15 = simpleMethods0.getMin(7, 10);
        int int18 = simpleMethods0.getMin((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin(10, (-6));
        int int21 = simpleMethods0.getMin((-4), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin(10, 10);
        int int18 = simpleMethods0.getMin(4, (int) (short) 0);
        int int21 = simpleMethods0.getMin((-9), (-1));
        int int24 = simpleMethods0.getMin((-100), (-9));
        int int27 = simpleMethods0.getMin(0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(7, 35);
        int int21 = simpleMethods0.getMin(5, (-7));
        int int24 = simpleMethods0.getMin((-1), (-1));
        int int27 = simpleMethods0.getMin((-9), (-5));
        int int30 = simpleMethods0.getMin(35, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(10, 2);
        int int24 = simpleMethods0.getMin((-100), 6);
        int int27 = simpleMethods0.getMin((int) (short) 10, 97);
        int int30 = simpleMethods0.getMin(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin(1, 6);
        int int21 = simpleMethods0.getMin(97, 9);
        int int24 = simpleMethods0.getMin(10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(1, 5);
        int int18 = simpleMethods0.getMin(52, 1);
        int int21 = simpleMethods0.getMin((-9), (int) 'a');
        int int24 = simpleMethods0.getMin(10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int24 = simpleMethods0.getMin(1, (int) '4');
        int int27 = simpleMethods0.getMin(10, (-1));
        int int30 = simpleMethods0.getMin((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int15 = simpleMethods0.getMin(0, 6);
        int int18 = simpleMethods0.getMin((-4), 2);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(5, 10);
        int int18 = simpleMethods0.getMin(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int15 = simpleMethods0.getMin((int) (short) 0, 8);
        int int18 = simpleMethods0.getMin((-100), 4);
        int int21 = simpleMethods0.getMin((-3), (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 6);
        int int27 = simpleMethods0.getMin(5, 1);
        int int30 = simpleMethods0.getMin(32, 0);
        int int33 = simpleMethods0.getMin((-6), 0);
        int int36 = simpleMethods0.getMin((-7), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-7) + "'", int36 == (-7));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (short) 10, 35);
        int int21 = simpleMethods0.getMin((-100), (int) '4');
        int int24 = simpleMethods0.getMin((int) (byte) 0, 0);
        int int27 = simpleMethods0.getMin((-8), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) ' ');
        int int21 = simpleMethods0.getMin(32, 0);
        int int24 = simpleMethods0.getMin(52, (-10));
        int int27 = simpleMethods0.getMin((int) ' ', 0);
        int int30 = simpleMethods0.getMin((-4), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int24 = simpleMethods0.getMin((int) (short) 0, 7);
        int int27 = simpleMethods0.getMin((int) '4', (int) '4');
        int int30 = simpleMethods0.getMin((int) (short) 1, (-100));
        int int33 = simpleMethods0.getMin((-5), 0);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-5) + "'", int33 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin((-9), (int) (byte) 0);
        int int21 = simpleMethods0.getMin((-3), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin((-10), 0);
        int int15 = simpleMethods0.getMin(8, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-1), (-10));
        int int21 = simpleMethods0.getMin(97, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, 5);
        int int21 = simpleMethods0.getMin((int) (short) 0, (int) (short) 0);
        int int24 = simpleMethods0.getMin((-4), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-100), (int) (byte) 100);
        int int15 = simpleMethods0.getMin(9, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int15 = simpleMethods0.getMin((-2), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin(10, 0);
        int int24 = simpleMethods0.getMin(8, (-1));
        int int27 = simpleMethods0.getMin((-8), 97);
        int int30 = simpleMethods0.getMin(4, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin((-5), (int) (short) 0);
        int int30 = simpleMethods0.getMin((int) (short) 100, (-6));
        int int33 = simpleMethods0.getMin(0, (int) '#');
        int int36 = simpleMethods0.getMin((-8), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin((-6), 6);
        int int12 = simpleMethods0.getMin(100, 52);
        int int15 = simpleMethods0.getMin(97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int21 = simpleMethods0.getMin((-1), (-100));
        int int24 = simpleMethods0.getMin((int) (short) -1, 100);
        int int27 = simpleMethods0.getMin((-4), 0);
        int int30 = simpleMethods0.getMin((-6), (int) 'a');
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(6, 0);
        int int21 = simpleMethods0.getMin(8, 10);
        int int24 = simpleMethods0.getMin(9, (int) (byte) -1);
        int int27 = simpleMethods0.getMin((-3), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        int int27 = simpleMethods0.getMin((int) (short) 10, (int) ' ');
        int int30 = simpleMethods0.getMin((int) (short) 1, 4);
        int int33 = simpleMethods0.getMin(7, 1);
        int int36 = simpleMethods0.getMin(1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin(35, 100);
        int int27 = simpleMethods0.getMin((int) (short) -1, 0);
        int int30 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int33 = simpleMethods0.getMin(35, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int24 = simpleMethods0.getMin((int) (short) -1, 0);
        int int27 = simpleMethods0.getMin((int) '4', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(32, 0);
        int int15 = simpleMethods0.getMin(35, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin((-2), 100);
        int int30 = simpleMethods0.getMin(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin(32, (int) (short) 10);
        int int24 = simpleMethods0.getMin((-1), (int) (short) 0);
        int int27 = simpleMethods0.getMin(8, 52);
        int int30 = simpleMethods0.getMin(0, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-6), (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) (short) 10, (-8));
        int int24 = simpleMethods0.getMin(10, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 6);
        int int18 = simpleMethods0.getMin((int) 'a', 1);
        int int21 = simpleMethods0.getMin(8, (int) '#');
        int int24 = simpleMethods0.getMin(8, (int) (short) 0);
        int int27 = simpleMethods0.getMin(0, 1);
        int int30 = simpleMethods0.getMin(0, 0);
        int int33 = simpleMethods0.getMin(32, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int15 = simpleMethods0.getMin((int) 'a', 0);
        int int18 = simpleMethods0.getMin(0, 32);
        int int21 = simpleMethods0.getMin((-1), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 52);
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin(1, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-6));
        int int24 = simpleMethods0.getMin(52, (int) (short) 0);
        int int27 = simpleMethods0.getMin(9, (int) (short) -1);
        int int30 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int33 = simpleMethods0.getMin(0, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-8) + "'", int33 == (-8));
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(7, (-1));
        int int24 = simpleMethods0.getMin((int) (short) 0, 32);
        int int27 = simpleMethods0.getMin(2, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(5, 1);
        int int18 = simpleMethods0.getMin((-1), (-1));
        int int21 = simpleMethods0.getMin((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 3);
        int int24 = simpleMethods0.getMin(35, 52);
        int int27 = simpleMethods0.getMin((-9), (int) 'a');
        int int30 = simpleMethods0.getMin((-6), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(5, 10);
        int int18 = simpleMethods0.getMin(100, (int) (short) 10);
        int int21 = simpleMethods0.getMin((int) ' ', (int) 'a');
        int int24 = simpleMethods0.getMin(100, 35);
        int int27 = simpleMethods0.getMin(5, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int9 = simpleMethods0.getMin((-10), (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int24 = simpleMethods0.getMin((-100), (-100));
        int int27 = simpleMethods0.getMin(100, 0);
        int int30 = simpleMethods0.getMin(100, (-8));
        int int33 = simpleMethods0.getMin(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin(8, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 10);
        int int21 = simpleMethods0.getMin(0, 5);
        int int24 = simpleMethods0.getMin(32, 7);
        int int27 = simpleMethods0.getMin(100, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin(32, (-10));
        int int27 = simpleMethods0.getMin(0, (-8));
        int int30 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int33 = simpleMethods0.getMin(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-9) + "'", int30 == (-9));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 100);
        int int27 = simpleMethods0.getMin(2, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin(3, (-1));
        int int21 = simpleMethods0.getMin(5, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int18 = simpleMethods0.getMin(100, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin(0, 0);
        int int27 = simpleMethods0.getMin((int) 'a', (-7));
        int int30 = simpleMethods0.getMin((-9), (-10));
        int int33 = simpleMethods0.getMin(35, 8);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin((-2), (int) (short) 0);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-3));
        int int27 = simpleMethods0.getMin(0, 6);
        int int30 = simpleMethods0.getMin(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((int) '#', 0);
        int int9 = simpleMethods0.getMin(10, 32);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 10);
        int int15 = simpleMethods0.getMin(2, 97);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(0, 8);
        int int24 = simpleMethods0.getMin((-4), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin(6, 0);
        int int18 = simpleMethods0.getMin((-3), (-7));
        int int21 = simpleMethods0.getMin(9, 4);
        int int24 = simpleMethods0.getMin(4, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 6);
        int int27 = simpleMethods0.getMin((-7), 35);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(100, 1);
        int int21 = simpleMethods0.getMin((int) '#', 10);
        int int24 = simpleMethods0.getMin(52, 10);
        int int27 = simpleMethods0.getMin((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 100);
        int int27 = simpleMethods0.getMin(2, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 6);
        int int18 = simpleMethods0.getMin(0, (int) (short) 0);
        int int21 = simpleMethods0.getMin((int) (short) -1, 0);
        int int24 = simpleMethods0.getMin((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin(100, (int) ' ');
        int int15 = simpleMethods0.getMin(10, 5);
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        int int27 = simpleMethods0.getMin(0, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int18 = simpleMethods0.getMin(2, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((-8), 10);
        int int24 = simpleMethods0.getMin((-6), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin(52, 3);
        int int21 = simpleMethods0.getMin((-6), 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin(52, (int) (short) 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 0);
        int int27 = simpleMethods0.getMin((-10), 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 7);
        int int18 = simpleMethods0.getMin(9, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((int) (short) 10, 1);
        int int24 = simpleMethods0.getMin(8, (-8));
        int int27 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 0);
        int int30 = simpleMethods0.getMin(0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-4), 6);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, (-5));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-1));
        int int15 = simpleMethods0.getMin((-5), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(32, 3);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(1, 9);
        int int24 = simpleMethods0.getMin(2, (int) ' ');
        int int27 = simpleMethods0.getMin(8, (int) (byte) 0);
        int int30 = simpleMethods0.getMin(0, 7);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin((-6), 100);
        int int27 = simpleMethods0.getMin(32, 7);
        int int30 = simpleMethods0.getMin(52, 5);
        int int33 = simpleMethods0.getMin((-5), (int) (short) 0);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-5) + "'", int33 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin((-1), 10);
        int int21 = simpleMethods0.getMin((int) ' ', 8);
        int int24 = simpleMethods0.getMin((int) (byte) -1, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(100, 2);
        int int21 = simpleMethods0.getMin(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int18 = simpleMethods0.getMin(97, 52);
        int int21 = simpleMethods0.getMin((-9), (int) (short) 10);
        int int24 = simpleMethods0.getMin(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin(1, 100);
        int int18 = simpleMethods0.getMin(100, 35);
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int15 = simpleMethods0.getMin(3, (-1));
        int int18 = simpleMethods0.getMin(2, 0);
        int int21 = simpleMethods0.getMin((-8), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((-1), 9);
        int int24 = simpleMethods0.getMin(7, 3);
        int int27 = simpleMethods0.getMin(2, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin(8, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) ' ', (-5));
        int int18 = simpleMethods0.getMin((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(4, 9);
        int int24 = simpleMethods0.getMin(100, 5);
        int int27 = simpleMethods0.getMin((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int24 = simpleMethods0.getMin((-100), (-100));
        int int27 = simpleMethods0.getMin(100, 0);
        int int30 = simpleMethods0.getMin(100, (-8));
        int int33 = simpleMethods0.getMin((int) ' ', 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-2));
        int int18 = simpleMethods0.getMin((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int24 = simpleMethods0.getMin(10, (int) (byte) 0);
        int int27 = simpleMethods0.getMin((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin(10, 52);
        int int24 = simpleMethods0.getMin(97, 97);
        int int27 = simpleMethods0.getMin((-4), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin(35, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(97, (int) 'a');
        int int21 = simpleMethods0.getMin(0, (int) (byte) 100);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-2));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-6));
        int int24 = simpleMethods0.getMin(4, 1);
        int int27 = simpleMethods0.getMin((-2), 0);
        int int30 = simpleMethods0.getMin((-4), 100);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin(100, 0);
        int int30 = simpleMethods0.getMin(97, (int) (byte) 100);
        int int33 = simpleMethods0.getMin(10, (int) (short) -1);
        int int36 = simpleMethods0.getMin(4, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin((-8), 3);
        int int12 = simpleMethods0.getMin(100, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-10));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin((-7), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 100);
        int int21 = simpleMethods0.getMin(1, (int) (short) -1);
        int int24 = simpleMethods0.getMin((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin((-8), 0);
        int int21 = simpleMethods0.getMin(100, 35);
        int int24 = simpleMethods0.getMin(100, (-6));
        int int27 = simpleMethods0.getMin(0, 32);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 3);
        int int24 = simpleMethods0.getMin(35, 52);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((-2), (int) 'a');
        int int15 = simpleMethods0.getMin(2, (-10));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 3);
        int int15 = simpleMethods0.getMin((-5), (int) '#');
        int int18 = simpleMethods0.getMin((-7), 100);
        int int21 = simpleMethods0.getMin(5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-9), (int) (byte) 100);
        int int24 = simpleMethods0.getMin(9, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-3), (int) (byte) 100);
        int int15 = simpleMethods0.getMin(5, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(5, 10);
        int int18 = simpleMethods0.getMin(100, (int) (short) 10);
        int int21 = simpleMethods0.getMin((int) ' ', (int) 'a');
        int int24 = simpleMethods0.getMin(1, (-9));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin((-9), (-8));
        int int21 = simpleMethods0.getMin((-100), 32);
        int int24 = simpleMethods0.getMin(5, 2);
        int int27 = simpleMethods0.getMin((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin((-2), 100);
        int int30 = simpleMethods0.getMin(1, 10);
        int int33 = simpleMethods0.getMin(10, 32);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(1, 2);
        int int21 = simpleMethods0.getMin((int) (short) 1, 4);
        int int24 = simpleMethods0.getMin(10, 8);
        int int27 = simpleMethods0.getMin(100, (-9));
        int int30 = simpleMethods0.getMin(100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(52, 52);
        int int24 = simpleMethods0.getMin((-6), (int) (short) 10);
        int int27 = simpleMethods0.getMin(32, 1);
        int int30 = simpleMethods0.getMin(9, (int) (short) 0);
        int int33 = simpleMethods0.getMin((int) (short) 10, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        int int21 = simpleMethods0.getMin(6, 100);
        int int24 = simpleMethods0.getMin((-1), (int) (short) 1);
        int int27 = simpleMethods0.getMin((-3), 10);
        int int30 = simpleMethods0.getMin(10, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int27 = simpleMethods0.getMin(0, 52);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (short) 0, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin(9, 1);
        int int12 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int15 = simpleMethods0.getMin((-10), 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin((-3), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) (short) 10, 100);
        int int18 = simpleMethods0.getMin(100, 9);
        int int21 = simpleMethods0.getMin(10, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int21 = simpleMethods0.getMin((-1), (-100));
        int int24 = simpleMethods0.getMin((int) (short) -1, 100);
        int int27 = simpleMethods0.getMin((-3), 9);
        int int30 = simpleMethods0.getMin(10, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, 35);
        int int27 = simpleMethods0.getMin((-7), (int) '#');
        int int30 = simpleMethods0.getMin((int) '#', 52);
        int int33 = simpleMethods0.getMin(1, 0);
        int int36 = simpleMethods0.getMin((-3), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin(52, 97);
        int int15 = simpleMethods0.getMin((-7), 0);
        int int18 = simpleMethods0.getMin(7, 5);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin(0, 0);
        int int27 = simpleMethods0.getMin((int) 'a', (-7));
        int int30 = simpleMethods0.getMin((-9), (-10));
        int int33 = simpleMethods0.getMin((-1), 1);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) ' ');
        int int27 = simpleMethods0.getMin((int) 'a', (-1));
        int int30 = simpleMethods0.getMin(0, (-8));
        int int33 = simpleMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(35, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(7, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (-9));
        int int27 = simpleMethods0.getMin((-4), 1);
        int int30 = simpleMethods0.getMin((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin((int) (short) 1, 0);
        int int27 = simpleMethods0.getMin((-2), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(10, (int) (short) 10);
        int int18 = simpleMethods0.getMin(3, 1);
        int int21 = simpleMethods0.getMin((-4), (-9));
        int int24 = simpleMethods0.getMin(1, (int) '#');
        int int27 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int30 = simpleMethods0.getMin((int) (short) 0, 100);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(35, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(7, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (-9));
        int int27 = simpleMethods0.getMin(0, 7);
        int int30 = simpleMethods0.getMin((int) (byte) 10, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) ' ', 2);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int21 = simpleMethods0.getMin((-5), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin(0, 6);
        int int24 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int27 = simpleMethods0.getMin((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin((int) (short) 1, 1);
        int int21 = simpleMethods0.getMin(10, 97);
        int int24 = simpleMethods0.getMin(100, 100);
        int int27 = simpleMethods0.getMin((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin((-7), (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 35);
        int int24 = simpleMethods0.getMin((-7), 10);
        int int27 = simpleMethods0.getMin(52, (int) ' ');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-2), (-2));
        int int24 = simpleMethods0.getMin((int) (short) 100, 100);
        int int27 = simpleMethods0.getMin(8, 97);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(1, 0);
        int int24 = simpleMethods0.getMin((-5), 97);
        int int27 = simpleMethods0.getMin(0, 4);
        int int30 = simpleMethods0.getMin(2, (-3));
        int int33 = simpleMethods0.getMin(10, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-6));
        int int24 = simpleMethods0.getMin((int) 'a', (int) ' ');
        int int27 = simpleMethods0.getMin(8, 97);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((-6), (int) 'a');
        int int27 = simpleMethods0.getMin((-6), 7);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(52, (-1));
        int int27 = simpleMethods0.getMin(5, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-6));
        int int24 = simpleMethods0.getMin((int) 'a', (int) ' ');
        int int27 = simpleMethods0.getMin(8, 97);
        int int30 = simpleMethods0.getMin(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (short) 100);
        int int15 = simpleMethods0.getMin((-8), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin((-3), 4);
        int int15 = simpleMethods0.getMin(4, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int21 = simpleMethods0.getMin((-7), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 10);
        int int18 = simpleMethods0.getMin((-9), (-4));
        int int21 = simpleMethods0.getMin((-7), 0);
        int int24 = simpleMethods0.getMin((-9), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(7, (int) (short) 0);
        int int18 = simpleMethods0.getMin(6, (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((-8), (-8));
        int int21 = simpleMethods0.getMin((int) 'a', (-8));
        int int24 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 10);
        int int27 = simpleMethods0.getMin((int) ' ', 8);
        int int30 = simpleMethods0.getMin(7, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin((-1), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((-5), 100);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) 0);
        int int21 = simpleMethods0.getMin(10, (-2));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 10, 10);
        int int24 = simpleMethods0.getMin(7, (int) (byte) 100);
        int int27 = simpleMethods0.getMin((int) (byte) 100, 35);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin(10, 5);
        int int21 = simpleMethods0.getMin((-7), 10);
        int int24 = simpleMethods0.getMin(1, 2);
        int int27 = simpleMethods0.getMin(8, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 1);
        int int15 = simpleMethods0.getMin(7, 32);
        int int18 = simpleMethods0.getMin(10, (int) 'a');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(5, (int) 'a');
        int int24 = simpleMethods0.getMin((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) ' ');
        int int15 = simpleMethods0.getMin((-1), 8);
        int int18 = simpleMethods0.getMin(3, (-1));
        int int21 = simpleMethods0.getMin(0, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin(4, (int) (short) 10);
        int int30 = simpleMethods0.getMin(10, (-4));
        int int33 = simpleMethods0.getMin((int) (short) -1, (int) (short) -1);
        int int36 = simpleMethods0.getMin((-6), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-6) + "'", int36 == (-6));
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (short) 0, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) '4');
        int int21 = simpleMethods0.getMin((-1), 8);
        int int24 = simpleMethods0.getMin((-1), (int) '4');
        int int27 = simpleMethods0.getMin((-5), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) ' ');
        int int27 = simpleMethods0.getMin((int) 'a', (-1));
        int int30 = simpleMethods0.getMin(0, (-8));
        int int33 = simpleMethods0.getMin(0, (int) (short) -1);
        int int36 = simpleMethods0.getMin((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin(4, (int) (short) 10);
        int int30 = simpleMethods0.getMin((-3), (-100));
        int int33 = simpleMethods0.getMin(3, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin((int) ' ', 10);
        int int18 = simpleMethods0.getMin((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin((-10), (-6));
        int int21 = simpleMethods0.getMin((int) 'a', (int) (byte) 10);
        int int24 = simpleMethods0.getMin(5, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 0);
        int int18 = simpleMethods0.getMin((-6), 0);
        int int21 = simpleMethods0.getMin((-1), 9);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((int) '4', 0);
        int int27 = simpleMethods0.getMin(0, (-8));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(35, (-100));
        int int18 = simpleMethods0.getMin((int) '4', (-2));
        int int21 = simpleMethods0.getMin(2, 0);
        int int24 = simpleMethods0.getMin((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin(8, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) ' ', (-5));
        int int18 = simpleMethods0.getMin((-4), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin(0, 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) ' ');
        int int21 = simpleMethods0.getMin((-10), (int) 'a');
        int int24 = simpleMethods0.getMin(6, (int) (short) 10);
        int int27 = simpleMethods0.getMin(8, (int) (byte) 1);
        int int30 = simpleMethods0.getMin((-3), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int24 = simpleMethods0.getMin((-100), (int) (byte) 0);
        int int27 = simpleMethods0.getMin((-7), 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin(10, (int) '4');
        int int27 = simpleMethods0.getMin((-7), 32);
        int int30 = simpleMethods0.getMin(4, 3);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(0, 100);
        int int27 = simpleMethods0.getMin((-5), (-1));
        int int30 = simpleMethods0.getMin(10, 2);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (-1));
        int int15 = simpleMethods0.getMin(10, 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(0, 100);
        int int15 = simpleMethods0.getMin(7, 5);
        int int18 = simpleMethods0.getMin(7, 0);
        int int21 = simpleMethods0.getMin(1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(2, (-7));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 10);
        int int12 = simpleMethods0.getMin((-2), (-100));
        int int15 = simpleMethods0.getMin(3, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-5), 2);
        int int21 = simpleMethods0.getMin(97, 1);
        int int24 = simpleMethods0.getMin(9, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(4, 9);
        int int24 = simpleMethods0.getMin(0, (-4));
        int int27 = simpleMethods0.getMin(35, (-3));
        int int30 = simpleMethods0.getMin(97, (-4));
        int int33 = simpleMethods0.getMin(3, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin(32, 10);
        int int15 = simpleMethods0.getMin((int) '4', (int) (short) 10);
        int int18 = simpleMethods0.getMin(3, (-5));
        int int21 = simpleMethods0.getMin(4, 2);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin(4, 52);
        int int18 = simpleMethods0.getMin(100, (int) '#');
        int int21 = simpleMethods0.getMin(32, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((-10), 0);
        int int27 = simpleMethods0.getMin(9, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(0, 100);
        int int27 = simpleMethods0.getMin((-5), (-1));
        int int30 = simpleMethods0.getMin((int) 'a', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin((-10), 0);
        int int15 = simpleMethods0.getMin(8, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-1), (-10));
        int int21 = simpleMethods0.getMin((int) (byte) 1, 10);
        int int24 = simpleMethods0.getMin(3, 0);
        int int27 = simpleMethods0.getMin(100, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 10, (-2));
        int int24 = simpleMethods0.getMin(3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin((int) ' ', 0);
        int int21 = simpleMethods0.getMin((-2), 35);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        int int18 = simpleMethods0.getMin(9, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 100, 3);
        int int24 = simpleMethods0.getMin(0, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((-8), (int) (short) 1);
        int int27 = simpleMethods0.getMin((-5), 2);
        int int30 = simpleMethods0.getMin((-100), 100);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(10, 2);
        int int24 = simpleMethods0.getMin((int) '4', (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-8), (-8));
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (-1));
        int int21 = simpleMethods0.getMin(1, 97);
        int int24 = simpleMethods0.getMin(4, (int) (short) 10);
        int int27 = simpleMethods0.getMin(7, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(1, 2);
        int int21 = simpleMethods0.getMin((int) (short) 100, (-1));
        int int24 = simpleMethods0.getMin(8, (-1));
        int int27 = simpleMethods0.getMin((int) (byte) 100, (int) '#');
        int int30 = simpleMethods0.getMin(2, (-3));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin((-1), 0);
        int int18 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 10);
        int int21 = simpleMethods0.getMin((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(1, (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 10, 5);
        int int18 = simpleMethods0.getMin(52, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin(52, 97);
        int int15 = simpleMethods0.getMin((-7), 0);
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) 'a');
        int int21 = simpleMethods0.getMin(8, (int) (short) 1);
        int int24 = simpleMethods0.getMin((-7), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(1, 6);
        int int24 = simpleMethods0.getMin(0, 0);
        int int27 = simpleMethods0.getMin((-7), 35);
        int int30 = simpleMethods0.getMin(2, 32);
        int int33 = simpleMethods0.getMin(6, 0);
        int int36 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int39 = simpleMethods0.getMin(32, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-10), 10);
        int int24 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int27 = simpleMethods0.getMin((int) (short) 100, 9);
        int int30 = simpleMethods0.getMin((int) (byte) 10, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-4), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(1, 35);
        int int18 = simpleMethods0.getMin((-10), (int) '4');
        int int21 = simpleMethods0.getMin((-100), (-5));
        int int24 = simpleMethods0.getMin((-9), 6);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-10), 7);
        int int15 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(97, (-3));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) -1, 10);
        int int15 = simpleMethods0.getMin((-6), (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (-1));
        int int15 = simpleMethods0.getMin((int) '4', (-100));
        int int18 = simpleMethods0.getMin(2, (int) (byte) 100);
        int int21 = simpleMethods0.getMin(52, 3);
        int int24 = simpleMethods0.getMin(10, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((int) '#', (-2));
        int int15 = simpleMethods0.getMin(5, 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int15 = simpleMethods0.getMin(0, 6);
        int int18 = simpleMethods0.getMin(100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        int int27 = simpleMethods0.getMin((int) (short) 1, (-4));
        int int30 = simpleMethods0.getMin(52, 35);
        int int33 = simpleMethods0.getMin(0, (int) (short) -1);
        int int36 = simpleMethods0.getMin((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-100), (int) (short) -1);
        int int24 = simpleMethods0.getMin(10, (int) '4');
        int int27 = simpleMethods0.getMin((int) '#', (int) '4');
        int int30 = simpleMethods0.getMin((-6), (int) (short) 100);
        int int33 = simpleMethods0.getMin(97, 0);
        int int36 = simpleMethods0.getMin(100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin(10, 3);
        int int21 = simpleMethods0.getMin(8, 100);
        int int24 = simpleMethods0.getMin((int) (short) -1, 100);
        int int27 = simpleMethods0.getMin((-9), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(1, 2);
        int int21 = simpleMethods0.getMin((int) (short) 1, 4);
        int int24 = simpleMethods0.getMin(10, 8);
        int int27 = simpleMethods0.getMin((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(1, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(52, 52);
        int int24 = simpleMethods0.getMin(8, 0);
        int int27 = simpleMethods0.getMin(35, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin(6, (-5));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int9 = simpleMethods0.getMin((-1), (-8));
        int int12 = simpleMethods0.getMin((-100), 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int24 = simpleMethods0.getMin(10, 35);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(10, 1);
        int int24 = simpleMethods0.getMin((int) ' ', (-4));
        int int27 = simpleMethods0.getMin(0, (-10));
        int int30 = simpleMethods0.getMin((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((-8), 10);
        int int24 = simpleMethods0.getMin(2, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 52);
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        int int27 = simpleMethods0.getMin((-4), (-8));
        int int30 = simpleMethods0.getMin(35, (int) (short) 0);
        int int33 = simpleMethods0.getMin(1, 0);
        int int36 = simpleMethods0.getMin(5, (int) (short) 100);
        int int39 = simpleMethods0.getMin(10, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-4), 0);
        int int24 = simpleMethods0.getMin(100, 3);
        int int27 = simpleMethods0.getMin((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 6);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(4, 9);
        int int24 = simpleMethods0.getMin(0, (-4));
        int int27 = simpleMethods0.getMin(35, (-3));
        int int30 = simpleMethods0.getMin((-4), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(35, 7);
        int int15 = simpleMethods0.getMin((-2), 7);
        int int18 = simpleMethods0.getMin((int) 'a', (-6));
        int int21 = simpleMethods0.getMin(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (int) '#');
        int int21 = simpleMethods0.getMin((int) ' ', 32);
        int int24 = simpleMethods0.getMin(97, (int) ' ');
        int int27 = simpleMethods0.getMin(32, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (short) -1, (-6));
        int int24 = simpleMethods0.getMin(100, 0);
        int int27 = simpleMethods0.getMin((int) (short) 100, 3);
        int int30 = simpleMethods0.getMin((int) (short) -1, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-7), 5);
        int int27 = simpleMethods0.getMin(9, (-3));
        int int30 = simpleMethods0.getMin(6, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin(1, 97);
        int int12 = simpleMethods0.getMin(3, (-7));
        int int15 = simpleMethods0.getMin(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((-6), (int) 'a');
        int int27 = simpleMethods0.getMin(2, 9);
        int int30 = simpleMethods0.getMin((int) '4', 0);
        int int33 = simpleMethods0.getMin(0, (int) (short) 1);
        int int36 = simpleMethods0.getMin(2, 5);
        int int39 = simpleMethods0.getMin((int) (byte) 1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin(10, 0);
        int int18 = simpleMethods0.getMin(7, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin((-1), 100);
        int int21 = simpleMethods0.getMin((-10), (-8));
        int int24 = simpleMethods0.getMin((-3), (-3));
        int int27 = simpleMethods0.getMin(0, (-9));
        int int30 = simpleMethods0.getMin((int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 1, 32);
        int int15 = simpleMethods0.getMin((-9), 0);
        int int18 = simpleMethods0.getMin(100, 9);
        int int21 = simpleMethods0.getMin(1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin((-4), 100);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-100));
        int int21 = simpleMethods0.getMin(0, (int) (short) 10);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) -1, 10);
        int int15 = simpleMethods0.getMin(5, (-1));
        int int18 = simpleMethods0.getMin((-1), (int) ' ');
        int int21 = simpleMethods0.getMin(6, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-5), 0);
        int int24 = simpleMethods0.getMin((int) ' ', (-2));
        int int27 = simpleMethods0.getMin(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-1), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(1, 0);
        int int18 = simpleMethods0.getMin((-2), 0);
        int int21 = simpleMethods0.getMin(4, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (int) '#');
        int int21 = simpleMethods0.getMin((int) ' ', 32);
        int int24 = simpleMethods0.getMin(97, (int) ' ');
        int int27 = simpleMethods0.getMin(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((-10), 6);
        int int18 = simpleMethods0.getMin((-1), 1);
        int int21 = simpleMethods0.getMin(52, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(4, (-100));
        int int12 = simpleMethods0.getMin(8, (-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        int int27 = simpleMethods0.getMin((-4), (-8));
        int int30 = simpleMethods0.getMin(35, (int) (short) 0);
        int int33 = simpleMethods0.getMin(52, (-6));
        int int36 = simpleMethods0.getMin(8, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int12 = simpleMethods0.getMin(100, 9);
        int int15 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        int int18 = simpleMethods0.getMin(100, 9);
        int int21 = simpleMethods0.getMin((int) 'a', 52);
        int int24 = simpleMethods0.getMin((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin((-6), (-1));
        int int18 = simpleMethods0.getMin(4, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin((int) (byte) -1, (int) '#');
        int int24 = simpleMethods0.getMin((-100), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(52, 5);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) ' ', 2);
        int int21 = simpleMethods0.getMin((-1), 2);
        int int24 = simpleMethods0.getMin((int) (short) -1, 32);
        int int27 = simpleMethods0.getMin((-100), 0);
        int int30 = simpleMethods0.getMin(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((int) ' ', 8);
        int int15 = simpleMethods0.getMin(5, (int) '#');
        int int18 = simpleMethods0.getMin((-10), 97);
        int int21 = simpleMethods0.getMin(100, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((int) '#', 0);
        int int9 = simpleMethods0.getMin(35, (-6));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-10), 7);
        int int15 = simpleMethods0.getMin((int) '#', (-7));
        int int18 = simpleMethods0.getMin(2, (-1));
        int int21 = simpleMethods0.getMin(52, 1);
        int int24 = simpleMethods0.getMin((-3), (int) ' ');
        int int27 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 1);
        int int30 = simpleMethods0.getMin(0, 35);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (int) (byte) 1);
        int int21 = simpleMethods0.getMin((int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin(10, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) '#', 0);
        int int24 = simpleMethods0.getMin((-5), 8);
        int int27 = simpleMethods0.getMin((int) 'a', (int) (byte) 10);
        int int30 = simpleMethods0.getMin((-10), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, 35);
        int int27 = simpleMethods0.getMin((-100), (int) '#');
        int int30 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(1, 6);
        int int24 = simpleMethods0.getMin(0, 0);
        int int27 = simpleMethods0.getMin((-7), 35);
        int int30 = simpleMethods0.getMin(2, 32);
        int int33 = simpleMethods0.getMin((int) ' ', 9);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) ' ', (-100));
        int int18 = simpleMethods0.getMin(5, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int15 = simpleMethods0.getMin((int) ' ', (int) (byte) 100);
        int int18 = simpleMethods0.getMin((-8), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (short) -1, (-6));
        int int24 = simpleMethods0.getMin(100, 0);
        int int27 = simpleMethods0.getMin((int) (short) 100, 3);
        int int30 = simpleMethods0.getMin((-10), 1);
        int int33 = simpleMethods0.getMin(0, (-2));
        int int36 = simpleMethods0.getMin(2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(0, (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin((int) (short) 0, (-10));
        int int21 = simpleMethods0.getMin((-7), (int) (byte) 10);
        int int24 = simpleMethods0.getMin(0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((-6), 1);
        int int18 = simpleMethods0.getMin((-6), 10);
        int int21 = simpleMethods0.getMin((-1), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((-1), 9);
        int int24 = simpleMethods0.getMin(7, 3);
        int int27 = simpleMethods0.getMin((int) (short) 100, 97);
        int int30 = simpleMethods0.getMin(9, 97);
        int int33 = simpleMethods0.getMin(6, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }
}

