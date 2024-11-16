package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Class<?> wildcardClass1 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((int) (byte) -1);
        int int8 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        int int10 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(3);
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        int int16 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        int int20 = simpleMethods0.abs((int) ' ');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        int int22 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        int int16 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) ' ');
        int int14 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        int int20 = simpleMethods0.abs((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (short) 10);
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((int) 'a');
        int int12 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs(2);
        int int16 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) 100);
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((-10));
        int int10 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((int) (short) 10);
        int int14 = simpleMethods0.abs(35);
        int int16 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(35);
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(97);
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((int) 'a');
        int int6 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs(97);
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(9);
        int int16 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(2);
        int int12 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(9);
        int int14 = simpleMethods0.abs((int) '#');
        int int16 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(8);
        int int16 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs(100);
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs((-10));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(2);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(4);
        int int18 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(32);
        int int14 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs((int) (short) -1);
        int int14 = simpleMethods0.abs(1);
        int int16 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((int) (byte) -1);
        int int14 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(32);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(9);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-5));
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(7);
        int int12 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((-5));
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs((-6));
        int int12 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        int int22 = simpleMethods0.abs((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(1);
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs((int) (byte) 0);
        int int12 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs((int) '4');
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-7));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(10);
        int int16 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((int) '4');
        int int10 = simpleMethods0.abs((-5));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-1));
        int int16 = simpleMethods0.abs(32);
        int int18 = simpleMethods0.abs((-2));
        int int20 = simpleMethods0.abs((-6));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-5));
        int int10 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs((int) '#');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        int int12 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 100);
        int int14 = simpleMethods0.abs((int) (byte) 1);
        int int16 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-2));
        int int14 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs(7);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs((int) (byte) 0);
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs(4);
        int int14 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs(35);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((-8));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        int int22 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(100);
        int int10 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((int) ' ');
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-2));
        int int10 = simpleMethods0.abs((-8));
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((int) (byte) -1);
        int int16 = simpleMethods0.abs((int) 'a');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(3);
        int int6 = simpleMethods0.abs((-2));
        int int8 = simpleMethods0.abs((int) (byte) 10);
        int int10 = simpleMethods0.abs((int) (byte) 1);
        int int12 = simpleMethods0.abs(97);
        int int14 = simpleMethods0.abs(5);
        int int16 = simpleMethods0.abs((-2));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs((-9));
        int int10 = simpleMethods0.abs(5);
        int int12 = simpleMethods0.abs(2);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((-1));
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(0);
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs(3);
        int int16 = simpleMethods0.abs(4);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((int) (byte) 1);
        int int14 = simpleMethods0.abs(97);
        int int16 = simpleMethods0.abs(0);
        int int18 = simpleMethods0.abs((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(97);
        int int12 = simpleMethods0.abs((-9));
        int int14 = simpleMethods0.abs(7);
        int int16 = simpleMethods0.abs(3);
        int int18 = simpleMethods0.abs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((-7));
        int int14 = simpleMethods0.abs(8);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs((-6));
        int int14 = simpleMethods0.abs((-100));
        int int16 = simpleMethods0.abs((int) (short) 0);
        int int18 = simpleMethods0.abs((-5));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((int) (short) 100);
        int int16 = simpleMethods0.abs(9);
        int int18 = simpleMethods0.abs((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-1));
        int int6 = simpleMethods0.abs((int) (short) -1);
        int int8 = simpleMethods0.abs(1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        int int20 = simpleMethods0.abs((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs((-9));
        int int16 = simpleMethods0.abs((int) (byte) 1);
        int int18 = simpleMethods0.abs(100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs((-10));
        int int12 = simpleMethods0.abs(8);
        int int14 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) '#');
        int int12 = simpleMethods0.abs(10);
        int int14 = simpleMethods0.abs(6);
        int int16 = simpleMethods0.abs((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) (short) 100);
        int int10 = simpleMethods0.abs(8);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs((-6));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (byte) -1);
        int int12 = simpleMethods0.abs((int) 'a');
        int int14 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(5);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs((-1));
        int int10 = simpleMethods0.abs(4);
        int int12 = simpleMethods0.abs((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(10);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (short) 10);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-100));
        int int14 = simpleMethods0.abs(52);
        int int16 = simpleMethods0.abs(10);
        int int18 = simpleMethods0.abs(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(6);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(0);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-4));
        int int14 = simpleMethods0.abs(100);
        int int16 = simpleMethods0.abs((-3));
        int int18 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        int int20 = simpleMethods0.abs(5);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs(3);
        int int12 = simpleMethods0.abs(1);
        int int14 = simpleMethods0.abs((-1));
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((int) (byte) 10);
        int int8 = simpleMethods0.abs((int) (short) 1);
        int int10 = simpleMethods0.abs(1);
        int int12 = simpleMethods0.abs((-1));
        int int14 = simpleMethods0.abs((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((-100));
        int int10 = simpleMethods0.abs((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(5);
        int int14 = simpleMethods0.abs((-9));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(97);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-8));
        int int10 = simpleMethods0.abs(32);
        int int12 = simpleMethods0.abs(52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-6));
        int int8 = simpleMethods0.abs((-3));
        int int10 = simpleMethods0.abs(10);
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(10);
        int int10 = simpleMethods0.abs((-3));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-4));
        java.lang.Class<?> wildcardClass3 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.Class<?> wildcardClass23 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-9));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs((-5));
        int int4 = simpleMethods0.abs((int) (short) -1);
        int int6 = simpleMethods0.abs((-3));
        int int8 = simpleMethods0.abs(3);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs((-6));
        int int6 = simpleMethods0.abs(7);
        int int8 = simpleMethods0.abs(5);
        int int10 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs(6);
        int int6 = simpleMethods0.abs(100);
        int int8 = simpleMethods0.abs(0);
        java.lang.Class<?> wildcardClass9 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs((-9));
        int int8 = simpleMethods0.abs(9);
        int int10 = simpleMethods0.abs((int) (byte) 100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-4));
        int int16 = simpleMethods0.abs((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(0);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs(35);
        int int10 = simpleMethods0.abs(100);
        int int12 = simpleMethods0.abs(0);
        int int14 = simpleMethods0.abs((-3));
        int int16 = simpleMethods0.abs((int) ' ');
        java.lang.Class<?> wildcardClass17 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(1);
        int int4 = simpleMethods0.abs(1);
        int int6 = simpleMethods0.abs(8);
        int int8 = simpleMethods0.abs((int) (byte) -1);
        int int10 = simpleMethods0.abs((int) (short) 1);
        int int12 = simpleMethods0.abs((-100));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.Class<?> wildcardClass21 = simpleMethods0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(6);
        int int8 = simpleMethods0.abs((int) (byte) 0);
        int int10 = simpleMethods0.abs((-8));
        java.lang.Class<?> wildcardClass11 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        int int20 = simpleMethods0.abs((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int2 = simpleMethods0.abs(0);
        int int4 = simpleMethods0.abs((-2));
        int int6 = simpleMethods0.abs(1);
        int int8 = simpleMethods0.abs((int) 'a');
        int int10 = simpleMethods0.abs(6);
        int int12 = simpleMethods0.abs(2);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

