package math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) '#', 1);
        int int24 = intMath0.mod(25, 6);
        int int27 = intMath0.mod(2, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(81, 28);
        int int15 = intMath0.mod(52, (int) (short) 1);
        int int18 = intMath0.mod((-7), 39);
        int int21 = intMath0.mod(10, 22);
        int int24 = intMath0.mod(0, 4);
        int int27 = intMath0.mod(41, 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 41 + "'", int27 == 41);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(50, 14);
        int int18 = intMath0.mod(80, (int) 'a');
        int int21 = intMath0.mod(49, 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 80 + "'", int18 == 80);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(92, 100);
        int int12 = intMath0.mod((-2), 5);
        int int15 = intMath0.mod((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 92 + "'", int9 == 92);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(0, (int) (short) 1);
        int int15 = intMath0.mod(19, 98);
        int int18 = intMath0.mod((int) ' ', 7);
        int int21 = intMath0.mod(21, 44);
        int int24 = intMath0.mod((int) (short) 1, 53);
        int int27 = intMath0.mod(46, (int) '4');
        int int30 = intMath0.mod(72, 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 46 + "'", int27 == 46);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 72 + "'", int30 == 72);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (short) 100, (int) (short) 10);
        int int24 = intMath0.mod(30, 34);
        int int27 = intMath0.mod(30, 51);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        int int33 = intMath0.mod(47, 59);
        java.lang.Class<?> wildcardClass34 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 47 + "'", int33 == 47);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((int) (short) 0, 17);
        int int21 = intMath0.mod(14, 17);
        int int24 = intMath0.mod((-3), 83);
        int int27 = intMath0.mod(1, 41);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((-8), 10);
        int int12 = intMath0.mod(64, 13);
        int int15 = intMath0.mod((-7), 19);
        int int18 = intMath0.mod(0, 18);
        int int21 = intMath0.mod(61, 73);
        int int24 = intMath0.mod(4, 45);
        int int27 = intMath0.mod(86, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 61 + "'", int21 == 61);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod((int) 'a', 11);
        int int18 = intMath0.mod((int) (short) 100, 53);
        int int21 = intMath0.mod(15, 32);
        int int24 = intMath0.mod(80, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 80 + "'", int24 == 80);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        int int21 = intMath0.mod(68, 64);
        int int24 = intMath0.mod(97, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((-1), (int) (byte) 100);
        int int18 = intMath0.mod((-1), 27);
        int int21 = intMath0.mod((int) (byte) 10, 42);
        int int24 = intMath0.mod(3, 88);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
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
        int int36 = intMath0.mod(38, 19);
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
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) '4', (int) (byte) 1);
        int int18 = intMath0.mod((-6), (int) (byte) 1);
        int int21 = intMath0.mod((int) '4', 1);
        int int24 = intMath0.mod(57, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(74, 3);
        int int15 = intMath0.mod(42, 8);
        int int18 = intMath0.mod(56, 1);
        int int21 = intMath0.mod(60, 13);
        int int24 = intMath0.mod((-6), 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 74 + "'", int24 == 74);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod((-10), 20);
        int int21 = intMath0.mod((-4), 72);
        int int24 = intMath0.mod(61, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 68 + "'", int21 == 68);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(1, 25);
        int int21 = intMath0.mod(0, 16);
        int int24 = intMath0.mod(1, 11);
        int int27 = intMath0.mod(43, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((-5), 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((-6), 95);
        int int15 = intMath0.mod(15, 13);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 89 + "'", int12 == 89);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 100, 100);
        int int12 = intMath0.mod((int) ' ', 81);
        int int15 = intMath0.mod(15, 80);
        int int18 = intMath0.mod(45, 1);
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
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(85, 38);
        int int15 = intMath0.mod((-2), 29);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27 + "'", int15 == 27);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(6, 8);
        int int18 = intMath0.mod(100, 100);
        int int21 = intMath0.mod((int) '4', 2);
        int int24 = intMath0.mod(34, 100);
        int int27 = intMath0.mod(11, 21);
        int int30 = intMath0.mod(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod(3, (int) (byte) 1);
        int int9 = intMath0.mod((-1), 3);
        int int12 = intMath0.mod(50, 35);
        int int15 = intMath0.mod((-1), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(71, 23);
        int int18 = intMath0.mod((int) (byte) 1, 48);
        int int21 = intMath0.mod(94, 18);
        int int24 = intMath0.mod((-7), 68);
        int int27 = intMath0.mod(19, 15);
        int int30 = intMath0.mod(12, 79);
        int int33 = intMath0.mod(86, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 61 + "'", int24 == 61);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        int int36 = intMath0.mod((int) ' ', 4);
        int int39 = intMath0.mod((int) (byte) 10, 58);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod(9, 3);
        int int24 = intMath0.mod(7, 99);
        int int27 = intMath0.mod((-1), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 16 + "'", int27 == 16);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod((int) 'a', 35);
        int int21 = intMath0.mod(12, 14);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus 0 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(29, 25);
        int int21 = intMath0.mod(39, 49);
        int int24 = intMath0.mod(9, 6);
        int int27 = intMath0.mod(51, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod((int) (byte) 10, 9);
        int int21 = intMath0.mod(53, 34);
        int int24 = intMath0.mod((int) (byte) 10, 17);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-100), (int) (byte) 10);
        int int9 = intMath0.mod(13, (int) (byte) 100);
        int int12 = intMath0.mod((-2), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 95 + "'", int12 == 95);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod(0, 5);
        int int9 = intMath0.mod(5, 99);
        int int12 = intMath0.mod(44, (int) 'a');
        int int15 = intMath0.mod(37, 64);
        int int18 = intMath0.mod((int) '#', 55);
        int int21 = intMath0.mod(100, (int) '4');
        int int24 = intMath0.mod(94, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 44 + "'", int12 == 44);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 48 + "'", int21 == 48);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 22 + "'", int24 == 22);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod(9, 7);
        int int18 = intMath0.mod(83, 37);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(18, (-7));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -7 must be > 0");
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
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        int int45 = intMath0.mod((-6), 87);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 81 + "'", int45 == 81);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod((int) (short) 10, 5);
        int int15 = intMath0.mod((int) (byte) 10, 4);
        int int18 = intMath0.mod(4, (int) (short) 10);
        int int21 = intMath0.mod(80, 6);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(4, 1);
        int int18 = intMath0.mod(35, (int) (byte) 10);
        int int21 = intMath0.mod(61, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod(77, 77);
        int int15 = intMath0.mod((int) 'a', 34);
        int int18 = intMath0.mod(6, 11);
        int int21 = intMath0.mod((-2), 68);
        int int24 = intMath0.mod(8, 75);
        int int27 = intMath0.mod(0, 71);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 66 + "'", int21 == 66);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(42, 24);
        int int18 = intMath0.mod(40, 50);
        int int21 = intMath0.mod(89, 59);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 40 + "'", int18 == 40);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(0, 28);
        int int18 = intMath0.mod(19, (int) (byte) 1);
        int int21 = intMath0.mod(86, 29);
        int int24 = intMath0.mod(6, 55);
        int int27 = intMath0.mod(50, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = intMath0.mod((int) (short) 1, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(94, 95);
        int int21 = intMath0.mod(4, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 94 + "'", int18 == 94);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(12, 11);
        int int27 = intMath0.mod(7, 5);
        int int30 = intMath0.mod(0, 100);
        int int33 = intMath0.mod(51, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((int) '4', 1);
        int int12 = intMath0.mod((int) (byte) 0, 32);
        int int15 = intMath0.mod(49, 39);
        int int18 = intMath0.mod(99, 21);
        int int21 = intMath0.mod(22, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
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
        int int36 = intMath0.mod(22, 24);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(51, 77);
        int int12 = intMath0.mod((int) (short) 1, 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        int int15 = intMath0.mod(7, 7);
        int int18 = intMath0.mod(66, 21);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
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
        int int30 = intMath0.mod(83, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30 + "'", int27 == 30);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) (short) -1, 6);
        int int12 = intMath0.mod(0, 30);
        int int15 = intMath0.mod(0, 74);
        int int18 = intMath0.mod(19, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((-1), 95);
        int int12 = intMath0.mod(44, 16);
        int int15 = intMath0.mod(47, 27);
        int int18 = intMath0.mod(26, 34);
        int int21 = intMath0.mod(64, 37);
        int int24 = intMath0.mod(10, 46);
        int int27 = intMath0.mod(67, 70);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 94 + "'", int9 == 94);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 67 + "'", int27 == 67);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod((-1), 19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = intMath0.mod(13, (-100));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -100 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), 4);
        int int18 = intMath0.mod(86, 99);
        int int21 = intMath0.mod(20, 39);
        int int24 = intMath0.mod(98, 34);
        int int27 = intMath0.mod(44, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 86 + "'", int18 == 86);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 44 + "'", int27 == 44);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod((int) (short) -1, 99);
        int int21 = intMath0.mod(72, 31);
        int int24 = intMath0.mod(30, 31);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(35, (int) (short) 1);
        int int18 = intMath0.mod((-2), (int) '4');
        int int21 = intMath0.mod(54, 79);
        int int24 = intMath0.mod(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-8), 87);
        int int18 = intMath0.mod(0, 12);
        int int21 = intMath0.mod(0, (int) (short) 10);
        int int24 = intMath0.mod(20, 80);
        int int27 = intMath0.mod(0, 49);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 79 + "'", int15 == 79);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(10, 52);
        int int12 = intMath0.mod(30, (int) (short) 10);
        int int15 = intMath0.mod(0, 24);
        int int18 = intMath0.mod(93, 61);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod((-4), (int) ' ');
        int int18 = intMath0.mod(46, 23);
        int int21 = intMath0.mod((-9), (int) (short) 10);
        int int24 = intMath0.mod(28, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod((-7), 95);
        int int15 = intMath0.mod((int) (short) 10, 4);
        int int18 = intMath0.mod(74, (int) '4');
        int int21 = intMath0.mod(5, 28);
        int int24 = intMath0.mod(79, 3);
        int int27 = intMath0.mod(85, (int) ' ');
        int int30 = intMath0.mod((int) (byte) 100, 49);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 88 + "'", int12 == 88);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((int) (short) 10, (int) (short) 1);
        int int6 = intMath0.mod(100, 99);
        int int9 = intMath0.mod((int) (byte) 0, (int) '#');
        int int12 = intMath0.mod(0, 95);
        int int15 = intMath0.mod(79, 10);
        int int18 = intMath0.mod(3, 91);
        int int21 = intMath0.mod(32, 98);
        int int24 = intMath0.mod(99, 32);
        int int27 = intMath0.mod(0, 94);
        int int30 = intMath0.mod(59, 93);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 59 + "'", int30 == 59);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(51, 2);
        int int15 = intMath0.mod(89, 27);
        int int18 = intMath0.mod(100, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod((-8), 9);
        int int12 = intMath0.mod((int) (short) 100, (int) (byte) 100);
        int int15 = intMath0.mod((-1), 14);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(86, (int) (short) 100);
        int int18 = intMath0.mod(39, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 86 + "'", int15 == 86);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 39 + "'", int18 == 39);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        int int33 = intMath0.mod(15, 20);
        int int36 = intMath0.mod(12, 54);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12 + "'", int36 == 12);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod(100, (int) 'a');
        int int6 = intMath0.mod((-4), 99);
        int int9 = intMath0.mod(0, 88);
        int int12 = intMath0.mod(6, 51);
        int int15 = intMath0.mod(0, 100);
        int int18 = intMath0.mod(6, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 95 + "'", int6 == 95);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(91, 12);
        int int15 = intMath0.mod(22, 1);
        int int18 = intMath0.mod(91, 18);
        int int21 = intMath0.mod(78, 24);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, 5);
        int int9 = intMath0.mod((int) (short) 10, 99);
        int int12 = intMath0.mod(27, 28);
        int int15 = intMath0.mod(54, 2);
        int int18 = intMath0.mod(2, 17);
        int int21 = intMath0.mod(26, 49);
        int int24 = intMath0.mod(94, 80);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(8, (int) '4');
        int int12 = intMath0.mod(34, 72);
        int int15 = intMath0.mod(50, 71);
        int int18 = intMath0.mod(87, 25);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 50 + "'", int15 == 50);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-100), (int) '4');
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod(5, 25);
        int int21 = intMath0.mod((int) (byte) -1, 88);
        int int24 = intMath0.mod(4, 10);
        int int27 = intMath0.mod(24, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 87 + "'", int21 == 87);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 24 + "'", int27 == 24);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod((-100), 1);
        int int12 = intMath0.mod(66, 54);
        java.lang.Class<?> wildcardClass13 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
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
        int int33 = intMath0.mod(52, 68);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(10, 26);
        int int15 = intMath0.mod(30, 60);
        int int18 = intMath0.mod((-1), 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(10, 9);
        int int9 = intMath0.mod((-100), (int) (short) 100);
        int int12 = intMath0.mod(36, 72);
        int int15 = intMath0.mod((-4), 20);
        int int18 = intMath0.mod(24, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 24 + "'", int18 == 24);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(87, 4);
        int int18 = intMath0.mod(95, 19);
        int int21 = intMath0.mod((-5), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = intMath0.mod(53, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(2, (int) (short) 100);
        int int18 = intMath0.mod((-5), 86);
        int int21 = intMath0.mod(0, 80);
        int int24 = intMath0.mod(11, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 81 + "'", int18 == 81);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(19, 4);
        int int15 = intMath0.mod(0, (int) '4');
        int int18 = intMath0.mod(25, 36);
        int int21 = intMath0.mod(21, 2);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 25 + "'", int18 == 25);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 51);
        int int18 = intMath0.mod(4, 8);
        int int21 = intMath0.mod((-100), 87);
        int int24 = intMath0.mod(12, 11);
        int int27 = intMath0.mod(7, 5);
        int int30 = intMath0.mod(36, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(41, (int) (short) 100);
        int int18 = intMath0.mod(100, 54);
        int int21 = intMath0.mod(8, 35);
        java.lang.Class<?> wildcardClass22 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 41 + "'", int15 == 41);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(3, (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) -1, 8);
        int int18 = intMath0.mod((-6), (int) (short) 10);
        int int21 = intMath0.mod((-7), 10);
        int int24 = intMath0.mod(10, 36);
        int int27 = intMath0.mod(10, 39);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
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
        int int30 = intMath0.mod((int) '#', 39);
        int int33 = intMath0.mod((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod(0, (int) '4');
        int int15 = intMath0.mod(7, 7);
        int int18 = intMath0.mod(22, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod((int) ' ', 3);
        int int12 = intMath0.mod(88, (int) '4');
        int int15 = intMath0.mod(14, 35);
        int int18 = intMath0.mod(20, 87);
        int int21 = intMath0.mod(38, 16);
        int int24 = intMath0.mod(26, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod((int) (short) 1, 28);
        int int12 = intMath0.mod(95, (int) (byte) 1);
        int int15 = intMath0.mod(0, 13);
        int int18 = intMath0.mod((-10), 20);
        int int21 = intMath0.mod(37, 79);
        int int24 = intMath0.mod((-100), 76);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        int int30 = intMath0.mod(84, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) ' ', (int) ' ');
        int int9 = intMath0.mod(48, 86);
        int int12 = intMath0.mod(31, 7);
        int int15 = intMath0.mod(74, (int) '4');
        int int18 = intMath0.mod(47, 22);
        int int21 = intMath0.mod(100, 3);
        int int24 = intMath0.mod(79, 1);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((int) (short) -1, (int) '4');
        int int12 = intMath0.mod((int) '#', (int) (byte) 100);
        int int15 = intMath0.mod((int) (byte) 10, 10);
        int int18 = intMath0.mod(79, 10);
        int int21 = intMath0.mod((int) ' ', (int) 'a');
        int int24 = intMath0.mod(100, 22);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = intMath0.mod(59, (-1));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        int int30 = intMath0.mod((int) (short) -1, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 94 + "'", int21 == 94);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 77 + "'", int27 == 77);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((-7), (int) ' ');
        int int18 = intMath0.mod((int) ' ', (int) (byte) 100);
        int int21 = intMath0.mod((int) '#', 100);
        int int24 = intMath0.mod(43, 82);
        int int27 = intMath0.mod(91, 6);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 43 + "'", int24 == 43);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        int int36 = intMath0.mod((int) '#', 78);
        java.lang.Class<?> wildcardClass37 = intMath0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((-8), 19);
        int int15 = intMath0.mod(1, 34);
        int int18 = intMath0.mod((-8), 21);
        int int21 = intMath0.mod(67, 3);
        int int24 = intMath0.mod(13, 14);
        int int27 = intMath0.mod(21, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        int int33 = intMath0.mod(0, 61);
        int int36 = intMath0.mod(1, 34);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(0, 10);
        int int9 = intMath0.mod(79, 87);
        int int12 = intMath0.mod(17, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = intMath0.mod(38, (-6));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -6 must be > 0");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 79 + "'", int9 == 79);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod(51, 10);
        int int18 = intMath0.mod(87, (int) (short) 100);
        int int21 = intMath0.mod(24, 44);
        int int24 = intMath0.mod(39, 23);
        int int27 = intMath0.mod(10, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 87 + "'", int18 == 87);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 16 + "'", int24 == 16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        int int30 = intMath0.mod(2, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 74 + "'", int21 == 74);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod(100, (int) (short) 100);
        int int9 = intMath0.mod((-9), 9);
        int int12 = intMath0.mod(25, (int) (short) 10);
        int int15 = intMath0.mod(25, 6);
        int int18 = intMath0.mod(8, 94);
        int int21 = intMath0.mod((-100), 86);
        int int24 = intMath0.mod((-2), 100);
        int int27 = intMath0.mod(12, 97);
        int int30 = intMath0.mod(50, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 72 + "'", int21 == 72);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 98 + "'", int24 == 98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 50 + "'", int30 == 50);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod(26, 100);
        int int18 = intMath0.mod(40, (int) (byte) 10);
        int int21 = intMath0.mod(27, 56);
        int int24 = intMath0.mod(76, 28);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = intMath0.mod(22, (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Modulus -3 must be > 0");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(0, 1);
        int int12 = intMath0.mod((int) (short) 10, 30);
        int int15 = intMath0.mod(38, 74);
        int int18 = intMath0.mod((int) '#', 71);
        int int21 = intMath0.mod(1, 10);
        int int24 = intMath0.mod(31, 41);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod(23, 15);
        int int15 = intMath0.mod(0, 99);
        int int18 = intMath0.mod(7, 63);
        java.lang.Class<?> wildcardClass19 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (short) 10, 8);
        int int9 = intMath0.mod(1, 100);
        int int12 = intMath0.mod(0, 100);
        int int15 = intMath0.mod((int) (short) 10, 28);
        int int18 = intMath0.mod(21, 81);
        int int21 = intMath0.mod(35, 86);
        int int24 = intMath0.mod(76, 100);
        int int27 = intMath0.mod(94, (int) (short) 10);
        int int30 = intMath0.mod(72, 29);
        java.lang.Class<?> wildcardClass31 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-3), 6);
        int int6 = intMath0.mod((int) (byte) 1, 10);
        int int9 = intMath0.mod(31, 30);
        int int12 = intMath0.mod((-9), 17);
        int int15 = intMath0.mod((int) (short) 100, 22);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-1), 100);
        int int6 = intMath0.mod((int) (byte) 0, 7);
        int int9 = intMath0.mod((int) '#', 3);
        int int12 = intMath0.mod(1, (int) '4');
        int int15 = intMath0.mod(100, 71);
        int int18 = intMath0.mod(79, 74);
        int int21 = intMath0.mod(54, 88);
        int int24 = intMath0.mod(8, 21);
        int int27 = intMath0.mod((int) (short) 100, 30);
        java.lang.Class<?> wildcardClass28 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(35, (int) (short) 1);
        int int12 = intMath0.mod(0, 22);
        int int15 = intMath0.mod(66, 42);
        java.lang.Class<?> wildcardClass16 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        int int33 = intMath0.mod(98, 8);
        int int36 = intMath0.mod((-8), 88);
        int int39 = intMath0.mod(76, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 80 + "'", int36 == 80);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(9, (int) (byte) 10);
        int int12 = intMath0.mod((-9), (int) '#');
        int int15 = intMath0.mod((int) (short) 10, (int) (byte) 100);
        int int18 = intMath0.mod(0, 83);
        int int21 = intMath0.mod(97, 52);
        int int24 = intMath0.mod((int) '#', 59);
        java.lang.Class<?> wildcardClass25 = intMath0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 45 + "'", int21 == 45);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod((-8), 5);
        int int9 = intMath0.mod(9, 3);
        int int12 = intMath0.mod(23, 15);
        int int15 = intMath0.mod(15, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        math.IntMath intMath0 = new math.IntMath();
        int int3 = intMath0.mod((-100), 3);
        int int6 = intMath0.mod(0, 1);
        int int9 = intMath0.mod(0, 100);
        int int12 = intMath0.mod(18, 36);
        int int15 = intMath0.mod(25, 43);
        int int18 = intMath0.mod((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 18 + "'", int12 == 18);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 25 + "'", int15 == 25);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

