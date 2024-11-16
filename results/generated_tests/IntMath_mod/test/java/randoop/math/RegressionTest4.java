package math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod((int) 'a', 26);
        int int27 = intMath0.mod(3, 35);
        int int30 = intMath0.mod(45, 92);
        int int33 = intMath0.mod(89, 27);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(85, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 45 + "'", int30 == 45);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(21, 44);
        int int24 = intMath0.mod((int) (short) 1, 53);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod(9, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int30 = intMath0.mod(26, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 67 + "'", int27 == 67);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(3, (int) (short) 0);
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
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        int int33 = intMath0.mod(1, 15);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(91, 26);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        int int33 = intMath0.mod(17, 69);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17 + "'", int33 == 17);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((int) (short) 10, 89);
        int int15 = intMath0.mod(19, 61);
        int int18 = intMath0.mod(37, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(81, 34);
        int int21 = intMath0.mod((-7), 8);
        int int24 = intMath0.mod(86, 31);
        int int27 = intMath0.mod(56, 48);
        int int30 = intMath0.mod(52, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(81, 34);
        int int21 = intMath0.mod((-7), 8);
        int int24 = intMath0.mod(74, 94);
        int int27 = intMath0.mod(88, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        int int30 = intMath0.mod(18, (int) '#');
        int int33 = intMath0.mod(10, 74);
        int int36 = intMath0.mod(4, 17);
        int int39 = intMath0.mod((-10), (int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18 + "'", int30 == 18);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        int int30 = intMath0.mod((int) (byte) -1, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(15, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 72 + "'", int27 == 72);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(10, (int) '#');
        int int27 = intMath0.mod(72, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod((-5), 4);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(20, 72);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((-100), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(29, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (byte) 100, (int) 'a');
        int int15 = intMath0.mod(35, 44);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(84, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(17, (int) '4');
        int int21 = intMath0.mod(95, 77);
        int int24 = intMath0.mod(50, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 50 + "'", int24 == 50);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-4), (int) (byte) 1);
        int int21 = intMath0.mod(27, 5);
        int int24 = intMath0.mod(42, 72);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 42 + "'", int24 == 42);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod((int) (short) -1, 48);
        int int21 = intMath0.mod((int) '#', 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod(23, 15);
        int int15 = intMath0.mod(0, 99);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(17, 84);
        int int15 = intMath0.mod((int) (short) 100, 36);
        int int18 = intMath0.mod(64, 18);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(10, (int) (short) 1);
        int int21 = intMath0.mod(62, 75);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 62 + "'", int21 == 62);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(7, 49);
        int int27 = intMath0.mod(0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(92, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(27, 2);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod((-4), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 93 + "'", int24 == 93);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod((int) (byte) 100, 88);
        int int27 = intMath0.mod((-8), 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 42 + "'", int27 == 42);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(79, 14);
        int int27 = intMath0.mod(32, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        int int30 = intMath0.mod(14, 33);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod(29, 19);
        int int18 = intMath0.mod(27, 88);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(35, 34);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod((int) (byte) 0, 17);
        int int24 = intMath0.mod(37, 88);
        int int27 = intMath0.mod((int) (byte) -1, 16);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(20, 55);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(39, 30);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(0, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int30 = intMath0.mod(24, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(61, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        int int30 = intMath0.mod(3, 81);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(89, 11);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) '4', 17);
        int int15 = intMath0.mod(0, 94);
        int int18 = intMath0.mod(15, 77);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(0, (int) (byte) 1);
        int int18 = intMath0.mod(37, 71);
        int int21 = intMath0.mod(80, 39);
        int int24 = intMath0.mod((int) (byte) 100, 4);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod(1, 16);
        int int24 = intMath0.mod(93, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        int int36 = intMath0.mod(43, 35);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        int int30 = intMath0.mod(25, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(56, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod(46, 23);
        int int27 = intMath0.mod(0, 86);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(18, 12);
        int int21 = intMath0.mod(67, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 67 + "'", int21 == 67);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod(49, (int) 'a');
        int int24 = intMath0.mod((-8), 80);
        int int27 = intMath0.mod(51, 77);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(91, 16);
        int int18 = intMath0.mod(99, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int42 = intMath0.mod(76, 68);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = intMath0.mod(13, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        int int42 = intMath0.mod(24, 27);
        int int45 = intMath0.mod((-9), 86);
        int int48 = intMath0.mod((-6), 21);
        int int51 = intMath0.mod(31, 12);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 24 + "'", int42 == 24);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 77 + "'", int45 == 77);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 7 + "'", int51 == 7);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod((int) (short) 0, 87);
        int int24 = intMath0.mod(34, 33);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(35, 38);
        int int18 = intMath0.mod(39, 69);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(0, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(17, 72);
        int int27 = intMath0.mod((-7), 87);
        int int30 = intMath0.mod(44, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 80 + "'", int27 == 80);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod((int) (short) 10, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((-10), 87);
        int int12 = intMath0.mod((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 77 + "'", int9 == 77);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, (int) (byte) 10);
        int int24 = intMath0.mod(51, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(8, 11);
        int int21 = intMath0.mod((int) (short) 10, 84);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod((int) (byte) 10, 86);
        int int15 = intMath0.mod(46, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(18, 36);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod(47, 50);
        int int18 = intMath0.mod(9, 52);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(34, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) ' ', (int) (byte) 100);
        int int21 = intMath0.mod(42, 43);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(100, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(13, 100);
        int int9 = intMath0.mod(35, (int) ' ');
        int int12 = intMath0.mod(50, 1);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        int int30 = intMath0.mod((-6), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-4), 76);
        int int24 = intMath0.mod(69, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        int int33 = intMath0.mod(86, 3);
        int int36 = intMath0.mod(27, (int) (byte) 10);
        int int39 = intMath0.mod(51, 22);
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 7 + "'", int36 == 7);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-2), 5);
        int int9 = intMath0.mod(86, 28);
        int int12 = intMath0.mod(16, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(49, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-5), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) (byte) -1, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        int int30 = intMath0.mod((-4), 53);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38 + "'", int27 == 38);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 49 + "'", int30 == 49);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        int int30 = intMath0.mod(100, 16);
        int int33 = intMath0.mod((-9), 41);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod((-6), 1);
        int int15 = intMath0.mod(47, (int) (short) 1);
        int int18 = intMath0.mod(80, 55);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(14, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        int int30 = intMath0.mod(47, 86);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod((-1), (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(53, 34);
        int int24 = intMath0.mod(12, (int) 'a');
        int int27 = intMath0.mod(68, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(33, (int) '#');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33 + "'", int18 == 33);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(0, 54);
        int int12 = intMath0.mod(97, 95);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(100, 19);
        int int21 = intMath0.mod(49, 27);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(44, 81);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        int int21 = intMath0.mod(15, 54);
        int int24 = intMath0.mod(31, 6);
        int int27 = intMath0.mod(0, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(98, 54);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        int int33 = intMath0.mod(81, 25);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        int int39 = intMath0.mod(27, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = intMath0.mod(0, (-1));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 55 + "'", int30 == 55);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 17 + "'", int33 == 17);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) '4', 32);
        int int12 = intMath0.mod((-1), 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 84 + "'", int12 == 84);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod(26, 34);
        int int18 = intMath0.mod(14, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 98);
        int int24 = intMath0.mod(99, 32);
        int int27 = intMath0.mod(0, 85);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(96, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(81, 34);
        int int21 = intMath0.mod((-7), 8);
        int int24 = intMath0.mod(0, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod((-7), 48);
        int int27 = intMath0.mod((int) (short) 0, 35);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod((-100), 76);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(12, 25);
        int int18 = intMath0.mod(73, 42);
        int int21 = intMath0.mod((int) (byte) 100, 61);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod(69, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod((int) (short) -1, 54);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) (short) 100, 19);
        int int15 = intMath0.mod(0, 10);
        int int18 = intMath0.mod(0, 48);
        int int21 = intMath0.mod(76, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(26, 98);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(26, 27);
        int int18 = intMath0.mod((-2), 43);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 41 + "'", int18 == 41);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(47, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod(71, (int) (byte) 10);
        int int27 = intMath0.mod(80, 55);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
            int int24 = intMath0.mod(85, 0);
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
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(99, 3);
        int int24 = intMath0.mod(28, 28);
        int int27 = intMath0.mod(74, 23);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod(86, 42);
        int int24 = intMath0.mod(7, 4);
        int int27 = intMath0.mod((int) (byte) 100, 85);
        int int30 = intMath0.mod(23, 13);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        int int33 = intMath0.mod(20, 79);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) -1, 87);
        int int12 = intMath0.mod(80, 19);
        int int15 = intMath0.mod((-1), 3);
        int int18 = intMath0.mod((-7), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 86 + "'", int9 == 86);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 5);
        int int24 = intMath0.mod(46, 79);
        int int27 = intMath0.mod((int) (byte) 0, 10);
        int int30 = intMath0.mod((-100), 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38 + "'", int30 == 38);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-1), 37);
        int int18 = intMath0.mod(50, 31);
        int int21 = intMath0.mod(10, 85);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(17, 26);
        int int21 = intMath0.mod(21, 10);
        int int24 = intMath0.mod(29, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((int) 'a', 94);
        int int15 = intMath0.mod(9, (int) (byte) 1);
        int int18 = intMath0.mod(77, 18);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(17, 72);
        int int27 = intMath0.mod(1, 30);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((-9), (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(12, 25);
        int int18 = intMath0.mod(73, 42);
        int int21 = intMath0.mod((int) (byte) 100, 61);
        int int24 = intMath0.mod(43, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        int int36 = intMath0.mod((-2), 64);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 62 + "'", int36 == 62);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((-100), 13);
        int int18 = intMath0.mod((-5), (int) '4');
        int int21 = intMath0.mod(0, (int) '#');
        int int24 = intMath0.mod((-8), 34);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (byte) 0, (int) '4');
        int int21 = intMath0.mod((int) (short) -1, 50);
        int int24 = intMath0.mod(49, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod(20, 87);
        int int21 = intMath0.mod(38, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(35, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
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
        int int30 = intMath0.mod(63, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 63 + "'", int30 == 63);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(44, 81);
        int int24 = intMath0.mod(10, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod((-1), 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(89, 11);
        int int18 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int21 = intMath0.mod((-10), 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        int int15 = intMath0.mod(7, 7);
        int int18 = intMath0.mod(0, 99);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 34);
        int int21 = intMath0.mod(64, 37);
        int int24 = intMath0.mod(77, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 77 + "'", int24 == 77);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(2, 32);
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 1, 12);
        int int18 = intMath0.mod(19, 2);
        int int21 = intMath0.mod(68, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(42, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 68 + "'", int21 == 68);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        int int30 = intMath0.mod(80, 61);
        int int33 = intMath0.mod(10, 88);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 50 + "'", int27 == 50);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 19 + "'", int30 == 19);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        int int39 = intMath0.mod(98, 71);
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27 + "'", int39 == 27);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
            int int36 = intMath0.mod(61, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
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
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) ' ', (int) (byte) 100);
        int int21 = intMath0.mod(54, 44);
        int int24 = intMath0.mod(20, 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(79, 1);
        int int15 = intMath0.mod(14, 42);
        int int18 = intMath0.mod(40, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod((int) (short) -1, 48);
        int int21 = intMath0.mod(20, (int) '#');
        int int24 = intMath0.mod((int) (byte) 100, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
        int int30 = intMath0.mod(53, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(4, 8);
        int int18 = intMath0.mod(1, 51);
        int int21 = intMath0.mod(0, 41);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(35, 10);
        int int24 = intMath0.mod(28, 88);
        int int27 = intMath0.mod(18, 91);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) (short) 10, 30);
        int int15 = intMath0.mod(38, 74);
        int int18 = intMath0.mod((int) '#', 71);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod(50, 71);
        int int18 = intMath0.mod(35, 2);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int30 = intMath0.mod(100, 16);
        int int33 = intMath0.mod((-9), 41);
        int int36 = intMath0.mod(42, 45);
        int int39 = intMath0.mod(5, 24);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = intMath0.mod((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 42 + "'", int36 == 42);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod(20, 87);
        int int21 = intMath0.mod(38, 16);
        int int24 = intMath0.mod((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(0, (int) (short) 0);
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        int int33 = intMath0.mod(0, 2);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
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
        int int30 = intMath0.mod(47, 83);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(1, 87);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod(64, 13);
        int int15 = intMath0.mod(17, 85);
        int int18 = intMath0.mod(92, 94);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 92 + "'", int18 == 92);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 39 + "'", int24 == 39);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(0, 27);
        int int21 = intMath0.mod(0, (int) ' ');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod(0, 16);
        int int24 = intMath0.mod(29, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        int int30 = intMath0.mod(97, 41);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 1, 12);
        int int18 = intMath0.mod(42, 92);
        int int21 = intMath0.mod(21, 97);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 42 + "'", int18 == 42);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod(38, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod((-6), 1);
        int int15 = intMath0.mod(47, (int) (short) 1);
        int int18 = intMath0.mod(71, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(91, 16);
        int int18 = intMath0.mod(87, 99);
        int int21 = intMath0.mod(80, 67);
        int int24 = intMath0.mod(28, 18);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        int int42 = intMath0.mod(74, 59);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(86, 7);
        int int21 = intMath0.mod(0, 72);
        int int24 = intMath0.mod(42, 12);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        int int33 = intMath0.mod((int) '4', 4);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20 + "'", int30 == 20);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(10, 26);
        int int15 = intMath0.mod(0, 52);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (byte) -1, 8);
        int int12 = intMath0.mod((int) (short) 0, 89);
        int int15 = intMath0.mod((int) (byte) 0, 91);
        int int18 = intMath0.mod(91, 38);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 83);
        int int24 = intMath0.mod(94, 32);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(68, 45);
        int int15 = intMath0.mod(76, 7);
        int int18 = intMath0.mod((-2), 45);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 43 + "'", int18 == 43);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(18, 12);
        int int21 = intMath0.mod(14, 10);
        int int24 = intMath0.mod(93, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(52, (int) (short) 1);
        int int18 = intMath0.mod((-7), 39);
        int int21 = intMath0.mod(12, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(11, 87);
        int int18 = intMath0.mod((-9), 8);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((-1), 69);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(29, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 68 + "'", int18 == 68);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(0, 22);
        int int15 = intMath0.mod(66, 42);
        int int18 = intMath0.mod(84, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(79, 79);
        int int21 = intMath0.mod(32, 21);
        int int24 = intMath0.mod(0, (int) 'a');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(31, 30);
        int int12 = intMath0.mod((-9), 17);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod(2, (int) (byte) 1);
        int int24 = intMath0.mod((int) (byte) 100, 94);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(37, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(1, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod((-7), 0);
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
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(1, 98);
        int int21 = intMath0.mod(48, 9);
        int int24 = intMath0.mod(31, 41);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(100, 14);
        int int18 = intMath0.mod(80, 98);
        int int21 = intMath0.mod(0, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(35, (int) (short) 10);
        int int9 = intMath0.mod(50, 23);
        int int12 = intMath0.mod(35, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        int int18 = intMath0.mod(0, 80);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(29, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 83);
        int int24 = intMath0.mod(92, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(36, 100);
        int int15 = intMath0.mod(99, 50);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 34);
        int int21 = intMath0.mod(64, 37);
        int int24 = intMath0.mod(41, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(73, 98);
        int int24 = intMath0.mod(54, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 73 + "'", int21 == 73);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(36, 100);
        int int24 = intMath0.mod((int) (short) 100, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(62, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(91, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(74, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        int int42 = intMath0.mod(76, 68);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int30 = intMath0.mod(36, (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        int int30 = intMath0.mod(100, 16);
        int int33 = intMath0.mod((-9), 41);
        int int36 = intMath0.mod(42, 45);
        int int39 = intMath0.mod(5, 24);
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 42 + "'", int36 == 42);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod(0, 16);
        int int24 = intMath0.mod((int) (byte) 100, 71);
        int int27 = intMath0.mod(0, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((-100), (int) (short) 100);
        int int12 = intMath0.mod(10, 76);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod((int) (short) 0, (int) '4');
        int int24 = intMath0.mod(4, 9);
        int int27 = intMath0.mod(68, 89);
        int int30 = intMath0.mod(29, 66);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 68 + "'", int27 == 68);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod(26, 95);
        int int18 = intMath0.mod((-9), 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 72 + "'", int18 == 72);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod(74, (int) '4');
        int int21 = intMath0.mod(72, (int) (byte) 1);
        int int24 = intMath0.mod((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod((int) (short) 0, (int) '4');
        int int24 = intMath0.mod(4, 9);
        int int27 = intMath0.mod(68, 89);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 68 + "'", int27 == 68);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(88, 3);
        int int15 = intMath0.mod(12, 25);
        int int18 = intMath0.mod(73, 42);
        int int21 = intMath0.mod(88, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        int int30 = intMath0.mod(10, (int) (short) 1);
        int int33 = intMath0.mod(59, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod(62, 40);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod(71, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(33, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod(52, 98);
        int int27 = intMath0.mod((-10), 54);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44 + "'", int27 == 44);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(0, 28);
        int int21 = intMath0.mod(84, 95);
        int int24 = intMath0.mod(0, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 84 + "'", int21 == 84);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(50, 14);
        int int18 = intMath0.mod(38, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 38 + "'", int18 == 38);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(0, (int) (byte) 1);
        int int18 = intMath0.mod(37, 71);
        int int21 = intMath0.mod((int) (byte) 0, 37);
        int int24 = intMath0.mod(21, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(32, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(68, (-1));
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
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        int int42 = intMath0.mod(24, 27);
        int int45 = intMath0.mod((-9), 86);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = intMath0.mod(0, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 24 + "'", int42 == 24);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 77 + "'", int45 == 77);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int18 = intMath0.mod(95, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(18, 36);
        int int15 = intMath0.mod(25, 43);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(75, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod(50, 71);
        int int18 = intMath0.mod(72, 100);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 72 + "'", int18 == 72);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod((int) (short) 0, 20);
        int int18 = intMath0.mod(0, (int) (short) 1);
        int int21 = intMath0.mod(51, 28);
        int int24 = intMath0.mod((int) '#', 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 23 + "'", int21 == 23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod(4, 26);
        int int12 = intMath0.mod(37, 52);
        int int15 = intMath0.mod(31, 40);
        int int18 = intMath0.mod(98, 61);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(15, 80);
        int int18 = intMath0.mod((-8), 83);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 75 + "'", int18 == 75);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(28, 4);
        int int24 = intMath0.mod(0, 18);
        int int27 = intMath0.mod((int) (short) -1, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 42 + "'", int27 == 42);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod(19, 24);
        int int18 = intMath0.mod(100, 21);
        int int21 = intMath0.mod(47, 28);
        int int24 = intMath0.mod(84, 44);
        int int27 = intMath0.mod((int) 'a', 73);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, (int) (short) 1);
        int int21 = intMath0.mod(0, 95);
        int int24 = intMath0.mod(15, 17);
        int int27 = intMath0.mod(80, 64);
        int int30 = intMath0.mod(75, 98);
        int int33 = intMath0.mod(43, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 75 + "'", int30 == 75);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 43 + "'", int33 == 43);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(86, 52);
        int int21 = intMath0.mod(1, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod((-100), 87);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        int int30 = intMath0.mod(95, 56);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 39 + "'", int30 == 39);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        int int30 = intMath0.mod(100, 16);
        int int33 = intMath0.mod((-9), 41);
        int int36 = intMath0.mod(42, 45);
        int int39 = intMath0.mod(90, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 42 + "'", int36 == 42);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        int int30 = intMath0.mod((-4), 88);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 84 + "'", int30 == 84);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(44, 18);
        int int18 = intMath0.mod(15, (int) 'a');
        int int21 = intMath0.mod(30, 1);
        int int24 = intMath0.mod(82, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        int int36 = intMath0.mod(74, 26);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod(64, 13);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        int int24 = intMath0.mod(99, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(86, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86 + "'", int15 == 86);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod((int) (short) 0, (int) '4');
        int int24 = intMath0.mod(4, 9);
        int int27 = intMath0.mod(68, 89);
        int int30 = intMath0.mod(29, 66);
        int int33 = intMath0.mod(45, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 68 + "'", int27 == 68);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 29 + "'", int30 == 29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 45 + "'", int33 == 45);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod((int) (short) -1, 99);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        int int18 = intMath0.mod(0, 80);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(4, 8);
        int int18 = intMath0.mod(1, 51);
        int int21 = intMath0.mod(0, 41);
        int int24 = intMath0.mod(45, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(81, 5);
        int int12 = intMath0.mod(22, 71);
        int int15 = intMath0.mod((int) (byte) 10, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod((int) (short) 0, 20);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(61, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod(91, 4);
        int int18 = intMath0.mod(36, 18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(80, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(23, 88);
        int int15 = intMath0.mod(88, 35);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(84, 16);
        int int18 = intMath0.mod(91, 42);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(86, (int) (short) 100);
        int int18 = intMath0.mod(50, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(39, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86 + "'", int15 == 86);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod((int) ' ', 49);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod((-1), 19);
        int int21 = intMath0.mod(15, 31);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        int int45 = intMath0.mod(39, 19);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(35, 34);
        int int12 = intMath0.mod((int) (short) -1, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        int int18 = intMath0.mod((-1), 41);
        int int21 = intMath0.mod(41, 74);
        int int24 = intMath0.mod(36, 49);
        int int27 = intMath0.mod(40, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 41 + "'", int21 == 41);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 40 + "'", int27 == 40);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(100, 14);
        int int18 = intMath0.mod(0, 17);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        int int21 = intMath0.mod(68, 64);
        int int24 = intMath0.mod((int) '#', 44);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        int int30 = intMath0.mod(19, 3);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod((-1), 95);
        int int24 = intMath0.mod(61, 11);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-7), 1);
        int int21 = intMath0.mod((-5), 10);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod((int) '#', 38);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod(88, 35);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(18, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(83, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(0, 80);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(36, 100);
        int int24 = intMath0.mod((int) (short) 100, 16);
        int int27 = intMath0.mod(0, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((int) 'a', 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod(87, 8);
        int int15 = intMath0.mod((int) (short) 0, 20);
        int int18 = intMath0.mod(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        int int30 = intMath0.mod((-5), 13);
        int int33 = intMath0.mod(26, 3);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(7, 6);
        int int18 = intMath0.mod(20, 55);
        int int21 = intMath0.mod((-100), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        java.lang.Class<?> wildcardClass40 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(40, (int) (byte) 10);
        int int21 = intMath0.mod(27, 56);
        int int24 = intMath0.mod(48, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((-2), 50);
        int int15 = intMath0.mod((-8), (int) (short) 100);
        int int18 = intMath0.mod(75, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 92 + "'", int15 == 92);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod(86, 42);
        int int24 = intMath0.mod(7, 4);
        int int27 = intMath0.mod((int) (byte) 100, 85);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(30, 30);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(44, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 44 + "'", int30 == 44);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod((int) (short) 10, (int) ' ');
        int int18 = intMath0.mod(100, 2);
        int int21 = intMath0.mod(3, (int) (byte) 1);
        int int24 = intMath0.mod(12, 18);
        int int27 = intMath0.mod(32, 100);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 10, 67);
        int int18 = intMath0.mod((-10), 63);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(6, 99);
        int int18 = intMath0.mod(86, 88);
        int int21 = intMath0.mod(10, 68);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(67, (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod(91, 4);
        int int18 = intMath0.mod(36, 18);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 16 + "'", int36 == 16);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(73, (int) (byte) 100);
        int int24 = intMath0.mod((int) (short) -1, 27);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (short) 0, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 73 + "'", int21 == 73);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(100, 14);
        int int18 = intMath0.mod(80, 98);
        int int21 = intMath0.mod(95, 11);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(87, (int) (short) 100);
        int int21 = intMath0.mod(8, 10);
        int int24 = intMath0.mod((-1), 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod((int) 'a', 51);
        int int24 = intMath0.mod(47, 8);
        int int27 = intMath0.mod(88, 14);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(4, (int) (short) 10);
        int int21 = intMath0.mod(38, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((-3), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
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
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(10, 26);
        int int15 = intMath0.mod(0, 52);
        int int18 = intMath0.mod(25, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod((int) ' ', 52);
        int int24 = intMath0.mod(22, 22);
        int int27 = intMath0.mod(97, 42);
        int int30 = intMath0.mod(69, 22);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(4, 8);
        int int18 = intMath0.mod(1, 51);
        int int21 = intMath0.mod(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (byte) 100, 39);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (short) 1, 98);
        int int21 = intMath0.mod(68, 54);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod(23, 15);
        int int15 = intMath0.mod(18, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(53, 34);
        int int24 = intMath0.mod(46, 41);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(91, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(1, 19);
        int int12 = intMath0.mod(92, 52);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 40 + "'", int12 == 40);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((-3), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((-9), 81);
        int int15 = intMath0.mod((int) (byte) 0, 14);
        int int18 = intMath0.mod(18, 1);
        int int21 = intMath0.mod(33, (int) ' ');
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 72 + "'", int12 == 72);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(77, 79);
        int int24 = intMath0.mod((int) '4', 48);
        int int27 = intMath0.mod(38, 99);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38 + "'", int27 == 38);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 5);
        int int24 = intMath0.mod(46, 79);
        int int27 = intMath0.mod((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(55, (int) '#');
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((-7), 11);
        int int18 = intMath0.mod(34, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(27, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(29, 25);
        int int21 = intMath0.mod(27, 38);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(35, (int) 'a');
        int int18 = intMath0.mod((int) (short) 1, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod((int) 'a', 35);
        int int21 = intMath0.mod(12, 14);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod((-1), 8);
        int int15 = intMath0.mod((int) (short) 1, 99);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((int) (short) 0, 28);
        int int12 = intMath0.mod(4, 97);
        int int15 = intMath0.mod(29, 26);
        int int18 = intMath0.mod((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod(0, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(45, 4);
        int int21 = intMath0.mod(1, 90);
        int int24 = intMath0.mod(18, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        int int18 = intMath0.mod(0, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(52, 50);
        int int18 = intMath0.mod(80, 19);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        int int15 = intMath0.mod((int) 'a', 34);
        int int18 = intMath0.mod(6, 11);
        int int21 = intMath0.mod(0, 75);
        int int24 = intMath0.mod(31, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(36, 100);
        int int24 = intMath0.mod(89, 30);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod(83, 79);
        int int12 = intMath0.mod(27, 10);
        int int15 = intMath0.mod(81, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod(91, 4);
        int int18 = intMath0.mod(36, 18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(49, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        int int33 = intMath0.mod(50, 62);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 50 + "'", int33 == 50);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod(35, (int) 'a');
        int int18 = intMath0.mod(20, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(64, 30);
        int int15 = intMath0.mod((-10), 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod((int) (byte) -1, 95);
        int int24 = intMath0.mod(54, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(59, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 100, 16);
        int int18 = intMath0.mod((-1), 41);
        int int21 = intMath0.mod(19, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((int) (short) -1, 4);
        int int12 = intMath0.mod(3, 99);
        int int15 = intMath0.mod(87, 4);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((-1), 30);
        int int12 = intMath0.mod(12, 44);
        int int15 = intMath0.mod(68, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(77, 79);
        int int24 = intMath0.mod((int) '4', 48);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
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
            int int24 = intMath0.mod(49, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
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
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(84, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
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
        int int30 = intMath0.mod((-4), 53);
        int int33 = intMath0.mod((int) '#', 14);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 38 + "'", int27 == 38);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 49 + "'", int30 == 49);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        int int39 = intMath0.mod(27, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(44, 15);
        int int12 = intMath0.mod(8, 5);
        int int15 = intMath0.mod((int) (byte) 0, 77);
        int int18 = intMath0.mod(6, 25);
        int int21 = intMath0.mod(2, (int) (byte) 1);
        int int24 = intMath0.mod(0, 34);
        int int27 = intMath0.mod(100, 10);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(40, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        int int33 = intMath0.mod(87, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(72, 40);
        int int24 = intMath0.mod(34, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(11, 94);
        int int27 = intMath0.mod(87, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 87 + "'", int27 == 87);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55 + "'", int27 == 55);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod((-2), 50);
        int int15 = intMath0.mod(9, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) 'a', 17);
        int int15 = intMath0.mod(36, 8);
        int int18 = intMath0.mod(81, 38);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        int int30 = intMath0.mod(36, (int) (byte) 10);
        int int33 = intMath0.mod(1, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(79, 79);
        int int21 = intMath0.mod(32, 21);
        int int24 = intMath0.mod(0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(53, 34);
        int int24 = intMath0.mod(12, (int) 'a');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod((int) (byte) 0, 17);
        int int24 = intMath0.mod(37, 88);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        int int33 = intMath0.mod((-1), 50);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 49 + "'", int33 == 49);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(18, 12);
        int int21 = intMath0.mod((int) (short) 1, 23);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(36, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod((int) '#', (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -10 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(0, 12);
        int int21 = intMath0.mod(1, (int) (byte) 1);
        int int24 = intMath0.mod((-2), 74);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(88, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 72 + "'", int24 == 72);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((-10), 87);
        int int12 = intMath0.mod((int) (short) 1, 10);
        int int15 = intMath0.mod(50, 79);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 77 + "'", int9 == 77);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod(87, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(69, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
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
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(80, 49);
        int int27 = intMath0.mod(89, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14 + "'", int27 == 14);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(84, 1);
        int int15 = intMath0.mod((int) '#', 1);
        int int18 = intMath0.mod(74, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(7, 35);
        int int21 = intMath0.mod(84, 44);
        int int24 = intMath0.mod(51, (int) (byte) 10);
        int int27 = intMath0.mod(2, 86);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(1, 86);
        int int21 = intMath0.mod((-9), 51);
        int int24 = intMath0.mod(1, 100);
        int int27 = intMath0.mod(43, 80);
        int int30 = intMath0.mod(0, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 42 + "'", int21 == 42);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 43 + "'", int27 == 43);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(34, 26);
        int int27 = intMath0.mod((-6), 77);
        int int30 = intMath0.mod(0, 54);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 71 + "'", int27 == 71);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod((-100), 97);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod((int) (short) 1, 47);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(1, 87);
        int int21 = intMath0.mod(87, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (byte) 0, (int) '4');
        int int21 = intMath0.mod((int) (short) -1, 50);
        int int24 = intMath0.mod(92, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-4), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(54, 0);
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
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(74, 75);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(20, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 74 + "'", int18 == 74);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(42, 25);
        int int27 = intMath0.mod(27, 47);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27 + "'", int27 == 27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod((int) (byte) 100, 42);
        int int21 = intMath0.mod(71, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 71 + "'", int21 == 71);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod(100, 13);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        int int33 = intMath0.mod(8, 1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod((-100), (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((-100), (int) (short) 100);
        int int12 = intMath0.mod(10, 76);
        int int15 = intMath0.mod(23, 96);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 23 + "'", int15 == 23);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        int int30 = intMath0.mod(93, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 24 + "'", int24 == 24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 21 + "'", int30 == 21);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
            int int24 = intMath0.mod(53, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
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
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(54, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(48, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod(100, 9);
        int int15 = intMath0.mod((int) 'a', (int) (byte) 1);
        int int18 = intMath0.mod(75, 6);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) (byte) 100, 28);
        int int15 = intMath0.mod((-7), (int) '4');
        int int18 = intMath0.mod(37, 35);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45 + "'", int15 == 45);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        int int42 = intMath0.mod(41, 33);
        int int45 = intMath0.mod(45, 52);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 45 + "'", int45 == 45);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod((int) (byte) 0, 1);
        int int27 = intMath0.mod((int) 'a', 31);
        int int30 = intMath0.mod(10, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod((-3), 83);
        int int27 = intMath0.mod(47, 47);
        int int30 = intMath0.mod(8, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(62, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        int int15 = intMath0.mod((int) 'a', 34);
        int int18 = intMath0.mod(40, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((int) (short) 1, (int) ' ');
        int int12 = intMath0.mod((int) 'a', 94);
        int int15 = intMath0.mod(2, 86);
        int int18 = intMath0.mod(15, 91);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, 10);
        int int12 = intMath0.mod((-10), 74);
        int int15 = intMath0.mod(55, 80);
        int int18 = intMath0.mod(46, 53);
        int int21 = intMath0.mod(71, 59);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 55 + "'", int15 == 55);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(55, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 55 + "'", int24 == 55);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (byte) 100, (int) 'a');
        int int15 = intMath0.mod((int) '#', 11);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod((int) '#', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(46, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod((-6), 52);
        int int12 = intMath0.mod(54, 77);
        int int15 = intMath0.mod(53, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 46 + "'", int9 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (byte) 100, (int) 'a');
        int int15 = intMath0.mod(32, 100);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(99, 3);
        int int21 = intMath0.mod(21, 1);
        int int24 = intMath0.mod(7, 80);
        int int27 = intMath0.mod(0, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(40, 0);
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
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(7, 2);
        int int12 = intMath0.mod(17, 83);
        int int15 = intMath0.mod(26, (int) (short) 1);
        int int18 = intMath0.mod((-5), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod(39, 97);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        int int33 = intMath0.mod(44, 87);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 44 + "'", int33 == 44);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod((int) (short) 10, 88);
        int int21 = intMath0.mod(8, 48);
        int int24 = intMath0.mod(42, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(8, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(7, 35);
        int int21 = intMath0.mod(84, 44);
        int int24 = intMath0.mod(51, (int) (byte) 10);
        int int27 = intMath0.mod(2, 86);
        int int30 = intMath0.mod(0, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(27, 2);
        int int21 = intMath0.mod(0, 23);
        int int24 = intMath0.mod((-1), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 71 + "'", int24 == 71);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(72, 12);
        int int18 = intMath0.mod(38, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(91, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod(35, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod((-5), 2);
        int int21 = intMath0.mod(45, 25);
        int int24 = intMath0.mod(25, (int) ' ');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 25 + "'", int24 == 25);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        int int33 = intMath0.mod(76, 53);
        int int36 = intMath0.mod((-4), 29);
        int int39 = intMath0.mod(28, 4);
        int int42 = intMath0.mod((int) '#', 24);
        java.lang.Class<?> wildcardClass43 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 23 + "'", int33 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25 + "'", int36 == 25);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
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
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(7, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = intMath0.mod(24, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-7), 1);
        int int21 = intMath0.mod(27, 91);
        int int24 = intMath0.mod(48, (int) (short) 1);
        int int27 = intMath0.mod(0, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        int int30 = intMath0.mod(47, 86);
        int int33 = intMath0.mod(8, 11);
        int int36 = intMath0.mod(72, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44 + "'", int27 == 44);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 30 + "'", int36 == 30);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod((-2), 48);
        int int24 = intMath0.mod(91, 48);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43 + "'", int24 == 43);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod(27, (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -4 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod((-3), 10);
        int int12 = intMath0.mod(6, 79);
        int int15 = intMath0.mod(0, 38);
        int int18 = intMath0.mod(91, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        int int30 = intMath0.mod(11, 5);
        int int33 = intMath0.mod(72, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = intMath0.mod(49, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 21 + "'", int33 == 21);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(25, 4);
        int int24 = intMath0.mod(8, 87);
        int int27 = intMath0.mod((int) (short) 0, 20);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(0, (int) (byte) 1);
        int int18 = intMath0.mod(37, 71);
        int int21 = intMath0.mod((int) (byte) 0, 37);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod((int) (short) 100, 51);
        int int21 = intMath0.mod(37, 76);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod((-100), 97);
        int int21 = intMath0.mod(86, 3);
        int int24 = intMath0.mod(0, 71);
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
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod(1, 98);
        int int21 = intMath0.mod(48, 9);
        int int24 = intMath0.mod((-6), 93);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 87 + "'", int24 == 87);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        int int30 = intMath0.mod(32, 74);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(79, (int) (byte) 10);
        int int24 = intMath0.mod(1, 77);
        int int27 = intMath0.mod(0, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(11, 94);
        int int27 = intMath0.mod((-9), 26);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod(94, 30);
        int int24 = intMath0.mod(26, 88);
        int int27 = intMath0.mod(74, 55);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 19 + "'", int27 == 19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        int int24 = intMath0.mod(8, 21);
        int int27 = intMath0.mod(67, 86);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 67 + "'", int27 == 67);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 20);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(91, 26);
        int int24 = intMath0.mod((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(36, 21);
        int int18 = intMath0.mod(20, 34);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(77, 79);
        int int24 = intMath0.mod((int) '4', 48);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(0, (int) ' ');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(86, 7);
        int int21 = intMath0.mod(39, 30);
        int int24 = intMath0.mod(23, (int) '4');
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 23 + "'", int24 == 23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-9), 19);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod(1, 83);
        int int21 = intMath0.mod(36, (int) (byte) 10);
        int int24 = intMath0.mod(94, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 94 + "'", int24 == 94);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(10, 1);
        int int15 = intMath0.mod(35, 38);
        int int18 = intMath0.mod((-1), 67);
        int int21 = intMath0.mod(82, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 66 + "'", int18 == 66);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(97, 21);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        int int30 = intMath0.mod(14, 33);
        int int33 = intMath0.mod((-1), 6);
        int int36 = intMath0.mod(79, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27 + "'", int36 == 27);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(50, 35);
        int int15 = intMath0.mod(71, 3);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(37, 16);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(77, 22);
        int int21 = intMath0.mod(77, 79);
        int int24 = intMath0.mod((int) '4', 48);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(81, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -5 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 77 + "'", int21 == 77);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(31, 30);
        int int12 = intMath0.mod(28, 7);
        int int15 = intMath0.mod(100, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(44, 81);
        int int24 = intMath0.mod(14, 94);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        int int15 = intMath0.mod((int) 'a', 34);
        int int18 = intMath0.mod(6, 11);
        int int21 = intMath0.mod(10, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod(96, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(74, 77);
        int int12 = intMath0.mod((int) (short) 1, 3);
        int int15 = intMath0.mod(76, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 76 + "'", int15 == 76);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(48, 38);
        int int21 = intMath0.mod((-1), 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((-4), 1);
        int int18 = intMath0.mod(100, 19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(45, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -8 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-5), 6);
        int int18 = intMath0.mod(100, 11);
        int int21 = intMath0.mod((int) (byte) 0, 17);
        int int24 = intMath0.mod(45, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 45 + "'", int24 == 45);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
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
        int int33 = intMath0.mod(42, 79);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 42 + "'", int33 == 42);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        int int42 = intMath0.mod(41, 33);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(7, (int) (byte) 1);
        int int12 = intMath0.mod((-8), 99);
        int int15 = intMath0.mod(41, 16);
        int int18 = intMath0.mod(45, 4);
        int int21 = intMath0.mod(1, 90);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 91 + "'", int12 == 91);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(71, 26);
        int int18 = intMath0.mod(19, 94);
        int int21 = intMath0.mod(81, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(22, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
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
        int int30 = intMath0.mod(47, 86);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44 + "'", int27 == 44);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 47 + "'", int30 == 47);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod(87, 55);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(52, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod((-5), 10);
        int int24 = intMath0.mod((int) (byte) 1, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(49, 41);
        java.lang.Class<?> wildcardClass10 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(17, 5);
        int int24 = intMath0.mod((int) '#', 30);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(87, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        int int30 = intMath0.mod(15, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 40 + "'", int21 == 40);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        int int15 = intMath0.mod(62, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod(0, 12);
        int int12 = intMath0.mod((int) (byte) 1, 2);
        int int15 = intMath0.mod(11, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(48, 6);
        int int27 = intMath0.mod((-100), 41);
        int int30 = intMath0.mod(52, 29);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 23 + "'", int27 == 23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 23 + "'", int30 == 23);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(6, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) (byte) 0, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(20, 53);
        int int18 = intMath0.mod((-9), 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(46, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod((-100), 35);
        int int21 = intMath0.mod((int) (byte) 100, 86);
        int int24 = intMath0.mod(28, 36);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((-5), 52);
        int int21 = intMath0.mod(14, 74);
        int int24 = intMath0.mod((int) (short) 1, 23);
        int int27 = intMath0.mod(15, 20);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod((int) (short) 0, 9);
        int int21 = intMath0.mod(80, 27);
        int int24 = intMath0.mod(9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(41, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        int int30 = intMath0.mod(14, 33);
        int int33 = intMath0.mod((-1), 6);
        int int36 = intMath0.mod(37, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 39 + "'", int27 == 39);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 37 + "'", int36 == 37);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        int int30 = intMath0.mod(19, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(20, 53);
        int int18 = intMath0.mod(35, 22);
        int int21 = intMath0.mod(27, 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
        int int33 = intMath0.mod(27, 23);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = intMath0.mod(100, (int) (short) 0);
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
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((-3), 1);
        int int12 = intMath0.mod((int) (byte) 1, 1);
        int int15 = intMath0.mod(25, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        int int33 = intMath0.mod(76, 53);
        int int36 = intMath0.mod((-4), 29);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 23 + "'", int33 == 23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 25 + "'", int36 == 25);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod((-2), 100);
        int int9 = intMath0.mod(8, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod((-100), 2);
        int int21 = intMath0.mod((-9), 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(89, 7);
        int int18 = intMath0.mod(87, 34);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 19 + "'", int18 == 19);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(38, 69);
        int int15 = intMath0.mod(44, 18);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(78, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(21, 81);
        int int21 = intMath0.mod(35, 86);
        int int24 = intMath0.mod(76, 100);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        int int36 = intMath0.mod(55, 53);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(4, 32);
        int int21 = intMath0.mod(100, (int) '#');
        int int24 = intMath0.mod(80, 49);
        int int27 = intMath0.mod(44, 33);
        int int30 = intMath0.mod(41, 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41 + "'", int30 == 41);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(35, (int) (short) 10);
        int int9 = intMath0.mod(32, 75);
        int int12 = intMath0.mod(74, 72);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(11, 20);
        int int24 = intMath0.mod((-4), 86);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 82 + "'", int24 == 82);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
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
        int int30 = intMath0.mod((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((-3), 4);
        int int9 = intMath0.mod(60, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) (short) 100, 19);
        int int15 = intMath0.mod((-7), 88);
        int int18 = intMath0.mod((-2), 86);
        int int21 = intMath0.mod(72, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 81 + "'", int15 == 81);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 84 + "'", int18 == 84);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
        int int15 = intMath0.mod(1, 34);
        int int18 = intMath0.mod((-8), 21);
        int int21 = intMath0.mod(67, 3);
        int int24 = intMath0.mod(13, 14);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod((-4), 81);
        int int18 = intMath0.mod(95, 30);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 77 + "'", int15 == 77);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod((int) 'a', 4);
        int int21 = intMath0.mod(35, 10);
        int int24 = intMath0.mod(28, 88);
        int int27 = intMath0.mod(18, 91);
        int int30 = intMath0.mod(32, (int) (short) 10);
        int int33 = intMath0.mod((-8), 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 18 + "'", int27 == 18);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 61 + "'", int33 == 61);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        int int30 = intMath0.mod(47, 35);
        int int33 = intMath0.mod(72, 77);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 72 + "'", int33 == 72);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        int int36 = intMath0.mod((-4), 44);
        int int39 = intMath0.mod((int) (short) -1, 9);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 40 + "'", int36 == 40);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(2, 88);
        int int9 = intMath0.mod(42, (int) (short) 1);
        int int12 = intMath0.mod(26, 88);
        int int15 = intMath0.mod(34, 100);
        int int18 = intMath0.mod(56, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(25, 76);
        int int18 = intMath0.mod(44, 19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(89, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
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
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod(12, 42);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(28, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(52, 54);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
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
        int int33 = intMath0.mod(1, 15);
        int int36 = intMath0.mod(95, 10);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod((-4), 81);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(17, (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -9 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 77 + "'", int15 == 77);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(10, 26);
        int int15 = intMath0.mod(0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod(100, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod(0, 99);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod((int) ' ', (-9));
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(43, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod((int) '4', 77);
        int int12 = intMath0.mod(6, 64);
        int int15 = intMath0.mod(20, 53);
        int int18 = intMath0.mod(35, 22);
        int int21 = intMath0.mod((-8), 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod((-5), (int) (byte) 1);
        int int27 = intMath0.mod(16, 21);
        int int30 = intMath0.mod((int) (byte) 100, 52);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48 + "'", int30 == 48);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) (short) 0, 2);
        int int15 = intMath0.mod((int) ' ', 30);
        int int18 = intMath0.mod(53, 97);
        int int21 = intMath0.mod(40, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
            int int24 = intMath0.mod(82, 0);
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 79 + "'", int27 == 79);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(74, 77);
        int int12 = intMath0.mod((int) (short) 1, 3);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 74 + "'", int9 == 74);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(0, (int) '4');
        int int18 = intMath0.mod(25, 36);
        int int21 = intMath0.mod((-9), 41);
        int int24 = intMath0.mod(66, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod((int) (byte) 10, 67);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod(0, 3);
        int int24 = intMath0.mod((int) '4', (int) '#');
        int int27 = intMath0.mod((int) (byte) 10, 85);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 17 + "'", int24 == 17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
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
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 44 + "'", int21 == 44);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(54, (int) (short) 100);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod((-1), (int) '#');
        int int27 = intMath0.mod(99, 21);
        int int30 = intMath0.mod(45, 1);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod((int) (short) -1, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = intMath0.mod((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -1 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(20, 39);
        int int24 = intMath0.mod((int) (byte) 10, 7);
        int int27 = intMath0.mod((int) '#', 86);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((int) '4', (int) (byte) 10);
        int int15 = intMath0.mod((-6), 8);
        int int18 = intMath0.mod(0, 45);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(74, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(21, 81);
        int int21 = intMath0.mod(35, 86);
        int int24 = intMath0.mod((int) '4', 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((-10), 87);
        int int12 = intMath0.mod(1, 36);
        int int15 = intMath0.mod(77, 100);
        int int18 = intMath0.mod(99, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 77 + "'", int9 == 77);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 77 + "'", int15 == 77);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod(89, 35);
        int int15 = intMath0.mod(26, 42);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (short) 0, (int) (short) 1);
        int int18 = intMath0.mod(9, (int) (byte) 1);
        int int21 = intMath0.mod(30, 81);
        int int24 = intMath0.mod(0, 20);
        int int27 = intMath0.mod(86, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod((-6), 54);
        int int18 = intMath0.mod(26, 25);
        int int21 = intMath0.mod((-1), 100);
        int int24 = intMath0.mod(92, 37);
        int int27 = intMath0.mod((int) (byte) -1, 6);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-100), 100);
        int int21 = intMath0.mod(46, 51);
        int int24 = intMath0.mod(28, 50);
        int int27 = intMath0.mod(34, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 46 + "'", int21 == 46);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 28 + "'", int24 == 28);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(26, 91);
        int int21 = intMath0.mod((-100), 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod(0, 26);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(32, 72);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(76, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -2 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        int int24 = intMath0.mod(8, 21);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(26, 91);
        int int21 = intMath0.mod((-100), 100);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(100, 8);
        int int21 = intMath0.mod((int) ' ', 52);
        int int24 = intMath0.mod(22, 22);
        int int27 = intMath0.mod(0, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(17, 28);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(89, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        int int33 = intMath0.mod(46, 2);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod((int) (byte) 1, 27);
        int int21 = intMath0.mod(73, (int) (byte) 100);
        int int24 = intMath0.mod((int) (short) -1, 27);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 73 + "'", int21 == 73);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod(54, 4);
        int int21 = intMath0.mod(0, 18);
        int int24 = intMath0.mod(52, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod((int) (byte) 100, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod(23, 15);
        int int15 = intMath0.mod(69, 18);
        int int18 = intMath0.mod(14, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }
}

