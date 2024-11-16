package examples;

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
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((-8));
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(3);
        int int22 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((int) (short) 0);
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs((int) (short) 1);
        int int30 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs(3);
        int int20 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) '#');
        int int18 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(1);
        int int24 = simpleMethods0.abs((-9));
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs((int) (short) 0);
        int int30 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs((int) (byte) 100);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs((-100));
        int int24 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs(32);
        int int22 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs((-8));
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) ' ');
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((int) '4');
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs((int) (short) 100);
        int int26 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(32);
        int int20 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(2);
        int int22 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs((-6));
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) 'a');
        int int24 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs((int) (byte) 1);
        int int10 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs((int) (short) 0);
        int int22 = simpleMethods0.abs(97);
        int int24 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs((int) (byte) 1);
        int int24 = simpleMethods0.abs(8);
        int int26 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-8));
        int int16 = simpleMethods0.abs(35);
        int int18 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs(3);
        int int10 = simpleMethods0.abs(9);
        int int12 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((int) '4');
        int int28 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs((int) (byte) 10);
        int int22 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((-8));
        int int18 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(4);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((int) (byte) 10);
        int int20 = simpleMethods0.abs((-6));
        int int22 = simpleMethods0.abs(4);
        int int24 = simpleMethods0.abs(2);
        int int26 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(32);
        int int22 = simpleMethods0.abs((int) (byte) 100);
        int int24 = simpleMethods0.abs((-7));
        int int26 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((-7));
        int int24 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs((int) (short) 100);
        int int20 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs((-5));
        int int20 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) ' ');
        int int10 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(4);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((-8));
        int int24 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(3);
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs(52);
        int int26 = simpleMethods0.abs((int) (byte) 10);
        int int28 = simpleMethods0.abs(1);
        int int30 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs((-100));
        int int24 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs((int) (byte) 1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-9));
        int int20 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) 0);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs((-3));
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-9));
        int int20 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((-8));
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(1);
        int int10 = simpleMethods0.abs((int) (short) 100);
        int int12 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((int) '4');
        int int20 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs(5);
        int int26 = simpleMethods0.abs((int) (short) 1);
        int int28 = simpleMethods0.abs((int) (short) 10);
        int int30 = simpleMethods0.abs(7);
        int int32 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((int) ' ');
        int int24 = simpleMethods0.abs((int) (short) -1);
        int int26 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((-10));
        int int24 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((int) '4');
        int int20 = simpleMethods0.abs(3);
        int int22 = simpleMethods0.abs(52);
        int int24 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs(35);
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((int) '4');
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs(100);
        int int26 = simpleMethods0.abs((int) (short) 0);
        int int28 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs(35);
        int int22 = simpleMethods0.abs((int) (byte) 10);
        int int24 = simpleMethods0.abs(6);
        int int26 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(5);
        int int18 = simpleMethods0.abs((int) (byte) 0);
        int int20 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((-6));
        int int20 = simpleMethods0.abs(2);
        int int22 = simpleMethods0.abs((-9));
        int int24 = simpleMethods0.abs((int) (short) 0);
        int int26 = simpleMethods0.abs(1);
        int int28 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs(100);
        int int20 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(9);
        int int12 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs(8);
        int int22 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((-10));
        int int18 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) 0);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs(8);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs((-3));
        int int22 = simpleMethods0.abs((int) ' ');
        int int24 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((-10));
        int int24 = simpleMethods0.abs((int) '4');
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(52);
        int int22 = simpleMethods0.abs(2);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(9);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (short) 100);
        int int24 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-5));
        int int22 = simpleMethods0.abs((int) '4');
        int int24 = simpleMethods0.abs((-6));
        int int26 = simpleMethods0.abs((-9));
        int int28 = simpleMethods0.abs((-100));
        int int30 = simpleMethods0.abs((-3));
        int int32 = simpleMethods0.abs((-7));
        int int34 = simpleMethods0.abs(0);
        int int36 = simpleMethods0.abs((-1));
        int int38 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass39 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs((int) (short) 100);
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(5);
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) -1);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-4));
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((int) (short) 0);
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs((int) (byte) -1);
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-5));
        int int22 = simpleMethods0.abs((int) '4');
        int int24 = simpleMethods0.abs((-6));
        int int26 = simpleMethods0.abs((-9));
        int int28 = simpleMethods0.abs((-100));
        int int30 = simpleMethods0.abs((-3));
        int int32 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass33 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) -1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) (short) 10);
        int int10 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((int) (byte) 10);
        int int20 = simpleMethods0.abs((-6));
        int int22 = simpleMethods0.abs(4);
        int int24 = simpleMethods0.abs(4);
        int int26 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs(10);
        int int24 = simpleMethods0.abs((-10));
        int int26 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs(52);
        int int22 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs((-6));
        int int20 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((int) (short) 0);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs((-100));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(35);
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs(1);
        int int24 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((-6));
        int int20 = simpleMethods0.abs(2);
        int int22 = simpleMethods0.abs((int) (byte) 10);
        int int24 = simpleMethods0.abs(8);
        int int26 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs((int) (byte) 1);
        int int26 = simpleMethods0.abs((-8));
        int int28 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs(52);
        int int22 = simpleMethods0.abs(10);
        int int24 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) (short) 100);
        int int20 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (short) 10);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(32);
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((-3));
        int int20 = simpleMethods0.abs((int) (byte) -1);
        int int22 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs(9);
        int int24 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(3);
        int int22 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs(6);
        int int18 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(9);
        int int12 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) 'a');
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((int) (short) 100);
        int int26 = simpleMethods0.abs((-7));
        int int28 = simpleMethods0.abs(6);
        int int30 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs(35);
        int int24 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs((-7));
        int int8 = simpleMethods0.abs((-5));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((-10));
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((int) 'a');
        int int22 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(2);
        int int18 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(32);
        int int22 = simpleMethods0.abs(2);
        int int24 = simpleMethods0.abs((-1));
        int int26 = simpleMethods0.abs((int) (byte) 100);
        int int28 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((int) '#');
        int int18 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(35);
        int int22 = simpleMethods0.abs((int) (short) 1);
        int int24 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(8);
        int int22 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) '#');
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs((int) '#');
        int int26 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs((int) '#');
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs((-3));
        int int10 = simpleMethods0.abs(9);
        int int12 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(100);
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((int) (short) 10);
        int int10 = simpleMethods0.abs((-7));
        int int12 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs(2);
        int int24 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs((-7));
        int int22 = simpleMethods0.abs((int) ' ');
        int int24 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(8);
        int int22 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs(52);
        int int20 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs((int) (byte) 10);
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) ' ');
        int int10 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs((int) (short) 100);
        int int22 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs(9);
        int int24 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs((-7));
        int int8 = simpleMethods0.abs((-5));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs((int) (short) 100);
        int int20 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-10));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) '#');
        int int20 = simpleMethods0.abs((int) (byte) 1);
        int int22 = simpleMethods0.abs((-10));
        int int24 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-5));
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs(52);
        int int26 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs((-6));
        int int22 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs(5);
        int int18 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs((int) (short) 0);
        int int22 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs(8);
        int int10 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-7));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(52);
        int int20 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs(6);
        int int22 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((int) (byte) 100);
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs(8);
        int int24 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(100);
        int int24 = simpleMethods0.abs((int) (short) -1);
        int int26 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((-7));
        int int24 = simpleMethods0.abs(8);
        int int26 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(9);
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((int) '4');
        int int20 = simpleMethods0.abs((int) '#');
        int int22 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(52);
        int int22 = simpleMethods0.abs(2);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs(52);
        int int26 = simpleMethods0.abs((int) (byte) 10);
        int int28 = simpleMethods0.abs(1);
        int int30 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-5));
        int int22 = simpleMethods0.abs((int) '4');
        int int24 = simpleMethods0.abs((-6));
        int int26 = simpleMethods0.abs((-9));
        int int28 = simpleMethods0.abs((-100));
        int int30 = simpleMethods0.abs(0);
        int int32 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs((-100));
        int int24 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) 'a');
        int int24 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((int) (short) 10);
        int int10 = simpleMethods0.abs((-7));
        int int12 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs(3);
        int int22 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs((int) (short) 10);
        int int22 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs(35);
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 100);
        int int20 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs(5);
        int int26 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs(5);
        int int26 = simpleMethods0.abs((int) (short) 1);
        int int28 = simpleMethods0.abs((int) (short) 10);
        int int30 = simpleMethods0.abs(5);
        int int32 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (short) 100);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) (byte) 10);
        int int20 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((int) (byte) 0);
        int int20 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(3);
        int int20 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) '4');
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs(52);
        int int20 = simpleMethods0.abs((int) (short) 100);
        int int22 = simpleMethods0.abs(9);
        int int24 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs(52);
        int int26 = simpleMethods0.abs((-1));
        int int28 = simpleMethods0.abs(0);
        int int30 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs(5);
        int int26 = simpleMethods0.abs((int) (short) 1);
        int int28 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs((int) (byte) 100);
        int int24 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs(10);
        int int24 = simpleMethods0.abs((-10));
        int int26 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs(8);
        int int22 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) '4');
        int int22 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(52);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs((int) '4');
        int int26 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(2);
        int int18 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs((int) (byte) 1);
        int int26 = simpleMethods0.abs((-8));
        int int28 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((-6));
        int int24 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs((int) (byte) 100);
        int int24 = simpleMethods0.abs(7);
        int int26 = simpleMethods0.abs((int) '#');
        int int28 = simpleMethods0.abs(0);
        int int30 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(8);
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(35);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 0);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs((int) (byte) 100);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((-10));
        int int28 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs(0);
        int int26 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs((int) 'a');
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((int) (byte) 10);
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-10));
        int int18 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-5));
        int int22 = simpleMethods0.abs((int) '4');
        int int24 = simpleMethods0.abs((-6));
        int int26 = simpleMethods0.abs((-9));
        int int28 = simpleMethods0.abs((-100));
        int int30 = simpleMethods0.abs((-3));
        int int32 = simpleMethods0.abs((-7));
        int int34 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass35 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) '4');
        int int20 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) '#');
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs((int) (short) -1);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((int) ' ');
        int int24 = simpleMethods0.abs((int) (short) -1);
        int int26 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) -1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs((-6));
        int int18 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (short) 1);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((-100));
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs(6);
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((int) (short) 100);
        int int18 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((int) (short) 10);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(10);
        int int24 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-100));
        int int18 = simpleMethods0.abs(35);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-7));
        int int20 = simpleMethods0.abs((int) (short) 0);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs(7);
        int int26 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(52);
        int int22 = simpleMethods0.abs(32);
        int int24 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs((-6));
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-7));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs(10);
        int int24 = simpleMethods0.abs((int) '#');
        int int26 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((-4));
        int int22 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((int) '4');
        int int20 = simpleMethods0.abs(3);
        int int22 = simpleMethods0.abs(9);
        int int24 = simpleMethods0.abs((int) (short) 100);
        int int26 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) -1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs(3);
        int int24 = simpleMethods0.abs(0);
        int int26 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(3);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(3);
        int int20 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs((-3));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) '#');
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs((-10));
        int int24 = simpleMethods0.abs(100);
        int int26 = simpleMethods0.abs((int) (short) -1);
        int int28 = simpleMethods0.abs((int) 'a');
        int int30 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(5);
        int int22 = simpleMethods0.abs((-8));
        int int24 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) 0);
        int int20 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((int) (short) 0);
        int int26 = simpleMethods0.abs((int) ' ');
        int int28 = simpleMethods0.abs((-5));
        int int30 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs((-100));
        int int24 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(2);
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) (byte) 100);
        int int22 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((int) (byte) 100);
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs((int) 'a');
        int int24 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((-2));
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (short) -1);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs((int) '4');
        int int22 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs((-1));
        int int24 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }
}

