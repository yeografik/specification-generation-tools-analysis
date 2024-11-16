package examples;

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
        int int34 = simpleMethods0.abs((-100));
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int28 = simpleMethods0.abs(97);
        int int30 = simpleMethods0.abs((-10));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
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
        int int28 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        int int20 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int22 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs(3);
        int int24 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        int int20 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        int int24 = simpleMethods0.abs((-2));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        int int20 = simpleMethods0.abs((int) (byte) 1);
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
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        int int20 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        int int34 = simpleMethods0.abs((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        int int24 = simpleMethods0.abs((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        int int8 = simpleMethods0.abs(7);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        int int20 = simpleMethods0.abs((-4));
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
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int28 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(4);
        int int8 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        int int22 = simpleMethods0.abs(2);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        int int22 = simpleMethods0.abs((int) '#');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        int int20 = simpleMethods0.abs((int) '#');
        int int22 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        int int24 = simpleMethods0.abs((int) (short) 0);
        int int26 = simpleMethods0.abs(32);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(7);
        int int20 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (short) 1);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-1));
        int int20 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        int int20 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-100));
        int int12 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs((int) (short) -1);
        int int16 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        int int28 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        int int22 = simpleMethods0.abs(4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) '#');
        int int18 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) 'a');
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(8);
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (short) 100);
        int int20 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-6));
        int int18 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        int int20 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((-10));
        int int18 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((int) '4');
        int int12 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (short) -1);
        int int12 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        int int22 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        int int22 = simpleMethods0.abs((-8));
        int int24 = simpleMethods0.abs((-3));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(7);
        int int18 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(10);
        int int20 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        int int20 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((int) (short) -1);
        int int20 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-8));
        int int18 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(7);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        int int26 = simpleMethods0.abs(0);
        int int28 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass29 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(35);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        int int22 = simpleMethods0.abs((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        int int20 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        int int8 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        int int20 = simpleMethods0.abs(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        int int28 = simpleMethods0.abs((-1));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((int) (short) 10);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        int int20 = simpleMethods0.abs((int) ' ');
        int int22 = simpleMethods0.abs((int) (short) -1);
        int int24 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(4);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) (short) 0);
        int int20 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        int int20 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        int int22 = simpleMethods0.abs((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
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
        int int28 = simpleMethods0.abs((-6));
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        int int20 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        int int20 = simpleMethods0.abs((-7));
        int int22 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 1);
        int int14 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        int int26 = simpleMethods0.abs((-9));
        int int28 = simpleMethods0.abs(10);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(35);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        int int24 = simpleMethods0.abs((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        int int20 = simpleMethods0.abs((-10));
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
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs(52);
        int int18 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-10));
        int int16 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        int int20 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        int int24 = simpleMethods0.abs((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (short) 100);
        int int8 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
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
        int int22 = simpleMethods0.abs(0);
        int int24 = simpleMethods0.abs((-2));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        int int20 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        int int22 = simpleMethods0.abs((-5));
        int int24 = simpleMethods0.abs((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs(3);
        int int10 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        int int22 = simpleMethods0.abs(1);
        int int24 = simpleMethods0.abs((-2));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-5));
        int int8 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((int) (short) 0);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
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
        int int22 = simpleMethods0.abs((-7));
        int int24 = simpleMethods0.abs(32);
        int int26 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        int int26 = simpleMethods0.abs((int) '#');
        int int28 = simpleMethods0.abs((int) (byte) 10);
        int int30 = simpleMethods0.abs((-3));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
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
        int int24 = simpleMethods0.abs((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs((int) '#');
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        int int22 = simpleMethods0.abs((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((-5));
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        int int20 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        int int24 = simpleMethods0.abs(10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) ' ');
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        int int22 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) ' ');
        int int16 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        int int30 = simpleMethods0.abs(35);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        int int22 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        int int22 = simpleMethods0.abs(97);
        int int24 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (short) 1);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int int20 = simpleMethods0.abs(10);
        int int22 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs((int) (short) 10);
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        int int24 = simpleMethods0.abs(1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        int int30 = simpleMethods0.abs(6);
        int int32 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass33 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        int int22 = simpleMethods0.abs(52);
        int int24 = simpleMethods0.abs(32);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        int int22 = simpleMethods0.abs(8);
        int int24 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        int int20 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs((int) (short) 0);
        int int22 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        int int20 = simpleMethods0.abs((-10));
        int int22 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs(4);
        int int22 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-6));
        int int18 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        int int10 = simpleMethods0.abs((int) (short) 0);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(32);
        int int20 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        int int22 = simpleMethods0.abs(4);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs((-2));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs(2);
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        int int20 = simpleMethods0.abs((int) ' ');
        int int22 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        int int22 = simpleMethods0.abs(2);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        int int20 = simpleMethods0.abs((-100));
        int int22 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int22 = simpleMethods0.abs((int) '4');
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        int int20 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        int int20 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        int int24 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) -1);
        int int18 = simpleMethods0.abs((-10));
        int int20 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(7);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((-5));
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs((-2));
        int int18 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs((int) (short) 0);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-4));
        int int18 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) '4');
        int int8 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((-3));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (short) 10);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        int int22 = simpleMethods0.abs(5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(3);
        int int8 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        int int8 = simpleMethods0.abs(7);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
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
        int int24 = simpleMethods0.abs((-2));
        int int26 = simpleMethods0.abs((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
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
        int int20 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (byte) 10);
        int int18 = simpleMethods0.abs((-5));
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(1);
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((int) ' ');
        int int18 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        int int22 = simpleMethods0.abs((int) (short) 1);
        int int24 = simpleMethods0.abs(8);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        int int26 = simpleMethods0.abs(8);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((-3));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(0);
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
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(7);
        int int4 = simpleMethods0.abs(8);
        int int6 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        int int22 = simpleMethods0.abs(100);
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
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((int) '4');
        int int16 = simpleMethods0.abs((-8));
        int int18 = simpleMethods0.abs((-5));
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        int int22 = simpleMethods0.abs(100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(6);
        int int14 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
        int int20 = simpleMethods0.abs((int) (byte) 0);
        int int22 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(8);
        int int18 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs((-9));
        int int20 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
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
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        int int22 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        int int28 = simpleMethods0.abs(100);
        int int30 = simpleMethods0.abs((int) (short) -1);
        int int32 = simpleMethods0.abs(1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
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
        int int20 = simpleMethods0.abs((-7));
        int int22 = simpleMethods0.abs(10);
        int int24 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        int int14 = simpleMethods0.abs((int) 'a');
        int int16 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-10));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(6);
        int int10 = simpleMethods0.abs((int) (short) 100);
        int int12 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        int int20 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        int int22 = simpleMethods0.abs((-7));
        int int24 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        int int20 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        int int26 = simpleMethods0.abs(8);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        int int8 = simpleMethods0.abs(7);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(52);
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(1);
        int int18 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) '4');
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(4);
        int int20 = simpleMethods0.abs((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        int int20 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (short) 0);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (short) 100);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((-6));
        int int16 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        int int20 = simpleMethods0.abs((int) (byte) 10);
        int int22 = simpleMethods0.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        int int24 = simpleMethods0.abs((int) (short) 10);
        int int26 = simpleMethods0.abs((-2));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        int int22 = simpleMethods0.abs((-10));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        int int20 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((-2));
        int int16 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(32);
        int int8 = simpleMethods0.abs(7);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(100);
        int int18 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(3);
        int int20 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        int int22 = simpleMethods0.abs(1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
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
        int int26 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        int int22 = simpleMethods0.abs(8);
        int int24 = simpleMethods0.abs(7);
        int int26 = simpleMethods0.abs((-100));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
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
        int int22 = simpleMethods0.abs(97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
        int int20 = simpleMethods0.abs(9);
        int int22 = simpleMethods0.abs(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
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
        int int20 = simpleMethods0.abs(7);
        int int22 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(3);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((int) '4');
        int int18 = simpleMethods0.abs(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        int int22 = simpleMethods0.abs(7);
        int int24 = simpleMethods0.abs(0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
        int int20 = simpleMethods0.abs(1);
        int int22 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs((int) (byte) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-100));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((int) (short) 0);
        int int14 = simpleMethods0.abs((int) (short) 10);
        int int16 = simpleMethods0.abs((-7));
        int int18 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
        int int22 = simpleMethods0.abs(8);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        int int28 = simpleMethods0.abs((-100));
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((int) '#');
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((-1));
        int int12 = simpleMethods0.abs(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((-9));
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
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
        int int22 = simpleMethods0.abs(100);
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass27 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        int int22 = simpleMethods0.abs((-3));
        int int24 = simpleMethods0.abs((-4));
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-3));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(35);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '#');
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(32);
        int int16 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs((int) (byte) 1);
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
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs(10);
        int int12 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        int int24 = simpleMethods0.abs((-100));
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(100);
        int int14 = simpleMethods0.abs((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        int int24 = simpleMethods0.abs(2);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        int int20 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((int) (short) 100);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((-1));
        int int18 = simpleMethods0.abs(2);
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        int int22 = simpleMethods0.abs(32);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-2));
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((-8));
        int int14 = simpleMethods0.abs(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        int int22 = simpleMethods0.abs((int) ' ');
        int int24 = simpleMethods0.abs(1);
        int int26 = simpleMethods0.abs(0);
        int int28 = simpleMethods0.abs(9);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        int int24 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(3);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (short) 1);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        int int18 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        int int28 = simpleMethods0.abs(0);
        int int30 = simpleMethods0.abs(1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (byte) 0);
        int int18 = simpleMethods0.abs((int) (byte) -1);
        int int20 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
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
        int int24 = simpleMethods0.abs((-9));
        int int26 = simpleMethods0.abs((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(97);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs((-10));
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(5);
        int int20 = simpleMethods0.abs(0);
        int int22 = simpleMethods0.abs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs((int) '#');
        int int18 = simpleMethods0.abs((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
        int int20 = simpleMethods0.abs((-1));
        int int22 = simpleMethods0.abs((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((-100));
        int int20 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        int int22 = simpleMethods0.abs(52);
        int int24 = simpleMethods0.abs(5);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }
}

