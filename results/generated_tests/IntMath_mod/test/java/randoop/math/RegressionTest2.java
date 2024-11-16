package math;

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
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) (short) 0, 2);
        int int15 = intMath0.mod((int) ' ', 30);
        int int18 = intMath0.mod(55, 53);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(71, 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(4, 89);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(55, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(5, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(68, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod((-1), 22);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod(2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod(7, 36);
        int int27 = intMath0.mod(100, 24);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(8, (int) (byte) 10);
        int int24 = intMath0.mod((int) (byte) 1, 10);
        int int27 = intMath0.mod(12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(29, 25);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod(47, 50);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod(77, 37);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        int int15 = intMath0.mod(100, 13);
        int int18 = intMath0.mod(20, 41);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(32, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod((int) (short) 100, (int) (byte) 100);
        int int27 = intMath0.mod((-4), 15);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(36, 21);
        int int18 = intMath0.mod(20, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(32, 8);
        int int24 = intMath0.mod(48, 25);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-2), 1);
        int int18 = intMath0.mod(100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(86, 10);
        int int15 = intMath0.mod(27, 15);
        int int18 = intMath0.mod(17, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(17, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(12, 42);
        int int24 = intMath0.mod((int) 'a', 88);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-100), (int) (byte) 10);
        int int9 = intMath0.mod(13, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(22, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(86, 7);
        int int21 = intMath0.mod(0, 72);
        int int24 = intMath0.mod(42, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(88, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(95, 19);
        int int24 = intMath0.mod((-10), 2);
        int int27 = intMath0.mod(23, 16);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(20, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(32, 8);
        int int24 = intMath0.mod(48, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(37, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(0, 45);
        int int21 = intMath0.mod((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(91, 26);
        int int24 = intMath0.mod((int) (short) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) 'a', (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
        int int21 = intMath0.mod((-100), 2);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((int) (byte) 1, 44);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(73, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod(0, 7);
        int int24 = intMath0.mod(11, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(35, (int) (short) 1);
        int int18 = intMath0.mod((-2), (int) '4');
        int int21 = intMath0.mod(54, 79);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(6, (int) ' ');
        int int15 = intMath0.mod(1, 81);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(53, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(13, 100);
        int int9 = intMath0.mod(35, (int) ' ');
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod(7, 36);
        int int27 = intMath0.mod(2, 26);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((-100), 53);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((-3), 1);
        int int12 = intMath0.mod(4, 51);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(8, (int) (byte) 10);
        int int24 = intMath0.mod(47, 4);
        int int27 = intMath0.mod((int) 'a', 67);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod(38, 47);
        int int18 = intMath0.mod(80, 23);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((-3), 7);
        int int15 = intMath0.mod(2, 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod((-6), 50);
        int int21 = intMath0.mod(88, 50);
        int int24 = intMath0.mod(72, 83);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(30, 81);
        int int24 = intMath0.mod(0, 26);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        int int18 = intMath0.mod(87, 97);
        int int21 = intMath0.mod(37, 68);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod((int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(40, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(91, 34);
        int int18 = intMath0.mod(10, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(49, (int) '#');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(12, 42);
        int int24 = intMath0.mod(38, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 38 + "'", int24 == 38);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(95, 19);
        int int24 = intMath0.mod(89, 77);
        int int27 = intMath0.mod(7, 29);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod(52, (int) (short) 10);
        int int27 = intMath0.mod(42, 17);
        int int30 = intMath0.mod((-100), 2);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(0, 28);
        int int21 = intMath0.mod(84, 95);
        int int24 = intMath0.mod(11, 26);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(19, 74);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (byte) 100, (int) 'a');
        int int15 = intMath0.mod((int) '#', 11);
        int int18 = intMath0.mod((int) ' ', 54);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        int int18 = intMath0.mod(15, 44);
        int int21 = intMath0.mod((int) (byte) 10, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) 'a', (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod((-7), 48);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod((-7), 48);
        int int27 = intMath0.mod(97, 38);
        int int30 = intMath0.mod(44, 55);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(14, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        int int18 = intMath0.mod(40, 50);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(83, 40);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((-100), 13);
        int int18 = intMath0.mod((-5), (int) '4');
        int int21 = intMath0.mod(5, 37);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (byte) 100, (int) 'a');
        int int15 = intMath0.mod((int) '#', 11);
        int int18 = intMath0.mod((int) ' ', 54);
        int int21 = intMath0.mod((int) (byte) 10, 37);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(37, 34);
        int int27 = intMath0.mod(6, (int) '4');
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        int int12 = intMath0.mod(32, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(25, 81);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod((-100), 87);
        int int21 = intMath0.mod(0, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(95, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        int int12 = intMath0.mod((int) (byte) 10, 71);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod(52, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(30, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(32, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        int int18 = intMath0.mod(74, 16);
        int int21 = intMath0.mod(28, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(9, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(21, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(84, 16);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 3);
        int int18 = intMath0.mod(15, 54);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 35);
        int int21 = intMath0.mod(98, (int) (short) 100);
        int int24 = intMath0.mod(24, 42);
        int int27 = intMath0.mod(9, 94);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((int) (short) 0, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(0, 6);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(0, 80);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod((-6), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-4), (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(79, 86);
        int int12 = intMath0.mod(27, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(1, (int) (byte) 10);
        int int24 = intMath0.mod((int) (short) -1, 12);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(42, 8);
        int int18 = intMath0.mod(5, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod(10, 10);
        int int21 = intMath0.mod(34, 32);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(46, 23);
        int int21 = intMath0.mod((-9), (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(30, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(41, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(0, 17);
        int int24 = intMath0.mod((int) (byte) 0, 39);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(49, 87);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(51, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 35);
        int int21 = intMath0.mod(98, (int) (short) 100);
        int int24 = intMath0.mod(24, 42);
        int int27 = intMath0.mod(40, 7);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        int int18 = intMath0.mod((int) '#', 55);
        int int21 = intMath0.mod(100, (int) '4');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        int int27 = intMath0.mod(7, 91);
        int int30 = intMath0.mod(36, 50);
        int int33 = intMath0.mod(25, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36 + "'", int30 == 36);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25 + "'", int33 == 25);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(49, 4);
        int int21 = intMath0.mod(39, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(12, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(10, 99);
        int int15 = intMath0.mod((int) (byte) 0, 54);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(74, 7);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-1), 37);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod(83, 37);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(5, 34);
        int int30 = intMath0.mod(3, 97);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod((int) (byte) -1, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 68 + "'", int15 == 68);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((-3), 1);
        int int12 = intMath0.mod(4, 51);
        int int15 = intMath0.mod((-10), 30);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
        int int21 = intMath0.mod(52, 79);
        int int24 = intMath0.mod(46, 52);
        int int27 = intMath0.mod(23, 7);
        int int30 = intMath0.mod(10, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod((-8), 20);
        int int21 = intMath0.mod(80, 16);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((-3), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) (byte) -1, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((int) 'a', 94);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(36, 15);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(46, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(86, 35);
        int int9 = intMath0.mod(14, 51);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 16 + "'", int6 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod((int) '4', 8);
        int int27 = intMath0.mod(52, 32);
        int int30 = intMath0.mod(83, 51);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(16, 46);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(72, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(16, 46);
        int int18 = intMath0.mod(21, 2);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod((-6), 32);
        int int21 = intMath0.mod(1, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(13, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((int) (short) 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(80, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod(10, 30);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(44, 18);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(46, 23);
        int int21 = intMath0.mod(34, 4);
        int int24 = intMath0.mod(0, 100);
        int int27 = intMath0.mod(2, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod((int) (byte) 100, 88);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(83, 40);
        int int21 = intMath0.mod(88, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(10, 99);
        int int15 = intMath0.mod(0, 28);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod(1, 86);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod(42, 36);
        int int27 = intMath0.mod((int) (byte) 0, 26);
        int int30 = intMath0.mod((-8), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(12, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-1), 37);
        int int18 = intMath0.mod((-8), (int) '#');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(10, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(74, 12);
        int int18 = intMath0.mod(38, 44);
        int int21 = intMath0.mod(17, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-6), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(4, (int) (short) 10);
        int int21 = intMath0.mod(38, 49);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(74, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod((-1), 27);
        int int27 = intMath0.mod(1, 97);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod(49, 98);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(10, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(28, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(20, 39);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(89, 94);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 89 + "'", int21 == 89);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
        int int21 = intMath0.mod(46, 51);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
        int int21 = intMath0.mod(46, 51);
        int int24 = intMath0.mod(28, 50);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        int int12 = intMath0.mod(73, 21);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(18, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(68, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(46, 23);
        int int21 = intMath0.mod(34, 4);
        int int24 = intMath0.mod(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(91, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod((-5), 4);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(27, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(87, (int) (short) 100);
        int int21 = intMath0.mod(5, 87);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(100, 50);
        int int21 = intMath0.mod(99, 12);
        int int24 = intMath0.mod(79, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        int int15 = intMath0.mod(74, (int) '4');
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 35);
        int int21 = intMath0.mod(54, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(13, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(0, 45);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(2, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(8, 81);
        int int27 = intMath0.mod(54, 3);
        int int30 = intMath0.mod(40, 25);
        int int33 = intMath0.mod(68, 87);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 68 + "'", int33 == 68);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(72, 27);
        int int30 = intMath0.mod((-3), 5);
        int int33 = intMath0.mod(68, 71);
        int int36 = intMath0.mod(23, 98);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 68 + "'", int33 == 68);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 23 + "'", int36 == 23);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(98, 98);
        int int33 = intMath0.mod(80, 34);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod((-2), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((-1), (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((-1), 30);
        int int12 = intMath0.mod(11, 4);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(13, 100);
        int int9 = intMath0.mod(35, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(74, 12);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(13, 100);
        java.lang.Class<?> wildcardClass7 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(92, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 92 + "'", int21 == 92);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(10, 26);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(37, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod((-9), (int) ' ');
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod(49, (int) 'a');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod(91, 4);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-1), 28);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-100), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
        int int15 = intMath0.mod((-3), (int) 'a');
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 94 + "'", int15 == 94);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(42, 25);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod(74, (int) '4');
        int int21 = intMath0.mod(72, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod((int) ' ', 52);
        int int24 = intMath0.mod(22, 22);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(8, 28);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        int int18 = intMath0.mod(40, 50);
        int int21 = intMath0.mod(0, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) ' ', (int) (byte) 1);
        int int27 = intMath0.mod(88, 30);
        int int30 = intMath0.mod(2, 3);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod(86, 42);
        int int24 = intMath0.mod(7, 4);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(52, (int) (short) 1);
        int int18 = intMath0.mod((-7), 39);
        int int21 = intMath0.mod(41, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(27, 2);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(100, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(40, (int) (short) 1);
        int int21 = intMath0.mod(51, (int) ' ');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(12, 42);
        int int24 = intMath0.mod((int) 'a', 88);
        int int27 = intMath0.mod(67, 11);
        int int30 = intMath0.mod((int) (short) 10, 8);
        int int33 = intMath0.mod(4, 38);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((-3), 7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(47, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod((-2), (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(20, 39);
        int int24 = intMath0.mod((int) (byte) 10, 7);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod((int) (short) 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(25, 81);
        int int27 = intMath0.mod((int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(80, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(50, 14);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(30, 51);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(20, 72);
        int int27 = intMath0.mod(40, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(95, 3);
        int int27 = intMath0.mod((-1), (int) ' ');
        int int30 = intMath0.mod(55, 84);
        int int33 = intMath0.mod((-6), 23);
        int int36 = intMath0.mod((int) ' ', 84);
        int int39 = intMath0.mod((-8), 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17 + "'", int33 == 17);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 56 + "'", int39 == 56);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(19, 24);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) -1, 87);
        int int12 = intMath0.mod(80, 19);
        int int15 = intMath0.mod(53, (int) (short) 1);
        int int18 = intMath0.mod(100, 53);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86 + "'", int9 == 86);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        int int12 = intMath0.mod((int) (short) 0, 89);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((-2), (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(54, 80);
        int int18 = intMath0.mod(74, 89);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(7, 49);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod(4, 26);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(81, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(100, 14);
        int int18 = intMath0.mod(35, 71);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod(50, 71);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-7), 1);
        int int21 = intMath0.mod(27, 91);
        int int24 = intMath0.mod(48, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(23, 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(91, 16);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
        int int21 = intMath0.mod(52, 79);
        int int24 = intMath0.mod(51, 28);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(0, (int) '4');
        int int18 = intMath0.mod(25, 36);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '#', 49);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(0, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(37, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(28, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(25, 27);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25 + "'", int21 == 25);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod((int) (short) -1, 49);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(28, (int) '#');
        int int27 = intMath0.mod(72, (int) (short) 100);
        int int30 = intMath0.mod((-2), 32);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 72 + "'", int27 == 72);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30 + "'", int30 == 30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(99, 45);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(20, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(10, 52);
        int int12 = intMath0.mod(9, 27);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod((int) (byte) 0, (int) (byte) 100);
        int int18 = intMath0.mod((-4), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(39, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(22, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod((-5), 10);
        int int27 = intMath0.mod((-1), 99);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(22, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod((int) (byte) 0, 14);
        int int18 = intMath0.mod(18, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(2, 17);
        int int21 = intMath0.mod(2, 83);
        int int24 = intMath0.mod((-1), 20);
        int int27 = intMath0.mod(10, (int) (byte) 100);
        int int30 = intMath0.mod((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(36, 18);
        int int18 = intMath0.mod(30, 30);
        int int21 = intMath0.mod(91, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(98, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 6);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(98, 3);
        int int27 = intMath0.mod(69, 52);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod((int) (short) 0, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        int int18 = intMath0.mod(15, 44);
        int int21 = intMath0.mod(72, 99);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod((int) 'a', 51);
        int int24 = intMath0.mod((int) (byte) 0, 2);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) ' ', (int) (byte) 100);
        int int21 = intMath0.mod(54, 44);
        int int24 = intMath0.mod((int) (byte) 100, 79);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
        int int21 = intMath0.mod(52, 79);
        int int24 = intMath0.mod(46, 52);
        int int27 = intMath0.mod(23, 7);
        int int30 = intMath0.mod((-6), 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(11, 21);
        int int21 = intMath0.mod(18, 24);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod((-6), 32);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(24, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod(83, 79);
        int int12 = intMath0.mod((int) (short) -1, 99);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 35);
        int int21 = intMath0.mod(98, (int) (short) 100);
        int int24 = intMath0.mod(24, 42);
        int int27 = intMath0.mod(100, 41);
        int int30 = intMath0.mod(92, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(37, 34);
        int int27 = intMath0.mod(6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(10, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(79, 26);
        int int27 = intMath0.mod((-9), 64);
        int int30 = intMath0.mod(29, 77);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55 + "'", int27 == 55);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(79, 26);
        int int27 = intMath0.mod((-7), (int) '#');
        int int30 = intMath0.mod(79, 8);
        int int33 = intMath0.mod((-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod((int) 'a', 51);
        int int24 = intMath0.mod(47, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(100, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (byte) 100, 42);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(88, 79);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod(1, 86);
        int int30 = intMath0.mod(35, 48);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod((-5), 4);
        int int27 = intMath0.mod(75, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(81, 86);
        int int18 = intMath0.mod(91, 77);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) (short) 10, 30);
        int int15 = intMath0.mod(38, 74);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(71, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        int int24 = intMath0.mod(0, 73);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((-9), 36);
        int int21 = intMath0.mod(36, (int) 'a');
        int int24 = intMath0.mod(15, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod(0, 26);
        int int24 = intMath0.mod(91, 47);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(52, 50);
        int int18 = intMath0.mod(10, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(79, (int) (byte) 10);
        int int24 = intMath0.mod(1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(73, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 73 + "'", int21 == 73);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod((-6), 32);
        int int21 = intMath0.mod(1, 51);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(20, (int) (short) 100);
        int int21 = intMath0.mod(3, 28);
        int int24 = intMath0.mod(45, 49);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod(42, 36);
        int int27 = intMath0.mod((int) (byte) 0, 26);
        int int30 = intMath0.mod((-8), (int) '4');
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(95, 19);
        int int24 = intMath0.mod((-10), 2);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(10, 74);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(4, (int) (short) 10);
        int int21 = intMath0.mod(38, 49);
        int int24 = intMath0.mod(77, 98);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 77 + "'", int24 == 77);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod((-1), 22);
        int int27 = intMath0.mod(14, 46);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14 + "'", int27 == 14);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod((int) (byte) 0, 17);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod((-5), 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(89, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod(35, 38);
        int int27 = intMath0.mod(100, 26);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(52, 67);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        int int18 = intMath0.mod(40, 50);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(61, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod((-7), 48);
        int int27 = intMath0.mod((int) (byte) 10, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(54, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((-100), 13);
        int int18 = intMath0.mod((-5), (int) '4');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod(83, 37);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(7, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(36, 18);
        int int18 = intMath0.mod(30, 30);
        int int21 = intMath0.mod(91, 47);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) 'a', 4);
        int int12 = intMath0.mod(54, 6);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(25, 6);
        int int27 = intMath0.mod((int) (byte) 1, 25);
        int int30 = intMath0.mod((-10), 16);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(9, 38);
        int int18 = intMath0.mod((int) '#', 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(83, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(81, 86);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        int int18 = intMath0.mod((int) '#', 55);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod(23, 15);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(38, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((-7), 20);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(81, 34);
        int int21 = intMath0.mod((-7), 8);
        int int24 = intMath0.mod(74, 94);
        int int27 = intMath0.mod(39, 55);
        int int30 = intMath0.mod(29, 98);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 35);
        int int21 = intMath0.mod(98, (int) (short) 100);
        int int24 = intMath0.mod(24, 42);
        int int27 = intMath0.mod(40, 7);
        int int30 = intMath0.mod((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(0, 27);
        int int21 = intMath0.mod(0, (int) ' ');
        int int24 = intMath0.mod(6, 12);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(86, 7);
        int int21 = intMath0.mod(0, 72);
        int int24 = intMath0.mod((-1), (int) (short) 10);
        int int27 = intMath0.mod(83, 95);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 83 + "'", int27 == 83);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(5, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(46, 23);
        int int21 = intMath0.mod(34, 4);
        int int24 = intMath0.mod(0, 100);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(74, 77);
        int int12 = intMath0.mod(94, 100);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 94 + "'", int12 == 94);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(12, 25);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) ' ', (int) (byte) 100);
        int int21 = intMath0.mod(54, 44);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(0, 28);
        int int21 = intMath0.mod(84, 95);
        int int24 = intMath0.mod(11, 26);
        int int27 = intMath0.mod(22, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod((-2), 23);
        int int18 = intMath0.mod(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(54, 77);
        int int15 = intMath0.mod(79, 1);
        int int18 = intMath0.mod(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod(3, (int) (byte) 1);
        int int24 = intMath0.mod(12, 18);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((int) (short) 10, (int) (byte) 100);
        int int18 = intMath0.mod((int) (short) 100, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(54, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod(52, (int) (short) 10);
        int int27 = intMath0.mod(42, 17);
        int int30 = intMath0.mod((int) (byte) 1, 5);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(100, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(44, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod(5, 14);
        int int12 = intMath0.mod(55, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod((-3), 83);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod(1, 16);
        int int24 = intMath0.mod(24, 3);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod(0, (int) 'a');
        int int24 = intMath0.mod((int) '4', 69);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) -1, 87);
        int int12 = intMath0.mod(27, 72);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86 + "'", int9 == 86);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(95, 3);
        int int27 = intMath0.mod((-2), (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(2, 81);
        int int15 = intMath0.mod((int) '#', 68);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(0, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod(1, 83);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod((int) (byte) 0, 14);
        int int18 = intMath0.mod(18, 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod(51, 29);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(99, 19);
        int int30 = intMath0.mod(79, 5);
        int int33 = intMath0.mod(29, 77);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(64, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29 + "'", int33 == 29);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(16, (int) (byte) 1);
        int int24 = intMath0.mod(24, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(77, 79);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod((int) (short) 10, 6);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(36, 100);
        int int15 = intMath0.mod((-1), 77);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((-7), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(89, 35);
        int int15 = intMath0.mod(26, 42);
        int int18 = intMath0.mod(30, (int) '#');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(0, (int) (byte) 1);
        int int18 = intMath0.mod(37, 71);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(35, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(76, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod((-5), 10);
        int int27 = intMath0.mod((-1), 99);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(9, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((-2), 50);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(10, (int) (short) 10);
        int int27 = intMath0.mod(0, (int) (short) 10);
        int int30 = intMath0.mod(26, 30);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26 + "'", int30 == 26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(9, 83);
        int int21 = intMath0.mod(52, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(80, 49);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((-5), 52);
        int int21 = intMath0.mod(14, 74);
        int int24 = intMath0.mod((int) (short) 1, 23);
        int int27 = intMath0.mod(6, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(25, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(12, 42);
        int int24 = intMath0.mod((int) 'a', 88);
        int int27 = intMath0.mod(67, 11);
        int int30 = intMath0.mod((int) (short) 10, 8);
        int int33 = intMath0.mod(18, 48);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18 + "'", int33 == 18);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(35, 38);
        int int18 = intMath0.mod(97, 81);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 34);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(92, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(79, 26);
        int int27 = intMath0.mod((-7), (int) '#');
        int int30 = intMath0.mod(79, 8);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(99, 19);
        int int30 = intMath0.mod(79, 5);
        int int33 = intMath0.mod(29, 77);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(72, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29 + "'", int33 == 29);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-7), 1);
        int int21 = intMath0.mod(27, 91);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(2, 17);
        int int21 = intMath0.mod(2, 83);
        int int24 = intMath0.mod((-1), 20);
        int int27 = intMath0.mod(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(45, 69);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(95, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(8, 80);
        int int18 = intMath0.mod(67, 51);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod(74, (int) '4');
        int int21 = intMath0.mod(72, (int) (byte) 1);
        int int24 = intMath0.mod((-1), 44);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43 + "'", int24 == 43);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(10, 99);
        int int15 = intMath0.mod(3, 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod((int) (short) 1, 15);
        int int15 = intMath0.mod(0, 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(36, 21);
        int int18 = intMath0.mod(34, 50);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(40, (int) (short) 1);
        int int21 = intMath0.mod((int) (short) 1, 94);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(17, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(10, (int) (short) 10);
        int int27 = intMath0.mod(0, (int) (short) 10);
        int int30 = intMath0.mod(66, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31 + "'", int30 == 31);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(7, 2);
        int int12 = intMath0.mod(17, 83);
        int int15 = intMath0.mod(26, (int) (short) 1);
        int int18 = intMath0.mod((-100), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '#', 49);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod(79, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod((-5), 10);
        int int27 = intMath0.mod((-1), 99);
        int int30 = intMath0.mod(8, 3);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(50, 30);
        int int21 = intMath0.mod(1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod((int) (short) 100, 29);
        int int24 = intMath0.mod(94, 95);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(76, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod((int) (short) 0, 9);
        int int21 = intMath0.mod((-8), 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(25, 81);
        int int27 = intMath0.mod((int) (short) -1, 1);
        int int30 = intMath0.mod(3, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(10, (int) (short) 10);
        int int27 = intMath0.mod(54, 26);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(48, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-5), 10);
        int int15 = intMath0.mod(40, 25);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        int int18 = intMath0.mod(15, 44);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(40, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((-100), (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        int int18 = intMath0.mod((int) '#', 55);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(0, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 1, 12);
        int int18 = intMath0.mod(19, 2);
        int int21 = intMath0.mod(97, 13);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod((int) (short) -1, 48);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(40, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(45, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(11, 21);
        int int21 = intMath0.mod((-3), 64);
        int int24 = intMath0.mod((int) '#', 3);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 61 + "'", int21 == 61);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(99, 19);
        int int30 = intMath0.mod(0, (int) ' ');
        int int33 = intMath0.mod(77, 24);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod(79, 87);
        int int12 = intMath0.mod(50, 1);
        int int15 = intMath0.mod(4, 37);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(35, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(0, (int) '#');
        int int24 = intMath0.mod(87, 87);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (byte) 100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(4, (int) (short) 10);
        int int21 = intMath0.mod(38, 49);
        int int24 = intMath0.mod(77, 98);
        int int27 = intMath0.mod(12, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 77 + "'", int24 == 77);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(98, 3);
        int int27 = intMath0.mod((int) 'a', 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 47 + "'", int27 == 47);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(54, 77);
        int int15 = intMath0.mod(79, 1);
        int int18 = intMath0.mod(14, 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(36, 18);
        int int18 = intMath0.mod(30, 30);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 83);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((-100), 13);
        int int18 = intMath0.mod((-5), (int) '4');
        int int21 = intMath0.mod(0, (int) '#');
        int int24 = intMath0.mod((-8), 34);
        int int27 = intMath0.mod(4, 91);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(35, (int) 'a');
        int int18 = intMath0.mod((int) '4', 95);
        int int21 = intMath0.mod((int) '#', 47);
        int int24 = intMath0.mod((int) (short) 1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-2), 1);
        int int18 = intMath0.mod(3, 49);
        int int21 = intMath0.mod(97, 42);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod((-1), (int) '#');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(4, (int) (short) 100);
        int int33 = intMath0.mod((int) (byte) -1, 30);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29 + "'", int33 == 29);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod(13, 34);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(35, 38);
        int int18 = intMath0.mod((-1), 67);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 66 + "'", int18 == 66);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod((int) (short) -1, 49);
        int int18 = intMath0.mod(69, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(3, 16);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(79, (int) (byte) 10);
        int int24 = intMath0.mod(1, (int) (byte) 100);
        int int27 = intMath0.mod((int) 'a', 48);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((-3), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod(0, 12);
        int int12 = intMath0.mod((int) (byte) 1, 2);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(79, 14);
        int int27 = intMath0.mod(73, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 5);
        int int24 = intMath0.mod(46, 79);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(2, 86);
        int int21 = intMath0.mod(8, (int) '4');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(2, 17);
        int int21 = intMath0.mod(26, 49);
        int int24 = intMath0.mod((-2), 34);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 35);
        int int21 = intMath0.mod(54, (int) (short) 1);
        int int24 = intMath0.mod(19, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod((-1), 22);
        int int27 = intMath0.mod(76, 49);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27 + "'", int27 == 27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod((int) (byte) 10, 54);
        int int30 = intMath0.mod(15, 32);
        int int33 = intMath0.mod(28, 48);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(51, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 28 + "'", int33 == 28);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, 99);
        int int24 = intMath0.mod(1, (int) 'a');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(72, 27);
        int int30 = intMath0.mod(39, 24);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(45, 69);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(61, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 45 + "'", int18 == 45);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(4, 89);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((int) 'a', 94);
        int int15 = intMath0.mod(2, 86);
        int int18 = intMath0.mod(27, 45);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-4), (int) (byte) 1);
        int int21 = intMath0.mod(14, 81);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (byte) 100, (int) 'a');
        int int15 = intMath0.mod((int) '#', 11);
        int int18 = intMath0.mod((int) ' ', 54);
        int int21 = intMath0.mod((int) (byte) 10, 37);
        int int24 = intMath0.mod(8, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-8), 52);
        int int18 = intMath0.mod(22, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(89, 11);
        int int18 = intMath0.mod(91, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 91 + "'", int18 == 91);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) '4', 17);
        int int15 = intMath0.mod(0, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(7, 35);
        int int21 = intMath0.mod(84, 44);
        int int24 = intMath0.mod(51, (int) (byte) 10);
        int int27 = intMath0.mod(24, 12);
        int int30 = intMath0.mod(28, 26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod((int) (byte) 10, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 98);
        int int24 = intMath0.mod(99, 32);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(8, 87);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(19, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(8, 28);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod(77, 6);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = intMath0.mod(0, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(1, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(2, 17);
        int int21 = intMath0.mod(26, 49);
        int int24 = intMath0.mod(23, 97);
        int int27 = intMath0.mod((-4), 81);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 77 + "'", int27 == 77);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        int int21 = intMath0.mod(68, 64);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod((int) (byte) 0, 17);
        int int24 = intMath0.mod(37, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod((int) (byte) 10, 54);
        int int30 = intMath0.mod(51, 41);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(99, (int) ' ');
        int int21 = intMath0.mod((-6), 38);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod((-6), 50);
        int int21 = intMath0.mod(88, 50);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod((int) '4', 8);
        int int27 = intMath0.mod(52, 32);
        int int30 = intMath0.mod(83, 51);
        int int33 = intMath0.mod(56, 83);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 56 + "'", int33 == 56);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(8, 94);
        int int21 = intMath0.mod((-100), 86);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(94, 95);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(53, 20);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(18, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) 0, 28);
        int int12 = intMath0.mod(44, 72);
        int int15 = intMath0.mod((int) (byte) 0, 35);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod(27, 27);
        int int24 = intMath0.mod((int) 'a', 49);
        int int27 = intMath0.mod(0, 18);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((int) (short) 1, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod((-2), 41);
        int int18 = intMath0.mod(83, 19);
        int int21 = intMath0.mod(36, 67);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        int int15 = intMath0.mod(48, 72);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod(42, 36);
        int int27 = intMath0.mod((int) (byte) 0, 26);
        int int30 = intMath0.mod(72, 95);
        int int33 = intMath0.mod(87, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 72 + "'", int30 == 72);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod((-8), 9);
        int int12 = intMath0.mod(37, 68);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod(38, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(35, 10);
        int int24 = intMath0.mod(0, 51);
        int int27 = intMath0.mod(73, 69);
        int int30 = intMath0.mod(86, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(48, 6);
        int int27 = intMath0.mod(34, 4);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 34);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(74, 12);
        int int18 = intMath0.mod(38, 44);
        int int21 = intMath0.mod((int) '4', 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 1, 12);
        int int18 = intMath0.mod(19, 2);
        int int21 = intMath0.mod((int) (byte) -1, 46);
        int int24 = intMath0.mod((int) ' ', 6);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(100, 14);
        int int18 = intMath0.mod(80, 98);
        int int21 = intMath0.mod((int) (byte) 1, 71);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(8, 80);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(14, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(12, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(88, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
        int int21 = intMath0.mod(52, 79);
        int int24 = intMath0.mod(51, 28);
        int int27 = intMath0.mod(88, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 88 + "'", int27 == 88);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-2), 1);
        int int18 = intMath0.mod(100, (int) 'a');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(98, 3);
        int int27 = intMath0.mod((-100), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(91, 34);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(26, 88);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod(21, 47);
        int int21 = intMath0.mod(7, (int) '#');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(93, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(86, 7);
        int int21 = intMath0.mod(0, 72);
        int int24 = intMath0.mod((-1), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(19, 89);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        int int15 = intMath0.mod(100, 13);
        int int18 = intMath0.mod(99, 2);
        int int21 = intMath0.mod(32, 11);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((int) (short) 1, 99);
        int int18 = intMath0.mod(25, 5);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(32, 8);
        int int24 = intMath0.mod(89, 37);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(72, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(79, (int) (byte) 10);
        int int24 = intMath0.mod(1, (int) (byte) 100);
        int int27 = intMath0.mod(3, 52);
        int int30 = intMath0.mod(89, 79);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(25, 27);
        int int24 = intMath0.mod(0, 50);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 25 + "'", int21 == 25);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(42, 8);
        int int18 = intMath0.mod(5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod((int) '4', 30);
        int int30 = intMath0.mod((-3), 52);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 49 + "'", int30 == 49);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-10), 26);
        int int15 = intMath0.mod(27, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27 + "'", int15 == 27);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(16, 1);
        int int21 = intMath0.mod((int) (byte) 0, 31);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(6, 99);
        int int18 = intMath0.mod(86, 88);
        int int21 = intMath0.mod(44, 99);
        int int24 = intMath0.mod(1, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(25, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) (short) 0, 2);
        int int15 = intMath0.mod((int) ' ', 30);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(42, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) (short) 1, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(17, (int) '4');
        int int21 = intMath0.mod(95, 77);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(0, (int) (short) 10);
        int int15 = intMath0.mod(91, 30);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod((int) (short) 100, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(20, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(4, (int) (short) 100);
        int int33 = intMath0.mod((int) (byte) -1, 30);
        int int36 = intMath0.mod((int) '#', 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29 + "'", int33 == 29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((-3), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(81, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((-100), 13);
        int int18 = intMath0.mod((-5), (int) '4');
        int int21 = intMath0.mod(5, 37);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(14, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, (int) (byte) 100);
        int int30 = intMath0.mod(98, 98);
        int int33 = intMath0.mod(80, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(34, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(86, 28);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod(20, 87);
        int int21 = intMath0.mod(89, 53);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(0, 87);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(40, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(8, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(8, (int) (byte) 10);
        int int24 = intMath0.mod((int) 'a', 1);
        int int27 = intMath0.mod(50, 43);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod((int) '4', 30);
        int int30 = intMath0.mod(15, 15);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-6), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(45, 4);
        int int21 = intMath0.mod(91, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 3);
        int int18 = intMath0.mod(16, 36);
        int int21 = intMath0.mod(79, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 79 + "'", int21 == 79);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(11, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(46, 23);
        int int21 = intMath0.mod(34, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-6), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(39, 87);
        int int21 = intMath0.mod(35, 41);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(74, 75);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) -1, 87);
        int int12 = intMath0.mod(80, 19);
        int int15 = intMath0.mod(53, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(95, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86 + "'", int9 == 86);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod(77, 6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(41, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(25, 6);
        int int27 = intMath0.mod((int) (byte) 1, 25);
        int int30 = intMath0.mod((-10), 16);
        int int33 = intMath0.mod((int) (short) 10, 87);
        int int36 = intMath0.mod((-4), 13);
        int int39 = intMath0.mod(41, 37);
        int int42 = intMath0.mod(20, (int) '#');
        java.lang.Class<?> wildcardClass43 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20 + "'", int42 == 20);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod((-10), 10);
        int int21 = intMath0.mod(52, 28);
        int int24 = intMath0.mod(24, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod((-1), 15);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod((int) ' ', 49);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(0, 12);
        int int21 = intMath0.mod(0, (int) (short) 10);
        int int24 = intMath0.mod(20, 80);
        int int27 = intMath0.mod(50, 79);
        int int30 = intMath0.mod(31, 80);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31 + "'", int30 == 31);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(39, 95);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(32, 8);
        int int24 = intMath0.mod(89, 37);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod(26, 34);
        int int18 = intMath0.mod(83, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(43, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        int int18 = intMath0.mod((int) ' ', 71);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(86, 64);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(42, (int) (short) 1);
        int int12 = intMath0.mod(35, 2);
        int int15 = intMath0.mod(93, 17);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(54, 77);
        int int15 = intMath0.mod(44, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(20, 39);
        int int24 = intMath0.mod(10, 34);
        int int27 = intMath0.mod(86, 22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(9, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(91, 16);
        int int18 = intMath0.mod(87, 99);
        int int21 = intMath0.mod(80, 67);
        int int24 = intMath0.mod(24, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod(64, 87);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(7, 86);
        int int15 = intMath0.mod(20, 72);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod((int) (byte) -1, 95);
        int int24 = intMath0.mod((int) (short) 10, 83);
        int int27 = intMath0.mod(77, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 77 + "'", int27 == 77);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod(74, (int) '4');
        int int21 = intMath0.mod(72, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-8), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(81, 34);
        int int21 = intMath0.mod((-7), 8);
        int int24 = intMath0.mod(74, 94);
        int int27 = intMath0.mod(39, 55);
        int int30 = intMath0.mod(29, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(20, 72);
        int int27 = intMath0.mod(28, 27);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(39, 95);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((-9), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
    }
}

