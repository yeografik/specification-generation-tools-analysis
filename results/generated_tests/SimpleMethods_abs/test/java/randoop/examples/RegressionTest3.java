package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        int int26 = simpleMethods0.abs(4);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(4);
        int int8 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        int int20 = simpleMethods0.abs(5);
        int int22 = simpleMethods0.abs((-4));
        int int24 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        int int20 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs((int) 'a');
        int int24 = simpleMethods0.abs(100);
        int int26 = simpleMethods0.abs(8);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        int int24 = simpleMethods0.abs(2);
        int int26 = simpleMethods0.abs(5);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-9));
        int int12 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        int int20 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((-6));
        int int20 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs((-4));
        int int26 = simpleMethods0.abs((-1));
        int int28 = simpleMethods0.abs((int) 'a');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs((int) (byte) 10);
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-4));
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-8));
        int int16 = simpleMethods0.abs(35);
        int int18 = simpleMethods0.abs(9);
        int int20 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        int int22 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-8));
        int int18 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-100));
        int int12 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs((int) '4');
        int int22 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(35);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs((int) (byte) 100);
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        int int20 = simpleMethods0.abs((-10));
        int int22 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) ' ');
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs(9);
        int int20 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        int int22 = simpleMethods0.abs((-7));
        int int24 = simpleMethods0.abs((-100));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs((-10));
        int int22 = simpleMethods0.abs(100);
        int int24 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs((-9));
        int int24 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) 0);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-8));
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        int int24 = simpleMethods0.abs((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        int int26 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs((-4));
        int int26 = simpleMethods0.abs((-1));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        int int20 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-4));
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((-3));
        int int14 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs(35);
        int int20 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs(32);
        int int20 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        int int24 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (short) 1);
        int int14 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        int int20 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) (byte) 10);
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        int int24 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        int int22 = simpleMethods0.abs(2);
        int int24 = simpleMethods0.abs(4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        int int20 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        int int24 = simpleMethods0.abs((-8));
        int int26 = simpleMethods0.abs(6);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        int int26 = simpleMethods0.abs((-6));
        int int28 = simpleMethods0.abs(1);
        int int30 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((-4));
        int int20 = simpleMethods0.abs((-8));
        int int22 = simpleMethods0.abs((int) (byte) 10);
        int int24 = simpleMethods0.abs((-6));
        int int26 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        int int20 = simpleMethods0.abs((int) (short) 0);
        int int22 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        int int20 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((-1));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-7));
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        int int20 = simpleMethods0.abs((int) (short) -1);
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
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        int int20 = simpleMethods0.abs((int) 'a');
        int int22 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs((-5));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        int int22 = simpleMethods0.abs((int) (byte) 1);
        int int24 = simpleMethods0.abs((int) (short) 10);
        int int26 = simpleMethods0.abs((-9));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((int) ' ');
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        int int20 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-8));
        int int18 = simpleMethods0.abs(100);
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        int int22 = simpleMethods0.abs((int) (byte) 100);
        int int24 = simpleMethods0.abs((-2));
        int int26 = simpleMethods0.abs(100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        int int22 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) ' ');
        int int6 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        int int20 = simpleMethods0.abs(2);
        int int22 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 1);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs((-9));
        int int20 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((int) '#');
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        int int20 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-7));
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        int int20 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        int int20 = simpleMethods0.abs((-10));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        int int22 = simpleMethods0.abs((int) (short) 1);
        int int24 = simpleMethods0.abs((-9));
        int int26 = simpleMethods0.abs((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        int int26 = simpleMethods0.abs((-4));
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        int int20 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((int) (short) 0);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-9));
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        int int20 = simpleMethods0.abs((-4));
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        int int24 = simpleMethods0.abs(100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        int int24 = simpleMethods0.abs((-7));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (short) 10);
        int int16 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        int int22 = simpleMethods0.abs(32);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        int int28 = simpleMethods0.abs((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        int int20 = simpleMethods0.abs(100);
        int int22 = simpleMethods0.abs((int) 'a');
        int int24 = simpleMethods0.abs((int) '#');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(32);
        int int20 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-7));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs((int) (byte) 10);
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
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (short) 0);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) ' ');
        int int6 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((-8));
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(8);
        int int20 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        int int24 = simpleMethods0.abs((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        int int30 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs(9);
        int int20 = simpleMethods0.abs((-8));
        int int22 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        int int20 = simpleMethods0.abs((int) ' ');
        int int22 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs((-4));
        int int22 = simpleMethods0.abs(100);
        int int24 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((-10));
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        int int24 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        int int20 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs(8);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        int int20 = simpleMethods0.abs((int) (byte) 10);
        int int22 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(6);
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-10));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-4));
        int int20 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-9));
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (byte) 10);
        int int6 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) '#');
        int int18 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(35);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        int int20 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        int int22 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs((-4));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(5);
        int int22 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        int int22 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        int int22 = simpleMethods0.abs((-7));
        int int24 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-4));
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(8);
        int int10 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        int int20 = simpleMethods0.abs(1);
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
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        int int20 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        int int28 = simpleMethods0.abs((int) (short) 1);
        int int30 = simpleMethods0.abs(3);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        int int22 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((-4));
        int int20 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        int int20 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
        int int24 = simpleMethods0.abs(1);
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
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
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
        int int22 = simpleMethods0.abs((int) (byte) 1);
        int int24 = simpleMethods0.abs(52);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        int int20 = simpleMethods0.abs((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        int int22 = simpleMethods0.abs(5);
        int int24 = simpleMethods0.abs(1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (byte) 10);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs((-7));
        int int8 = simpleMethods0.abs((-5));
        int int10 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        int int8 = simpleMethods0.abs(7);
        int int10 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        int int20 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(100);
        int int4 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(35);
        int int16 = simpleMethods0.abs((-10));
        int int18 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(8);
        int int10 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        int int24 = simpleMethods0.abs((-10));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((-8));
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-3));
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        int int22 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        int int22 = simpleMethods0.abs(10);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        int int20 = simpleMethods0.abs((int) (short) 10);
        int int22 = simpleMethods0.abs(3);
        int int24 = simpleMethods0.abs(0);
        int int26 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) (byte) 100);
        int int18 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        int int20 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((-8));
        int int20 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-4));
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((-4));
        int int20 = simpleMethods0.abs((-8));
        int int22 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((int) (short) 100);
        int int22 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        int int20 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((int) (short) 100);
        int int22 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((-9));
        int int20 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        int int24 = simpleMethods0.abs(9);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        int int16 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs((int) (short) 1);
        int int22 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs(2);
        int int20 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        int int20 = simpleMethods0.abs((-10));
        int int22 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        int int20 = simpleMethods0.abs((-9));
        int int22 = simpleMethods0.abs(1);
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        int int22 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs((-7));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs(97);
        int int20 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        int int26 = simpleMethods0.abs((-7));
        int int28 = simpleMethods0.abs((int) '4');
        int int30 = simpleMethods0.abs((-6));
        int int32 = simpleMethods0.abs((-5));
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((-10));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        int int22 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        int int20 = simpleMethods0.abs((int) (byte) 1);
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
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        int int22 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(3);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(4);
        int int20 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        int int22 = simpleMethods0.abs(4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        int int20 = simpleMethods0.abs(35);
        int int22 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        int int20 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        int int22 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(8);
        int int24 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        int int22 = simpleMethods0.abs((-1));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs(8);
        int int24 = simpleMethods0.abs(100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs(3);
        int int20 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        int int24 = simpleMethods0.abs((int) 'a');
        int int26 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        int int22 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        int int24 = simpleMethods0.abs((int) (short) 100);
        int int26 = simpleMethods0.abs(52);
        int int28 = simpleMethods0.abs(1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(3);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(35);
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-9));
        int int22 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(35);
        int int20 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        int int22 = simpleMethods0.abs(97);
        int int24 = simpleMethods0.abs((-5));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        int int20 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        int int22 = simpleMethods0.abs(1);
        int int24 = simpleMethods0.abs((-10));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        int int24 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((-3));
        int int14 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((int) (short) 1);
        int int20 = simpleMethods0.abs((int) '#');
        int int22 = simpleMethods0.abs(3);
        int int24 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((int) (short) 1);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        int int26 = simpleMethods0.abs((-6));
        int int28 = simpleMethods0.abs(1);
        int int30 = simpleMethods0.abs(8);
        int int32 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass33 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs((int) (byte) 100);
        int int20 = simpleMethods0.abs((-7));
        int int22 = simpleMethods0.abs((int) (byte) 0);
        int int24 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        int int20 = simpleMethods0.abs(32);
        int int22 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs(6);
        int int20 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs(4);
        int int20 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-10));
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        int int20 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs(35);
        int int22 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        int int20 = simpleMethods0.abs(97);
        int int22 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-7));
        int int8 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        int int26 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs(97);
        int int22 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs(0);
        int int20 = simpleMethods0.abs((-10));
        int int22 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
        int int26 = simpleMethods0.abs((-7));
        int int28 = simpleMethods0.abs((int) '4');
        int int30 = simpleMethods0.abs((int) '#');
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }
}

