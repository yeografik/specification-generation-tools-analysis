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
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        int int6 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        structure1.setX(5);
        structure1.setX(5);
        int int18 = structure1.foo();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.setX((int) (short) 0);
        int int9 = structure0.foo();
        int int10 = structure0.foo();
        int int11 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        int int9 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX((int) '#');
        int int14 = structure1.foo();
        structure1.setX((-4));
        structure1.clear();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.clear();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        structure1.setX(3);
        structure1.setX(7);
        structure1.setX((int) (byte) 1);
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-100));
        structure1.setX(105);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.setX((-1));
        structure1.setX(3);
        structure1.setX(100);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        structure1.setX(5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(36);
        int int7 = structure1.foo();
        structure1.setX(56);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37 + "'", int7 == 37);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        structure1.setX(5);
        structure1.setX(5);
        int int18 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        structure0.setX((-3));
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int13 = structure1.foo();
        structure1.setX((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        structure0.clear();
        int int8 = structure0.foo();
        structure0.setX(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX(98);
        structure1.setX(101);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        examples.Structure structure1 = new examples.Structure(36);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        examples.Structure structure1 = new examples.Structure(53);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        structure1.setX(37);
        int int17 = structure1.foo();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 38 + "'", int17 == 38);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.setX(4);
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.setX((-97));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.setX(6);
        structure1.clear();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.setX(4);
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-1));
        structure1.setX(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        int int17 = structure1.foo();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        structure0.setX(39);
        structure0.clear();
        structure0.setX((-4));
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.setX(7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        int int8 = structure1.foo();
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4) + "'", int8 == (-4));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.setX(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        int int9 = structure1.foo();
        structure1.setX(100);
        structure1.setX(2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX((int) (byte) 0);
        structure0.setX(34);
        int int11 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        structure1.setX((-4));
        structure1.setX(2);
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.setX((int) 'a');
        int int11 = structure1.foo();
        structure1.setX(57);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 98 + "'", int11 == 98);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(10);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.setX((-4));
        structure1.setX(98);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        structure1.setX((-100));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        int int4 = structure1.foo();
        structure1.setX(99);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(8);
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(33);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        structure1.setX(102);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX((int) (byte) -1);
        structure1.setX(40);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.setX(2);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        structure1.setX((int) (short) 1);
        structure1.clear();
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX((int) (short) 0);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.setX(0);
        int int7 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int5 = structure1.foo();
        structure1.setX((-99));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        structure0.setX((int) (short) 1);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        examples.Structure structure1 = new examples.Structure(105);
        int int2 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        int int19 = structure1.foo();
        structure1.clear();
        int int21 = structure1.foo();
        java.lang.Class<?> wildcardClass22 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.setX(2);
        structure1.setX(6);
        int int8 = structure1.foo();
        structure1.setX(5);
        structure1.setX(40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX(0);
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(102);
        structure1.setX((int) '4');
        structure1.setX((-2));
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.setX(36);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.setX(53);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (byte) 10);
        structure1.setX(99);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((int) (short) 1);
        structure0.setX((-99));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-98));
        int int16 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-97) + "'", int16 == (-97));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        structure1.setX(103);
        structure1.clear();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(101);
        int int11 = structure1.foo();
        structure1.setX(105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((-1));
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        structure1.setX((int) (short) 1);
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(100);
        structure0.setX((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        examples.Structure structure1 = new examples.Structure((-96));
        structure1.setX(55);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.setX(98);
        structure0.clear();
        structure0.clear();
        structure0.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(38);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX((-96));
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(9);
        structure1.setX(9);
        structure1.setX(38);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        structure1.setX((int) ' ');
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        structure1.setX(98);
        structure1.setX(2);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) -1);
        structure0.setX(0);
        structure0.clear();
        structure0.setX(7);
        structure0.setX(5);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-1));
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-10));
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX(0);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.setX(33);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.clear();
        structure0.setX((int) (byte) 0);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX((int) (short) 1);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        examples.Structure structure1 = new examples.Structure(41);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.setX((-5));
        structure1.clear();
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        structure1.setX((int) ' ');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        structure1.setX(101);
        int int17 = structure1.foo();
        structure1.setX(106);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX(0);
        int int9 = structure0.foo();
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        int int5 = structure0.foo();
        structure0.setX(37);
        int int8 = structure0.foo();
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 38 + "'", int8 == 38);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.clear();
        structure1.clear();
        structure1.setX(36);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) ' ');
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.clear();
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        int int17 = structure1.foo();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        int int7 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        structure0.clear();
        structure0.clear();
        structure0.setX((int) (short) 0);
        structure0.setX(5);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(10);
        int int11 = structure1.foo();
        structure1.clear();
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-9));
        structure1.setX(8);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        examples.Structure structure1 = new examples.Structure((-5));
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.clear();
        structure1.setX(105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(0);
        int int11 = structure1.foo();
        structure1.setX((-98));
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-97) + "'", int14 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX(3);
        structure0.setX((-2));
        structure0.clear();
        int int12 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass14 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.clear();
        structure1.setX(38);
        structure1.setX(54);
        structure1.clear();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX(3);
        structure0.setX((-2));
        structure0.clear();
        int int12 = structure0.foo();
        structure0.clear();
        int int14 = structure0.foo();
        structure0.setX(0);
        structure0.setX(103);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        structure1.setX((int) (short) 1);
        structure1.setX(0);
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX((-5));
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        structure1.setX((int) ' ');
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.clear();
        int int9 = structure0.foo();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX((-96));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.setX((-7));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(38);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        structure1.setX((-1));
        int int16 = structure1.foo();
        int int17 = structure1.foo();
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX((-3));
        int int11 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX(55);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX((-1));
        int int9 = structure0.foo();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((-98));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((-2));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53 + "'", int6 == 53);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.setX(37);
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.clear();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        structure1.setX(2);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.setX(6);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        int int6 = structure0.foo();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.setX((-2));
        structure1.clear();
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX((-7));
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(10);
        int int8 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(9);
        structure1.setX(9);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.setX((int) 'a');
        structure1.setX(6);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(33);
        structure1.setX((int) (byte) 100);
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        structure1.setX(54);
        int int20 = structure1.foo();
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 55 + "'", int20 == 55);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(1);
        structure1.setX((-10));
        structure1.setX(0);
        structure1.clear();
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(101);
        structure1.clear();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.setX(103);
        structure1.setX(101);
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        structure1.setX(100);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        int int14 = structure1.foo();
        structure1.clear();
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 33 + "'", int14 == 33);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        structure1.setX(103);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        int int22 = structure1.foo();
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        structure1.setX((int) (short) -1);
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        structure1.setX(3);
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        structure1.clear();
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX(98);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(107);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 99 + "'", int5 == 99);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-4));
        structure1.setX(0);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.setX(10);
        structure1.setX((int) '#');
        structure1.setX(11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        int int13 = structure1.foo();
        structure1.clear();
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        int int21 = structure1.foo();
        java.lang.Class<?> wildcardClass22 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.setX(0);
        structure1.setX((-97));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        int int16 = structure1.foo();
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        structure1.setX(34);
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX(13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX(4);
        structure1.clear();
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5) + "'", int16 == (-5));
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) (byte) 100);
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-1));
        int int14 = structure1.foo();
        structure1.setX((-7));
        int int17 = structure1.foo();
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-6) + "'", int17 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        structure1.setX(6);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        int int8 = structure1.foo();
        structure1.setX(37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        examples.Structure structure1 = new examples.Structure(5);
        structure1.clear();
        structure1.setX((int) (short) 1);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        structure0.clear();
        structure0.setX(55);
        structure0.setX(5);
        java.lang.Class<?> wildcardClass14 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        structure1.setX(11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        int int4 = structure1.foo();
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(98);
        structure0.setX(103);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(98);
        int int9 = structure0.foo();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        examples.Structure structure1 = new examples.Structure(104);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        structure1.setX(37);
        int int17 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 38 + "'", int17 == 38);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(105);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(103);
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 104 + "'", int7 == 104);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-9));
        structure1.setX(8);
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX((-7));
        structure1.setX((int) (byte) -1);
        structure1.setX(57);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) '#');
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.setX((-4));
        structure1.setX(98);
        structure1.setX((-97));
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        structure1.setX(37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        int int13 = structure1.foo();
        structure1.clear();
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        structure1.setX(98);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass25 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(34);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX((int) (byte) -1);
        structure0.setX(3);
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.setX(12);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        structure1.setX(54);
        structure1.setX(12);
        structure1.setX((int) (short) 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX(0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(36);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        examples.Structure structure1 = new examples.Structure(11);
        structure1.setX(2);
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX((-7));
        structure1.clear();
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.setX(7);
        structure1.setX((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.setX(37);
        structure1.setX(41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4) + "'", int28 == (-4));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX((int) (short) 0);
        structure1.setX(5);
        structure1.setX(103);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 104 + "'", int10 == 104);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 104 + "'", int11 == 104);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX((int) (byte) -1);
        int int8 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.setX(5);
        structure0.setX((-8));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(2);
        structure1.setX(38);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 39 + "'", int10 == 39);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        structure1.clear();
        structure1.setX(1);
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.setX((int) (byte) 1);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(101);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        structure1.setX((-98));
        structure1.setX((-1));
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.setX(100);
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        structure1.clear();
        structure1.setX(5);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        int int10 = structure0.foo();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int13 = structure1.foo();
        structure1.setX((-97));
        structure1.clear();
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        structure1.clear();
        structure1.setX(37);
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 38 + "'", int17 == 38);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.clear();
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-1));
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((-8));
        int int14 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(101);
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        structure1.setX(105);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        examples.Structure structure1 = new examples.Structure((-5));
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(104);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 105 + "'", int11 == 105);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
        int int29 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX(1);
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(3);
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        int int9 = structure1.foo();
        structure1.setX((-95));
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        examples.Structure structure1 = new examples.Structure(103);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(10);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) (byte) 100);
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(5);
        structure1.clear();
        structure1.setX(102);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5) + "'", int16 == (-5));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(101);
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        structure1.setX(105);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX(10);
        structure1.clear();
        structure1.setX((-10));
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.clear();
        int int4 = structure0.foo();
        int int5 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(37);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.clear();
        structure0.setX(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(37);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 1);
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX((int) (short) 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((int) (short) 1);
        int int11 = structure1.foo();
        structure1.setX(37);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        int int3 = structure0.foo();
        structure0.setX(5);
        structure0.clear();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX((-9));
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(99);
        int int8 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        structure0.clear();
        structure0.setX(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(34);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        structure0.clear();
        structure0.setX(55);
        structure0.clear();
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((-5));
        int int10 = structure1.foo();
        structure1.setX(0);
        structure1.setX(104);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.clear();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        structure1.setX(36);
        structure1.setX(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(10);
        int int6 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-98));
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-95) + "'", int14 == (-95));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        structure1.setX(10);
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        int int24 = structure1.foo();
        java.lang.Class<?> wildcardClass25 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.setX(36);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX((int) '#');
        structure1.clear();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.setX(103);
        structure1.setX(101);
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.setX(57);
        structure1.clear();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
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
        structure1.setX((-99));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        int int29 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.setX((int) (byte) 0);
        structure1.setX((int) (byte) 0);
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.setX(103);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((-8));
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        structure0.setX(1);
        structure0.setX((int) ' ');
        int int8 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        structure1.setX(5);
        structure1.setX(5);
        structure1.setX(12);
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        structure1.setX(12);
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 13 + "'", int17 == 13);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        structure1.setX(5);
        int int16 = structure1.foo();
        int int17 = structure1.foo();
        structure1.clear();
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX((int) (byte) -1);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        int int6 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.clear();
        structure0.setX((-5));
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-6));
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-5) + "'", int7 == (-5));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        examples.Structure structure1 = new examples.Structure((-5));
        int int2 = structure1.foo();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-4) + "'", int2 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(1);
        structure1.setX((-7));
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-6) + "'", int8 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX(10);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.setX(102);
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 103 + "'", int11 == 103);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        structure0.clear();
        structure0.setX(102);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        structure1.clear();
        int int16 = structure1.foo();
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        examples.Structure structure1 = new examples.Structure(53);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(98);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX((-4));
        structure1.setX((int) (byte) 0);
        structure1.setX(6);
        structure1.setX(11);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(37);
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX((-8));
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        structure1.setX(37);
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.setX((int) ' ');
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.clear();
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((-6));
        int int9 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.setX((-98));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-97) + "'", int5 == (-97));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(1);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        structure1.clear();
        structure1.clear();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((-5));
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX(104);
        structure1.setX((-99));
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-98) + "'", int14 == (-98));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-98) + "'", int15 == (-98));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(57);
        structure1.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        int int10 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-99) + "'", int10 == (-99));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX((int) (short) 0);
        int int6 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.clear();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        int int26 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-97) + "'", int26 == (-97));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-4));
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.setX(2);
        structure1.setX(6);
        int int8 = structure1.foo();
        structure1.setX(5);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX((-99));
        structure1.setX((-1));
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(100);
        structure0.setX((int) (short) 0);
        int int9 = structure0.foo();
        int int10 = structure0.foo();
        java.lang.Class<?> wildcardClass11 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(7);
        structure1.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(9);
        int int5 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(102);
        structure1.setX((int) '4');
        structure1.setX((-2));
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(101);
        int int9 = structure1.foo();
        structure1.setX((-9));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 102 + "'", int9 == 102);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.setX(1);
        structure1.clear();
        int int13 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.setX((-5));
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int14 = structure1.foo();
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        structure1.setX(0);
        structure1.setX(33);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        structure1.setX((int) '#');
        int int19 = structure1.foo();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        examples.Structure structure1 = new examples.Structure(36);
        int int2 = structure1.foo();
        structure1.setX((-5));
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(1);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.setX(4);
        structure1.clear();
        structure1.setX((-5));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int13 = structure1.foo();
        structure1.setX((-97));
        structure1.clear();
        structure1.clear();
        int int18 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        structure1.setX((int) (short) -1);
        structure1.setX(53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX(3);
        structure0.setX((-2));
        structure0.clear();
        int int12 = structure0.foo();
        structure0.clear();
        int int14 = structure0.foo();
        java.lang.Class<?> wildcardClass15 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        int int5 = structure0.foo();
        structure0.setX((-4));
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX((-1));
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX((int) (byte) 100);
        structure1.setX((-7));
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6) + "'", int6 == (-6));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        structure1.setX((-5));
        structure1.setX(102);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX(3);
        structure0.setX((-2));
        structure0.clear();
        int int12 = structure0.foo();
        structure0.clear();
        int int14 = structure0.foo();
        structure0.setX(102);
        java.lang.Class<?> wildcardClass17 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        structure1.clear();
        structure1.clear();
        structure1.setX(2);
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX((-7));
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        int int6 = structure1.foo();
        structure1.setX((int) (short) -1);
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.setX(37);
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX(102);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(1);
        structure1.setX(34);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 100);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX(98);
        structure1.setX(101);
        int int7 = structure1.foo();
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        int int2 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        int int10 = structure1.foo();
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        int int7 = structure1.foo();
        structure1.setX(40);
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54 + "'", int7 == 54);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(1);
        structure0.setX(100);
        structure0.clear();
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-3));
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((-3));
        structure1.setX(54);
        structure1.setX(12);
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 13 + "'", int19 == 13);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        structure1.setX(98);
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        int int6 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX(38);
        int int12 = structure1.foo();
        structure1.setX(0);
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.setX(37);
        structure1.setX(99);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(104);
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        examples.Structure structure1 = new examples.Structure(4);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.clear();
        structure1.setX(5);
        structure1.setX(5);
        structure1.setX(5);
        structure1.setX(100);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        examples.Structure structure1 = new examples.Structure(5);
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX((-3));
        structure1.clear();
        structure1.setX(103);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX(10);
        structure1.clear();
        structure1.clear();
        structure1.setX(9);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        int int18 = structure1.foo();
        int int19 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        structure1.setX(10);
        java.lang.Class<?> wildcardClass25 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(2);
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(37);
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((int) '#');
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(2);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(1);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(55);
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56 + "'", int12 == 56);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.setX(0);
        structure1.setX(10);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.clear();
        structure1.setX(36);
        structure1.setX(57);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        int int4 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.setX(0);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(101);
        structure1.setX((-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX((-1));
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(0);
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((int) (byte) 100);
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(11);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        examples.Structure structure1 = new examples.Structure(104);
        structure1.setX(0);
        structure1.clear();
        structure1.setX(33);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(10);
        structure1.setX(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX(0);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-6) + "'", int5 == (-6));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-6) + "'", int6 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(56);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 57 + "'", int8 == 57);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.setX(9);
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        examples.Structure structure1 = new examples.Structure(103);
        structure1.setX(106);
        structure1.clear();
        structure1.setX(103);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.setX(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        structure0.setX((-4));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(3);
        structure1.clear();
        structure1.setX((-99));
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-98) + "'", int13 == (-98));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.setX((int) (short) 0);
        structure0.clear();
        structure0.setX(12);
        structure0.clear();
        int int13 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(0);
        int int11 = structure1.foo();
        structure1.setX((-98));
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-97) + "'", int14 == (-97));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-97) + "'", int15 == (-97));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (short) 0);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.setX(2);
        structure0.setX((int) (short) 0);
        structure0.setX(53);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(6);
        structure1.setX(106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(57);
        structure1.setX((-96));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) -1);
        structure0.setX(0);
        structure0.clear();
        structure0.clear();
        structure0.clear();
        int int12 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (short) 0);
        structure0.clear();
        structure0.clear();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        int int12 = structure1.foo();
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.setX(100);
        int int9 = structure0.foo();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX(10);
        int int11 = structure1.foo();
        structure1.setX(102);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((-99));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.setX(11);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        structure1.setX((-4));
        structure1.setX(35);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        structure1.setX((-5));
        structure1.setX(102);
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.setX(55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(38);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        int int6 = structure0.foo();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

