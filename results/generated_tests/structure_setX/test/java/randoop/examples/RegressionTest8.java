package examples;

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
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        int int10 = structure1.foo();
        structure1.setX(103);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
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
        structure1.setX(35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-7));
        structure1.setX(34);
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        structure1.setX(57);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX(0);
        structure1.setX((-2));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
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
        int int17 = structure1.foo();
        structure1.setX((-96));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        int int10 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.setX(0);
        structure1.clear();
        structure1.setX(3);
        structure1.setX((-1));
        structure1.clear();
        int int21 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-99) + "'", int10 == (-99));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX((int) (byte) 10);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(100);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.setX((int) 'a');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((-98));
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        structure1.setX((-9));
        structure1.setX(41);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 42 + "'", int10 == 42);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(36);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37 + "'", int7 == 37);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        structure1.setX(98);
        int int16 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 99 + "'", int16 == 99);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.clear();
        structure1.setX(0);
        structure1.setX(33);
        int int12 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.clear();
        structure0.setX(3);
        structure0.setX((-2));
        int int11 = structure0.foo();
        int int12 = structure0.foo();
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(102);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX(36);
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        structure1.setX(55);
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 56 + "'", int16 == 56);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(102);
        structure1.setX(33);
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        int int7 = structure0.foo();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(57);
        structure1.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX((int) (short) 0);
        structure1.setX(5);
        structure1.setX(103);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 104 + "'", int10 == 104);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 104 + "'", int11 == 104);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        int int15 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(38);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(35);
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        examples.Structure structure1 = new examples.Structure((-98));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        examples.Structure structure1 = new examples.Structure((-4));
        structure1.setX((-7));
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(33);
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.setX(98);
        structure0.clear();
        structure0.setX((-2));
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.clear();
        structure0.clear();
        int int7 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
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
        structure1.setX(8);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-1));
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX(10);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        structure1.setX(100);
        structure1.setX(55);
        structure1.setX((-6));
        structure1.setX((int) ' ');
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        examples.Structure structure1 = new examples.Structure(108);
        structure1.clear();
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        structure1.setX(0);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX(102);
        structure1.clear();
        structure1.setX(7);
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(7);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.setX(101);
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 102 + "'", int19 == 102);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(98);
        structure0.setX(11);
        structure0.setX((-97));
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        structure1.setX(99);
        structure1.setX(4);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.setX(101);
        structure1.clear();
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.setX(102);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(5);
        structure1.clear();
        structure1.setX(56);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 57 + "'", int10 == 57);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 57 + "'", int11 == 57);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        structure0.clear();
        int int9 = structure0.foo();
        structure0.setX(5);
        int int12 = structure0.foo();
        structure0.setX(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        examples.Structure structure1 = new examples.Structure((-9));
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-8) + "'", int2 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        structure0.setX((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        structure1.setX(14);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
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
        structure1.setX((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.setX((-4));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
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
        structure1.clear();
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        structure1.clear();
        structure1.setX(2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.clear();
        structure1.setX((-98));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
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
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        int int25 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        structure1.setX((-97));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-6) + "'", int17 == (-6));
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
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
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.setX(100);
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(104);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        structure1.setX((-10));
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((-2));
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-1));
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((int) (short) 0);
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX((-8));
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-7) + "'", int9 == (-7));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-7) + "'", int10 == (-7));
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(99);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        structure1.setX(11);
        structure1.setX((-2));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.setX(6);
        structure1.clear();
        int int12 = structure1.foo();
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (short) 0);
        structure1.setX((-1));
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        int int4 = structure1.foo();
        structure1.setX(99);
        structure1.setX((-97));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX(13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        examples.Structure structure1 = new examples.Structure(106);
        structure1.setX(8);
        structure1.setX((int) ' ');
        structure1.setX((-1));
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.setX(102);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 103 + "'", int7 == 103);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(33);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(58);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        structure1.setX(35);
        structure1.setX(8);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(37);
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(37);
        structure1.setX(40);
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
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
        structure1.setX(54);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
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
        int int12 = structure0.foo();
        structure0.clear();
        int int14 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-6) + "'", int10 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX((-97));
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-96) + "'", int12 == (-96));
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(104);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
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
        structure1.setX((int) (byte) 10);
        structure1.setX(3);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        int int8 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-4) + "'", int8 == (-4));
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
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
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((-99));
        int int7 = structure1.foo();
        structure1.setX(10);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7 == (-98));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
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
        int int17 = structure1.foo();
        int int18 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        structure1.setX(0);
        structure1.clear();
        structure1.setX((-7));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
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
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.clear();
        structure0.setX((int) (byte) 0);
        int int8 = structure0.foo();
        structure0.setX(11);
        structure0.setX(54);
        structure0.clear();
        int int14 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        examples.Structure structure1 = new examples.Structure(53);
        structure1.clear();
        structure1.setX((-95));
        structure1.setX(36);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.setX(8);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        structure1.setX(8);
        structure1.clear();
        structure1.setX((-5));
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-10));
        structure1.setX(1);
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.setX(54);
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.setX(7);
        int int12 = structure0.foo();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 55 + "'", int9 == 55);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        structure1.setX((-5));
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
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
        int int18 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-97) + "'", int17 == (-97));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-97) + "'", int18 == (-97));
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        structure1.setX(36);
        int int26 = structure1.foo();
        structure1.clear();
        structure1.setX(53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 37 + "'", int26 == 37);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
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
        structure1.setX((-2));
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        examples.Structure structure1 = new examples.Structure(34);
        int int2 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX(99);
        structure1.setX((-7));
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        int int13 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-6) + "'", int11 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-6) + "'", int13 == (-6));
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        structure1.setX((-9));
        structure1.clear();
        structure1.setX((int) (short) 0);
        int int11 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(0);
        structure0.setX(39);
        structure0.setX((int) (byte) -1);
        structure0.clear();
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.setX(98);
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.setX(12);
        structure0.clear();
        structure0.setX(41);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.clear();
        structure1.setX((-96));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(38);
        structure1.setX(105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-10));
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-9) + "'", int11 == (-9));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(37);
        structure1.clear();
        int int12 = structure1.foo();
        structure1.setX((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 1);
        int int11 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.clear();
        structure1.setX(0);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        structure1.setX((-4));
        structure1.setX(9);
        int int10 = structure1.foo();
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        examples.Structure structure1 = new examples.Structure(33);
        int int2 = structure1.foo();
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass11 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        structure1.setX((-10));
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-9) + "'", int20 == (-9));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((int) (short) 100);
        structure1.setX((-6));
        structure1.setX((int) '4');
        structure1.setX((-9));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX(1);
        structure1.setX((-5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(40);
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 41 + "'", int12 == 41);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        structure1.clear();
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(106);
        int int11 = structure1.foo();
        structure1.setX(57);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 107 + "'", int11 == 107);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-1));
        structure1.setX(99);
        structure1.setX(33);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX(0);
        structure1.setX((-9));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX((-7));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX(38);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX((-1));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-3));
        structure1.setX(37);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4 == (-7));
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(99);
        structure1.setX(2);
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.setX((int) ' ');
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        examples.Structure structure1 = new examples.Structure(42);
        structure1.setX(1);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.clear();
        structure1.setX(10);
        structure1.setX(9);
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        int int3 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.setX(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.clear();
        structure1.setX(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) ' ');
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.clear();
        structure1.setX(12);
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        structure0.setX(1);
        structure0.clear();
        structure0.setX(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
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
        structure1.setX(3);
        structure1.setX((int) (byte) 0);
        int int30 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((-98));
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(41);
        structure1.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        int int12 = structure0.foo();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass15 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-6) + "'", int10 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((int) (short) 100);
        structure1.setX(3);
        int int6 = structure1.foo();
        structure1.setX(1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(102);
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 103 + "'", int6 == 103);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        structure1.setX(101);
        structure1.setX(4);
        structure1.setX(103);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-6));
        structure1.clear();
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        examples.Structure structure1 = new examples.Structure(11);
        structure1.setX((-7));
        structure1.setX(11);
        structure1.setX((-99));
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-98) + "'", int8 == (-98));
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        structure1.clear();
        structure1.setX(105);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX((-4));
        structure1.setX((int) (byte) 0);
        structure1.setX(6);
        structure1.clear();
        structure1.setX(37);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX(10);
        structure1.clear();
        structure1.setX((-10));
        structure1.setX(102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(99);
        int int7 = structure0.foo();
        structure0.setX(55);
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 56 + "'", int10 == 56);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        structure1.setX(4);
        structure1.clear();
        structure1.setX(38);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX(4);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX(53);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        structure1.setX((-96));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
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
        structure1.setX(35);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX(53);
        structure1.clear();
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 100);
        structure1.setX(8);
        int int13 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(101);
        int int6 = structure1.foo();
        structure1.setX((-5));
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 102 + "'", int6 == 102);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.setX((-100));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        int int25 = structure1.foo();
        java.lang.Class<?> wildcardClass26 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 99 + "'", int25 == 99);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX(10);
        structure1.setX(0);
        structure1.setX(10);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
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
        structure1.setX(0);
        int int31 = structure1.foo();
        structure1.setX((-6));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4) + "'", int28 == (-4));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.setX(9);
        structure1.clear();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        structure1.clear();
        structure1.clear();
        structure1.setX((-6));
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int13 = structure1.foo();
        structure1.clear();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        structure1.setX(98);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(102);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        examples.Structure structure1 = new examples.Structure(11);
        structure1.setX(34);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX(101);
        structure1.setX(6);
        int int10 = structure1.foo();
        structure1.setX((-3));
        structure1.setX(11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX(0);
        structure1.setX(38);
        structure1.setX(37);
        structure1.clear();
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        int int4 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-8) + "'", int4 == (-8));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-99) + "'", int10 == (-99));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-6) + "'", int17 == (-6));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX(34);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) '4');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.setX((-5));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 101 + "'", int7 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(98);
        int int9 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int12 = structure0.foo();
        structure0.setX((-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.clear();
        structure1.setX(34);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) '4');
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(42);
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        structure1.setX(3);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX((-99));
        structure1.setX((-1));
        structure1.clear();
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX(104);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(0);
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.setX(38);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(1);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        structure1.clear();
        structure1.setX(100);
        structure1.setX(33);
        structure1.setX(99);
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        structure1.clear();
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(3);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int14 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        structure1.setX((int) ' ');
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX(7);
        structure1.clear();
        structure1.setX(101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.setX(37);
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.setX(103);
        structure1.setX(40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX((int) 'a');
        structure1.setX(10);
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(104);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 105 + "'", int10 == 105);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX(107);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX(98);
        structure1.setX(101);
        int int7 = structure1.foo();
        structure1.setX((int) (short) 10);
        structure1.setX(53);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 102 + "'", int7 == 102);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX(5);
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
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
        structure1.setX(35);
        structure1.setX(0);
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        structure0.setX(54);
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 55 + "'", int8 == 55);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 55 + "'", int9 == 55);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        structure1.setX((-7));
        structure1.setX((int) (byte) -1);
        structure1.setX(54);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
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
        structure1.setX((int) 'a');
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        structure1.setX((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(7);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(0);
        structure1.setX(98);
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        structure1.setX(4);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(9);
        int int5 = structure0.foo();
        structure0.setX(35);
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-7));
        structure1.setX(34);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX((int) (short) 0);
        structure1.setX(5);
        structure1.setX(103);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.clear();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 104 + "'", int10 == 104);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 104 + "'", int11 == 104);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        structure0.setX(9);
        structure0.setX(33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        structure1.setX(11);
        structure1.setX(33);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
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
        structure1.setX(104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        int int29 = structure1.foo();
        structure1.setX((-100));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4) + "'", int28 == (-4));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-4) + "'", int29 == (-4));
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
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
        int int24 = structure1.foo();
        structure1.setX((-100));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(1);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((-5));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-4) + "'", int4 == (-4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-4) + "'", int5 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(103);
        structure1.setX(8);
        structure1.setX((-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX(106);
        structure0.setX((-10));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        examples.Structure structure1 = new examples.Structure(42);
        structure1.clear();
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        int int22 = structure1.foo();
        int int23 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(37);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) ' ');
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        examples.Structure structure1 = new examples.Structure((int) '4');
        structure1.setX((-8));
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-7) + "'", int4 == (-7));
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
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
        int int17 = structure1.foo();
        structure1.setX(40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(3);
        structure1.clear();
        structure1.setX((-3));
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-2) + "'", int13 == (-2));
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(13);
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        int int5 = structure1.foo();
        structure1.setX(0);
        structure1.setX(98);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 99 + "'", int10 == 99);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (short) 0);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        int int9 = structure0.foo();
        int int10 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        examples.Structure structure1 = new examples.Structure(102);
        structure1.setX(100);
        structure1.setX(6);
        int int6 = structure1.foo();
        structure1.setX(39);
        int int9 = structure1.foo();
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX(106);
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 107 + "'", int4 == 107);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        structure1.setX((-4));
        structure1.clear();
        int int17 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX((-7));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(36);
        structure1.setX(53);
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(102);
        structure1.setX((int) '4');
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        structure1.setX((int) (short) 0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        structure1.setX((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.setX(108);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
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
        structure1.clear();
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX((int) (short) 0);
        structure1.setX(14);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.setX(11);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.setX((-2));
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.setX(1);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        int int5 = structure1.foo();
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-96));
        structure1.setX(1);
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(104);
        int int10 = structure1.foo();
        structure1.setX(99);
        structure1.setX(0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 105 + "'", int10 == 105);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.clear();
        structure1.setX(36);
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
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
        structure1.clear();
        int int22 = structure1.foo();
        structure1.setX(59);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 55 + "'", int20 == 55);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) 'a');
        structure1.setX(33);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        structure1.setX((-4));
        int int22 = structure1.foo();
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-3) + "'", int22 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        structure1.setX(6);
        structure1.setX((-9));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-7) + "'", int7 == (-7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 39 + "'", int12 == 39);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        int int5 = structure0.foo();
        structure0.clear();
        structure0.setX((int) (byte) 100);
        structure0.setX(100);
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 98 + "'", int5 == 98);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.setX(107);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        structure1.setX((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
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
        structure1.setX(2);
        structure1.setX(9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        structure1.setX(10);
        structure1.setX(10);
        int int21 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.setX((-4));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) '4');
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX(36);
        structure1.clear();
        structure1.setX(0);
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.setX(4);
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (byte) 100);
        structure1.clear();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
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
        structure1.clear();
        int int17 = structure1.foo();
        structure1.clear();
        int int19 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        structure1.setX(6);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        examples.Structure structure1 = new examples.Structure(11);
        structure1.setX((-7));
        structure1.clear();
        structure1.setX(99);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.setX(2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.setX(34);
        structure0.setX(103);
        java.lang.Class<?> wildcardClass11 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
        int int15 = structure1.foo();
        structure1.setX((int) (byte) -1);
        int int18 = structure1.foo();
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX(98);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.setX(36);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        examples.Structure structure1 = new examples.Structure(100);
        int int2 = structure1.foo();
        structure1.setX(101);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        examples.Structure structure1 = new examples.Structure((-8));
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-8));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(99);
        structure0.setX(1);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        examples.Structure structure1 = new examples.Structure((-100));
        structure1.setX(1);
        structure1.clear();
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        int int7 = structure0.foo();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-5) + "'", int7 == (-5));
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(102);
        structure1.clear();
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        structure1.clear();
        structure1.clear();
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(100);
        structure0.setX((-97));
        structure0.setX(36);
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        examples.Structure structure1 = new examples.Structure(11);
        structure1.setX((-7));
        structure1.setX(11);
        structure1.setX((-99));
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        examples.Structure structure1 = new examples.Structure((-2));
        int int2 = structure1.foo();
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        structure1.setX((-97));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(10);
        structure1.setX(39);
        int int11 = structure1.foo();
        structure1.setX(7);
        structure1.setX((-2));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((int) '#');
        structure1.clear();
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX((int) (short) -1);
        structure0.setX(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        int int2 = structure1.foo();
        structure1.setX((-6));
        structure1.setX(1);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
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
        structure1.setX(5);
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 101 + "'", int17 == 101);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((-99));
        structure1.clear();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((int) (short) -1);
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        structure1.setX(10);
        structure1.clear();
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX(0);
        structure0.clear();
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX(55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX(5);
        structure1.setX(4);
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.setX((-4));
        structure0.setX(102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int9 = structure1.foo();
        structure1.setX(2);
        structure1.setX(0);
        structure1.setX(39);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        int int9 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.clear();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        structure0.clear();
        structure0.setX(1);
        structure0.setX((-8));
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        structure1.setX(36);
        structure1.setX(14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) ' ');
        structure1.setX(2);
        structure1.setX((int) '#');
        structure1.setX((-1));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        structure1.setX(0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-3) + "'", int17 == (-3));
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(38);
        structure1.setX((-98));
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        int int15 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        structure1.setX(1);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX(53);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(100);
        structure1.setX((-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX(100);
        structure1.clear();
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.setX((int) (byte) 1);
        structure1.setX((int) (byte) 100);
        structure1.setX(2);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((-3));
        structure1.setX(36);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.setX((-2));
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.clear();
        structure1.clear();
        structure1.clear();
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        structure1.setX(58);
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX((-99));
        structure1.setX((-1));
        structure1.clear();
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        int int16 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.setX((int) '#');
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
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
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        int int17 = structure1.foo();
        structure1.setX(7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((-5));
        int int10 = structure1.foo();
        structure1.setX(0);
        structure1.setX(104);
        structure1.setX(2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-4) + "'", int10 == (-4));
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        structure1.setX(2);
        structure1.setX(7);
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.setX((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.clear();
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        structure0.clear();
        int int10 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((-9));
        structure1.setX((-5));
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.setX((int) (byte) 1);
        structure1.setX((int) (short) 100);
        int int12 = structure1.foo();
        structure1.setX((-100));
        structure1.setX((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 1);
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        int int20 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX(0);
        int int9 = structure0.foo();
        structure0.clear();
        int int11 = structure0.foo();
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        structure1.setX(59);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(103);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 104 + "'", int7 == 104);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 104 + "'", int8 == 104);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.setX(41);
        structure1.clear();
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX(10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(35);
        int int12 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.setX(4);
        structure1.clear();
        structure1.setX((int) (short) 100);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        examples.Structure structure1 = new examples.Structure(36);
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.setX((-98));
        int int7 = structure1.foo();
        structure1.setX((int) (byte) 100);
        structure1.setX((-98));
        structure1.setX(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-97) + "'", int7 == (-97));
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        structure1.setX(0);
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.setX((-6));
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX(98);
        structure1.clear();
        structure1.setX(34);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
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
        int int29 = structure1.foo();
        structure1.clear();
        structure1.setX(57);
        java.lang.Class<?> wildcardClass33 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-4) + "'", int28 == (-4));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-4) + "'", int29 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
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
        structure1.clear();
        structure1.setX(40);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.setX(10);
        structure1.setX((-2));
        structure1.clear();
        structure1.setX(11);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.setX(98);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        structure1.setX((int) (short) 1);
        structure1.setX((int) (byte) -1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((-99));
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-96));
        structure1.setX((-95));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.setX(7);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        examples.Structure structure1 = new examples.Structure(3);
        int int2 = structure1.foo();
        structure1.setX(5);
        structure1.setX(98);
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
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
        structure1.setX(37);
        structure1.setX((-1));
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(103);
        structure1.setX(0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.setX(101);
        structure1.setX(58);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
        structure1.setX(1);
        int int21 = structure1.foo();
        structure1.setX((-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.setX(37);
        structure1.setX(6);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        structure1.setX(101);
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(106);
        structure1.setX((-1));
        structure1.setX(34);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX(38);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        structure1.setX((int) (byte) 100);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(10);
        int int6 = structure1.foo();
        structure1.setX((-1));
        structure1.setX(102);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 11 + "'", int6 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX((int) (byte) 1);
        structure1.clear();
        structure1.clear();
        structure1.setX(12);
        structure1.clear();
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.setX(101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        structure1.setX(6);
        int int26 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(99);
        int int6 = structure1.foo();
        structure1.setX(4);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-100));
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(0);
        structure0.setX(39);
        int int7 = structure0.foo();
        int int8 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.setX((int) (byte) 1);
        structure1.setX((int) (short) 100);
        int int12 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.clear();
        structure1.setX((-1));
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(5);
        structure1.setX((-5));
        structure1.clear();
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(99);
        structure0.setX(1);
        structure0.setX((int) '#');
        structure0.setX((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX(53);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54 + "'", int6 == 54);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) (short) -1);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX(38);
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 39 + "'", int9 == 39);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 39 + "'", int10 == 39);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 39 + "'", int11 == 39);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        structure1.setX(41);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
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
        structure1.setX((-5));
        int int22 = structure1.foo();
        java.lang.Class<?> wildcardClass23 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-4) + "'", int22 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        examples.Structure structure1 = new examples.Structure(7);
        int int2 = structure1.foo();
        structure1.setX((-96));
        structure1.setX((int) (byte) 0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(103);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) (short) -1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        examples.Structure structure1 = new examples.Structure(33);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
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
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((-6));
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        structure1.setX((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(10);
        structure1.clear();
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((int) (short) 1);
        int int11 = structure1.foo();
        structure1.setX(37);
        structure1.setX((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        int int12 = structure0.foo();
        int int13 = structure0.foo();
        structure0.setX(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-6) + "'", int10 == (-6));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.clear();
        structure0.setX(35);
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-2) + "'", int16 == (-2));
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
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
        structure0.setX(58);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 105 + "'", int12 == 105);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX(100);
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-1));
        structure1.setX((-9));
        int int9 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int13 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        java.lang.Class<?> wildcardClass17 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX(0);
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(5);
        structure1.clear();
        structure1.setX((int) (byte) -1);
        structure1.setX(12);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX(1);
        structure1.clear();
        structure1.setX((-97));
        int int13 = structure1.foo();
        structure1.setX((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-96) + "'", int13 == (-96));
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        structure1.setX(99);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX(38);
        structure1.setX(55);
        structure1.clear();
        int int13 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int14 = structure1.foo();
        int int15 = structure1.foo();
        structure1.setX(58);
        structure1.setX((int) (short) -1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.clear();
        structure1.setX(7);
        structure1.setX((-10));
        int int9 = structure1.foo();
        structure1.setX(100);
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-9) + "'", int9 == (-9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX((-100));
        structure1.setX(53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        structure1.setX(11);
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        examples.Structure structure1 = new examples.Structure(98);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
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
        int int21 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.setX(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
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
        structure1.setX(8);
        int int21 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        structure1.setX((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.setX(13);
        structure1.clear();
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(1);
        structure1.setX(11);
        int int12 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 1);
        structure1.setX(0);
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(99);
        structure1.clear();
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(10);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        structure1.setX(103);
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        examples.Structure structure1 = new examples.Structure(35);
        structure1.setX(1);
        structure1.clear();
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(105);
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 106 + "'", int7 == 106);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.setX(37);
        structure1.setX(1);
        structure1.clear();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.setX((-6));
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-5) + "'", int10 == (-5));
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) -1);
        structure0.setX(0);
        structure0.clear();
        structure0.setX(8);
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.setX(2);
        structure1.setX((-98));
        structure1.setX((-1));
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(101);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.setX((int) (byte) 10);
        int int7 = structure1.foo();
        structure1.clear();
        structure1.setX(57);
        structure1.setX(106);
        int int13 = structure1.foo();
        int int14 = structure1.foo();
        structure1.setX(106);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 107 + "'", int13 == 107);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 107 + "'", int14 == 107);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
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
        structure1.setX(39);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX(5);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.clear();
        structure1.clear();
        structure1.setX(39);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(12);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '4');
        structure1.setX(58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        structure1.setX((int) 'a');
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) 100);
        structure0.setX(0);
        int int9 = structure0.foo();
        structure0.clear();
        int int11 = structure0.foo();
        int int12 = structure0.foo();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((int) (byte) 1);
        int int9 = structure1.foo();
        structure1.setX((int) (byte) -1);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        structure1.clear();
        structure1.setX(99);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(103);
        int int10 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 104 + "'", int10 == 104);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(34);
        structure1.setX(8);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX((-3));
        int int11 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int14 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-2) + "'", int11 == (-2));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        structure1.clear();
        int int16 = structure1.foo();
        structure1.setX(57);
        int int19 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 58 + "'", int19 == 58);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(3);
        structure1.setX(5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.setX(98);
        structure1.setX((int) (byte) 1);
        int int6 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(5);
        structure1.clear();
        structure1.clear();
        structure1.setX(33);
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 33 + "'", int10 == 33);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        structure1.setX((-9));
        structure1.setX(100);
        int int28 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 101 + "'", int28 == 101);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        structure1.clear();
        structure1.setX(39);
    }
}

