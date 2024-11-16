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
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX((-8));
        int int13 = structure1.foo();
        structure1.setX(98);
        structure1.setX(100);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX((-2));
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.setX((-7));
        int int10 = structure0.foo();
        structure0.clear();
        structure0.setX(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-6) + "'", int10 == (-6));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        examples.Structure structure1 = new examples.Structure((-8));
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        structure1.setX(11);
        structure1.setX((-2));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 1);
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        examples.Structure structure1 = new examples.Structure((int) '#');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX(0);
        structure1.setX(38);
        structure1.clear();
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        int int19 = structure1.foo();
        int int20 = structure1.foo();
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(12);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.clear();
        structure0.setX((int) (byte) 0);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.setX((-7));
        structure0.setX(103);
        structure0.clear();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(0);
        structure1.clear();
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(2);
        structure1.setX(38);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(6);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        structure1.setX(0);
        structure1.setX((-97));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-100));
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.setX(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        int int15 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int18 = structure1.foo();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 1);
        structure1.setX(99);
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(99);
        structure1.setX((int) (short) 0);
        structure1.setX(54);
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.setX(37);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int12 = structure1.foo();
        structure1.setX(53);
        structure1.setX(13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX(1);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        int int22 = structure1.foo();
        int int23 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        examples.Structure structure1 = new examples.Structure(104);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        int int19 = structure1.foo();
        structure1.setX((int) (short) 0);
        int int22 = structure1.foo();
        int int23 = structure1.foo();
        java.lang.Class<?> wildcardClass24 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(99);
        structure1.setX((-8));
        int int8 = structure1.foo();
        structure1.setX(35);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-7) + "'", int8 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        examples.Structure structure1 = new examples.Structure(104);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(5);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        int int14 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        int int15 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(8);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.setX((int) (short) -1);
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        examples.Structure structure1 = new examples.Structure(3);
        int int2 = structure1.foo();
        structure1.setX(5);
        structure1.setX(98);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(100);
        int int20 = structure1.foo();
        structure1.setX(10);
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((-5));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4) + "'", int4 == (-4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-4) + "'", int6 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX(104);
        structure1.setX((-99));
        structure1.clear();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX(5);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.setX((-7));
        structure0.setX((int) (short) 1);
        structure0.clear();
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        int int7 = structure0.foo();
        structure0.setX(10);
        structure0.setX((-100));
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.setX(104);
        int int12 = structure0.foo();
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 105 + "'", int12 == 105);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.setX((-5));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.setX(0);
        structure1.setX(5);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.setX(40);
        structure1.setX((-9));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX(10);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX((-7));
        structure1.clear();
        structure1.setX((-99));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(98);
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) 'a');
        structure1.setX(0);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(103);
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        examples.Structure structure1 = new examples.Structure(5);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((-8));
        structure1.setX(9);
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-96));
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX((-7));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(1);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(56);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (short) 0);
        structure0.clear();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        structure0.setX(39);
        structure0.clear();
        structure0.setX(100);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        int int10 = structure1.foo();
        structure1.setX(99);
        structure1.setX(36);
        structure1.setX((-7));
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-99) + "'", int10 == (-99));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        examples.Structure structure1 = new examples.Structure((-100));
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(33);
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(102);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103 + "'", int6 == 103);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX((-7));
        structure1.clear();
        structure1.setX((-1));
        structure1.clear();
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX(102);
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 103 + "'", int14 == 103);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        examples.Structure structure1 = new examples.Structure(101);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX((int) ' ');
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((int) (short) 1);
        structure0.clear();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(1);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(1);
        structure1.setX(11);
        int int12 = structure1.foo();
        structure1.setX((-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(33);
        structure1.clear();
        int int14 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((-99));
        structure1.setX((int) (byte) 1);
        structure1.setX(0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        examples.Structure structure1 = new examples.Structure(102);
        structure1.setX(100);
        structure1.setX(6);
        structure1.setX((-96));
        structure1.setX(34);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(1);
        int int5 = structure0.foo();
        structure0.setX(37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX((-3));
        structure1.setX((-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(103);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.clear();
        structure1.setX(38);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        int int7 = structure0.foo();
        structure0.setX((-97));
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-96) + "'", int10 == (-96));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) -1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.setX(0);
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        int int10 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        int int15 = structure1.foo();
        structure1.clear();
        structure1.setX(57);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        structure1.setX((-4));
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.clear();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(104);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.setX(54);
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.setX((-97));
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5) + "'", int16 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(8);
        int int20 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass24 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(102);
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        examples.Structure structure1 = new examples.Structure((-100));
        structure1.clear();
        int int3 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        examples.Structure structure1 = new examples.Structure((-97));
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-96) + "'", int2 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int7 = structure1.foo();
        structure1.setX(6);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX((int) (short) 100);
        int int16 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(0);
        structure1.setX(35);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        structure1.setX(56);
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) 'a');
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(1);
        structure1.setX(11);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-99) + "'", int4 == (-99));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-99) + "'", int5 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        examples.Structure structure1 = new examples.Structure(104);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        structure1.setX(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        structure1.setX(10);
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.setX(54);
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 55 + "'", int9 == 55);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        examples.Structure structure1 = new examples.Structure(36);
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.setX((-98));
        int int7 = structure1.foo();
        structure1.setX((int) (byte) 100);
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-97) + "'", int7 == (-97));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(104);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.clear();
        structure1.setX((-9));
        structure1.setX(39);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.setX(102);
        structure1.setX((int) (short) 0);
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        structure1.setX(0);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(99);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX(14);
        structure1.setX((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        examples.Structure structure1 = new examples.Structure(53);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-98));
        structure1.clear();
        structure1.setX((-2));
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        int int6 = structure1.foo();
        structure1.setX(37);
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 38 + "'", int9 == 38);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((-10));
        structure1.clear();
        int int17 = structure1.foo();
        structure1.clear();
        structure1.setX(57);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX(98);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.setX(13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX((-7));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        structure1.setX((int) '#');
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.setX(3);
        structure1.setX(98);
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-100));
        structure1.setX(0);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) -1);
        structure1.setX((-100));
        structure1.clear();
        structure1.setX(38);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX((int) (short) -1);
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.setX((-7));
        structure0.setX(103);
        structure0.clear();
        structure0.clear();
        structure0.setX(7);
        int int16 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        int int15 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int18 = structure1.foo();
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(1);
        structure1.clear();
        structure1.setX((-97));
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-96) + "'", int13 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX(34);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        int int10 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-99) + "'", int10 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX(102);
        structure1.clear();
        int int13 = structure1.foo();
        structure1.clear();
        int int15 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        int int15 = structure1.foo();
        structure1.clear();
        structure1.setX((-96));
        structure1.setX((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        int int13 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(14);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        examples.Structure structure1 = new examples.Structure(36);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX(5);
        structure1.clear();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-6));
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        structure1.setX((-98));
        structure1.clear();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-5) + "'", int11 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        int int14 = structure1.foo();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        int int22 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((int) (short) -1);
        structure1.setX((int) (byte) 0);
        structure1.setX(103);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(100);
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(1);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.setX(2);
        structure1.setX(6);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX((-2));
        int int12 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.clear();
        int int4 = structure0.foo();
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(37);
        structure1.setX(40);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(12);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((-5));
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4) + "'", int16 == (-4));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.setX((-97));
        structure1.setX((-97));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(99);
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX((-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        examples.Structure structure1 = new examples.Structure(39);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 40 + "'", int2 == 40);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        int int13 = structure1.foo();
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(13);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        structure1.setX(3);
        structure1.setX(7);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        structure1.setX(101);
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(8);
        structure1.setX(9);
        structure1.setX(0);
        structure1.setX((-98));
        structure1.setX((-5));
        int int28 = structure1.foo();
        java.lang.Class<?> wildcardClass29 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4) + "'", int28 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        examples.Structure structure1 = new examples.Structure((-10));
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.setX((-4));
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(3);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX(0);
        int int9 = structure0.foo();
        structure0.setX(100);
        structure0.setX(3);
        int int14 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        structure0.setX(39);
        structure0.setX((int) (byte) 0);
        structure0.clear();
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX(0);
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        int int15 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.setX(12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(33);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 34 + "'", int7 == 34);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX((int) 'a');
        structure1.setX((-100));
        structure1.clear();
        structure1.setX(39);
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(8);
        structure1.setX(9);
        structure1.setX(0);
        structure1.setX((-98));
        structure1.setX((-5));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass30 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-3));
        int int8 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4 == (-7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((-5));
        structure1.clear();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((-6));
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-5) + "'", int10 == (-5));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-5) + "'", int11 == (-5));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.clear();
        structure1.setX((int) (byte) 100);
        structure1.setX(0);
        structure1.setX((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX(101);
        structure1.setX((int) (byte) 10);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        int int9 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        structure1.setX((-2));
        structure1.clear();
        int int16 = structure1.foo();
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(103);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.setX(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int16 = structure1.foo();
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(7);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX(10);
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        structure1.setX(103);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 104 + "'", int10 == 104);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 104 + "'", int11 == 104);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.setX(34);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        examples.Structure structure1 = new examples.Structure((-4));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(2);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(10);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.clear();
        structure1.setX((int) (byte) -1);
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.setX(98);
        structure0.clear();
        structure0.setX((-2));
        int int12 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        examples.Structure structure1 = new examples.Structure((int) (byte) 0);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.setX(5);
        structure1.clear();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.clear();
        structure1.setX((-4));
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3) + "'", int6 == (-3));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX(10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        examples.Structure structure1 = new examples.Structure((-4));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3) + "'", int4 == (-3));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.setX(100);
        structure1.setX(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX(0);
        int int14 = structure1.foo();
        structure1.setX((-5));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.clear();
        int int3 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(100);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int13 = structure1.foo();
        structure1.setX(3);
        structure1.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(14);
        structure1.setX((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.setX(8);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX(6);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.setX(38);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX((-6));
        structure1.setX(55);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX(40);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.clear();
        structure0.setX((int) (byte) 0);
        int int8 = structure0.foo();
        structure0.setX(11);
        structure0.setX(54);
        structure0.setX((-3));
        structure0.clear();
        int int16 = structure0.foo();
        java.lang.Class<?> wildcardClass17 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        structure1.setX(103);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX(7);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-97));
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        structure1.setX((int) (short) -1);
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        examples.Structure structure1 = new examples.Structure(33);
        int int2 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(106);
        structure1.clear();
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(10);
        structure1.setX(4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX((int) (byte) -1);
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        structure1.setX(3);
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((int) '4');
        structure1.setX((int) '#');
        structure1.setX((-97));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.setX(9);
        structure1.clear();
        structure1.setX(0);
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX(9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX(99);
        structure1.setX((-7));
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(3);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.setX((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.setX((-7));
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX(3);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(13);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((int) (short) 100);
        structure1.setX(11);
        structure1.setX(39);
        structure1.setX(0);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(10);
        structure1.clear();
        structure1.setX((-1));
        structure1.clear();
        structure1.setX(37);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.setX((-2));
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 1);
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int21 = structure1.foo();
        java.lang.Class<?> wildcardClass22 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(98);
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX(103);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((-3));
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-2) + "'", int8 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) (byte) 0);
        structure1.setX((-1));
        structure1.setX((-99));
        int int24 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-98) + "'", int24 == (-98));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(5);
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.clear();
        structure1.setX(13);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(1);
        structure1.setX((-7));
        int int8 = structure1.foo();
        structure1.setX(33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-6) + "'", int8 == (-6));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        structure1.setX((int) '4');
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX(33);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(8);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        structure1.setX((int) (byte) 1);
        structure1.setX((int) (byte) 10);
        structure1.setX(0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        structure1.setX(10);
        structure1.clear();
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        structure1.setX(10);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX((int) (short) -1);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-3));
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.setX(0);
        structure1.setX((-5));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        structure1.clear();
        structure1.setX(100);
        structure1.setX(33);
        structure1.clear();
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.setX((int) '#');
        structure1.clear();
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.setX((-97));
        structure1.clear();
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        examples.Structure structure1 = new examples.Structure((int) (byte) 0);
        int int2 = structure1.foo();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(99);
        structure1.clear();
        structure1.setX((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.clear();
        structure1.setX((int) (byte) -1);
        int int14 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.clear();
        int int9 = structure0.foo();
        structure0.clear();
        structure0.setX(39);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.setX(37);
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        int int15 = structure1.foo();
        structure1.clear();
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX(6);
        int int8 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX(1);
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.setX(3);
        structure1.setX(33);
        structure1.clear();
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(6);
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.clear();
        structure0.setX((-5));
        structure0.setX(9);
        int int12 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        examples.Structure structure1 = new examples.Structure(105);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 106 + "'", int3 == 106);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX(99);
        structure1.setX((-7));
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-6) + "'", int11 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-6) + "'", int13 == (-6));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-6) + "'", int14 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        structure1.setX(3);
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        int int21 = structure1.foo();
        int int22 = structure1.foo();
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        structure1.setX(103);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        examples.Structure structure1 = new examples.Structure((-8));
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.setX(12);
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-99));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-98) + "'", int5 == (-98));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-98) + "'", int6 == (-98));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        structure1.setX(36);
        structure1.setX((int) (byte) 0);
        structure1.setX((int) (short) 10);
        int int15 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.setX((int) (short) 0);
        structure0.clear();
        structure0.setX(12);
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.setX(2);
        int int14 = structure1.foo();
        structure1.clear();
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(38);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.setX(1);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.setX(0);
        structure1.setX(100);
        structure1.clear();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        structure1.setX(1);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.setX(53);
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-96));
        structure1.clear();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX(103);
        structure1.clear();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.setX(2);
        structure1.setX(6);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX(14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        int int6 = structure0.foo();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(8);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(8);
        int int20 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.setX(0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        structure1.setX((int) '#');
        structure1.setX(106);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(2);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        int int22 = structure1.foo();
        int int23 = structure1.foo();
        java.lang.Class<?> wildcardClass24 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX((-99));
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX(13);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX(0);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX((-6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(100);
        structure0.setX((-97));
        structure0.setX(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        examples.Structure structure1 = new examples.Structure((-97));
        structure1.setX((-100));
        structure1.setX(34);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.setX((-98));
        int int12 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-97) + "'", int12 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.clear();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        structure0.clear();
        structure0.setX((int) '4');
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-10));
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX(10);
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX((-8));
        int int13 = structure1.foo();
        structure1.setX((int) (short) 10);
        int int16 = structure1.foo();
        structure1.clear();
        int int18 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-10));
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-9) + "'", int8 == (-9));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        structure0.setX((int) (byte) 0);
        int int5 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX((-7));
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6) + "'", int6 == (-6));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(101);
        int int15 = structure1.foo();
        structure1.setX(107);
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 108 + "'", int18 == 108);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(8);
        structure1.setX(9);
        structure1.setX(0);
        structure1.clear();
        int int25 = structure1.foo();
        int int26 = structure1.foo();
        structure1.setX(3);
        structure1.setX(34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        int int8 = structure1.foo();
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX(0);
        structure1.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int8 = structure0.foo();
        structure0.setX((-7));
        java.lang.Class<?> wildcardClass11 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(102);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        structure1.setX(8);
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3) + "'", int13 == (-3));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        structure1.setX((-1));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(10);
        int int14 = structure1.foo();
        structure1.clear();
        int int16 = structure1.foo();
        structure1.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        examples.Structure structure1 = new examples.Structure(103);
        structure1.clear();
        structure1.setX(101);
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 102 + "'", int5 == 102);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-100));
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.clear();
        structure1.setX(0);
        structure1.setX(33);
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(10);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(53);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.setX((-4));
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        structure1.clear();
        structure1.setX(5);
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4 == (-7));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.setX((int) 'a');
        structure1.setX(6);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        examples.Structure structure1 = new examples.Structure((-98));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        int int13 = structure1.foo();
        structure1.setX((-9));
        structure1.setX(107);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        int int8 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        structure1.setX(1);
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.clear();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        structure0.clear();
        structure0.setX((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.setX(3);
        structure1.setX(35);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(101);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(1);
        structure0.setX(100);
        structure0.setX((-99));
        structure0.clear();
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        int int19 = structure1.foo();
        int int20 = structure1.foo();
        int int21 = structure1.foo();
        structure1.clear();
        int int23 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(1);
        structure0.setX((int) (short) 1);
        structure0.setX(101);
        structure0.clear();
        structure0.setX(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(101);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        structure1.setX(9);
        int int21 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(101);
        structure1.setX(55);
        java.lang.Class<?> wildcardClass28 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 99 + "'", int7 == 99);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((int) '4');
        structure1.setX((int) '#');
        structure1.setX(11);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.setX(3);
        structure1.setX(7);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.setX(2);
        structure1.clear();
        structure1.setX(40);
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 41 + "'", int7 == 41);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-3));
        int int7 = structure1.foo();
        structure1.setX(103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.setX(98);
        structure1.setX((int) (byte) 1);
        int int6 = structure1.foo();
        structure1.setX((-97));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.setX(12);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        structure1.setX((-1));
        structure1.setX(106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((-96));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.setX((-1));
        structure1.setX(3);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.setX((int) '#');
        structure1.clear();
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        int int13 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.setX((int) (short) -1);
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(3);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX((int) (byte) 100);
        structure1.setX((-7));
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6) + "'", int6 == (-6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        structure1.setX((-10));
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-7));
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-6) + "'", int14 == (-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX(9);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(38);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        examples.Structure structure1 = new examples.Structure((-3));
        structure1.clear();
        structure1.setX(1);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX((-8));
        int int13 = structure1.foo();
        structure1.setX(0);
        structure1.setX(35);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.setX((int) 'a');
        structure1.setX(6);
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        structure0.clear();
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.setX((-97));
        structure1.setX(54);
        int int21 = structure1.foo();
        int int22 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5) + "'", int16 == (-5));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 55 + "'", int21 == 55);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX((int) 'a');
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.clear();
        int int17 = structure1.foo();
        structure1.setX(8);
        structure1.setX(9);
        structure1.setX(0);
        structure1.setX(9);
        structure1.setX(55);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX((-1));
        int int9 = structure0.foo();
        structure0.setX((-7));
        structure0.setX((-8));
        structure0.setX((-5));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 1);
        int int16 = structure1.foo();
        structure1.clear();
        structure1.setX(54);
        structure1.setX((-100));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        int int10 = structure1.foo();
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.clear();
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        structure1.setX((int) (byte) -1);
        int int17 = structure1.foo();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX(98);
        structure1.setX((-99));
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-98) + "'", int6 == (-98));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7 == (-98));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8 == (-98));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(35);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX(0);
        structure1.setX((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((int) (byte) 1);
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int17 = structure1.foo();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        structure1.setX(0);
        structure1.setX(2);
        structure1.setX(98);
        structure1.clear();
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.clear();
        structure1.setX(0);
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.setX(100);
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        examples.Structure structure1 = new examples.Structure((-98));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        examples.Structure structure1 = new examples.Structure(58);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) 1);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(100);
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX((-1));
        int int9 = structure0.foo();
        structure0.clear();
        int int11 = structure0.foo();
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(33);
        structure1.clear();
        int int14 = structure1.foo();
        structure1.setX(99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(3);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int14 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.clear();
        structure1.setX((int) '4');
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX((-9));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        int int15 = structure1.foo();
        structure1.setX((int) '#');
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) -1);
        structure0.setX(0);
        structure0.clear();
        structure0.setX(8);
        structure0.clear();
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        int int7 = structure0.foo();
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-5) + "'", int7 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        int int7 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(101);
        structure1.setX((-97));
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((int) (short) -1);
        structure1.setX(100);
        int int10 = structure1.foo();
        structure1.setX(12);
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

