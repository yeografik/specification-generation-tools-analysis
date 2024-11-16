package examples;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        structure1.setX((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-99) + "'", int10 == (-99));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        structure1.clear();
        structure1.clear();
        int int23 = structure1.foo();
        java.lang.Class<?> wildcardClass24 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.setX((-4));
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-3) + "'", int7 == (-3));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3) + "'", int8 == (-3));
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-1));
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        structure1.setX((-96));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-9));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(99);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-8) + "'", int5 == (-8));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX(9);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        int int16 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        structure1.setX((-2));
        structure1.setX((-4));
        structure1.setX(10);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(3);
        structure1.clear();
        structure1.setX((-3));
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(10);
        structure1.clear();
        structure1.setX(2);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        examples.Structure structure1 = new examples.Structure((-10));
        structure1.setX((int) (byte) 1);
        structure1.setX(104);
        structure1.setX((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.setX(12);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        examples.Structure structure1 = new examples.Structure(53);
        structure1.clear();
        structure1.setX((-95));
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-94) + "'", int5 == (-94));
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(5);
        int int4 = structure1.foo();
        structure1.setX((-1));
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 100);
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX(4);
        structure1.setX(104);
        structure1.setX(105);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 104 + "'", int17 == 104);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(6);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        structure1.setX(98);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        examples.Structure structure1 = new examples.Structure(34);
        structure1.setX(1);
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(98);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX((-100));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (byte) 100);
        structure1.clear();
        structure1.setX((int) '4');
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        int int16 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        int int20 = structure1.foo();
        structure1.clear();
        int int22 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(54);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(103);
        int int7 = structure1.foo();
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 104 + "'", int7 == 104);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.setX((-2));
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(0);
        structure0.setX(39);
        structure0.clear();
        structure0.clear();
        structure0.setX((-6));
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((-5));
        structure0.clear();
        structure0.setX(11);
        int int8 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(34);
        int int6 = structure1.foo();
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
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
        structure1.setX(10);
        structure1.setX((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        int int17 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        int int17 = structure1.foo();
        structure1.setX((-6));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX(98);
        structure1.setX(101);
        int int7 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
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
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        int int4 = structure1.foo();
        structure1.setX(41);
        structure1.setX(57);
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        int int14 = structure1.foo();
        structure1.setX(11);
        int int17 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.clear();
        structure1.setX(33);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-1));
        structure1.clear();
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54 + "'", int15 == 54);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(10);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int15 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.setX(11);
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(2);
        structure1.setX(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.setX((-5));
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4) + "'", int8 == (-4));
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.setX(4);
        structure1.setX((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        structure1.setX((int) (byte) 10);
        structure1.setX((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int5 = structure0.foo();
        structure0.clear();
        structure0.setX((-7));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int13 = structure1.foo();
        structure1.setX(11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.clear();
        structure1.setX(10);
        structure1.setX(9);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX((-7));
        structure1.clear();
        structure1.setX(10);
        structure1.clear();
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX(38);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 39 + "'", int9 == 39);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 39 + "'", int10 == 39);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.setX((-4));
        structure1.setX(1);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(36);
        int int7 = structure1.foo();
        structure1.setX(56);
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37 + "'", int7 == 37);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(38);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.setX(0);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.setX(1);
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        examples.Structure structure1 = new examples.Structure(34);
        structure1.setX(1);
        structure1.setX(106);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        structure0.setX(11);
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(9);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(37);
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 38 + "'", int6 == 38);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(0);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        structure1.setX(3);
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        structure1.setX((-9));
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        structure1.setX((-97));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX((int) (byte) -1);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX(98);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 99 + "'", int4 == 99);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        structure1.setX((-1));
        structure1.clear();
        structure1.setX(41);
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 42 + "'", int20 == 42);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((-5));
        structure0.clear();
        structure0.setX(11);
        structure0.setX((-8));
        structure0.setX(3);
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        structure1.clear();
        structure1.setX(7);
        structure1.setX(98);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-1));
        structure1.setX(42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.clear();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX(3);
        int int7 = structure1.foo();
        structure1.setX(0);
        int int10 = structure1.foo();
        structure1.setX((-100));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((int) (byte) 100);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        structure1.setX(11);
        structure1.setX((-2));
        structure1.setX((int) (byte) 0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.setX((-3));
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        int int16 = structure1.foo();
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        examples.Structure structure1 = new examples.Structure((-98));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        int int6 = structure1.foo();
        structure1.setX(37);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(0);
        structure0.setX((int) ' ');
        int int7 = structure0.foo();
        structure0.setX(38);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        examples.Structure structure1 = new examples.Structure((-4));
        int int2 = structure1.foo();
        structure1.setX(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX(10);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.setX((-2));
        structure1.setX((int) (byte) 0);
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        structure1.setX((int) '#');
        structure1.clear();
        structure1.setX((int) (short) -1);
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX(6);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        structure1.setX(2);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX((-99));
        structure1.clear();
        int int12 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
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
        int int17 = structure1.foo();
        structure1.clear();
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-97) + "'", int17 == (-97));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(36);
        structure1.setX((int) (short) 0);
        structure1.setX(3);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        structure1.setX(0);
        structure1.clear();
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        int int4 = structure1.foo();
        structure1.setX(41);
        structure1.setX(57);
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        int int3 = structure0.foo();
        structure0.setX(5);
        structure0.setX(98);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        structure1.setX((-1));
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.setX(102);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        structure1.clear();
        int int12 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.setX(36);
        structure1.setX((int) (short) -1);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        int int13 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.setX(98);
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(104);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((int) 'a');
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 105 + "'", int10 == 105);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        structure1.setX((-9));
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-5) + "'", int16 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((-5));
        int int10 = structure1.foo();
        structure1.setX(0);
        structure1.setX((-1));
        structure1.setX(54);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.setX(12);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(5);
        structure1.clear();
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX(0);
        structure1.setX(98);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-4) + "'", int11 == (-4));
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.setX((-4));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) '4');
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        structure1.setX(58);
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.setX((-98));
        structure1.setX((int) (short) 100);
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        structure1.setX((-5));
        structure1.clear();
        structure1.clear();
        structure1.setX(104);
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
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
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-4) + "'", int16 == (-4));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.clear();
        structure1.setX(104);
        structure1.clear();
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(57);
        structure1.setX((int) (byte) 10);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX((int) (byte) -1);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
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
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-6) + "'", int17 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        structure1.setX((-8));
        structure1.setX(35);
        int int24 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.setX(4);
        structure1.clear();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        structure1.clear();
        structure1.clear();
        structure1.setX((-6));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        int int4 = structure1.foo();
        structure1.setX(99);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX((-1));
        int int9 = structure0.foo();
        int int10 = structure0.foo();
        int int11 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX(103);
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX(0);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        int int9 = structure1.foo();
        structure1.setX((-100));
        int int12 = structure1.foo();
        structure1.clear();
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-99) + "'", int12 == (-99));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        structure1.clear();
        structure1.setX(5);
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-4));
        structure1.setX(0);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX(0);
        int int9 = structure0.foo();
        structure0.clear();
        structure0.setX(58);
        structure0.clear();
        int int14 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.setX(33);
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.setX((int) '4');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.setX(0);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        structure1.setX(0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(33);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(98);
        structure0.setX(103);
        java.lang.Class<?> wildcardClass11 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX((int) (byte) 1);
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(103);
        structure1.setX(57);
        structure1.clear();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        structure1.setX(98);
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX(106);
        structure0.clear();
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.setX(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        structure1.clear();
        int int21 = structure1.foo();
        structure1.setX(106);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(5);
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 1);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        structure1.setX((int) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX((-2));
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        structure1.setX(53);
        structure1.setX(0);
        int int18 = structure1.foo();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        int int5 = structure0.foo();
        structure0.setX(37);
        structure0.setX(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) -1);
        structure1.setX(99);
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 0);
        int int15 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        structure1.setX(0);
        structure1.setX(1);
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
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
        structure1.setX((-8));
        int int22 = structure1.foo();
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-7) + "'", int22 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        int int16 = structure1.foo();
        structure1.setX(34);
        structure1.setX((-100));
        structure1.clear();
        structure1.setX(34);
        structure1.setX((-5));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

