package math;

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
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod((-5), 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        int int30 = intMath0.mod((int) '#', 97);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(4, (int) (short) 10);
        int int21 = intMath0.mod(80, 6);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) (byte) 100, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        int int24 = intMath0.mod(36, 100);
        int int27 = intMath0.mod(4, 1);
        int int30 = intMath0.mod(34, 24);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(50, 30);
        int int21 = intMath0.mod(44, 91);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(7, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-3), (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-9), 95);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 86 + "'", int12 == 86);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(52, (int) (short) 1);
        int int18 = intMath0.mod((-7), 39);
        int int21 = intMath0.mod(10, 22);
        int int24 = intMath0.mod(0, 4);
        int int27 = intMath0.mod(71, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 71 + "'", int27 == 71);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
        int int15 = intMath0.mod(1, 34);
        int int18 = intMath0.mod((-8), 21);
        int int21 = intMath0.mod(67, 3);
        int int24 = intMath0.mod(13, 14);
        int int27 = intMath0.mod(42, 11);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(35, (int) (short) 10);
        int int9 = intMath0.mod(50, 23);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod(37, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(60, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod(47, 50);
        int int18 = intMath0.mod(1, 9);
        int int21 = intMath0.mod((int) (byte) 100, 32);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (short) 1, 14);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod((int) (byte) 0, 14);
        int int18 = intMath0.mod(13, (int) (short) 100);
        int int21 = intMath0.mod(24, 99);
        int int24 = intMath0.mod(98, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod(0, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(81, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(41, (int) (short) 100);
        int int18 = intMath0.mod(100, 54);
        int int21 = intMath0.mod(8, 35);
        int int24 = intMath0.mod(33, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 41 + "'", int15 == 41);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod((-5), 2);
        int int21 = intMath0.mod(31, (int) (byte) 10);
        int int24 = intMath0.mod((int) (short) -1, 7);
        int int27 = intMath0.mod(97, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26 + "'", int27 == 26);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod((int) (byte) 0, 17);
        int int24 = intMath0.mod(37, 88);
        int int27 = intMath0.mod(79, 35);
        int int30 = intMath0.mod(23, 48);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23 + "'", int30 == 23);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(40, (int) (byte) 10);
        int int21 = intMath0.mod(27, 56);
        int int24 = intMath0.mod(17, 94);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(11, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(94, 95);
        int int21 = intMath0.mod(72, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(81, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 81 + "'", int9 == 81);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-1), 37);
        int int18 = intMath0.mod(41, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(0, (int) '#');
        int int24 = intMath0.mod(20, 53);
        int int27 = intMath0.mod(16, 68);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(37, 34);
        int int27 = intMath0.mod(21, 18);
        int int30 = intMath0.mod((-9), 87);
        int int33 = intMath0.mod(20, 69);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 78 + "'", int30 == 78);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod((-5), 4);
        int int27 = intMath0.mod((int) (short) 1, 56);
        int int30 = intMath0.mod(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(49, (int) '#');
        int int27 = intMath0.mod(47, 16);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-7), 1);
        int int21 = intMath0.mod(27, 91);
        int int24 = intMath0.mod(48, (int) (short) 1);
        int int27 = intMath0.mod(95, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(69, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(7, 35);
        int int21 = intMath0.mod(84, 44);
        int int24 = intMath0.mod(89, 83);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(40, (int) (byte) 10);
        int int21 = intMath0.mod(27, 56);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((-2), 50);
        int int15 = intMath0.mod(21, 1);
        int int18 = intMath0.mod(93, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(0, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(1, 79);
        int int30 = intMath0.mod(100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod((-9), 18);
        int int21 = intMath0.mod(55, 89);
        int int24 = intMath0.mod(79, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 55 + "'", int21 == 55);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod(71, (int) (byte) 10);
        int int27 = intMath0.mod(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(94, 4);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        int int12 = intMath0.mod(6, 51);
        int int15 = intMath0.mod(98, 51);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-100), 97);
        int int9 = intMath0.mod(76, 42);
        int int12 = intMath0.mod((int) (byte) -1, 24);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(84, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(95, 19);
        int int24 = intMath0.mod((-10), 2);
        int int27 = intMath0.mod(23, 20);
        int int30 = intMath0.mod(9, 21);
        int int33 = intMath0.mod(14, 99);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14 + "'", int33 == 14);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(0, 28);
        int int21 = intMath0.mod(0, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod(85, 85);
        int int30 = intMath0.mod((int) (byte) 1, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 98);
        int int24 = intMath0.mod(50, 41);
        int int27 = intMath0.mod((-2), 55);
        int int30 = intMath0.mod(21, 100);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21 + "'", int30 == 21);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(49, 87);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(16, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) 10, (int) (byte) 100);
        int int24 = intMath0.mod((int) (byte) -1, 27);
        int int27 = intMath0.mod(33, 26);
        int int30 = intMath0.mod(23, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23 + "'", int30 == 23);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod((int) '4', (int) (short) 100);
        int int24 = intMath0.mod(86, 73);
        int int27 = intMath0.mod(4, 48);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(35, (int) (short) 1);
        int int18 = intMath0.mod(48, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(0, 12);
        int int21 = intMath0.mod(1, (int) (byte) 1);
        int int24 = intMath0.mod((-2), 74);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        int int33 = intMath0.mod(32, 36);
        int int36 = intMath0.mod(60, 87);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) 0, 28);
        int int12 = intMath0.mod(12, 1);
        int int15 = intMath0.mod(71, 22);
        int int18 = intMath0.mod((int) (short) 100, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        int int18 = intMath0.mod(0, 80);
        int int21 = intMath0.mod(30, 77);
        int int24 = intMath0.mod(35, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(54, 77);
        int int15 = intMath0.mod(79, 1);
        int int18 = intMath0.mod(0, (int) (byte) 10);
        int int21 = intMath0.mod(95, 52);
        int int24 = intMath0.mod((-8), 40);
        int int27 = intMath0.mod(38, 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 43 + "'", int21 == 43);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38 + "'", int27 == 38);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = intMath0.mod(44, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        int int30 = intMath0.mod(86, 66);
        int int33 = intMath0.mod(68, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 68 + "'", int33 == 68);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        int int30 = intMath0.mod(51, 34);
        int int33 = intMath0.mod(13, 30);
        int int36 = intMath0.mod(43, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 17 + "'", int30 == 17);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 13 + "'", int33 == 13);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 18 + "'", int36 == 18);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((-5), 52);
        int int21 = intMath0.mod(14, 69);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod((int) 'a', 35);
        int int21 = intMath0.mod(87, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        int int21 = intMath0.mod(94, 18);
        int int24 = intMath0.mod((-7), 68);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(3, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 61 + "'", int24 == 61);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(6, 32);
        int int21 = intMath0.mod(63, 31);
        int int24 = intMath0.mod(21, 78);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((int) (short) 10, (int) (byte) 100);
        int int18 = intMath0.mod((int) (short) 100, 25);
        int int21 = intMath0.mod(46, 84);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(44, 81);
        int int24 = intMath0.mod(39, 88);
        int int27 = intMath0.mod((int) (short) 1, 38);
        int int30 = intMath0.mod(46, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39 + "'", int24 == 39);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        int int15 = intMath0.mod((int) 'a', 34);
        int int18 = intMath0.mod(6, 11);
        int int21 = intMath0.mod((-2), 68);
        int int24 = intMath0.mod(62, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 66 + "'", int21 == 66);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(35, 38);
        int int18 = intMath0.mod(95, (int) (byte) 100);
        int int21 = intMath0.mod((-9), 45);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-10), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 95 + "'", int18 == 95);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(97, 21);
        int int12 = intMath0.mod(73, 62);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod((int) (byte) 10, 48);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        int int24 = intMath0.mod(36, 100);
        int int27 = intMath0.mod(4, 1);
        int int30 = intMath0.mod(2, 80);
        int int33 = intMath0.mod(85, 40);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        int int27 = intMath0.mod(24, 30);
        int int30 = intMath0.mod(5, 46);
        int int33 = intMath0.mod(36, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 36 + "'", int33 == 36);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(99, 3);
        int int21 = intMath0.mod(54, 32);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-5), 86);
        int int21 = intMath0.mod(0, 80);
        int int24 = intMath0.mod(30, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 81 + "'", int18 == 81);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(0, (int) '4');
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(79, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(7, 2);
        int int12 = intMath0.mod(17, 83);
        int int15 = intMath0.mod(26, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(46, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(27, 89);
        int int27 = intMath0.mod(49, 53);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 49 + "'", int27 == 49);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        int int30 = intMath0.mod((-9), 100);
        int int33 = intMath0.mod((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 91 + "'", int30 == 91);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((-1), 16);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
            int int27 = intMath0.mod(29, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
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
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod(77, 6);
        int int24 = intMath0.mod(63, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 63 + "'", int24 == 63);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        int int33 = intMath0.mod(0, (int) (short) 10);
        int int36 = intMath0.mod((-7), 36);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 29 + "'", int36 == 29);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        int int39 = intMath0.mod(74, (int) 'a');
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 74 + "'", int39 == 74);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        int int30 = intMath0.mod(50, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(1, 87);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        int int21 = intMath0.mod(15, 54);
        int int24 = intMath0.mod(31, 6);
        int int27 = intMath0.mod(84, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 99);
        int int21 = intMath0.mod(10, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(0, (int) (short) 10);
        int int15 = intMath0.mod(91, 27);
        int int18 = intMath0.mod(2, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(44, 18);
        int int18 = intMath0.mod(15, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(47, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        int int18 = intMath0.mod((-1), 41);
        int int21 = intMath0.mod(41, 74);
        int int24 = intMath0.mod(36, 49);
        int int27 = intMath0.mod(0, 84);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(8, 28);
        int int27 = intMath0.mod(23, 37);
        int int30 = intMath0.mod(60, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        int int30 = intMath0.mod((int) (short) 10, 32);
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
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod(1, 100);
        int int27 = intMath0.mod(64, 34);
        int int30 = intMath0.mod((int) 'a', 4);
        int int33 = intMath0.mod(34, 7);
        int int36 = intMath0.mod(100, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) -1, 87);
        int int12 = intMath0.mod(80, 19);
        int int15 = intMath0.mod(53, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86 + "'", int9 == 86);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(17, 72);
        int int27 = intMath0.mod((-1), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod(32, 55);
        int int27 = intMath0.mod(0, 9);
        int int30 = intMath0.mod(99, 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39 + "'", int30 == 39);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(42, (int) (short) 1);
        int int12 = intMath0.mod(8, 86);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(81, 86);
        int int18 = intMath0.mod((-9), 71);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 62 + "'", int18 == 62);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(61, 20);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(50, 15);
        int int18 = intMath0.mod(62, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(15, 80);
        int int18 = intMath0.mod(0, 9);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(9, 38);
        int int18 = intMath0.mod(0, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(86, (int) (short) 100);
        int int18 = intMath0.mod(82, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(69, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86 + "'", int15 == 86);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(29, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(79, 89);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        int int18 = intMath0.mod(15, 44);
        int int21 = intMath0.mod(39, 6);
        int int24 = intMath0.mod(74, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        int int36 = intMath0.mod(0, 21);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod((int) (short) 0, (int) '4');
        int int24 = intMath0.mod(4, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(0, 45);
        int int21 = intMath0.mod((-7), (int) '#');
        int int24 = intMath0.mod(61, 48);
        int int27 = intMath0.mod(24, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(89, 35);
        int int15 = intMath0.mod(26, 42);
        int int18 = intMath0.mod(30, (int) '#');
        int int21 = intMath0.mod((int) (short) 0, 16);
        int int24 = intMath0.mod((int) '#', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 98);
        int int24 = intMath0.mod(50, 41);
        int int27 = intMath0.mod((-2), 55);
        int int30 = intMath0.mod(33, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod(55, 80);
        int int18 = intMath0.mod(46, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(63, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod((int) ' ', 49);
        int int18 = intMath0.mod(30, 86);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod(53, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod((-6), 50);
        int int21 = intMath0.mod(88, 50);
        int int24 = intMath0.mod(72, 83);
        int int27 = intMath0.mod((-3), 6);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(6, 97);
        int int18 = intMath0.mod(50, (int) (byte) 1);
        int int21 = intMath0.mod((-6), 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod(30, 34);
        int int27 = intMath0.mod(39, 51);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        int int30 = intMath0.mod((int) (short) 0, 3);
        int int33 = intMath0.mod(47, 9);
        int int36 = intMath0.mod(60, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        int int30 = intMath0.mod(0, 30);
        int int33 = intMath0.mod(78, 19);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(20, 39);
        int int24 = intMath0.mod(10, 34);
        int int27 = intMath0.mod(46, 85);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 46 + "'", int27 == 46);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(87, 34);
        int int27 = intMath0.mod(29, 94);
        int int30 = intMath0.mod(59, 66);
        int int33 = intMath0.mod(56, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29 + "'", int27 == 29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 59 + "'", int30 == 59);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(8, 87);
        int int27 = intMath0.mod(22, 76);
        int int30 = intMath0.mod((-10), 25);
        int int33 = intMath0.mod(0, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        int int33 = intMath0.mod(69, 83);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 69 + "'", int33 == 69);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(81, 5);
        int int12 = intMath0.mod(22, 71);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod((-8), 9);
        int int12 = intMath0.mod((int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(94, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(50, 35);
        int int15 = intMath0.mod(71, 3);
        int int18 = intMath0.mod((int) (short) 1, (int) '#');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        int int18 = intMath0.mod(45, 23);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(0, 45);
        int int21 = intMath0.mod((-7), (int) '#');
        int int24 = intMath0.mod(61, 48);
        int int27 = intMath0.mod(30, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        int int21 = intMath0.mod(68, 64);
        int int24 = intMath0.mod((int) '#', 44);
        int int27 = intMath0.mod(80, 27);
        int int30 = intMath0.mod((-2), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26 + "'", int27 == 26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((int) (short) 10, 89);
        int int15 = intMath0.mod(19, 61);
        int int18 = intMath0.mod(21, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(11, 21);
        int int21 = intMath0.mod((-3), 64);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 61 + "'", int21 == 61);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(52, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        int int33 = intMath0.mod(21, 55);
        int int36 = intMath0.mod(1, 93);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21 + "'", int33 == 21);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod(71, (int) (byte) 10);
        int int27 = intMath0.mod(81, 89);
        int int30 = intMath0.mod(28, 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 81 + "'", int27 == 81);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        int int30 = intMath0.mod(86, 66);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(77, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((-1), 69);
        int int21 = intMath0.mod(26, 73);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 68 + "'", int18 == 68);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((-2), 50);
        int int15 = intMath0.mod(32, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(69, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(22, 22);
        int int15 = intMath0.mod(38, 19);
        int int18 = intMath0.mod(59, 73);
        int int21 = intMath0.mod((int) (short) 100, 59);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(35, 38);
        int int18 = intMath0.mod(39, 69);
        int int21 = intMath0.mod(82, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        int int30 = intMath0.mod(4, 21);
        int int33 = intMath0.mod(66, 76);
        int int36 = intMath0.mod(50, 1);
        int int39 = intMath0.mod(95, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 66 + "'", int33 == 66);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 43 + "'", int39 == 43);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        int int30 = intMath0.mod(13, 56);
        int int33 = intMath0.mod(40, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13 + "'", int30 == 13);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod(13, 34);
        int int12 = intMath0.mod(13, 53);
        int int15 = intMath0.mod(51, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod(4, 26);
        int int12 = intMath0.mod(37, 52);
        int int15 = intMath0.mod(31, 40);
        int int18 = intMath0.mod(21, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 10, 3);
        int int21 = intMath0.mod(8, 54);
        int int24 = intMath0.mod(60, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        int int18 = intMath0.mod((int) '#', 55);
        int int21 = intMath0.mod((-100), 11);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(14, 42);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(16, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        int int30 = intMath0.mod(50, 79);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(52, (int) (byte) 10);
        int int15 = intMath0.mod((-1), 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod(76, 91);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod(20, 87);
        int int21 = intMath0.mod(38, 16);
        int int24 = intMath0.mod(37, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((int) 'a', 94);
        int int15 = intMath0.mod(2, 86);
        int int18 = intMath0.mod(15, 91);
        int int21 = intMath0.mod(2, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(83, 85);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 83 + "'", int15 == 83);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        int int30 = intMath0.mod(44, 75);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod(51, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-8), 52);
        int int18 = intMath0.mod(22, (int) (byte) 10);
        int int21 = intMath0.mod((-2), (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 44 + "'", int15 == 44);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod(30, 34);
        int int27 = intMath0.mod(39, 51);
        int int30 = intMath0.mod((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '#', 49);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(72, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod((int) (short) 100, 51);
        int int21 = intMath0.mod(39, 14);
        int int24 = intMath0.mod(72, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod((int) (short) 0, 9);
        int int21 = intMath0.mod(80, 27);
        int int24 = intMath0.mod(9, (int) (short) 1);
        int int27 = intMath0.mod(1, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(8, 94);
        int int21 = intMath0.mod((-100), 86);
        int int24 = intMath0.mod((-2), 100);
        int int27 = intMath0.mod(24, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod(74, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(93, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 30);
        int int24 = intMath0.mod(44, 53);
        int int27 = intMath0.mod(0, 26);
        int int30 = intMath0.mod(38, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod((-1), 19);
        int int21 = intMath0.mod(15, 31);
        int int24 = intMath0.mod(64, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod((-4), 81);
        int int18 = intMath0.mod(55, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 77 + "'", int15 == 77);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(35, (int) (short) 10);
        int int9 = intMath0.mod(98, (int) (byte) 10);
        int int12 = intMath0.mod((int) (short) 1, 43);
        int int15 = intMath0.mod(98, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod((int) (short) 0, (int) '4');
        int int24 = intMath0.mod(94, 73);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(30, 81);
        int int24 = intMath0.mod(0, 26);
        int int27 = intMath0.mod(51, 36);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(68, 53);
        int int12 = intMath0.mod(92, 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
        int int21 = intMath0.mod((-100), 2);
        int int24 = intMath0.mod(84, 42);
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
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
            int int24 = intMath0.mod(79, 0);
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
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((int) (short) 100, 53);
        int int21 = intMath0.mod(15, 32);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-6), (int) (byte) 1);
        int int21 = intMath0.mod(35, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod((-100), 97);
        int int21 = intMath0.mod(86, 3);
        int int24 = intMath0.mod((int) (short) 0, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        int int12 = intMath0.mod(88, 54);
        int int15 = intMath0.mod(1, 64);
        int int18 = intMath0.mod((int) (short) 0, 34);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod(90, 40);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(18, 12);
        int int21 = intMath0.mod(29, 38);
        int int24 = intMath0.mod(0, 82);
        int int27 = intMath0.mod((-6), 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 78 + "'", int27 == 78);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(71, 26);
        int int18 = intMath0.mod(19, 94);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod((int) (byte) 100, 91);
        int int27 = intMath0.mod(38, 16);
        int int30 = intMath0.mod((-2), 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 73 + "'", int30 == 73);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod((int) (byte) 0, 1);
        int int27 = intMath0.mod(80, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(81, 5);
        int int12 = intMath0.mod(90, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(91, 16);
        int int18 = intMath0.mod(87, 99);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod((-1), 95);
        int int24 = intMath0.mod(38, 26);
        int int27 = intMath0.mod(83, 1);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod((int) (byte) 0, 14);
        int int18 = intMath0.mod(13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(33, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(91, 73);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        int int27 = intMath0.mod(8, 2);
        int int30 = intMath0.mod((int) (short) 10, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(0, 98);
        int int18 = intMath0.mod((-2), 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 88 + "'", int18 == 88);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(27, 89);
        int int27 = intMath0.mod(44, 54);
        int int30 = intMath0.mod(89, 22);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44 + "'", int27 == 44);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(10, 52);
        int int12 = intMath0.mod(30, (int) (short) 10);
        int int15 = intMath0.mod(39, 30);
        int int18 = intMath0.mod(81, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 81 + "'", int18 == 81);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        int int30 = intMath0.mod(0, 17);
        int int33 = intMath0.mod(0, 64);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        int int30 = intMath0.mod(7, 29);
        int int33 = intMath0.mod(74, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 77 + "'", int24 == 77);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 74 + "'", int33 == 74);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(0, 11);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        int int30 = intMath0.mod((int) (byte) 1, 51);
        int int33 = intMath0.mod(51, 31);
        int int36 = intMath0.mod(51, 24);
        int int39 = intMath0.mod(43, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 43 + "'", int39 == 43);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-6), (int) (byte) 1);
        int int21 = intMath0.mod(16, 42);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, 23);
        int int15 = intMath0.mod(94, 88);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        int int24 = intMath0.mod(8, 21);
        int int27 = intMath0.mod(42, 88);
        int int30 = intMath0.mod((int) (byte) 10, (int) (short) 10);
        int int33 = intMath0.mod(75, 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 42 + "'", int27 == 42);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 75 + "'", int33 == 75);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-2), 1);
        int int18 = intMath0.mod(95, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(23, 95);
        int int30 = intMath0.mod(99, 24);
        int int33 = intMath0.mod(42, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod((int) '4', 8);
        int int27 = intMath0.mod(29, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(59, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 34);
        int int21 = intMath0.mod(64, 37);
        int int24 = intMath0.mod(10, 46);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(11, 21);
        int int21 = intMath0.mod(83, 95);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 83 + "'", int21 == 83);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(19, 46);
        int int27 = intMath0.mod(24, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(29, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        int int15 = intMath0.mod(3, 32);
        int int18 = intMath0.mod(73, 68);
        int int21 = intMath0.mod(5, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(94, 4);
        int int24 = intMath0.mod(80, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(42, (int) (short) 1);
        int int12 = intMath0.mod(14, 52);
        int int15 = intMath0.mod(43, 15);
        int int18 = intMath0.mod(80, (int) (byte) 10);
        int int21 = intMath0.mod(0, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) (byte) -1, 88);
        int int18 = intMath0.mod((int) ' ', 71);
        int int21 = intMath0.mod(19, 11);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        int int15 = intMath0.mod(74, (int) '4');
        int int18 = intMath0.mod(0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-1), 37);
        int int18 = intMath0.mod((-8), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(80, 49);
        int int27 = intMath0.mod((int) (byte) 1, 43);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(35, 10);
        int int24 = intMath0.mod(35, 6);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod(71, (int) (byte) 10);
        int int27 = intMath0.mod(81, 89);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 81 + "'", int27 == 81);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 1, 35);
        int int21 = intMath0.mod(1, 52);
        int int24 = intMath0.mod(45, 10);
        int int27 = intMath0.mod(72, 13);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(76, 77);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod((-6), 50);
        int int21 = intMath0.mod(88, 50);
        int int24 = intMath0.mod(72, 83);
        int int27 = intMath0.mod(46, 86);
        int int30 = intMath0.mod(36, (int) '#');
        int int33 = intMath0.mod((int) (short) 100, 44);
        int int36 = intMath0.mod(55, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 46 + "'", int27 == 46);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 55 + "'", int36 == 55);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(87, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 5);
        int int24 = intMath0.mod(11, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        int int36 = intMath0.mod(5, 29);
        int int39 = intMath0.mod((-1), 40);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 39 + "'", int39 == 39);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
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
        int int30 = intMath0.mod((int) (byte) 100, (int) (short) 1);
        int int33 = intMath0.mod(96, 96);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod(30, 34);
        int int27 = intMath0.mod(53, 36);
        int int30 = intMath0.mod(68, 20);
        int int33 = intMath0.mod((int) (short) -1, 28);
        int int36 = intMath0.mod(10, 88);
        int int39 = intMath0.mod(9, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27 + "'", int33 == 27);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(30, 32);
        int int24 = intMath0.mod(48, 84);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(4, 89);
        int int18 = intMath0.mod(76, 77);
        int int21 = intMath0.mod(37, 13);
        int int24 = intMath0.mod(19, 20);
        int int27 = intMath0.mod((int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod((-2), 23);
        int int18 = intMath0.mod(1, (int) (short) 100);
        int int21 = intMath0.mod(96, 80);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(47, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        int int18 = intMath0.mod(0, 80);
        int int21 = intMath0.mod(77, 47);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod((int) (byte) 10, 7);
        int int12 = intMath0.mod((int) 'a', 36);
        int int15 = intMath0.mod(8, 39);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod(0, 62);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(39, 87);
        int int21 = intMath0.mod(35, 41);
        int int24 = intMath0.mod((int) 'a', 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(23, 88);
        int int15 = intMath0.mod(88, 35);
        int int18 = intMath0.mod(100, 27);
        int int21 = intMath0.mod(59, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        int int18 = intMath0.mod(87, 97);
        int int21 = intMath0.mod(0, 61);
        int int24 = intMath0.mod(69, 14);
        int int27 = intMath0.mod(66, 75);
        int int30 = intMath0.mod(29, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 66 + "'", int27 == 66);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(22, 22);
        int int15 = intMath0.mod(85, 2);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod((-8), 5);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((int) (short) 100, 53);
        int int21 = intMath0.mod((-1), 73);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        int int33 = intMath0.mod(19, 25);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
        int int21 = intMath0.mod(52, 79);
        int int24 = intMath0.mod(46, 52);
        int int27 = intMath0.mod((-6), 73);
        int int30 = intMath0.mod(80, 30);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(74, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 67 + "'", int27 == 67);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 6);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(89, 35);
        int int15 = intMath0.mod(76, 48);
        int int18 = intMath0.mod(20, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod(79, 87);
        int int12 = intMath0.mod(50, 1);
        int int15 = intMath0.mod(2, 76);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        int int33 = intMath0.mod((int) (short) 100, 59);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 41 + "'", int33 == 41);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((-4), 49);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45 + "'", int15 == 45);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod(85, 85);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(79, 26);
        int int27 = intMath0.mod(19, 83);
        int int30 = intMath0.mod(51, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51 + "'", int30 == 51);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(30, 81);
        int int24 = intMath0.mod(0, 20);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(28, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(42, 25);
        int int27 = intMath0.mod(51, 73);
        int int30 = intMath0.mod(43, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod((int) (short) 100, 51);
        int int21 = intMath0.mod(37, 76);
        int int24 = intMath0.mod((int) (byte) 1, 50);
        int int27 = intMath0.mod(0, 50);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(19, 24);
        int int18 = intMath0.mod(100, 21);
        int int21 = intMath0.mod(64, 56);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-100), (int) (byte) 10);
        int int9 = intMath0.mod(9, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, (int) (byte) 10);
        int int15 = intMath0.mod(100, 13);
        int int18 = intMath0.mod(20, 41);
        int int21 = intMath0.mod(7, 100);
        int int24 = intMath0.mod(100, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(87, (int) (short) 100);
        int int21 = intMath0.mod(24, 44);
        int int24 = intMath0.mod((int) (short) 0, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        int int30 = intMath0.mod(100, 74);
        int int33 = intMath0.mod(1, 38);
        int int36 = intMath0.mod(23, 15);
        int int39 = intMath0.mod(61, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 26 + "'", int30 == 26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 61 + "'", int39 == 61);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        int int21 = intMath0.mod(5, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 100, (int) (byte) 10);
        int int21 = intMath0.mod(30, 78);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
        int int21 = intMath0.mod(46, 51);
        int int24 = intMath0.mod(28, 50);
        int int27 = intMath0.mod(32, 61);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod(6, 5);
        int int21 = intMath0.mod(66, 19);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(27, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        int int33 = intMath0.mod(5, 89);
        int int36 = intMath0.mod(100, 71);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 29 + "'", int36 == 29);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(64, 12);
        int int18 = intMath0.mod((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(34, (int) (short) 1);
        int int15 = intMath0.mod(36, 96);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        int int27 = intMath0.mod(8, 2);
        int int30 = intMath0.mod(87, (int) ' ');
        int int33 = intMath0.mod(10, (int) '4');
        int int36 = intMath0.mod((int) (short) 0, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23 + "'", int30 == 23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) 10, (int) (byte) 100);
        int int24 = intMath0.mod((int) (short) 0, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 98);
        int int24 = intMath0.mod(99, 32);
        int int27 = intMath0.mod(80, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 80 + "'", int27 == 80);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        int int33 = intMath0.mod((-7), 44);
        int int36 = intMath0.mod(30, 4);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 37 + "'", int33 == 37);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) '4', 99);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod((int) (short) 0, 9);
        int int21 = intMath0.mod(80, 27);
        int int24 = intMath0.mod(9, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(18, 12);
        int int21 = intMath0.mod((int) (short) 1, 23);
        int int24 = intMath0.mod((int) (short) 0, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(72, 12);
        int int18 = intMath0.mod(38, 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) 0, 28);
        int int12 = intMath0.mod(8, 4);
        int int15 = intMath0.mod(99, 96);
        int int18 = intMath0.mod(22, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(17, 5);
        int int12 = intMath0.mod(14, 23);
        int int15 = intMath0.mod(14, 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(77, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(68, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        int int33 = intMath0.mod(31, 19);
        int int36 = intMath0.mod(10, 54);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(27, 89);
        int int27 = intMath0.mod(56, (int) (byte) 10);
        int int30 = intMath0.mod(54, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 54 + "'", int30 == 54);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((int) '4', 46);
        int int24 = intMath0.mod(50, 36);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(12, 77);
        int int24 = intMath0.mod((-9), 53);
        int int27 = intMath0.mod(52, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 44 + "'", int24 == 44);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(55, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 55 + "'", int12 == 55);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(29, 25);
        int int21 = intMath0.mod(39, 49);
        int int24 = intMath0.mod(73, (int) '#');
        int int27 = intMath0.mod(60, 20);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(84, 1);
        int int15 = intMath0.mod((int) '#', 1);
        int int18 = intMath0.mod(0, 52);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod((int) ' ', 36);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod(13, 34);
        int int12 = intMath0.mod(13, 53);
        int int15 = intMath0.mod(98, 24);
        int int18 = intMath0.mod(12, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(25, 76);
        int int18 = intMath0.mod(44, 19);
        int int21 = intMath0.mod(86, 1);
        int int24 = intMath0.mod(64, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod((-3), 83);
        int int27 = intMath0.mod(97, 79);
        int int30 = intMath0.mod(99, 38);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(40, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23 + "'", int30 == 23);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(36, 100);
        int int24 = intMath0.mod(89, 30);
        int int27 = intMath0.mod((int) (short) -1, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 95 + "'", int27 == 95);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((-2), 50);
        int int15 = intMath0.mod((-8), (int) (short) 100);
        int int18 = intMath0.mod(5, 100);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(81, 34);
        int int21 = intMath0.mod((-7), 8);
        int int24 = intMath0.mod(75, 3);
        int int27 = intMath0.mod(11, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod(87, (int) (byte) 100);
        int int24 = intMath0.mod(0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(78, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(1, 79);
        int int30 = intMath0.mod(100, (int) (byte) 100);
        int int33 = intMath0.mod((int) (short) 10, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(71, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        int int21 = intMath0.mod((-9), 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(22, 22);
        int int15 = intMath0.mod(92, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(1, 87);
        int int21 = intMath0.mod(50, 48);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(77, 79);
        int int24 = intMath0.mod(91, 21);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        int int30 = intMath0.mod(12, 72);
        int int33 = intMath0.mod(25, 54);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 88 + "'", int27 == 88);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25 + "'", int33 == 25);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        int int36 = intMath0.mod(45, (int) 'a');
        int int39 = intMath0.mod(0, 68);
        int int42 = intMath0.mod(75, 93);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = intMath0.mod(94, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 56 + "'", int33 == 56);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45 + "'", int36 == 45);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 75 + "'", int42 == 75);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        int int21 = intMath0.mod(7, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(35, (int) 'a');
        int int18 = intMath0.mod((int) '4', 95);
        int int21 = intMath0.mod((int) '#', 47);
        int int24 = intMath0.mod(47, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        int int30 = intMath0.mod(30, 10);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod((int) '4', (int) (short) 100);
        int int24 = intMath0.mod(86, 73);
        int int27 = intMath0.mod(4, 48);
        int int30 = intMath0.mod((int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(26, 88);
        int int27 = intMath0.mod(1, 22);
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
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(84, 16);
        int int18 = intMath0.mod(68, 88);
        int int21 = intMath0.mod(28, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 68 + "'", int18 == 68);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 0, 4);
        int int18 = intMath0.mod(51, 26);
        int int21 = intMath0.mod(0, 95);
        int int24 = intMath0.mod(90, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 90 + "'", int24 == 90);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(2, 81);
        int int15 = intMath0.mod((int) '#', 68);
        int int18 = intMath0.mod(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod((int) (byte) 10, 86);
        int int15 = intMath0.mod(42, 40);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(25, 76);
        int int18 = intMath0.mod(44, 19);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(28, 77);
        int int12 = intMath0.mod((-5), 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 28 + "'", int9 == 28);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(2, 17);
        int int21 = intMath0.mod(26, 49);
        int int24 = intMath0.mod(94, 80);
        int int27 = intMath0.mod(19, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod(83, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(73, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod((int) '4', (int) (short) 100);
        int int24 = intMath0.mod(86, 73);
        int int27 = intMath0.mod(4, 48);
        int int30 = intMath0.mod(26, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(6, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
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
        int int30 = intMath0.mod((-6), 8);
        int int33 = intMath0.mod(46, 73);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 46 + "'", int33 == 46);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(50, 30);
        int int21 = intMath0.mod(44, 91);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(27, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(72, 12);
        int int18 = intMath0.mod(38, 1);
        int int21 = intMath0.mod(1, 24);
        int int24 = intMath0.mod(47, 36);
        int int27 = intMath0.mod((int) (short) 10, 52);
        int int30 = intMath0.mod(67, 76);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 67 + "'", int30 == 67);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        int int42 = intMath0.mod(53, 1);
        int int45 = intMath0.mod(18, 95);
        int int48 = intMath0.mod(7, 1);
        java.lang.Class<?> wildcardClass49 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 18 + "'", int45 == 18);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(37, 34);
        int int27 = intMath0.mod(21, 18);
        int int30 = intMath0.mod((-4), (int) (byte) 1);
        int int33 = intMath0.mod(14, 64);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14 + "'", int33 == 14);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod((-100), 49);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod(50, 71);
        int int18 = intMath0.mod(87, 25);
        int int21 = intMath0.mod(27, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (short) 1, 14);
        int int18 = intMath0.mod(52, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 34);
        int int21 = intMath0.mod(64, 37);
        int int24 = intMath0.mod(1, (int) (byte) 10);
        int int27 = intMath0.mod(41, 95);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        int int18 = intMath0.mod(87, 97);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 5);
        int int24 = intMath0.mod(11, 23);
        int int27 = intMath0.mod((-9), 43);
        int int30 = intMath0.mod((int) (byte) -1, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 49 + "'", int30 == 49);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(11, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod(76, 91);
        int int15 = intMath0.mod(82, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 76 + "'", int12 == 76);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 82 + "'", int15 == 82);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(20, (int) (short) 100);
        int int21 = intMath0.mod(3, 28);
        int int24 = intMath0.mod(92, 87);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod((int) (short) -1, 30);
        int int18 = intMath0.mod(21, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(10, 52);
        int int12 = intMath0.mod((int) (short) -1, 47);
        int int15 = intMath0.mod(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod((-8), 5);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        int int30 = intMath0.mod(86, 66);
        int int33 = intMath0.mod(77, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 11 + "'", int33 == 11);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 1, 12);
        int int18 = intMath0.mod(42, 92);
        int int21 = intMath0.mod(5, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(13, 14);
        int int21 = intMath0.mod(90, 56);
        int int24 = intMath0.mod(100, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(0, 3);
        int int24 = intMath0.mod(1, 99);
        int int27 = intMath0.mod(0, 69);
        int int30 = intMath0.mod((-5), 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 72 + "'", int30 == 72);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(21, 81);
        int int21 = intMath0.mod(35, 86);
        int int24 = intMath0.mod(76, 100);
        int int27 = intMath0.mod((-2), 6);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod((-2), 41);
        int int18 = intMath0.mod(83, 19);
        int int21 = intMath0.mod(12, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(7, 2);
        int int12 = intMath0.mod(17, 83);
        int int15 = intMath0.mod(100, 7);
        int int18 = intMath0.mod(93, 67);
        int int21 = intMath0.mod(19, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        int int30 = intMath0.mod(94, 1);
        int int33 = intMath0.mod(24, 1);
        int int36 = intMath0.mod((int) (short) -1, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 92 + "'", int36 == 92);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
        int int33 = intMath0.mod(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod((-2), 23);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod((-7), 48);
        int int27 = intMath0.mod(40, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(91, 26);
        int int24 = intMath0.mod((int) (short) 100, (int) '#');
        int int27 = intMath0.mod((int) 'a', 88);
        int int30 = intMath0.mod(44, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(29, 25);
        int int21 = intMath0.mod(27, 38);
        int int24 = intMath0.mod(45, 43);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod(69, 33);
        int int27 = intMath0.mod(95, 60);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(0, 17);
        int int24 = intMath0.mod((int) (byte) 0, 39);
        int int27 = intMath0.mod(98, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-100), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = intMath0.mod(68, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod((-1), 27);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(32, 15);
        int int18 = intMath0.mod(21, 74);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        int int30 = intMath0.mod(74, 13);
        int int33 = intMath0.mod(0, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int18 = intMath0.mod(95, (int) (short) 10);
        int int21 = intMath0.mod(73, (int) '4');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(99, 3);
        int int21 = intMath0.mod(54, 32);
        int int24 = intMath0.mod(41, 43);
        int int27 = intMath0.mod((-9), 49);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(40, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40 + "'", int27 == 40);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(99, 3);
        int int24 = intMath0.mod(28, 28);
        int int27 = intMath0.mod(79, 89);
        int int30 = intMath0.mod(100, 47);
        int int33 = intMath0.mod(18, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 79 + "'", int27 == 79);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18 + "'", int33 == 18);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        int int30 = intMath0.mod(75, 44);
        int int33 = intMath0.mod(14, 100);
        int int36 = intMath0.mod(10, 9);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 77 + "'", int24 == 77);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31 + "'", int30 == 31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 14 + "'", int33 == 14);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(19, 21);
        int int18 = intMath0.mod((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(29, 25);
        int int21 = intMath0.mod(27, 38);
        int int24 = intMath0.mod(45, 43);
        int int27 = intMath0.mod(41, 75);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        int int18 = intMath0.mod(6, 97);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(1, 19);
        int int12 = intMath0.mod(92, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(48, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-100), 97);
        int int9 = intMath0.mod(76, 42);
        int int12 = intMath0.mod(68, 13);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 94 + "'", int6 == 94);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        int int12 = intMath0.mod(88, 54);
        int int15 = intMath0.mod(1, 64);
        int int18 = intMath0.mod((int) (short) 0, 34);
        int int21 = intMath0.mod((-9), (int) (byte) 100);
        int int24 = intMath0.mod((-2), 37);
        int int27 = intMath0.mod(49, 44);
        int int30 = intMath0.mod(71, 1);
        int int33 = intMath0.mod(8, 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
        int int15 = intMath0.mod((int) (short) 1, 22);
        int int18 = intMath0.mod(17, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        int int30 = intMath0.mod(44, 75);
        int int33 = intMath0.mod(80, 84);
        int int36 = intMath0.mod(17, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 80 + "'", int33 == 80);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17 + "'", int36 == 17);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(95, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(78, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        int int36 = intMath0.mod(86, 82);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 0, 4);
        int int18 = intMath0.mod(52, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(36, 18);
        int int18 = intMath0.mod(71, 4);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(42, (int) (short) 1);
        int int12 = intMath0.mod(39, 36);
        int int15 = intMath0.mod((-9), 33);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(80, 49);
        int int27 = intMath0.mod((int) 'a', 68);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29 + "'", int27 == 29);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        int int18 = intMath0.mod((int) '#', 55);
        int int21 = intMath0.mod((-100), 11);
        int int24 = intMath0.mod(87, 78);
        int int27 = intMath0.mod(17, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(54, 80);
        int int18 = intMath0.mod(74, 89);
        int int21 = intMath0.mod(97, 13);
        int int24 = intMath0.mod(18, 12);
        int int27 = intMath0.mod((int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(91, 34);
        int int18 = intMath0.mod((int) (short) 0, 11);
        int int21 = intMath0.mod((int) (short) 10, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 6);
        int int21 = intMath0.mod((int) (byte) -1, 96);
        int int24 = intMath0.mod(79, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 95 + "'", int21 == 95);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        int int24 = intMath0.mod(8, 21);
        int int27 = intMath0.mod(42, 88);
        int int30 = intMath0.mod((int) (byte) 10, (int) (short) 10);
        int int33 = intMath0.mod(29, (int) (byte) 10);
        int int36 = intMath0.mod(56, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 42 + "'", int27 == 42);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 56 + "'", int36 == 56);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(86, (int) (short) 100);
        int int18 = intMath0.mod(82, 8);
        int int21 = intMath0.mod(40, (int) (byte) 1);
        int int24 = intMath0.mod(49, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86 + "'", int15 == 86);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(54, 77);
        int int15 = intMath0.mod(79, 1);
        int int18 = intMath0.mod(0, (int) (byte) 10);
        int int21 = intMath0.mod(95, 52);
        int int24 = intMath0.mod((-8), 40);
        int int27 = intMath0.mod(38, 100);
        int int30 = intMath0.mod((-10), 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 43 + "'", int21 == 43);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38 + "'", int27 == 38);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27 + "'", int30 == 27);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (short) 1, 98);
        int int21 = intMath0.mod(68, 54);
        int int24 = intMath0.mod((-7), 68);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 61 + "'", int24 == 61);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(34, 26);
        int int27 = intMath0.mod((int) ' ', 80);
        int int30 = intMath0.mod(46, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 46 + "'", int30 == 46);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(13, 14);
        int int21 = intMath0.mod(0, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod((-5), (int) (byte) 1);
        int int27 = intMath0.mod(81, 51);
        int int30 = intMath0.mod((int) (short) 1, 56);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(5, (int) (byte) 1);
        int int27 = intMath0.mod(78, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(42, 86);
        int int21 = intMath0.mod(97, 11);
        int int24 = intMath0.mod((int) (short) 1, 48);
        int int27 = intMath0.mod(72, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(56, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod((int) (short) 0, 9);
        int int21 = intMath0.mod(80, 27);
        int int24 = intMath0.mod(9, (int) (short) 1);
        int int27 = intMath0.mod((int) 'a', 22);
        int int30 = intMath0.mod(91, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) (short) 100, 19);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod((-2), 86);
        int int21 = intMath0.mod((-5), 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 84 + "'", int18 == 84);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(54, 80);
        int int18 = intMath0.mod(74, 89);
        int int21 = intMath0.mod(64, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(94, 66);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(32, 72);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod((int) ' ', 52);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(31, 30);
        int int12 = intMath0.mod(28, 7);
        int int15 = intMath0.mod(13, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(42, (int) (short) 1);
        int int12 = intMath0.mod(26, 88);
        int int15 = intMath0.mod(99, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(20, 55);
        int int21 = intMath0.mod(44, 11);
        int int24 = intMath0.mod(97, 85);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(91, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        int int18 = intMath0.mod(0, 80);
        int int21 = intMath0.mod(77, 47);
        int int24 = intMath0.mod(0, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(32, 1);
        int int27 = intMath0.mod(72, 85);
        int int30 = intMath0.mod(34, 88);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod((-4), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 72 + "'", int27 == 72);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34 + "'", int30 == 34);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(11, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((int) (byte) 1, 44);
        int int24 = intMath0.mod(100, 16);
        int int27 = intMath0.mod(84, 79);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(68, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod((int) (byte) 0, 14);
        int int18 = intMath0.mod(5, 6);
        int int21 = intMath0.mod(66, 16);
        int int24 = intMath0.mod((int) '4', 53);
        int int27 = intMath0.mod(91, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod((-2), 41);
        int int18 = intMath0.mod(83, 19);
        int int21 = intMath0.mod(26, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod((int) (short) -1, 99);
        int int21 = intMath0.mod(13, 24);
        int int24 = intMath0.mod(94, 44);
        int int27 = intMath0.mod(55, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55 + "'", int27 == 55);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(35, (int) 'a');
        int int18 = intMath0.mod((int) '4', 95);
        int int21 = intMath0.mod((int) '#', 47);
        int int24 = intMath0.mod((-1), (int) 'a');
        int int27 = intMath0.mod(44, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 96 + "'", int24 == 96);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(33, 20);
        java.lang.Class<?> wildcardClass4 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(13, 100);
        int int9 = intMath0.mod(35, (int) ' ');
        int int12 = intMath0.mod(50, 1);
        int int15 = intMath0.mod(100, 48);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        int int15 = intMath0.mod(74, (int) '4');
        int int18 = intMath0.mod(47, 22);
        int int21 = intMath0.mod(28, (int) (short) 10);
        int int24 = intMath0.mod(41, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(21, 91);
        int int18 = intMath0.mod(41, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41 + "'", int18 == 41);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        int int24 = intMath0.mod(36, 100);
        int int27 = intMath0.mod(4, 1);
        int int30 = intMath0.mod(2, 80);
        int int33 = intMath0.mod((-2), 53);
        int int36 = intMath0.mod(89, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 51 + "'", int33 == 51);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 28 + "'", int36 == 28);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(95, 19);
        int int24 = intMath0.mod((-10), 2);
        int int27 = intMath0.mod(23, 20);
        int int30 = intMath0.mod(47, (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(68, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(45, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod((-1), (int) '#');
        int int27 = intMath0.mod(95, 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(35, (int) (short) 10);
        int int9 = intMath0.mod(98, (int) (byte) 10);
        int int12 = intMath0.mod(25, 75);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(1, 98);
        int int21 = intMath0.mod(48, 9);
        int int24 = intMath0.mod((int) (short) 10, 74);
        int int27 = intMath0.mod(13, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        int int33 = intMath0.mod(31, 19);
        int int36 = intMath0.mod(17, 11);
        int int39 = intMath0.mod(0, 5);
        int int42 = intMath0.mod(96, 1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 6 + "'", int36 == 6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(53, 86);
        int int27 = intMath0.mod(26, 16);
        int int30 = intMath0.mod(77, 1);
        int int33 = intMath0.mod((int) (byte) 100, 38);
        int int36 = intMath0.mod((int) (short) 10, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24 + "'", int33 == 24);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        int int15 = intMath0.mod(74, (int) '4');
        int int18 = intMath0.mod(47, 22);
        int int21 = intMath0.mod(28, (int) (short) 10);
        int int24 = intMath0.mod(0, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        int int30 = intMath0.mod(92, 20);
        int int33 = intMath0.mod(89, 21);
        int int36 = intMath0.mod(87, 84);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(86, 10);
        int int15 = intMath0.mod(27, 15);
        int int18 = intMath0.mod(2, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        int int30 = intMath0.mod(27, 30);
        int int33 = intMath0.mod(98, 89);
        int int36 = intMath0.mod((int) (byte) 0, 88);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27 + "'", int30 == 27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(99, 84);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(14, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        int int30 = intMath0.mod(13, 10);
        int int33 = intMath0.mod(71, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        int int18 = intMath0.mod((-1), 41);
        int int21 = intMath0.mod(41, 74);
        int int24 = intMath0.mod(84, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(0, 87);
        int int24 = intMath0.mod(88, 25);
        int int27 = intMath0.mod(8, (int) (byte) 1);
        int int30 = intMath0.mod(39, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39 + "'", int30 == 39);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod(1, 100);
        int int27 = intMath0.mod(46, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(53, 86);
        int int27 = intMath0.mod((int) (byte) 100, 89);
        int int30 = intMath0.mod(27, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27 + "'", int30 == 27);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod(21, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 1, 35);
        int int21 = intMath0.mod(1, 52);
        int int24 = intMath0.mod(45, 10);
        int int27 = intMath0.mod(0, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(10, (int) (short) 1);
        int int21 = intMath0.mod((-3), 42);
        int int24 = intMath0.mod(98, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(1, 98);
        int int21 = intMath0.mod(48, 9);
        int int24 = intMath0.mod((int) (short) 10, 74);
        int int27 = intMath0.mod(78, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 28 + "'", int27 == 28);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(53, 86);
        int int27 = intMath0.mod(26, 16);
        int int30 = intMath0.mod(77, 1);
        int int33 = intMath0.mod((int) (byte) 100, 38);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 24 + "'", int33 == 24);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(0, 88);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(49, (int) '#');
        int int27 = intMath0.mod(34, 15);
        int int30 = intMath0.mod(74, 81);
        int int33 = intMath0.mod(81, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 74 + "'", int30 == 74);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39 + "'", int33 == 39);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod(10, 10);
        int int21 = intMath0.mod(34, 32);
        int int24 = intMath0.mod(33, 61);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33 + "'", int24 == 33);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod((int) (short) -1, 30);
        int int18 = intMath0.mod(16, 86);
        int int21 = intMath0.mod((-1), 7);
        int int24 = intMath0.mod(44, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        int int30 = intMath0.mod(22, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 98 + "'", int27 == 98);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22 + "'", int30 == 22);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((-3), 7);
        int int15 = intMath0.mod(2, 10);
        int int18 = intMath0.mod(62, 51);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod(30, 34);
        int int27 = intMath0.mod(12, (int) ' ');
        int int30 = intMath0.mod(84, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13 + "'", int30 == 13);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(1, 79);
        int int30 = intMath0.mod((int) (short) -1, 53);
        int int33 = intMath0.mod(45, 3);
        int int36 = intMath0.mod(5, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        int int24 = intMath0.mod(36, 100);
        int int27 = intMath0.mod(4, 1);
        int int30 = intMath0.mod(2, 80);
        int int33 = intMath0.mod(30, 68);
        int int36 = intMath0.mod((int) (short) -1, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12 + "'", int36 == 12);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (byte) 10, 50);
        int int18 = intMath0.mod(6, 56);
        int int21 = intMath0.mod(78, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 78 + "'", int21 == 78);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(17, 72);
        int int27 = intMath0.mod(38, 68);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38 + "'", int27 == 38);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        int int30 = intMath0.mod(77, 37);
        int int33 = intMath0.mod(42, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 42 + "'", int33 == 42);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod((-8), 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 58 + "'", int15 == 58);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        int int33 = intMath0.mod((int) (byte) 10, 10);
        int int36 = intMath0.mod(47, 1);
        int int39 = intMath0.mod(96, 93);
        int int42 = intMath0.mod(42, 26);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 16 + "'", int42 == 16);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((-9), 36);
        int int21 = intMath0.mod(37, 73);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(37, 34);
        int int27 = intMath0.mod(21, 18);
        int int30 = intMath0.mod(21, (int) '#');
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21 + "'", int30 == 21);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(80, 49);
        int int27 = intMath0.mod((-10), 89);
        int int30 = intMath0.mod(82, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 79 + "'", int27 == 79);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(25, 6);
        int int27 = intMath0.mod(43, 30);
        int int30 = intMath0.mod((-2), 27);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(94, 66);
        int int27 = intMath0.mod(0, 73);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, 17);
        int int15 = intMath0.mod((-9), 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        int int39 = intMath0.mod((int) (short) -1, 56);
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 55 + "'", int39 == 55);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(0, 3);
        int int24 = intMath0.mod((int) '4', (int) '#');
        int int27 = intMath0.mod(89, 24);
        int int30 = intMath0.mod(53, 100);
        int int33 = intMath0.mod(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53 + "'", int30 == 53);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((int) 'a', 94);
        int int15 = intMath0.mod(9, (int) (byte) 1);
        int int18 = intMath0.mod(72, 47);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(81, 86);
        int int18 = intMath0.mod(91, 77);
        int int21 = intMath0.mod((-1), 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 76 + "'", int21 == 76);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        int int18 = intMath0.mod(87, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod(13, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(61, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        int int15 = intMath0.mod((int) 'a', 34);
        int int18 = intMath0.mod(6, 11);
        int int21 = intMath0.mod(0, 75);
        int int24 = intMath0.mod(95, 28);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(41, (int) (short) 100);
        int int18 = intMath0.mod(100, 54);
        int int21 = intMath0.mod(85, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 41 + "'", int15 == 41);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(0, 34);
        int int27 = intMath0.mod(94, 68);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 26 + "'", int27 == 26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        int int30 = intMath0.mod(47, 27);
        int int33 = intMath0.mod(40, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 40 + "'", int33 == 40);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(17, 26);
        int int21 = intMath0.mod(21, 10);
        int int24 = intMath0.mod((int) (short) 0, 33);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        int int42 = intMath0.mod(53, 1);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(69, 20);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        int int12 = intMath0.mod(88, 54);
        int int15 = intMath0.mod(1, 64);
        int int18 = intMath0.mod((int) (short) 0, 34);
        int int21 = intMath0.mod((-9), (int) (byte) 100);
        int int24 = intMath0.mod((-2), 37);
        int int27 = intMath0.mod(49, 44);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 91 + "'", int21 == 91);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(8, 87);
        int int27 = intMath0.mod(22, 76);
        int int30 = intMath0.mod(64, (int) (short) 10);
        int int33 = intMath0.mod(36, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(8, (int) (byte) 10);
        int int24 = intMath0.mod(51, 31);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(70, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        int int30 = intMath0.mod(81, 53);
        int int33 = intMath0.mod((-8), 1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 28 + "'", int30 == 28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(5, 17);
        int int15 = intMath0.mod(16, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        int int30 = intMath0.mod(95, 7);
        int int33 = intMath0.mod(79, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39 + "'", int33 == 39);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        int int33 = intMath0.mod(39, 81);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 39 + "'", int33 == 39);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        int int24 = intMath0.mod(36, 100);
        int int27 = intMath0.mod(4, 1);
        int int30 = intMath0.mod(50, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(34, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(50, 14);
        int int18 = intMath0.mod(75, (int) (byte) 1);
        int int21 = intMath0.mod((-6), 83);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        int int30 = intMath0.mod(12, 72);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 88 + "'", int27 == 88);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        int int36 = intMath0.mod(45, (int) 'a');
        int int39 = intMath0.mod(35, 42);
        int int42 = intMath0.mod(33, 68);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 45 + "'", int36 == 45);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 33 + "'", int42 == 33);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(100, 50);
        int int21 = intMath0.mod(99, 12);
        int int24 = intMath0.mod(14, 16);
        int int27 = intMath0.mod((int) (short) 100, (int) (short) 1);
        int int30 = intMath0.mod(72, 14);
        int int33 = intMath0.mod(80, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 33 + "'", int33 == 33);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(87, 34);
        int int27 = intMath0.mod(18, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        int int18 = intMath0.mod(87, 97);
        int int21 = intMath0.mod(0, 61);
        int int24 = intMath0.mod(69, 14);
        int int27 = intMath0.mod(66, 75);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 66 + "'", int27 == 66);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        int int30 = intMath0.mod(27, 30);
        int int33 = intMath0.mod(98, 89);
        int int36 = intMath0.mod(16, 100);
        int int39 = intMath0.mod((-9), 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27 + "'", int30 == 27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16 + "'", int36 == 16);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 44 + "'", int39 == 44);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        int int36 = intMath0.mod(0, 45);
        int int39 = intMath0.mod(29, 96);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = intMath0.mod(13, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 68 + "'", int33 == 68);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 29 + "'", int39 == 29);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(49, 4);
        int int21 = intMath0.mod(39, 29);
        int int24 = intMath0.mod(83, (int) '4');
        int int27 = intMath0.mod((int) (byte) -1, 7);
        int int30 = intMath0.mod(26, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(0, 88);
        int int24 = intMath0.mod(94, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(89, 94);
        int int24 = intMath0.mod(93, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 89 + "'", int21 == 89);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 88);
        int int21 = intMath0.mod((int) 'a', 87);
        int int24 = intMath0.mod(39, 14);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((-10), 87);
        int int12 = intMath0.mod((-1), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 77 + "'", int9 == 77);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 96 + "'", int12 == 96);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(15, 80);
        int int18 = intMath0.mod((-8), 83);
        int int21 = intMath0.mod(27, 42);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 75 + "'", int18 == 75);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod((-6), 50);
        int int21 = intMath0.mod(88, 50);
        int int24 = intMath0.mod(72, 83);
        int int27 = intMath0.mod(46, 86);
        int int30 = intMath0.mod(36, (int) '#');
        int int33 = intMath0.mod((int) (short) 100, 44);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 44 + "'", int18 == 44);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 38 + "'", int21 == 38);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 46 + "'", int27 == 46);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
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
        int int30 = intMath0.mod(94, 1);
        int int33 = intMath0.mod(24, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(4, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(27, 89);
        int int27 = intMath0.mod(100, 75);
        int int30 = intMath0.mod(75, 16);
        int int33 = intMath0.mod(22, 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22 + "'", int33 == 22);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(0, (int) '#');
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
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(0, 22);
        int int15 = intMath0.mod(66, 42);
        int int18 = intMath0.mod(63, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-5), 3);
        int int24 = intMath0.mod(53, 86);
        int int27 = intMath0.mod((int) (byte) 100, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(49, (int) '#');
        int int27 = intMath0.mod(47, 16);
        int int30 = intMath0.mod(74, (int) (byte) 1);
        int int33 = intMath0.mod(51, (int) ' ');
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 19 + "'", int33 == 19);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(19, 24);
        int int18 = intMath0.mod(18, (int) '#');
        int int21 = intMath0.mod(89, 100);
        int int24 = intMath0.mod(33, 28);
        int int27 = intMath0.mod((int) (short) -1, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 89 + "'", int21 == 89);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 47 + "'", int27 == 47);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 1, 35);
        int int21 = intMath0.mod(1, 52);
        int int24 = intMath0.mod(17, 63);
        int int27 = intMath0.mod(62, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 62 + "'", int27 == 62);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod(42, 36);
        int int27 = intMath0.mod(49, 40);
        int int30 = intMath0.mod(10, 25);
        int int33 = intMath0.mod(64, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod(49, (int) 'a');
        int int24 = intMath0.mod((int) ' ', 32);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(42, 86);
        int int21 = intMath0.mod(97, 11);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod((-2), 48);
        int int24 = intMath0.mod(91, 48);
        int int27 = intMath0.mod(54, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43 + "'", int24 == 43);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-3), 1);
        int int21 = intMath0.mod(17, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(40, (int) (byte) 10);
        int int21 = intMath0.mod(27, 56);
        int int24 = intMath0.mod(17, 94);
        int int27 = intMath0.mod((-1), 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        int int30 = intMath0.mod(92, 20);
        int int33 = intMath0.mod(67, (int) (byte) 100);
        int int36 = intMath0.mod(40, 21);
        int int39 = intMath0.mod((-8), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 67 + "'", int33 == 67);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 19 + "'", int36 == 19);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(18, 36);
        int int15 = intMath0.mod(75, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (short) 1, 98);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(44, 81);
        int int24 = intMath0.mod(14, 94);
        int int27 = intMath0.mod(100, 44);
        int int30 = intMath0.mod(81, 74);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(10, 52);
        int int12 = intMath0.mod(30, (int) (short) 10);
        int int15 = intMath0.mod(0, 24);
        int int18 = intMath0.mod(26, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(99, 3);
        int int24 = intMath0.mod(28, 28);
        int int27 = intMath0.mod(37, 46);
        int int30 = intMath0.mod(83, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 37 + "'", int27 == 37);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39 + "'", int30 == 39);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(54, 80);
        int int18 = intMath0.mod(37, 18);
        int int21 = intMath0.mod(1, 96);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(0, 27);
        int int21 = intMath0.mod(94, 5);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(25, 76);
        int int18 = intMath0.mod(44, 19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(50, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod(57, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 57 + "'", int18 == 57);
    }
}

