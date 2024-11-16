package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(1, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-10), 97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-8), (-8));
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 3);
        int int15 = simpleMethods0.getMin((-5), (int) '#');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((int) (byte) 0, 3);
        int int27 = simpleMethods0.getMin(100, 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(9, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) -1, 8);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin(5, 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((int) ' ', 0);
        int int24 = simpleMethods0.getMin(0, 3);
        int int27 = simpleMethods0.getMin((int) (short) 10, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(1, 9);
        int int24 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(7, 100);
        int int24 = simpleMethods0.getMin((int) ' ', 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((-10), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        int int21 = simpleMethods0.getMin((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(9, 35);
        int int27 = simpleMethods0.getMin(2, (-10));
        int int30 = simpleMethods0.getMin((int) '#', (int) (short) -1);
        int int33 = simpleMethods0.getMin(0, (int) (short) 100);
        int int36 = simpleMethods0.getMin((-1), 35);
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(9, (int) (short) 0);
        int int21 = simpleMethods0.getMin(52, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-1), 2);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(7, (int) (byte) 10);
        int int18 = simpleMethods0.getMin(100, 3);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin(0, 4);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-10));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin(1, 4);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((-5), (-7));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin(0, (-100));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(5, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (short) -1, (-6));
        int int24 = simpleMethods0.getMin(100, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin(100, (int) ' ');
        int int15 = simpleMethods0.getMin(10, 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin(4, 52);
        int int18 = simpleMethods0.getMin(0, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin((-2), (int) 'a');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin((-10), (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        int int33 = simpleMethods0.getMin((int) (byte) 0, 1);
        int int36 = simpleMethods0.getMin(8, (int) (byte) 100);
        int int39 = simpleMethods0.getMin((-7), 9);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-7) + "'", int39 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((int) ' ', 0);
        int int24 = simpleMethods0.getMin(0, 3);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin(100, (int) ' ');
        int int15 = simpleMethods0.getMin(10, 5);
        int int18 = simpleMethods0.getMin(100, 6);
        int int21 = simpleMethods0.getMin((-7), 9);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        int int21 = simpleMethods0.getMin(6, 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        int int30 = simpleMethods0.getMin((int) (byte) 1, (-2));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-9), 100);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin((int) (short) 1, (-10));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((-8), (-8));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin(35, 100);
        int int27 = simpleMethods0.getMin((int) (short) 100, (-9));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-9), 100);
        int int15 = simpleMethods0.getMin(0, 7);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin(0, 1);
        int int21 = simpleMethods0.getMin((-3), 0);
        int int24 = simpleMethods0.getMin(5, 4);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin(0, 1);
        int int21 = simpleMethods0.getMin((-100), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        int int33 = simpleMethods0.getMin((int) (byte) 0, 1);
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin(10, (int) (short) 1);
        int int21 = simpleMethods0.getMin(6, (-6));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(9, 1);
        int int21 = simpleMethods0.getMin((-5), 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin((-2), 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(52, 52);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((-8), (-8));
        int int21 = simpleMethods0.getMin(0, 35);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        int int30 = simpleMethods0.getMin((int) '4', 1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int15 = simpleMethods0.getMin((-7), 6);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(9, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-4));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (short) 10, 35);
        int int21 = simpleMethods0.getMin((-100), (int) '4');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-10));
        int int15 = simpleMethods0.getMin((-1), 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin((-3), 4);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((-7), (int) '#');
        int int18 = simpleMethods0.getMin(10, (-2));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(35, 7);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-10), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((-6), (-100));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((int) '4', 35);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin(97, 32);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(1, 4);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin(7, 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin(4, 52);
        int int18 = simpleMethods0.getMin(100, (int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((int) ' ', 8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-10), 7);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin(2, (-100));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int12 = simpleMethods0.getMin(100, (-9));
        int int15 = simpleMethods0.getMin(2, (-7));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin(10, (int) '4');
        int int27 = simpleMethods0.getMin((-9), (-4));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(0, (-3));
        int int18 = simpleMethods0.getMin((int) (short) 100, (-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int18 = simpleMethods0.getMin((-8), (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-8), 8);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((int) '#', 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(9, (int) (short) 0);
        int int21 = simpleMethods0.getMin(52, (int) (short) 10);
        int int24 = simpleMethods0.getMin((-8), (-1));
        int int27 = simpleMethods0.getMin(32, (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(5, (int) '#');
        int int18 = simpleMethods0.getMin(4, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((-7), 4);
        int int9 = simpleMethods0.getMin(6, 97);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-7) + "'", int6 == (-7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (short) 10, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin(0, (-8));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(35, (-100));
        int int18 = simpleMethods0.getMin((int) '4', (-2));
        int int21 = simpleMethods0.getMin(2, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((-10), 1);
        int int9 = simpleMethods0.getMin((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(1, 35);
        int int18 = simpleMethods0.getMin((-1), 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin((-4), 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin(35, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, 6);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) -1, 10);
        int int15 = simpleMethods0.getMin(5, (-1));
        int int18 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin(1, 100);
        int int24 = simpleMethods0.getMin(0, (int) ' ');
        int int27 = simpleMethods0.getMin(35, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin(9, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) 'a');
        int int21 = simpleMethods0.getMin(8, (int) (short) 1);
        int int24 = simpleMethods0.getMin((int) '#', (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(1, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin((-100), 3);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((-3), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin(10, 3);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(4, (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((-8), (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) ' ', 2);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin(1, 5);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(1, (-8));
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int24 = simpleMethods0.getMin(10, 0);
        int int27 = simpleMethods0.getMin(52, 2);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(100, 6);
        int int12 = simpleMethods0.getMin((-6), 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((-8), (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(35, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin(0, (-7));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-7) + "'", int6 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin(1, 4);
        int int18 = simpleMethods0.getMin(9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (-8));
        int int24 = simpleMethods0.getMin((-7), (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, 4);
        int int12 = simpleMethods0.getMin((int) (short) 1, 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 9);
        int int18 = simpleMethods0.getMin(8, 2);
        int int21 = simpleMethods0.getMin((-4), (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin(100, (int) ' ');
        int int15 = simpleMethods0.getMin(10, 5);
        int int18 = simpleMethods0.getMin(100, 6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(8, (int) '4');
        int int21 = simpleMethods0.getMin((-2), (int) ' ');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        int int30 = simpleMethods0.getMin(7, (-10));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin(32, 32);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin((-7), (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 35);
        int int24 = simpleMethods0.getMin((-7), 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((-6), 9);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int24 = simpleMethods0.getMin(3, (-9));
        int int27 = simpleMethods0.getMin(7, (-5));
        int int30 = simpleMethods0.getMin((-100), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(1, (-8));
        int int21 = simpleMethods0.getMin(0, 1);
        int int24 = simpleMethods0.getMin((int) 'a', 100);
        int int27 = simpleMethods0.getMin(100, (int) ' ');
        int int30 = simpleMethods0.getMin((-1), 100);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 10);
        int int24 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin(8, (int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin(100, (-100));
        int int9 = simpleMethods0.getMin((-5), 6);
        int int12 = simpleMethods0.getMin((int) '4', 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(1, 6);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int6 = simpleMethods0.getMin(1, 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin(6, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin(6, (int) ' ');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (short) 10, 35);
        int int21 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 10);
        int int24 = simpleMethods0.getMin((int) (byte) 10, 52);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin((-6), 6);
        int int12 = simpleMethods0.getMin(100, 52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        int int27 = simpleMethods0.getMin(10, 35);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin(52, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int24 = simpleMethods0.getMin(1, (int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin((-7), (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 35);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(10, 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int21 = simpleMethods0.getMin((-1), (-100));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(1, (-10));
        int int12 = simpleMethods0.getMin(35, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin((-9), (int) 'a');
        int int15 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int18 = simpleMethods0.getMin((int) '4', 32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(10, (-8));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin(1, (int) (short) -1);
        int int9 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin((int) (short) 0, (-8));
        int int24 = simpleMethods0.getMin(32, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(35, 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin(97, (int) (short) 0);
        int int21 = simpleMethods0.getMin(1, (int) ' ');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int18 = simpleMethods0.getMin(10, 97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin((int) (byte) 100, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(3, 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) ' ');
        int int21 = simpleMethods0.getMin((-6), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) ' ', 2);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int18 = simpleMethods0.getMin(97, 52);
        int int21 = simpleMethods0.getMin((-9), (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(9, 35);
        int int27 = simpleMethods0.getMin(2, (-10));
        int int30 = simpleMethods0.getMin((int) '#', (int) (short) -1);
        int int33 = simpleMethods0.getMin(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin(8, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(5, 52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-7), 5);
        int int27 = simpleMethods0.getMin(100, 6);
        int int30 = simpleMethods0.getMin((int) (short) 0, 10);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((-8), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin(10, 52);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-2), (-2));
        int int24 = simpleMethods0.getMin((-1), (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((-10), 6);
        int int18 = simpleMethods0.getMin((-1), 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin(10, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((-8), 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((-5), (-7));
        int int24 = simpleMethods0.getMin(0, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        int int21 = simpleMethods0.getMin(6, 100);
        int int24 = simpleMethods0.getMin((int) (byte) 10, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(7, 32);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int24 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin((int) '#', (int) (short) 100);
        int int30 = simpleMethods0.getMin((-5), (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(1, 100);
        int int27 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int21 = simpleMethods0.getMin(2, 3);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(3, 100);
        int int21 = simpleMethods0.getMin(10, 8);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(6, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(100, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-9), 100);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 100);
        int int18 = simpleMethods0.getMin(2, (-8));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin(1, 0);
        int int24 = simpleMethods0.getMin((-5), 97);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) -1, (int) ' ');
        int int15 = simpleMethods0.getMin((int) (short) 0, 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(1, (int) (short) 10);
        int int15 = simpleMethods0.getMin(35, 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 3);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((-10), 6);
        int int18 = simpleMethods0.getMin((-1), 1);
        int int21 = simpleMethods0.getMin(6, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin(32, (int) (short) 10);
        int int24 = simpleMethods0.getMin((-6), 3);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin((-5), (-5));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(9, 35);
        int int27 = simpleMethods0.getMin(2, (-10));
        int int30 = simpleMethods0.getMin(5, (-100));
        int int33 = simpleMethods0.getMin((int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(4, 100);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 10);
        int int21 = simpleMethods0.getMin(1, 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin((-100), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-9), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int15 = simpleMethods0.getMin((-6), (int) (short) 100);
        int int18 = simpleMethods0.getMin((-4), 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(5, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (byte) 10, 4);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 10);
        int int15 = simpleMethods0.getMin(2, 7);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin((-6), 6);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 6);
        int int18 = simpleMethods0.getMin((int) 'a', 1);
        int int21 = simpleMethods0.getMin(8, (int) '#');
        int int24 = simpleMethods0.getMin(8, (int) (short) 0);
        int int27 = simpleMethods0.getMin((-2), 100);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin((int) '4', (int) '#');
        int int18 = simpleMethods0.getMin(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((-2), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 10);
        int int12 = simpleMethods0.getMin(35, 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int24 = simpleMethods0.getMin(3, (-9));
        int int27 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(1, 9);
        int int24 = simpleMethods0.getMin(2, (int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-10), 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (int) '#');
        int int21 = simpleMethods0.getMin((int) ' ', 32);
        int int24 = simpleMethods0.getMin(97, (int) ' ');
        int int27 = simpleMethods0.getMin((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-100), 0);
        int int21 = simpleMethods0.getMin(10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        int int33 = simpleMethods0.getMin(5, 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-6));
        int int24 = simpleMethods0.getMin(6, 10);
        int int27 = simpleMethods0.getMin(5, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-10), 10);
        int int24 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int27 = simpleMethods0.getMin((-8), 7);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin(32, 10);
        int int15 = simpleMethods0.getMin((-9), (int) (short) 0);
        int int18 = simpleMethods0.getMin(3, 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin(32, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) '4', 100);
        int int9 = simpleMethods0.getMin(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        int int21 = simpleMethods0.getMin((-1), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(8, (int) '4');
        int int21 = simpleMethods0.getMin((-2), (int) ' ');
        int int24 = simpleMethods0.getMin(0, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin(10, (int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin(97, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        int int18 = simpleMethods0.getMin(5, (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin((-3), (-3));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        int int24 = simpleMethods0.getMin((-3), (-9));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin(100, (-100));
        int int9 = simpleMethods0.getMin((-5), 6);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 8);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((-4), (int) '4');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((int) ' ', 8);
        int int15 = simpleMethods0.getMin(5, (int) '#');
        int int18 = simpleMethods0.getMin((-10), 97);
        int int21 = simpleMethods0.getMin(7, 52);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin(32, 10);
        int int15 = simpleMethods0.getMin((-9), (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (-10));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int12 = simpleMethods0.getMin(100, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((-7), (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((int) (byte) 10, (-7));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-7) + "'", int6 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-8), (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((-7), 7);
        int int27 = simpleMethods0.getMin(3, (-9));
        int int30 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        int int30 = simpleMethods0.getMin((int) '4', 1);
        int int33 = simpleMethods0.getMin((-3), (int) (short) 10);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-2), (-2));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(0, (-10));
        int int15 = simpleMethods0.getMin((-3), (-3));
        int int18 = simpleMethods0.getMin((-9), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int18 = simpleMethods0.getMin(97, 52);
        int int21 = simpleMethods0.getMin(100, 6);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) '#', 8);
        int int27 = simpleMethods0.getMin(5, 35);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) 10);
        int int21 = simpleMethods0.getMin(100, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 10, 10);
        int int24 = simpleMethods0.getMin(7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(5, 1);
        int int18 = simpleMethods0.getMin((-1), (-1));
        int int21 = simpleMethods0.getMin(0, 3);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (-6));
        int int21 = simpleMethods0.getMin((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((int) '#', (int) ' ');
        int int15 = simpleMethods0.getMin(0, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        int int30 = simpleMethods0.getMin((-1), (-7));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 35);
        int int21 = simpleMethods0.getMin(0, (-5));
        int int24 = simpleMethods0.getMin((-10), (int) (byte) 10);
        int int27 = simpleMethods0.getMin(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int6 = simpleMethods0.getMin((-10), 9);
        int int9 = simpleMethods0.getMin((-1), 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        int int30 = simpleMethods0.getMin(10, 0);
        int int33 = simpleMethods0.getMin((int) (short) 0, 35);
        int int36 = simpleMethods0.getMin((int) ' ', 52);
        int int39 = simpleMethods0.getMin((-9), (int) '#');
        java.lang.Class<?> wildcardClass40 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-9) + "'", int39 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(1, 35);
        int int18 = simpleMethods0.getMin(6, 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int15 = simpleMethods0.getMin(2, 1);
        int int18 = simpleMethods0.getMin(3, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(10, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin((int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-5), 0);
        int int24 = simpleMethods0.getMin((-8), (int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        int int30 = simpleMethods0.getMin((-9), 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-9) + "'", int30 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin((int) 'a', 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin(9, 1);
        int int12 = simpleMethods0.getMin(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int15 = simpleMethods0.getMin((-7), 6);
        int int18 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin((int) (short) 1, (-10));
        int int18 = simpleMethods0.getMin((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin((-9), (-8));
        int int21 = simpleMethods0.getMin((-100), 32);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin((-5), 100);
        int int24 = simpleMethods0.getMin(4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin(9, (int) (short) 10);
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 1);
        int int24 = simpleMethods0.getMin(0, (int) (short) 10);
        int int27 = simpleMethods0.getMin((-3), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        int int30 = simpleMethods0.getMin(0, (-1));
        int int33 = simpleMethods0.getMin(1, (-1));
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(3, (-2));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin((-1), 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 52);
        int int21 = simpleMethods0.getMin((-8), (-8));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(3, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(52, 52);
        int int24 = simpleMethods0.getMin((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin(52, 97);
        int int15 = simpleMethods0.getMin((-7), 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin(4, 52);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(10, 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-7), (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin(8, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(5, 52);
        int int15 = simpleMethods0.getMin((-8), 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        int int30 = simpleMethods0.getMin(10, 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 1);
        int int24 = simpleMethods0.getMin(6, (int) (byte) 100);
        int int27 = simpleMethods0.getMin(9, (int) (byte) 1);
        int int30 = simpleMethods0.getMin((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin(10, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) '#', 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-9));
        int int27 = simpleMethods0.getMin(1, 10);
        int int30 = simpleMethods0.getMin((-10), 97);
        int int33 = simpleMethods0.getMin((int) '4', (-2));
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(4, (-2));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, 5);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin((-3), 32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin((-3), (-3));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin((-9), (int) 'a');
        int int15 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int18 = simpleMethods0.getMin((int) '4', 32);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(32, (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin((-6), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        int int15 = simpleMethods0.getMin(100, (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-7), (int) (short) 1);
        int int21 = simpleMethods0.getMin((-6), 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        int int30 = simpleMethods0.getMin(52, 10);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(35, 10);
        int int21 = simpleMethods0.getMin((int) (short) 1, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((-7), 52);
        int int27 = simpleMethods0.getMin((int) (short) 10, 10);
        int int30 = simpleMethods0.getMin(0, (-3));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(1, (int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin((-6), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(100, 1);
        int int21 = simpleMethods0.getMin(9, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(10, (-3));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-4));
        int int18 = simpleMethods0.getMin((-7), 3);
        int int21 = simpleMethods0.getMin((-8), (int) (short) 0);
        int int24 = simpleMethods0.getMin((int) (byte) 10, (-7));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin((int) ' ', (int) 'a');
        int int24 = simpleMethods0.getMin(4, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(9, 35);
        int int27 = simpleMethods0.getMin(2, (-10));
        int int30 = simpleMethods0.getMin(5, (-100));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin(97, 1);
        int int18 = simpleMethods0.getMin((-100), 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((-1), 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(0, (int) 'a');
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin((int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, (-100));
        int int21 = simpleMethods0.getMin((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin(8, (int) 'a');
        int int18 = simpleMethods0.getMin(2, 6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 9);
        int int18 = simpleMethods0.getMin(6, (-5));
        int int21 = simpleMethods0.getMin(8, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) ' ');
        int int15 = simpleMethods0.getMin(52, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(7, 32);
        int int21 = simpleMethods0.getMin((-7), 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin(0, (-8));
        int int24 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int27 = simpleMethods0.getMin(1, 6);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin((-6), (-100));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(1, (-10));
        int int12 = simpleMethods0.getMin(35, (int) (short) 10);
        int int15 = simpleMethods0.getMin(0, 9);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin(97, 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin(8, (int) 'a');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(100, (-5));
        int int18 = simpleMethods0.getMin(0, (-6));
        int int21 = simpleMethods0.getMin(7, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (short) 0, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(1, 100);
        int int27 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(4, 9);
        int int24 = simpleMethods0.getMin(100, 5);
        int int27 = simpleMethods0.getMin((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 1);
        int int24 = simpleMethods0.getMin((int) '4', 6);
        int int27 = simpleMethods0.getMin(2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((-6), (int) 'a');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(4, 100);
        int int18 = simpleMethods0.getMin((int) '#', (int) (byte) 10);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(1, 6);
        int int24 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin(3, (-1));
        int int21 = simpleMethods0.getMin(35, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(1, 5);
        int int18 = simpleMethods0.getMin((int) 'a', 6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(6, 4);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 10, 10);
        int int24 = simpleMethods0.getMin((-10), (-4));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(7, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-100), 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((-8), (-8));
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int18 = simpleMethods0.getMin(97, 52);
        int int21 = simpleMethods0.getMin(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int24 = simpleMethods0.getMin(3, (-9));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, (-10));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int12 = simpleMethods0.getMin(100, (-9));
        int int15 = simpleMethods0.getMin(2, (-7));
        int int18 = simpleMethods0.getMin((-1), 2);
        int int21 = simpleMethods0.getMin(0, (int) ' ');
        int int24 = simpleMethods0.getMin(1, 35);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(1, (int) (short) 10);
        int int15 = simpleMethods0.getMin(100, (-7));
        int int18 = simpleMethods0.getMin(0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin((int) '#', (-4));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(100, (-3));
        int int15 = simpleMethods0.getMin(35, (-7));
        int int18 = simpleMethods0.getMin(4, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) -1, (int) (short) 10);
        int int15 = simpleMethods0.getMin((int) (short) -1, 2);
        int int18 = simpleMethods0.getMin(8, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(1, 2);
        int int21 = simpleMethods0.getMin((int) (short) 1, 4);
        int int24 = simpleMethods0.getMin((int) (byte) 100, 7);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 4);
        int int24 = simpleMethods0.getMin((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(1, (int) (short) 10);
        int int15 = simpleMethods0.getMin(100, (-7));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((int) ' ', 0);
        int int24 = simpleMethods0.getMin(5, (-8));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 6);
        int int18 = simpleMethods0.getMin((int) 'a', 1);
        int int21 = simpleMethods0.getMin(8, (int) '#');
        int int24 = simpleMethods0.getMin(8, (int) (short) 0);
        int int27 = simpleMethods0.getMin((-2), 100);
        int int30 = simpleMethods0.getMin(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(9, 35);
        int int27 = simpleMethods0.getMin(7, 9);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(7, (int) (short) -1);
        int int18 = simpleMethods0.getMin((int) '4', (-9));
        int int21 = simpleMethods0.getMin(0, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(10, 2);
        int int12 = simpleMethods0.getMin(100, (int) ' ');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 52);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) 100, 2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(1, 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        int int33 = simpleMethods0.getMin(7, 52);
        int int36 = simpleMethods0.getMin(10, (-6));
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-6) + "'", int36 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin((-6), (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin(10, 10);
        int int18 = simpleMethods0.getMin(4, (int) (short) 0);
        int int21 = simpleMethods0.getMin((-7), 6);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin(0, 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin((-1), 3);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-7), 5);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 52);
        int int24 = simpleMethods0.getMin(9, (int) '#');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(9, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-5));
        int int24 = simpleMethods0.getMin(100, 6);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        int int33 = simpleMethods0.getMin(7, 52);
        int int36 = simpleMethods0.getMin(8, (-3));
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int24 = simpleMethods0.getMin((-100), (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        int int33 = simpleMethods0.getMin(7, 52);
        int int36 = simpleMethods0.getMin(10, (-6));
        int int39 = simpleMethods0.getMin((-2), 9);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-6) + "'", int36 == (-6));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin((-9), (-8));
        int int21 = simpleMethods0.getMin((-100), 32);
        int int24 = simpleMethods0.getMin(5, (-1));
        int int27 = simpleMethods0.getMin(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin(3, (-1));
        int int21 = simpleMethods0.getMin(3, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(10, 0);
        int int18 = simpleMethods0.getMin((-100), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin(100, 8);
        int int15 = simpleMethods0.getMin((-100), 4);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int24 = simpleMethods0.getMin((-1), 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin(100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin((-8), (int) 'a');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (short) 10, 35);
        int int21 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(9, (int) (short) 0);
        int int21 = simpleMethods0.getMin(52, (int) (short) 10);
        int int24 = simpleMethods0.getMin(35, 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int21 = simpleMethods0.getMin((-1), (-100));
        int int24 = simpleMethods0.getMin(97, (int) (byte) 0);
        int int27 = simpleMethods0.getMin((int) ' ', (-5));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(7, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-8), (int) (short) 100);
        int int21 = simpleMethods0.getMin(1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin((-9), (int) (byte) 0);
        int int21 = simpleMethods0.getMin(3, 7);
        int int24 = simpleMethods0.getMin(4, (-3));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((-1), 9);
        int int15 = simpleMethods0.getMin((-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin(3, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin(0, (-10));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        int int18 = simpleMethods0.getMin((-2), (int) 'a');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        int int18 = simpleMethods0.getMin((-9), (-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin(97, (int) (short) 0);
        int int21 = simpleMethods0.getMin(1, (int) ' ');
        int int24 = simpleMethods0.getMin((int) 'a', (-6));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-7), (int) (short) 1);
        int int21 = simpleMethods0.getMin((-10), (int) (short) 0);
        int int24 = simpleMethods0.getMin((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        int int18 = simpleMethods0.getMin(9, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 100, 3);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin((-7), (-9));
        int int21 = simpleMethods0.getMin((-3), (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((-10), 6);
        int int18 = simpleMethods0.getMin((-1), 1);
        int int21 = simpleMethods0.getMin(6, 1);
        int int24 = simpleMethods0.getMin((int) (byte) -1, (-9));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((-8), (-8));
        int int21 = simpleMethods0.getMin((int) 'a', (-8));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        int int15 = simpleMethods0.getMin(32, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 10, 100);
        int int21 = simpleMethods0.getMin((-2), 7);
        int int24 = simpleMethods0.getMin((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin(2, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(35, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(7, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (-9));
        int int27 = simpleMethods0.getMin(100, 5);
        int int30 = simpleMethods0.getMin(2, 9);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((int) (short) 10, 1);
        int int24 = simpleMethods0.getMin(8, (-8));
        int int27 = simpleMethods0.getMin((-8), (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin(100, (-100));
        int int9 = simpleMethods0.getMin((-5), 6);
        int int12 = simpleMethods0.getMin((int) '4', 100);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((int) ' ', (-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) '4', 100);
        int int9 = simpleMethods0.getMin(0, (int) (short) 100);
        int int12 = simpleMethods0.getMin((-7), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(52, 52);
        int int24 = simpleMethods0.getMin((-6), (int) (short) 10);
        int int27 = simpleMethods0.getMin((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        int int30 = simpleMethods0.getMin((-3), (-5));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, 1);
        int int21 = simpleMethods0.getMin(3, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin(1, 5);
        int int21 = simpleMethods0.getMin((-7), 7);
        int int24 = simpleMethods0.getMin(10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int21 = simpleMethods0.getMin((-1), (-100));
        int int24 = simpleMethods0.getMin(1, (-5));
        int int27 = simpleMethods0.getMin((-1), 4);
        int int30 = simpleMethods0.getMin((int) '#', (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(35, 7);
        int int15 = simpleMethods0.getMin((-2), 7);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-2));
        int int15 = simpleMethods0.getMin((-5), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin((int) (short) 1, 2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin((-9), (int) 'a');
        int int15 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int18 = simpleMethods0.getMin((int) '4', 32);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin(0, (-100));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 35);
        int int21 = simpleMethods0.getMin((-9), 7);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin(8, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(0, 100);
        int int15 = simpleMethods0.getMin(7, 5);
        int int18 = simpleMethods0.getMin((-6), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin((int) '#', (-4));
        int int21 = simpleMethods0.getMin(0, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin((int) (byte) 1, 10);
        int int9 = simpleMethods0.getMin((int) ' ', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(10, 2);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((-2), (int) 'a');
        int int15 = simpleMethods0.getMin(2, (-10));
        int int18 = simpleMethods0.getMin(32, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        int int30 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int33 = simpleMethods0.getMin((-4), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin((int) 'a', (-3));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        int int33 = simpleMethods0.getMin(5, 10);
        int int36 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin(9, 6);
        int int15 = simpleMethods0.getMin((-10), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(7, (-10));
        int int21 = simpleMethods0.getMin((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-8), (-8));
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) ' ', 2);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(6, 8);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((int) (short) 10, 97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(10, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin((-4), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(100, 6);
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        int int30 = simpleMethods0.getMin(0, (-1));
        int int33 = simpleMethods0.getMin(10, 0);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int18 = simpleMethods0.getMin(4, 8);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin(8, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) ' ', (-5));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int27 = simpleMethods0.getMin((int) (byte) -1, 0);
        int int30 = simpleMethods0.getMin((-2), (-7));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (-8));
        int int15 = simpleMethods0.getMin((-10), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 5);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((int) '#', 0);
        int int9 = simpleMethods0.getMin(10, 32);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin(35, 100);
        int int27 = simpleMethods0.getMin((-7), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) ' ');
        int int27 = simpleMethods0.getMin(4, 4);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(2, (int) '4');
        int int27 = simpleMethods0.getMin(9, (int) (byte) 10);
        int int30 = simpleMethods0.getMin(8, 10);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-10));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int24 = simpleMethods0.getMin(4, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin(4, 9);
        int int24 = simpleMethods0.getMin(100, 5);
        int int27 = simpleMethods0.getMin((int) (short) 1, (int) 'a');
        int int30 = simpleMethods0.getMin((int) (short) -1, 97);
        int int33 = simpleMethods0.getMin((-3), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin(5, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin(4, 52);
        int int18 = simpleMethods0.getMin(0, (-1));
        int int21 = simpleMethods0.getMin((-100), 100);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(1, 2);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) 10);
        int int21 = simpleMethods0.getMin(2, 97);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int15 = simpleMethods0.getMin((-6), (int) (short) 100);
        int int18 = simpleMethods0.getMin((-4), 1);
        int int21 = simpleMethods0.getMin(52, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int9 = simpleMethods0.getMin(35, 97);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(10, (-3));
        int int12 = simpleMethods0.getMin((-9), 5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 0);
        int int27 = simpleMethods0.getMin((int) (byte) 0, 2);
        int int30 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((int) (short) -1, 10);
        int int15 = simpleMethods0.getMin(5, (-1));
        int int18 = simpleMethods0.getMin(1, (-7));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        int int30 = simpleMethods0.getMin(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-7));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(6, (-6));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((-1), 9);
        int int24 = simpleMethods0.getMin(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin(1, (int) (short) -1);
        int int9 = simpleMethods0.getMin(5, (-7));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(1, (int) '#');
        int int15 = simpleMethods0.getMin((-6), 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((-1), 0);
        int int21 = simpleMethods0.getMin((-4), 52);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int27 = simpleMethods0.getMin(9, (-6));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        int int18 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((-10), 10);
        int int27 = simpleMethods0.getMin(2, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin(0, 1);
        int int21 = simpleMethods0.getMin((-3), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (short) 1, 2);
        int int15 = simpleMethods0.getMin((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 6);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin(2, (-4));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((-1), 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(35, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(7, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (-9));
        int int27 = simpleMethods0.getMin(100, 5);
        int int30 = simpleMethods0.getMin(100, (-10));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(6, 10);
        int int18 = simpleMethods0.getMin(7, (-3));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin(0, (-1));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((int) (short) 100, 4);
        int int18 = simpleMethods0.getMin(5, (int) '4');
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) ' ');
        int int24 = simpleMethods0.getMin((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(2, 32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((-1), 0);
        int int21 = simpleMethods0.getMin((-8), (-3));
        int int24 = simpleMethods0.getMin(6, 4);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(0, 8);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }
}

