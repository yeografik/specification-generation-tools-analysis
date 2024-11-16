package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 0);
        int int18 = simpleMethods0.getMin(2, 7);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        int int36 = simpleMethods0.getMin((int) ' ', 52);
        int int39 = simpleMethods0.getMin(32, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) ' ', 2);
        int int21 = simpleMethods0.getMin((-10), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) -1, (int) ' ');
        int int15 = simpleMethods0.getMin(2, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin(1, 9);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin(6, (-10));
        int int24 = simpleMethods0.getMin((-10), (-8));
        int int27 = simpleMethods0.getMin(0, 52);
        int int30 = simpleMethods0.getMin((-3), (-4));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int18 = simpleMethods0.getMin((-8), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        int int30 = simpleMethods0.getMin(8, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin((int) 'a', 3);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-3));
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 10);
        int int27 = simpleMethods0.getMin((-6), 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 1);
        int int15 = simpleMethods0.getMin((-2), (-2));
        int int18 = simpleMethods0.getMin(100, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(100, (int) (short) 100);
        int int24 = simpleMethods0.getMin(2, (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int24 = simpleMethods0.getMin(32, (-2));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(6, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(100, 6);
        int int15 = simpleMethods0.getMin(100, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((-8), (int) (short) 1);
        int int15 = simpleMethods0.getMin((-9), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 100);
        int int21 = simpleMethods0.getMin(100, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (short) 0, (-2));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) ' ');
        int int27 = simpleMethods0.getMin((-5), (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-1), 2);
        int int12 = simpleMethods0.getMin((-2), 0);
        int int15 = simpleMethods0.getMin(8, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin((-6), (-8));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) '#', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin(8, (int) (short) -1);
        int int21 = simpleMethods0.getMin((-10), 0);
        int int24 = simpleMethods0.getMin(97, (-3));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin((-2), (-6));
        int int24 = simpleMethods0.getMin((-4), 0);
        int int27 = simpleMethods0.getMin((-9), (-4));
        int int30 = simpleMethods0.getMin(35, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 0);
        int int27 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int30 = simpleMethods0.getMin((int) (byte) 0, (-2));
        int int33 = simpleMethods0.getMin(7, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int18 = simpleMethods0.getMin(97, 52);
        int int21 = simpleMethods0.getMin((-9), (int) (short) 10);
        int int24 = simpleMethods0.getMin((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-7), (int) (short) 1);
        int int21 = simpleMethods0.getMin((-6), 100);
        int int24 = simpleMethods0.getMin((-10), (-8));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) (short) 0, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(0, 8);
        int int24 = simpleMethods0.getMin((int) (byte) 100, 2);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) 'a', 5);
        int int18 = simpleMethods0.getMin((-9), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 6);
        int int27 = simpleMethods0.getMin(0, (-100));
        int int30 = simpleMethods0.getMin((-6), (-9));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-9) + "'", int30 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin(10, 5);
        int int21 = simpleMethods0.getMin((-7), 10);
        int int24 = simpleMethods0.getMin(5, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) (byte) -1, 10);
        int int27 = simpleMethods0.getMin((int) (short) 100, (-6));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(0, (-10));
        int int15 = simpleMethods0.getMin((-3), (-3));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        int int36 = simpleMethods0.getMin((int) ' ', 52);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 1);
        int int24 = simpleMethods0.getMin(4, (-9));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-4));
        int int15 = simpleMethods0.getMin(0, (-4));
        int int18 = simpleMethods0.getMin((-2), (int) '4');
        int int21 = simpleMethods0.getMin(3, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (short) 1, 2);
        int int15 = simpleMethods0.getMin(9, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 1, 1);
        int int18 = simpleMethods0.getMin((-10), 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        int int18 = simpleMethods0.getMin(4, 10);
        int int21 = simpleMethods0.getMin((int) (byte) -1, 5);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(7, 32);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((int) (short) -1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int24 = simpleMethods0.getMin(5, 1);
        int int27 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int30 = simpleMethods0.getMin(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin(10, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) '#', 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-9));
        int int27 = simpleMethods0.getMin(32, (int) (byte) -1);
        int int30 = simpleMethods0.getMin((-3), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        int int30 = simpleMethods0.getMin((-10), (int) '4');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-10) + "'", int30 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 3);
        int int15 = simpleMethods0.getMin((-5), (int) '#');
        int int18 = simpleMethods0.getMin((-7), 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        int int30 = simpleMethods0.getMin(0, (-6));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin(1, 5);
        int int21 = simpleMethods0.getMin((-7), 7);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int9 = simpleMethods0.getMin((-9), 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(100, 6);
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(9, 8);
        int int21 = simpleMethods0.getMin(35, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin((-3), 6);
        int int21 = simpleMethods0.getMin(7, 100);
        int int24 = simpleMethods0.getMin(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((-3), (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        int int33 = simpleMethods0.getMin(0, (-7));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-7) + "'", int33 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin(0, (-1));
        int int15 = simpleMethods0.getMin((int) (byte) 0, 32);
        int int18 = simpleMethods0.getMin(97, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int18 = simpleMethods0.getMin((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin((-9), 9);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(97, (int) (byte) 100);
        int int27 = simpleMethods0.getMin(0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin(0, 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) ' ', 2);
        int int21 = simpleMethods0.getMin((-1), 2);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin(0, 1);
        int int21 = simpleMethods0.getMin((-2), (-6));
        int int24 = simpleMethods0.getMin((-4), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-8), (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) (short) 100, 9);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin(8, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) ' ', (-5));
        int int18 = simpleMethods0.getMin((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin(4, 52);
        int int18 = simpleMethods0.getMin(100, (int) '#');
        int int21 = simpleMethods0.getMin(1, 97);
        int int24 = simpleMethods0.getMin((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int24 = simpleMethods0.getMin((int) (short) 0, 7);
        int int27 = simpleMethods0.getMin((-10), 6);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(4, 100);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 10);
        int int21 = simpleMethods0.getMin(10, 97);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (-6));
        int int21 = simpleMethods0.getMin(3, 10);
        int int24 = simpleMethods0.getMin((int) '#', (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((int) '4', 35);
        int int27 = simpleMethods0.getMin((int) (short) 100, 4);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin(10, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) '#', 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-9));
        int int27 = simpleMethods0.getMin(5, (-3));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((-8), 35);
        int int21 = simpleMethods0.getMin(1, 5);
        int int24 = simpleMethods0.getMin(10, 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) ' ');
        int int21 = simpleMethods0.getMin(32, 0);
        int int24 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin((-4), (-3));
        int int21 = simpleMethods0.getMin((-1), (int) (short) 1);
        int int24 = simpleMethods0.getMin((-2), (int) '#');
        int int27 = simpleMethods0.getMin(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(5, (int) (byte) 1);
        int int27 = simpleMethods0.getMin(35, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(9, (int) (short) 0);
        int int21 = simpleMethods0.getMin(4, 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((-10), 6);
        int int18 = simpleMethods0.getMin((-1), 1);
        int int21 = simpleMethods0.getMin(6, 1);
        int int24 = simpleMethods0.getMin(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        int int36 = simpleMethods0.getMin((-10), (-100));
        int int39 = simpleMethods0.getMin((-100), 100);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-100) + "'", int36 == (-100));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-100) + "'", int39 == (-100));
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(100, 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        int int30 = simpleMethods0.getMin(0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin(52, 97);
        int int15 = simpleMethods0.getMin((-7), 0);
        int int18 = simpleMethods0.getMin(4, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        int int30 = simpleMethods0.getMin(6, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(100, (-5));
        int int18 = simpleMethods0.getMin(8, 6);
        int int21 = simpleMethods0.getMin((int) (short) 100, 2);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 0);
        int int18 = simpleMethods0.getMin((-100), 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-10), 7);
        int int15 = simpleMethods0.getMin((int) '#', (-7));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        int int18 = simpleMethods0.getMin(4, 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin(0, (int) (short) 10);
        int int21 = simpleMethods0.getMin(4, (-3));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 6);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 0);
        int int27 = simpleMethods0.getMin((-9), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        int int33 = simpleMethods0.getMin((int) (short) 0, 6);
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
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(35, 7);
        int int15 = simpleMethods0.getMin((int) '#', 97);
        int int18 = simpleMethods0.getMin(0, (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 0, 6);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin(10, 3);
        int int21 = simpleMethods0.getMin(7, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(35, (-100));
        int int18 = simpleMethods0.getMin((int) '4', (-2));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin((-5), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((int) '4', 35);
        int int27 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 1);
        int int15 = simpleMethods0.getMin((-2), (-2));
        int int18 = simpleMethods0.getMin(100, (-1));
        int int21 = simpleMethods0.getMin(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int27 = simpleMethods0.getMin(3, 0);
        int int30 = simpleMethods0.getMin(9, 8);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((int) ' ', 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(0, 100);
        int int15 = simpleMethods0.getMin(7, 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        int int30 = simpleMethods0.getMin(1, (-5));
        int int33 = simpleMethods0.getMin(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-5), 4);
        int int27 = simpleMethods0.getMin(7, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin(97, 100);
        int int21 = simpleMethods0.getMin((-2), (int) ' ');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int24 = simpleMethods0.getMin((-7), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin(35, 7);
        int int24 = simpleMethods0.getMin(35, 100);
        int int27 = simpleMethods0.getMin(97, (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin((int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (short) 0, 6);
        int int27 = simpleMethods0.getMin(0, 97);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(5, (-100));
        int int18 = simpleMethods0.getMin(5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(7, (int) (short) -1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        int int30 = simpleMethods0.getMin(1, (-5));
        int int33 = simpleMethods0.getMin((-5), 0);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-5) + "'", int33 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin((int) (byte) -1, 35);
        int int21 = simpleMethods0.getMin(6, (int) (short) -1);
        int int24 = simpleMethods0.getMin((-8), 0);
        int int27 = simpleMethods0.getMin(52, (-4));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-2), (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-8), (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) (short) 100, 9);
        int int24 = simpleMethods0.getMin(0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-3), (int) (byte) 100);
        int int15 = simpleMethods0.getMin(97, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin(1, 4);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin(7, 32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(9, 35);
        int int27 = simpleMethods0.getMin(9, 10);
        int int30 = simpleMethods0.getMin(1, 100);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin(0, (-6));
        int int27 = simpleMethods0.getMin((-3), (-1));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 5);
        int int15 = simpleMethods0.getMin((int) (byte) -1, (-5));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(3, 100);
        int int21 = simpleMethods0.getMin((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin(8, (int) 'a');
        int int18 = simpleMethods0.getMin((-4), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) ' ', (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(4, (-100));
        int int12 = simpleMethods0.getMin(8, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int21 = simpleMethods0.getMin(3, 7);
        int int24 = simpleMethods0.getMin(100, (-1));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-5), 0);
        int int24 = simpleMethods0.getMin((int) '4', 97);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(6, 10);
        int int18 = simpleMethods0.getMin((int) (short) 10, 10);
        int int21 = simpleMethods0.getMin(10, (-7));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((-5), 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(6, 0);
        int int21 = simpleMethods0.getMin(8, 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(8, (int) '4');
        int int21 = simpleMethods0.getMin((-2), (int) ' ');
        int int24 = simpleMethods0.getMin(9, (int) 'a');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        int int33 = simpleMethods0.getMin((-1), (int) '#');
        int int36 = simpleMethods0.getMin(8, 1);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        int int33 = simpleMethods0.getMin((-2), 100);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((-6), (int) 'a');
        int int27 = simpleMethods0.getMin((-2), (int) (short) 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(7, 32);
        int int21 = simpleMethods0.getMin((-7), 10);
        int int24 = simpleMethods0.getMin((int) (byte) 10, 35);
        int int27 = simpleMethods0.getMin(1, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, (int) (short) 0);
        int int15 = simpleMethods0.getMin(0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin(0, (-1));
        int int9 = simpleMethods0.getMin((-7), 0);
        int int12 = simpleMethods0.getMin(100, (-7));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin((int) (short) 0, (-10));
        int int21 = simpleMethods0.getMin((-3), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin((int) (short) 100, 0);
        int int24 = simpleMethods0.getMin((int) 'a', 4);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin((-1), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin(10, 3);
        int int21 = simpleMethods0.getMin(32, (-4));
        int int24 = simpleMethods0.getMin(2, 7);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        int int30 = simpleMethods0.getMin(32, 35);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin((int) 'a', 1);
        int int9 = simpleMethods0.getMin((int) ' ', 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        int int15 = simpleMethods0.getMin(32, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 10, 100);
        int int21 = simpleMethods0.getMin((int) (short) 0, (-9));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-9));
        int int24 = simpleMethods0.getMin((-5), 3);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 52);
        int int24 = simpleMethods0.getMin(9, (int) '#');
        int int27 = simpleMethods0.getMin(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 1);
        int int27 = simpleMethods0.getMin(2, 32);
        int int30 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin(10, (int) (short) -1);
        int int24 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(100, 4);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(7, (int) (short) 0);
        int int18 = simpleMethods0.getMin(32, (int) ' ');
        int int21 = simpleMethods0.getMin(1, 1);
        int int24 = simpleMethods0.getMin(8, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(100, (-3));
        int int15 = simpleMethods0.getMin(8, (-10));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin((-1), 100);
        int int21 = simpleMethods0.getMin(4, 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(100, (-5));
        int int18 = simpleMethods0.getMin(8, 6);
        int int21 = simpleMethods0.getMin((int) (short) 100, 2);
        int int24 = simpleMethods0.getMin((-2), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-5), 4);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin((-6), (-1));
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin((-5), 8);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((int) '#', (int) ' ');
        int int15 = simpleMethods0.getMin((int) (byte) 100, (int) 'a');
        int int18 = simpleMethods0.getMin((-5), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((int) (short) -1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int24 = simpleMethods0.getMin(5, 1);
        int int27 = simpleMethods0.getMin((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin(0, (-9));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-3), (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin(52, 97);
        int int15 = simpleMethods0.getMin((-7), 10);
        int int18 = simpleMethods0.getMin(7, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(7, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-2), 6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 100);
        int int12 = simpleMethods0.getMin(100, 9);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(7, 35);
        int int21 = simpleMethods0.getMin(5, (-7));
        int int24 = simpleMethods0.getMin((-1), (int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((-1), 0);
        int int21 = simpleMethods0.getMin((-8), (-3));
        int int24 = simpleMethods0.getMin(32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(100, 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, 0);
        int int21 = simpleMethods0.getMin((int) '#', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((int) '#', 0);
        int int9 = simpleMethods0.getMin(10, 32);
        int int12 = simpleMethods0.getMin((-2), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin(1, (-100));
        int int24 = simpleMethods0.getMin(6, 35);
        int int27 = simpleMethods0.getMin(52, (int) 'a');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
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
        int int33 = simpleMethods0.getMin(32, (-9));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9) + "'", int33 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin(1, (-100));
        int int24 = simpleMethods0.getMin((-6), 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin(52, (-3));
        int int27 = simpleMethods0.getMin((-10), (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin(100, 9);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (byte) -1, (-8));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin(1, (int) (short) -1);
        int int9 = simpleMethods0.getMin(0, 10);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin((-2), (-6));
        int int24 = simpleMethods0.getMin((-4), 0);
        int int27 = simpleMethods0.getMin((-9), (-4));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        int int30 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin((int) ' ', 8);
        int int24 = simpleMethods0.getMin((int) '4', (int) '4');
        int int27 = simpleMethods0.getMin(0, 1);
        int int30 = simpleMethods0.getMin((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin(6, 0);
        int int18 = simpleMethods0.getMin((-6), 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((-1), 35);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(10, 0);
        int int18 = simpleMethods0.getMin((-4), (-6));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-1), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(0, 9);
        int int24 = simpleMethods0.getMin(8, 0);
        int int27 = simpleMethods0.getMin(0, (-100));
        int int30 = simpleMethods0.getMin((-5), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (byte) -1, (-9));
        int int21 = simpleMethods0.getMin((int) (byte) 10, (-2));
        int int24 = simpleMethods0.getMin(10, (int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        int int30 = simpleMethods0.getMin(35, 32);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin(0, (-8));
        int int24 = simpleMethods0.getMin((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin(3, (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) '4');
        int int27 = simpleMethods0.getMin(8, (int) '4');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        int int30 = simpleMethods0.getMin((int) (byte) -1, (-5));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 1);
        int int15 = simpleMethods0.getMin((-2), (-2));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin(10, (-3));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(6, (-7));
        int int24 = simpleMethods0.getMin((-8), (-7));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(3, 97);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin(4, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((-8), (int) (short) 1);
        int int27 = simpleMethods0.getMin((-8), (-6));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        int int30 = simpleMethods0.getMin(8, 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin(1, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-3), (int) '4');
        int int24 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        int int27 = simpleMethods0.getMin(97, (-6));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) 'a', 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin(10, (-6));
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-1));
        int int27 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        int int30 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(0, 100);
        int int27 = simpleMethods0.getMin(97, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        int int33 = simpleMethods0.getMin((-100), 97);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin((-3), 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(52, 1);
        int int15 = simpleMethods0.getMin(0, 9);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) 10);
        int int21 = simpleMethods0.getMin(2, 97);
        int int24 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int27 = simpleMethods0.getMin((-5), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-6), (int) (short) 100);
        int int21 = simpleMethods0.getMin((-7), (int) 'a');
        int int24 = simpleMethods0.getMin(2, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(52, (-8));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin((-1), 3);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin(6, 0);
        int int18 = simpleMethods0.getMin(35, (-9));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        int int15 = simpleMethods0.getMin(32, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 10, 100);
        int int21 = simpleMethods0.getMin((-2), 7);
        int int24 = simpleMethods0.getMin((int) (byte) -1, (-1));
        int int27 = simpleMethods0.getMin((-5), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        int int30 = simpleMethods0.getMin(97, (-1));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((-1), 0);
        int int21 = simpleMethods0.getMin((-4), 52);
        int int24 = simpleMethods0.getMin(10, 0);
        int int27 = simpleMethods0.getMin((-8), 9);
        int int30 = simpleMethods0.getMin(100, 100);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        int int33 = simpleMethods0.getMin((-2), 100);
        int int36 = simpleMethods0.getMin((-8), (-3));
        int int39 = simpleMethods0.getMin((-2), 7);
        java.lang.Class<?> wildcardClass40 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-3), 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int18 = simpleMethods0.getMin((-9), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 10, (-2));
        int int27 = simpleMethods0.getMin(1, 6);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        int int33 = simpleMethods0.getMin((-5), 1);
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
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin(8, (int) (short) -1);
        int int21 = simpleMethods0.getMin((-10), 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-3));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin((-5), 100);
        int int24 = simpleMethods0.getMin(10, 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-1), 6);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin((int) '4', 7);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-10), 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 1, 52);
        int int24 = simpleMethods0.getMin(10, (-7));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-10));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int21 = simpleMethods0.getMin((-10), (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-9), 100);
        int int15 = simpleMethods0.getMin(100, 3);
        int int18 = simpleMethods0.getMin(35, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(4, 100);
        int int18 = simpleMethods0.getMin((int) '#', (int) (byte) 10);
        int int21 = simpleMethods0.getMin((int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int18 = simpleMethods0.getMin(10, 97);
        int int21 = simpleMethods0.getMin((-10), (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-4));
        int int15 = simpleMethods0.getMin((int) (short) 100, (-3));
        int int18 = simpleMethods0.getMin((-1), 0);
        int int21 = simpleMethods0.getMin((-8), (-3));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin(2, 10);
        int int21 = simpleMethods0.getMin((int) (short) 10, 1);
        int int24 = simpleMethods0.getMin(8, (-8));
        int int27 = simpleMethods0.getMin(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-5), 0);
        int int24 = simpleMethods0.getMin((-8), (int) '4');
        int int27 = simpleMethods0.getMin(2, (-8));
        int int30 = simpleMethods0.getMin((int) (short) -1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int15 = simpleMethods0.getMin(3, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin((-3), 10);
        int int24 = simpleMethods0.getMin((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin(32, 32);
        int int27 = simpleMethods0.getMin((-1), 6);
        int int30 = simpleMethods0.getMin(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int12 = simpleMethods0.getMin(100, (-9));
        int int15 = simpleMethods0.getMin(2, (-7));
        int int18 = simpleMethods0.getMin(6, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(8, 35);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin((-2), (-6));
        int int24 = simpleMethods0.getMin((-4), 0);
        int int27 = simpleMethods0.getMin((-9), (-4));
        int int30 = simpleMethods0.getMin((int) (short) 100, (-4));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(2, 32);
        int int15 = simpleMethods0.getMin(9, (int) 'a');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(1, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin(7, 35);
        int int21 = simpleMethods0.getMin((-1), (-3));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int15 = simpleMethods0.getMin((int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(6, (-7));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', 8);
        int int18 = simpleMethods0.getMin((-2), (int) '#');
        int int21 = simpleMethods0.getMin((-5), (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 52);
        int int21 = simpleMethods0.getMin((-8), (-8));
        int int24 = simpleMethods0.getMin(7, (int) 'a');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        int int33 = simpleMethods0.getMin((-2), 100);
        int int36 = simpleMethods0.getMin((-8), (-3));
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin(100, (-6));
        int int24 = simpleMethods0.getMin(52, (int) (short) 0);
        int int27 = simpleMethods0.getMin(7, (int) (byte) -1);
        int int30 = simpleMethods0.getMin((-100), (-3));
        int int33 = simpleMethods0.getMin((int) (byte) 100, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-100) + "'", int30 == (-100));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int6 = simpleMethods0.getMin((-10), 9);
        int int9 = simpleMethods0.getMin((-1), 10);
        int int12 = simpleMethods0.getMin((-100), 9);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(0, 6);
        int int18 = simpleMethods0.getMin(8, (int) (byte) 0);
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin(1, (int) (short) -1);
        int int9 = simpleMethods0.getMin(5, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 1);
        int int24 = simpleMethods0.getMin(4, (-9));
        int int27 = simpleMethods0.getMin((-5), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin(1, 100);
        int int24 = simpleMethods0.getMin(0, (int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 4);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-10), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-9), 100);
        int int15 = simpleMethods0.getMin(0, 7);
        int int18 = simpleMethods0.getMin((int) (short) 10, (-2));
        int int21 = simpleMethods0.getMin((-7), (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, (int) (short) 0);
        int int15 = simpleMethods0.getMin(3, (int) '4');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((int) (short) -1, 9);
        int int21 = simpleMethods0.getMin(35, (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin(8, (int) (short) -1);
        int int21 = simpleMethods0.getMin((-10), 0);
        int int24 = simpleMethods0.getMin((int) 'a', (-3));
        int int27 = simpleMethods0.getMin(32, (-1));
        int int30 = simpleMethods0.getMin((-5), (int) (byte) 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 1, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (-8));
        int int24 = simpleMethods0.getMin((-7), (int) (byte) 10);
        int int27 = simpleMethods0.getMin(6, (-9));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 9);
        int int18 = simpleMethods0.getMin(8, 2);
        int int21 = simpleMethods0.getMin((-4), (-1));
        int int24 = simpleMethods0.getMin((-10), (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(100, 6);
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin((int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin(10, 10);
        int int18 = simpleMethods0.getMin(4, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(9, 100);
        int int15 = simpleMethods0.getMin(1, 35);
        int int18 = simpleMethods0.getMin((-10), (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((-8), (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) (short) 100, 9);
        int int24 = simpleMethods0.getMin((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-5) + "'", int12 == (-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin(6, (-10));
        int int24 = simpleMethods0.getMin((-10), (-8));
        int int27 = simpleMethods0.getMin((int) (byte) 100, (-8));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin((-9), (-8));
        int int21 = simpleMethods0.getMin((-100), 32);
        int int24 = simpleMethods0.getMin(5, 2);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((-1), 9);
        int int24 = simpleMethods0.getMin(10, (int) (short) 1);
        int int27 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin((-6), (int) (byte) -1);
        int int15 = simpleMethods0.getMin((-7), 6);
        int int18 = simpleMethods0.getMin((-6), 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin((-8), 6);
        int int9 = simpleMethods0.getMin(6, 7);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-8) + "'", int6 == (-8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        int int12 = simpleMethods0.getMin(100, 9);
        int int15 = simpleMethods0.getMin((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 1);
        int int15 = simpleMethods0.getMin((-2), (-2));
        int int18 = simpleMethods0.getMin(100, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        int int30 = simpleMethods0.getMin((int) (byte) 100, 9);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 0);
        int int18 = simpleMethods0.getMin((-8), (int) '4');
        int int21 = simpleMethods0.getMin(9, 8);
        int int24 = simpleMethods0.getMin(6, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin(1, 4);
        int int18 = simpleMethods0.getMin(2, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int9 = simpleMethods0.getMin(1, (int) ' ');
        int int12 = simpleMethods0.getMin((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        int int30 = simpleMethods0.getMin(8, (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        int int30 = simpleMethods0.getMin((int) (byte) 100, 9);
        int int33 = simpleMethods0.getMin(35, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-8) + "'", int33 == (-8));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 8);
        int int24 = simpleMethods0.getMin(9, (int) (byte) 0);
        int int27 = simpleMethods0.getMin(2, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-10) + "'", int27 == (-10));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        int int30 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int33 = simpleMethods0.getMin((-10), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-10) + "'", int33 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) (byte) 1, 8);
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-9), 100);
        int int15 = simpleMethods0.getMin(0, 7);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 2);
        int int21 = simpleMethods0.getMin(9, (-7));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin(0, (-6));
        int int27 = simpleMethods0.getMin(0, (-1));
        int int30 = simpleMethods0.getMin((int) 'a', 100);
        int int33 = simpleMethods0.getMin(52, 3);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        int int36 = simpleMethods0.getMin(1, (-8));
        int int39 = simpleMethods0.getMin((-8), (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-8) + "'", int39 == (-8));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (short) -1, 35);
        int int15 = simpleMethods0.getMin((-7), (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(3, 100);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (-3));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(4, (-6));
        int int21 = simpleMethods0.getMin(100, (-1));
        int int24 = simpleMethods0.getMin((int) (byte) 100, (-2));
        int int27 = simpleMethods0.getMin(1, (int) ' ');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-1), 2);
        int int12 = simpleMethods0.getMin(0, (-6));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(3, 100);
        int int21 = simpleMethods0.getMin((-6), 2);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin(10, 0);
        int int18 = simpleMethods0.getMin((-10), (int) '#');
        int int21 = simpleMethods0.getMin(3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        int int15 = simpleMethods0.getMin(32, (-1));
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        int int36 = simpleMethods0.getMin(52, (-8));
        int int39 = simpleMethods0.getMin((-2), (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-9), (int) (short) -1);
        int int12 = simpleMethods0.getMin(10, 0);
        int int15 = simpleMethods0.getMin(35, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(97, (int) 'a');
        int int21 = simpleMethods0.getMin(100, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin((int) (byte) 10, (int) '4');
        int int12 = simpleMethods0.getMin((int) '#', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 0, 7);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int21 = simpleMethods0.getMin(52, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int21 = simpleMethods0.getMin((int) (byte) 10, 9);
        int int24 = simpleMethods0.getMin((-7), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        int int30 = simpleMethods0.getMin((-3), (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) ' ', 2);
        int int21 = simpleMethods0.getMin((-10), 0);
        int int24 = simpleMethods0.getMin((-10), (-7));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-7), 0);
        int int18 = simpleMethods0.getMin(0, (-4));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (short) 10, 7);
        int int24 = simpleMethods0.getMin((int) 'a', 4);
        int int27 = simpleMethods0.getMin(2, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 97);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((-1), 9);
        int int24 = simpleMethods0.getMin(10, (int) (short) 1);
        int int27 = simpleMethods0.getMin(0, (-100));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-100) + "'", int27 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-1), (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, 52);
        int int15 = simpleMethods0.getMin(0, (int) (short) -1);
        int int18 = simpleMethods0.getMin((int) '#', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin((-3), (-3));
        int int21 = simpleMethods0.getMin((int) 'a', 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int6 = simpleMethods0.getMin((-10), 9);
        int int9 = simpleMethods0.getMin((-1), 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) '4', (-100));
        int int12 = simpleMethods0.getMin(0, (-8));
        int int15 = simpleMethods0.getMin(32, (-1));
        int int18 = simpleMethods0.getMin((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin((int) '#', (int) (short) 10);
        int int21 = simpleMethods0.getMin((-100), (int) 'a');
        int int24 = simpleMethods0.getMin((int) '4', (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(5, (int) (byte) 1);
        int int27 = simpleMethods0.getMin(52, (int) '#');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (short) 100);
        int int15 = simpleMethods0.getMin((-3), 6);
        int int18 = simpleMethods0.getMin((int) (short) 1, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 8);
        int int24 = simpleMethods0.getMin(9, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin(10, (int) ' ');
        int int9 = simpleMethods0.getMin(97, 9);
        int int12 = simpleMethods0.getMin((-9), 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
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
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        int int15 = simpleMethods0.getMin((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-8), (-10));
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int9 = simpleMethods0.getMin((-1), (-8));
        int int12 = simpleMethods0.getMin((-10), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin(97, (-4));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin(10, 10);
        int int18 = simpleMethods0.getMin(4, (int) (short) 0);
        int int21 = simpleMethods0.getMin((-9), (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int6 = simpleMethods0.getMin(0, (-1));
        int int9 = simpleMethods0.getMin(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) -1, 8);
        int int18 = simpleMethods0.getMin(7, (int) (byte) 1);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((int) 'a', (-1));
        int int18 = simpleMethods0.getMin((-7), 4);
        int int21 = simpleMethods0.getMin((int) ' ', 8);
        int int24 = simpleMethods0.getMin((int) '4', (int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(1, (-10));
        int int12 = simpleMethods0.getMin(35, (int) (short) 10);
        int int15 = simpleMethods0.getMin(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-10) + "'", int9 == (-10));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin(4, 0);
        int int18 = simpleMethods0.getMin(10, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) '4', (-3));
        int int21 = simpleMethods0.getMin(6, (-7));
        int int24 = simpleMethods0.getMin((-8), (-7));
        int int27 = simpleMethods0.getMin((-8), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin((-2), (int) ' ');
        int int18 = simpleMethods0.getMin(9, (-2));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int24 = simpleMethods0.getMin((-10), (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (short) 100, 4);
        int int15 = simpleMethods0.getMin((-5), 97);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-1));
        int int21 = simpleMethods0.getMin((-7), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(4, 1);
        int int21 = simpleMethods0.getMin(3, (int) (short) 10);
        int int24 = simpleMethods0.getMin(35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(1, (int) '#');
        int int15 = simpleMethods0.getMin(7, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-10) + "'", int15 == (-10));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-2), (int) (short) 10);
        int int6 = simpleMethods0.getMin((-10), 9);
        int int9 = simpleMethods0.getMin((-1), 10);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((-100), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-2) + "'", int3 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-10) + "'", int6 == (-10));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        int int30 = simpleMethods0.getMin((-8), (-9));
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
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(10, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-2), 8);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(0, 7);
        int int21 = simpleMethods0.getMin((-2), (-6));
        int int24 = simpleMethods0.getMin((-4), 0);
        int int27 = simpleMethods0.getMin((-9), (-4));
        int int30 = simpleMethods0.getMin((int) (short) 100, (-4));
        int int33 = simpleMethods0.getMin((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(52, (-1));
        int int18 = simpleMethods0.getMin(35, (-6));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin((int) (short) -1, (int) (short) 10);
        int int27 = simpleMethods0.getMin(1, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(3, (int) (short) 100);
        int int18 = simpleMethods0.getMin(1, 8);
        int int21 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int24 = simpleMethods0.getMin((int) '4', 35);
        int int27 = simpleMethods0.getMin(9, 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) ' ', 2);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 0);
        int int18 = simpleMethods0.getMin((int) 'a', 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-5), 2);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin(6, 0);
        int int18 = simpleMethods0.getMin(100, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 6);
        int int15 = simpleMethods0.getMin(100, 97);
        int int18 = simpleMethods0.getMin(7, (int) 'a');
        int int21 = simpleMethods0.getMin(10, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int15 = simpleMethods0.getMin(10, 0);
        int int18 = simpleMethods0.getMin((-10), (int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int12 = simpleMethods0.getMin((-5), (-10));
        int int15 = simpleMethods0.getMin(4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) 'a', (-100));
        int int15 = simpleMethods0.getMin((-6), 7);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-4), (int) '4');
        int int12 = simpleMethods0.getMin((int) ' ', 8);
        int int15 = simpleMethods0.getMin(5, (int) '#');
        int int18 = simpleMethods0.getMin((-10), 97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        int int36 = simpleMethods0.getMin(7, (-100));
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-100) + "'", int36 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(10, (-3));
        int int12 = simpleMethods0.getMin((-9), 5);
        int int15 = simpleMethods0.getMin((int) 'a', 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin(0, (int) 'a');
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 100);
        int int15 = simpleMethods0.getMin((-9), 32);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(10, 9);
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-9));
        int int24 = simpleMethods0.getMin((-5), 3);
        int int27 = simpleMethods0.getMin(0, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(35, (-100));
        int int18 = simpleMethods0.getMin((int) '4', (-2));
        int int21 = simpleMethods0.getMin((-5), 8);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) '4', 100);
        int int9 = simpleMethods0.getMin(0, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (short) 0, 8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 3);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin((int) (byte) -1, (int) '#');
        int int24 = simpleMethods0.getMin(1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin((-5), (int) 'a');
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-8));
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (byte) 10, 2);
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin(52, (int) (short) 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 0);
        int int27 = simpleMethods0.getMin((int) (short) 1, (-5));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (-10));
        int int15 = simpleMethods0.getMin((-1), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(9, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        int int36 = simpleMethods0.getMin((-1), (-100));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-100) + "'", int36 == (-100));
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        int int33 = simpleMethods0.getMin((-1), (-2));
        int int36 = simpleMethods0.getMin((int) (byte) 1, 7);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) ' ', 2);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 0);
        int int18 = simpleMethods0.getMin((int) 'a', 0);
        int int21 = simpleMethods0.getMin(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) ' ', (-10));
        int int24 = simpleMethods0.getMin((-5), 4);
        int int27 = simpleMethods0.getMin(32, 35);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) '#');
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin(8, 1);
        int int18 = simpleMethods0.getMin(6, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(0, 100);
        int int21 = simpleMethods0.getMin((-100), 100);
        int int24 = simpleMethods0.getMin((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin(1, 2);
        int int21 = simpleMethods0.getMin((int) (short) 100, (-1));
        int int24 = simpleMethods0.getMin(8, (-1));
        int int27 = simpleMethods0.getMin(8, 1);
        int int30 = simpleMethods0.getMin((-4), (-6));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-9), (-5));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 10, (-1));
        int int18 = simpleMethods0.getMin(10, (int) (short) 1);
        int int21 = simpleMethods0.getMin(6, (-6));
        int int24 = simpleMethods0.getMin(100, (-6));
        int int27 = simpleMethods0.getMin(10, 2);
        int int30 = simpleMethods0.getMin((-3), 1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-6), (-3));
        int int15 = simpleMethods0.getMin((-1), 5);
        int int18 = simpleMethods0.getMin((-6), (-8));
        int int21 = simpleMethods0.getMin(100, (int) (byte) 0);
        int int24 = simpleMethods0.getMin(1, 10);
        int int27 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 100);
        int int30 = simpleMethods0.getMin((-7), (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (short) 100);
        int int15 = simpleMethods0.getMin((-3), 6);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin((int) (byte) 0, 5);
        int int21 = simpleMethods0.getMin((-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((-4), 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 1, 32);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (-4));
        int int18 = simpleMethods0.getMin(1, 52);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (short) -1, (int) (short) 0);
        int int24 = simpleMethods0.getMin(0, 100);
        int int27 = simpleMethods0.getMin((int) (short) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin((-10), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 8);
        int int6 = simpleMethods0.getMin(100, (-100));
        int int9 = simpleMethods0.getMin((int) (short) 1, 8);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin(1, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        int int36 = simpleMethods0.getMin((-8), (int) (short) 100);
        int int39 = simpleMethods0.getMin((int) '#', 97);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(7, (int) (short) -1);
        int int18 = simpleMethods0.getMin((-100), 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin((-10), 0);
        int int15 = simpleMethods0.getMin(8, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((-1), (-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-8), (int) 'a');
        int int12 = simpleMethods0.getMin(5, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(10, 52);
        int int18 = simpleMethods0.getMin(10, 3);
        int int21 = simpleMethods0.getMin(32, (-4));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (byte) 1, (-5));
        int int18 = simpleMethods0.getMin(7, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((int) (short) 10, (int) (short) 0);
        int int24 = simpleMethods0.getMin(0, 32);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-5), 52);
        int int18 = simpleMethods0.getMin(3, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(100, (int) (byte) 100);
        int int9 = simpleMethods0.getMin(4, 4);
        int int12 = simpleMethods0.getMin((-4), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(5, 1);
        int int18 = simpleMethods0.getMin((-1), (-1));
        int int21 = simpleMethods0.getMin(0, 3);
        int int24 = simpleMethods0.getMin(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, (-10));
        int int24 = simpleMethods0.getMin((int) (short) 10, 0);
        int int27 = simpleMethods0.getMin((int) ' ', 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), 4);
        int int21 = simpleMethods0.getMin((-5), 100);
        int int24 = simpleMethods0.getMin((int) (short) -1, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(9, 1);
        int int21 = simpleMethods0.getMin((-5), 1);
        int int24 = simpleMethods0.getMin(52, (-10));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin((int) 'a', (-4));
        int int27 = simpleMethods0.getMin((-6), (int) (short) 0);
        int int30 = simpleMethods0.getMin((-2), 10);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, 9);
        int int18 = simpleMethods0.getMin(100, 3);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(6, 10);
        int int18 = simpleMethods0.getMin((int) (short) 10, 10);
        int int21 = simpleMethods0.getMin(32, (-7));
        int int24 = simpleMethods0.getMin((-1), 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-4), 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) '4', 100);
        int int9 = simpleMethods0.getMin(0, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int15 = simpleMethods0.getMin((-6), (-2));
        int int18 = simpleMethods0.getMin(3, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin(0, 1);
        int int12 = simpleMethods0.getMin(100, 3);
        int int15 = simpleMethods0.getMin(35, (-100));
        int int18 = simpleMethods0.getMin(100, 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(1, 9);
        int int24 = simpleMethods0.getMin(10, 100);
        int int27 = simpleMethods0.getMin((-9), (-9));
        int int30 = simpleMethods0.getMin(0, 97);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        int int33 = simpleMethods0.getMin((-2), 100);
        int int36 = simpleMethods0.getMin((-8), (-3));
        int int39 = simpleMethods0.getMin((-2), 7);
        int int42 = simpleMethods0.getMin((-100), 8);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-2) + "'", int39 == (-2));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-100) + "'", int42 == (-100));
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-2), (int) (byte) 1);
        int int9 = simpleMethods0.getMin((-7), (-1));
        int int12 = simpleMethods0.getMin(1, (int) (short) 10);
        int int15 = simpleMethods0.getMin(100, (-7));
        int int18 = simpleMethods0.getMin(0, (-5));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-5) + "'", int18 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(0, (-9));
        int int18 = simpleMethods0.getMin((int) ' ', (-100));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-100) + "'", int18 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, 5);
        int int21 = simpleMethods0.getMin(1, (-100));
        int int24 = simpleMethods0.getMin(6, 35);
        int int27 = simpleMethods0.getMin(52, (int) 'a');
        int int30 = simpleMethods0.getMin((int) (short) 0, (int) (short) 0);
        int int33 = simpleMethods0.getMin(4, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 9);
        int int9 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int12 = simpleMethods0.getMin((-1), 3);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin(32, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin((-2), (-3));
        int int15 = simpleMethods0.getMin(7, 9);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin(0, 4);
        int int24 = simpleMethods0.getMin((-4), (int) (byte) 0);
        int int27 = simpleMethods0.getMin(0, (-6));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int12 = simpleMethods0.getMin(3, (-2));
        int int15 = simpleMethods0.getMin(1, (-2));
        int int18 = simpleMethods0.getMin(35, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin((-100), 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(5, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(100, 0);
        int int21 = simpleMethods0.getMin((-6), 0);
        int int24 = simpleMethods0.getMin(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (-100));
        int int15 = simpleMethods0.getMin(4, 52);
        int int18 = simpleMethods0.getMin((-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, 4);
        int int12 = simpleMethods0.getMin((int) (short) 0, 3);
        int int15 = simpleMethods0.getMin((-5), (int) '#');
        int int18 = simpleMethods0.getMin(0, (int) '#');
        int int21 = simpleMethods0.getMin(97, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-8), (-8));
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(1, (int) (byte) 10);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin(2, (int) (short) 100);
        int int21 = simpleMethods0.getMin(35, (-2));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-10), 7);
        int int15 = simpleMethods0.getMin(0, 0);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        int int30 = simpleMethods0.getMin(0, (int) (short) -1);
        int int33 = simpleMethods0.getMin((-6), 10);
        java.lang.Class<?> wildcardClass34 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 1, 32);
        int int15 = simpleMethods0.getMin((-9), 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-4), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin(5, (int) (short) 10);
        int int12 = simpleMethods0.getMin(32, 97);
        int int15 = simpleMethods0.getMin(6, 0);
        int int18 = simpleMethods0.getMin(100, (int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 0, 6);
        int int18 = simpleMethods0.getMin(1, 97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) ' ', (-4));
        int int9 = simpleMethods0.getMin((-2), (int) (byte) 10);
        int int12 = simpleMethods0.getMin(9, 32);
        int int15 = simpleMethods0.getMin((-1), 100);
        int int18 = simpleMethods0.getMin((int) '4', 7);
        int int21 = simpleMethods0.getMin((int) '#', (int) (short) 100);
        int int24 = simpleMethods0.getMin(10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        int int30 = simpleMethods0.getMin(2, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-100) + "'", int15 == (-100));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((-6), 9);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-7));
        int int21 = simpleMethods0.getMin((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        int int30 = simpleMethods0.getMin(0, 35);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        int int30 = simpleMethods0.getMin((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin((-1), (-5));
        int int18 = simpleMethods0.getMin(8, (int) '4');
        int int21 = simpleMethods0.getMin((-2), (int) ' ');
        int int24 = simpleMethods0.getMin(9, (int) 'a');
        int int27 = simpleMethods0.getMin((int) (short) 100, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin((int) 'a', (-4));
        int int27 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int30 = simpleMethods0.getMin(1, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((int) '#', 0);
        int int15 = simpleMethods0.getMin((-4), 2);
        int int18 = simpleMethods0.getMin(0, 35);
        int int21 = simpleMethods0.getMin(10, (int) (byte) -1);
        int int24 = simpleMethods0.getMin((int) (short) 100, 10);
        int int27 = simpleMethods0.getMin(3, 7);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        int int42 = simpleMethods0.getMin((-8), (int) ' ');
        int int45 = simpleMethods0.getMin(100, (-8));
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-8) + "'", int42 == (-8));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-8) + "'", int45 == (-8));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        int int30 = simpleMethods0.getMin(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (short) 100, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin(2, (-2));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((-1), 2);
        int int12 = simpleMethods0.getMin((-2), 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((-8), (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) ' ', 2);
        int int18 = simpleMethods0.getMin((-10), 32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) 10, 5);
        int int24 = simpleMethods0.getMin(32, 32);
        int int27 = simpleMethods0.getMin(1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(5, 0);
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        int int27 = simpleMethods0.getMin(32, 0);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int24 = simpleMethods0.getMin((-8), (-8));
        int int27 = simpleMethods0.getMin(5, 9);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-8) + "'", int24 == (-8));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin((int) '#', (int) (short) 10);
        int int21 = simpleMethods0.getMin((-100), (int) 'a');
        int int24 = simpleMethods0.getMin(8, (-9));
        int int27 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) '#', 35);
        int int18 = simpleMethods0.getMin((int) 'a', (int) '4');
        int int21 = simpleMethods0.getMin((-9), 0);
        int int24 = simpleMethods0.getMin((int) (short) -1, 1);
        int int27 = simpleMethods0.getMin(4, 1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((-100), 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(3, (int) (byte) 100);
        int int15 = simpleMethods0.getMin(7, (int) (byte) 10);
        int int18 = simpleMethods0.getMin(100, 3);
        int int21 = simpleMethods0.getMin((-1), (int) ' ');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-100) + "'", int6 == (-100));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin(9, (int) (short) 100);
        int int18 = simpleMethods0.getMin((-7), (-7));
        int int21 = simpleMethods0.getMin(0, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-8), 7);
        int int15 = simpleMethods0.getMin((int) '4', (-6));
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int24 = simpleMethods0.getMin((int) (short) 0, 7);
        int int27 = simpleMethods0.getMin(8, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int24 = simpleMethods0.getMin((-9), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((-6), 0);
        int int15 = simpleMethods0.getMin(9, 1);
        int int18 = simpleMethods0.getMin(1, (-8));
        int int21 = simpleMethods0.getMin(0, 1);
        int int24 = simpleMethods0.getMin((int) ' ', (-7));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
        int int36 = simpleMethods0.getMin(1, (-8));
        java.lang.Class<?> wildcardClass37 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-8) + "'", int36 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin(35, 0);
        int int18 = simpleMethods0.getMin((-2), 4);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int12 = simpleMethods0.getMin(10, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin(35, (int) (byte) 0);
        int int21 = simpleMethods0.getMin(0, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin((-10), (-5));
        int int15 = simpleMethods0.getMin((int) (short) 10, 9);
        int int18 = simpleMethods0.getMin((int) '#', (int) (short) 10);
        int int21 = simpleMethods0.getMin((-9), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin((int) (short) 1, 3);
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(0, (int) (byte) -1);
        int int21 = simpleMethods0.getMin((-2), (-2));
        int int24 = simpleMethods0.getMin((-1), (-1));
        int int27 = simpleMethods0.getMin((int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-6));
        int int24 = simpleMethods0.getMin(1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(2, (-1));
        int int6 = simpleMethods0.getMin((-2), (int) 'a');
        int int9 = simpleMethods0.getMin((int) (short) -1, 35);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 100, 5);
        int int24 = simpleMethods0.getMin(97, 52);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-1), (-7));
        int int15 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 0, 1);
        int int15 = simpleMethods0.getMin(97, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((-7), 1);
        int int21 = simpleMethods0.getMin(10, 0);
        int int24 = simpleMethods0.getMin((-100), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((-3), 1);
        int int9 = simpleMethods0.getMin(35, (-100));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(4, (-3));
        int int9 = simpleMethods0.getMin(10, (-4));
        int int12 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int15 = simpleMethods0.getMin((-6), 9);
        int int18 = simpleMethods0.getMin((int) (short) 100, 6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin((-1), (-7));
        int int18 = simpleMethods0.getMin(7, (int) '4');
        int int21 = simpleMethods0.getMin((int) ' ', 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((int) '#', (-8));
        int int12 = simpleMethods0.getMin(0, (int) (short) 1);
        int int15 = simpleMethods0.getMin(1, (-4));
        int int18 = simpleMethods0.getMin((int) 'a', 8);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        int int33 = simpleMethods0.getMin(1, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin(10, (int) (short) 0);
        int int15 = simpleMethods0.getMin((-5), 0);
        int int18 = simpleMethods0.getMin((-7), 0);
        int int21 = simpleMethods0.getMin(100, (int) (short) 100);
        int int24 = simpleMethods0.getMin((int) '4', (-9));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin((-100), 10);
        int int15 = simpleMethods0.getMin(0, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-7), (int) (short) 1);
        int int21 = simpleMethods0.getMin((-6), 100);
        int int24 = simpleMethods0.getMin((-10), (-8));
        int int27 = simpleMethods0.getMin(0, (-6));
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int12 = simpleMethods0.getMin(0, 10);
        int int15 = simpleMethods0.getMin(97, (int) 'a');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, (int) (short) 0);
        int int12 = simpleMethods0.getMin((-1), 0);
        int int15 = simpleMethods0.getMin(10, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((int) '4', 3);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(6, 0);
        int int21 = simpleMethods0.getMin(8, 10);
        int int24 = simpleMethods0.getMin((-100), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-100) + "'", int24 == (-100));
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin(5, 1);
        int int15 = simpleMethods0.getMin((-3), (int) '#');
        int int18 = simpleMethods0.getMin((-9), 9);
        int int21 = simpleMethods0.getMin((int) (short) 0, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin(100, (int) (short) 1);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 1);
        int int24 = simpleMethods0.getMin((int) (short) 100, (-5));
        int int27 = simpleMethods0.getMin(52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin(4, 100);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 10);
        int int21 = simpleMethods0.getMin((-4), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(0, 4);
        int int12 = simpleMethods0.getMin((-100), (int) (byte) 100);
        int int15 = simpleMethods0.getMin((int) (short) 100, 5);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-100) + "'", int12 == (-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) 1, 1);
        int int12 = simpleMethods0.getMin(0, (-6));
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(6, 8);
        int int21 = simpleMethods0.getMin(35, (-100));
        int int24 = simpleMethods0.getMin((-6), 100);
        int int27 = simpleMethods0.getMin((-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-6) + "'", int24 == (-6));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-3), (-2));
        int int12 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 4);
        int int18 = simpleMethods0.getMin(100, 35);
        int int21 = simpleMethods0.getMin(0, (-5));
        int int24 = simpleMethods0.getMin((-4), 97);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        int int30 = simpleMethods0.getMin((int) (short) 100, 7);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        int int42 = simpleMethods0.getMin(6, 10);
        int int45 = simpleMethods0.getMin((int) '4', 32);
        int int48 = simpleMethods0.getMin((-4), (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 6 + "'", int42 == 6);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-4) + "'", int48 == (-4));
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin((int) (short) -1, 1);
        int int9 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 100);
        int int12 = simpleMethods0.getMin(7, 1);
        int int15 = simpleMethods0.getMin(52, 5);
        int int18 = simpleMethods0.getMin(100, 7);
        int int21 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int24 = simpleMethods0.getMin((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-8), (int) (byte) -1);
        int int12 = simpleMethods0.getMin((-8), (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) ' ', 2);
        int int18 = simpleMethods0.getMin((-6), 3);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((int) '#', (int) 'a');
        int int12 = simpleMethods0.getMin(1, (-1));
        int int15 = simpleMethods0.getMin(10, (int) (short) 10);
        int int18 = simpleMethods0.getMin((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(9, (int) (short) 0);
        int int9 = simpleMethods0.getMin(0, (-7));
        int int12 = simpleMethods0.getMin((int) (short) 100, (-10));
        int int15 = simpleMethods0.getMin((-8), 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (-8));
        int int21 = simpleMethods0.getMin(4, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-10) + "'", int12 == (-10));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(1, (int) (short) 100);
        int int9 = simpleMethods0.getMin((-6), 2);
        int int12 = simpleMethods0.getMin(0, (-9));
        int int15 = simpleMethods0.getMin(5, 0);
        int int18 = simpleMethods0.getMin((-9), (-8));
        int int21 = simpleMethods0.getMin((-100), 32);
        int int24 = simpleMethods0.getMin(5, (-1));
        int int27 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int30 = simpleMethods0.getMin((-3), (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-9) + "'", int12 == (-9));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-100) + "'", int21 == (-100));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin((int) '#', (-9));
        int int9 = simpleMethods0.getMin(8, 100);
        int int12 = simpleMethods0.getMin((-1), (-3));
        int int15 = simpleMethods0.getMin((int) (byte) 0, (-4));
        int int18 = simpleMethods0.getMin((int) (short) 100, 4);
        int int21 = simpleMethods0.getMin(5, 6);
        int int24 = simpleMethods0.getMin(35, 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-9) + "'", int6 == (-9));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', (int) (byte) -1);
        int int6 = simpleMethods0.getMin(1, (int) ' ');
        int int9 = simpleMethods0.getMin(2, (-8));
        int int12 = simpleMethods0.getMin(100, 10);
        int int15 = simpleMethods0.getMin((int) (short) 0, (-5));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-9), 6);
        int int6 = simpleMethods0.getMin(0, 2);
        int int9 = simpleMethods0.getMin((-100), 2);
        int int12 = simpleMethods0.getMin((-6), (int) (byte) 1);
        int int15 = simpleMethods0.getMin(100, (int) (short) 10);
        int int18 = simpleMethods0.getMin(0, 0);
        int int21 = simpleMethods0.getMin((-6), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-100) + "'", int9 == (-100));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        int int9 = simpleMethods0.getMin(7, (int) (byte) 100);
        int int12 = simpleMethods0.getMin(3, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }
}

