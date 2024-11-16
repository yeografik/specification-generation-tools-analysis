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
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        examples.Structure structure1 = new examples.Structure(9);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        java.lang.Class<?> wildcardClass4 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        java.lang.Class<?> wildcardClass3 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        examples.Structure structure1 = new examples.Structure(6);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        examples.Structure structure1 = new examples.Structure((-2));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        examples.Structure structure1 = new examples.Structure(3);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        examples.Structure structure1 = new examples.Structure((int) '#');
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int8 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((-5));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        examples.Structure structure1 = new examples.Structure(10);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        examples.Structure structure1 = new examples.Structure((-3));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        examples.Structure structure1 = new examples.Structure((int) '4');
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        java.lang.Class<?> wildcardClass3 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        examples.Structure structure1 = new examples.Structure((-6));
        structure1.setX((-4));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        examples.Structure structure1 = new examples.Structure((-1));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        java.lang.Class<?> wildcardClass3 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((-5));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        examples.Structure structure1 = new examples.Structure(11);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.setX(5);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        examples.Structure structure1 = new examples.Structure((-10));
        structure1.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        examples.Structure structure1 = new examples.Structure((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        int int7 = structure0.foo();
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        examples.Structure structure0 = new examples.Structure();
        java.lang.Class<?> wildcardClass1 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        examples.Structure structure1 = new examples.Structure((-4));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) -1);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(7);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) -1);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.clear();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        examples.Structure structure1 = new examples.Structure(102);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        int int9 = structure1.foo();
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        structure1.setX((-8));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        examples.Structure structure1 = new examples.Structure(33);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX(4);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        structure1.setX(10);
        structure1.setX(0);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.clear();
        java.lang.Class<?> wildcardClass4 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(10);
        int int11 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.clear();
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.setX(6);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        examples.Structure structure1 = new examples.Structure(0);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        examples.Structure structure1 = new examples.Structure(100);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        examples.Structure structure1 = new examples.Structure(101);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(10);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) -1);
        structure0.setX(0);
        int int9 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.clear();
        structure1.setX((int) (short) 10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX((int) (short) -1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass21 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.clear();
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        int int6 = structure1.foo();
        structure1.setX(98);
        structure1.setX((int) 'a');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int13 = structure1.foo();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.setX(0);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.clear();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        examples.Structure structure1 = new examples.Structure((int) (short) 0);
        structure1.setX(10);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX(2);
        structure0.clear();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        examples.Structure structure1 = new examples.Structure(11);
        structure1.setX((-7));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.clear();
        structure0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.clear();
        structure1.setX(7);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((-5));
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX((-5));
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX(2);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        structure0.clear();
        structure0.clear();
        int int6 = structure0.foo();
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((int) (byte) -1);
        structure1.setX((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        examples.Structure structure1 = new examples.Structure((-100));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        structure1.setX(100);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        examples.Structure structure1 = new examples.Structure(2);
        structure1.setX(2);
        structure1.setX(100);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        examples.Structure structure1 = new examples.Structure((-4));
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        examples.Structure structure1 = new examples.Structure((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass24 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        structure1.setX(102);
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        examples.Structure structure1 = new examples.Structure(98);
        structure1.setX((-9));
        structure1.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.Class<?> wildcardClass26 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX((int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        examples.Structure structure1 = new examples.Structure((-10));
        structure1.setX((int) (byte) 1);
        structure1.setX(99);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        structure1.clear();
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        structure1.setX(103);
        int int5 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 104 + "'", int5 == 104);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        structure1.setX(100);
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.clear();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        int int8 = structure1.foo();
        structure1.setX(7);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((-4));
        structure0.setX(0);
        structure0.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.setX((-4));
        structure1.clear();
        structure1.setX(37);
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        int int7 = structure0.foo();
        structure0.clear();
        structure0.setX(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass3 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        int int10 = structure1.foo();
        structure1.setX((-7));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX(99);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(10);
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        examples.Structure structure1 = new examples.Structure((-98));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.clear();
        int int3 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.clear();
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((int) (short) 100);
        int int4 = structure1.foo();
        structure1.setX(8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.setX(98);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((-5));
        structure0.clear();
        structure0.setX(11);
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.setX(8);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass4 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        examples.Structure structure1 = new examples.Structure(8);
        structure1.setX((-8));
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((-99));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX((-4));
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        structure1.setX(36);
        structure1.setX((int) (byte) 0);
        structure1.setX((int) '#');
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        int int3 = structure0.foo();
        java.lang.Class<?> wildcardClass4 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        structure1.clear();
        java.lang.Class<?> wildcardClass27 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        examples.Structure structure1 = new examples.Structure(54);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.setX(2);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.clear();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) -1);
        structure1.setX((-100));
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.setX((int) ' ');
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        structure1.setX((int) '4');
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        int int7 = structure0.foo();
        structure0.clear();
        int int9 = structure0.foo();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX((-4));
        structure1.setX(0);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        structure0.clear();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        int int11 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        examples.Structure structure1 = new examples.Structure((-98));
        structure1.setX((-2));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.setX(103);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX((int) (short) 100);
        structure1.setX(8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(8);
        structure0.setX(98);
        structure0.clear();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.setX((int) '4');
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        structure1.setX(11);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        examples.Structure structure1 = new examples.Structure(37);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 10);
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        structure1.setX(36);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        examples.Structure structure1 = new examples.Structure(3);
        int int2 = structure1.foo();
        structure1.setX(5);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        examples.Structure structure1 = new examples.Structure(1);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        int int15 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        examples.Structure structure1 = new examples.Structure((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((-1));
        structure0.setX(5);
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        examples.Structure structure1 = new examples.Structure(100);
        structure1.setX((int) (byte) -1);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 101 + "'", int11 == 101);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        int int23 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 101 + "'", int20 == 101);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 99 + "'", int23 == 99);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(98);
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        structure1.setX(8);
        int int10 = structure1.foo();
        int int11 = structure1.foo();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.setX(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.Class<?> wildcardClass19 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        examples.Structure structure1 = new examples.Structure(38);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        structure1.setX(33);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        structure1.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
        structure1.clear();
        java.lang.Class<?> wildcardClass20 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX(0);
        int int6 = structure1.foo();
        structure1.setX(6);
        structure1.clear();
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        structure1.setX((int) (short) 1);
        structure1.clear();
        structure1.setX(10);
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        structure1.setX(101);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        java.lang.Class<?> wildcardClass2 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        examples.Structure structure1 = new examples.Structure((-7));
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.clear();
        java.lang.Class<?> wildcardClass8 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX(0);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.clear();
        structure1.setX((int) '#');
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass17 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.setX(0);
        structure1.setX((int) (short) 0);
        structure1.clear();
        structure1.setX((-4));
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-6));
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        examples.Structure structure1 = new examples.Structure(1);
        int int2 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX(53);
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54 + "'", int7 == 54);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        structure1.setX((int) '4');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        int int9 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 53 + "'", int9 == 53);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        examples.Structure structure1 = new examples.Structure((-7));
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((-6));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX(0);
        structure1.clear();
        structure1.setX((int) '4');
        int int10 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        examples.Structure structure1 = new examples.Structure((-99));
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-98) + "'", int2 == (-98));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        int int8 = structure1.foo();
        structure1.setX((int) 'a');
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        examples.Structure structure1 = new examples.Structure((-99));
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.clear();
        structure1.setX(6);
        structure1.setX(10);
        structure1.clear();
        structure1.setX(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((int) (byte) 1);
        structure0.setX((-1));
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        structure1.setX((-5));
        structure1.setX(102);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(37);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        structure1.setX(1);
        int int7 = structure1.foo();
        structure1.setX((-3));
        structure1.clear();
        structure1.setX((-2));
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        structure0.clear();
        structure0.clear();
        java.lang.Class<?> wildcardClass4 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        examples.Structure structure1 = new examples.Structure(9);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.setX((int) (byte) 10);
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 33 + "'", int7 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 33 + "'", int8 == 33);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        int int6 = structure0.foo();
        int int7 = structure0.foo();
        structure0.setX(102);
        structure0.clear();
        java.lang.Class<?> wildcardClass11 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((int) ' ');
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        structure1.clear();
        structure1.setX(6);
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        examples.Structure structure1 = new examples.Structure(7);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        structure1.setX((-8));
        structure1.setX(3);
        structure1.setX(7);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        examples.Structure structure1 = new examples.Structure((int) ' ');
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(103);
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 104 + "'", int7 == 104);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        structure1.setX(7);
        int int5 = structure1.foo();
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        int int7 = structure1.foo();
        structure1.setX(10);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((-100));
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.setX((-3));
        int int5 = structure1.foo();
        structure1.setX((int) (byte) 0);
        structure1.setX((-8));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((int) '#');
        structure1.setX((-99));
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        structure1.clear();
        int int11 = structure1.foo();
        structure1.setX((-1));
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((-99));
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-98) + "'", int7 == (-98));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        examples.Structure structure0 = new examples.Structure();
        structure0.clear();
        structure0.clear();
        structure0.setX(0);
        structure0.setX((int) ' ');
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        examples.Structure structure1 = new examples.Structure((int) '#');
        int int2 = structure1.foo();
        structure1.setX(9);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36 + "'", int2 == 36);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.clear();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.setX((int) 'a');
        structure1.setX((-100));
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        examples.Structure structure1 = new examples.Structure(4);
        java.lang.Class<?> wildcardClass2 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        int int10 = structure1.foo();
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        int int6 = structure1.foo();
        structure1.setX((-4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.clear();
        structure1.setX(100);
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 101 + "'", int5 == 101);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX(100);
        java.lang.Class<?> wildcardClass7 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.setX(4);
        int int6 = structure1.foo();
        java.lang.Class<?> wildcardClass7 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        examples.Structure structure1 = new examples.Structure((-9));
        structure1.setX(0);
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        examples.Structure structure1 = new examples.Structure((-10));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.setX((-100));
        int int6 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-9) + "'", int2 == (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-9) + "'", int3 == (-9));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-99) + "'", int6 == (-99));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.clear();
        structure1.setX((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        examples.Structure structure1 = new examples.Structure(104);
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        examples.Structure structure1 = new examples.Structure((-8));
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        examples.Structure structure1 = new examples.Structure(10);
        int int2 = structure1.foo();
        structure1.setX((int) ' ');
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.setX((int) (short) 1);
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.setX(103);
        structure1.clear();
        int int7 = structure1.foo();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        examples.Structure structure1 = new examples.Structure((-3));
        structure1.setX((-6));
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int11 = structure1.foo();
        int int12 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        structure0.setX(10);
        structure0.setX(100);
        int int9 = structure0.foo();
        java.lang.Class<?> wildcardClass10 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        examples.Structure structure1 = new examples.Structure((int) (short) 10);
        structure1.setX(10);
        int int4 = structure1.foo();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.clear();
        structure0.setX((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        int int3 = structure0.foo();
        int int4 = structure0.foo();
        structure0.setX((-6));
        structure0.setX(98);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((-100));
        structure0.setX((int) (byte) 1);
        int int5 = structure0.foo();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.setX(1);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        examples.Structure structure1 = new examples.Structure((-1));
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        examples.Structure structure1 = new examples.Structure((int) (short) 1);
        structure1.setX(0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.setX((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        examples.Structure structure1 = new examples.Structure(0);
        int int2 = structure1.foo();
        structure1.setX(4);
        int int5 = structure1.foo();
        structure1.clear();
        int int7 = structure1.foo();
        int int8 = structure1.foo();
        structure1.setX(103);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(2);
        structure1.setX((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        examples.Structure structure1 = new examples.Structure((int) 'a');
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.setX(36);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.setX(3);
        structure1.setX((-7));
        structure1.setX((-2));
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        structure1.clear();
        structure1.setX(99);
        structure1.setX((int) (short) 0);
        structure1.setX(54);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX(1);
        structure1.setX((-1));
        structure1.setX(0);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.clear();
        structure1.clear();
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.setX(104);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-7) + "'", int13 == (-7));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-7) + "'", int14 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX(10);
        structure1.setX((int) (byte) 100);
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 101 + "'", int8 == 101);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        examples.Structure structure1 = new examples.Structure(33);
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((-3));
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.setX((int) (byte) 0);
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((-7));
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        examples.Structure structure1 = new examples.Structure((int) (byte) 1);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        examples.Structure structure1 = new examples.Structure((int) (short) 100);
        int int2 = structure1.foo();
        structure1.setX(101);
        structure1.setX((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.setX((int) '4');
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass14 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        int int7 = structure1.foo();
        structure1.setX((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.clear();
        structure1.setX(10);
        int int8 = structure1.foo();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        structure1.setX((int) (short) 0);
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        examples.Structure structure1 = new examples.Structure(6);
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        examples.Structure structure1 = new examples.Structure((-5));
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX((int) (byte) 1);
        structure0.setX((int) (byte) -1);
        structure0.setX(0);
        java.lang.Class<?> wildcardClass9 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        examples.Structure structure1 = new examples.Structure(36);
        structure1.clear();
        structure1.setX((int) '4');
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass28 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        examples.Structure structure1 = new examples.Structure((-5));
        structure1.clear();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX((int) (short) 0);
        structure1.setX((-5));
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX(8);
        structure1.clear();
        structure1.setX(100);
        structure1.clear();
        java.lang.Class<?> wildcardClass8 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        structure1.setX(6);
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        structure1.setX(1);
        int int4 = structure1.foo();
        structure1.setX((int) (byte) 0);
        int int7 = structure1.foo();
        structure1.setX(6);
        structure1.setX((-98));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        int int14 = structure1.foo();
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        examples.Structure structure0 = new examples.Structure();
        structure0.setX((int) 'a');
        structure0.setX((-5));
        structure0.clear();
        java.lang.Class<?> wildcardClass6 = structure0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        structure1.setX(100);
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        int int3 = structure0.foo();
        structure0.clear();
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        java.lang.Class<?> wildcardClass12 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-6) + "'", int10 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        examples.Structure structure1 = new examples.Structure(8);
        int int2 = structure1.foo();
        structure1.setX((-7));
        structure1.setX((int) ' ');
        structure1.setX((-6));
        int int9 = structure1.foo();
        int int10 = structure1.foo();
        structure1.clear();
        java.lang.Class<?> wildcardClass12 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-5) + "'", int10 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        examples.Structure structure1 = new examples.Structure(0);
        structure1.setX((-100));
        structure1.setX((int) 'a');
        int int6 = structure1.foo();
        int int7 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        structure1.setX(9);
        structure1.clear();
        structure1.setX((-4));
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        structure1.clear();
        structure1.setX((-4));
        int int12 = structure1.foo();
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        examples.Structure structure1 = new examples.Structure(10);
        structure1.setX(98);
        structure1.clear();
        int int5 = structure1.foo();
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        examples.Structure structure1 = new examples.Structure(7);
        structure1.setX((int) (short) -1);
        int int4 = structure1.foo();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.setX((-5));
        structure1.clear();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        examples.Structure structure1 = new examples.Structure((int) (byte) -1);
        structure1.setX(0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX((-1));
        structure1.clear();
        java.lang.Class<?> wildcardClass9 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass18 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        structure1.clear();
        structure1.setX(1);
        structure1.clear();
        int int9 = structure1.foo();
        java.lang.Class<?> wildcardClass10 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        examples.Structure structure1 = new examples.Structure(9);
        structure1.setX((int) (byte) 0);
        int int4 = structure1.foo();
        int int5 = structure1.foo();
        structure1.clear();
        structure1.clear();
        structure1.clear();
        structure1.setX(101);
        java.lang.Class<?> wildcardClass11 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass22 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 101 + "'", int15 == 101);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.Class<?> wildcardClass13 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        examples.Structure structure0 = new examples.Structure();
        int int1 = structure0.foo();
        int int2 = structure0.foo();
        structure0.setX(0);
        java.lang.Class<?> wildcardClass5 = structure0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Class<?> wildcardClass16 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        examples.Structure structure1 = new examples.Structure((-1));
        int int2 = structure1.foo();
        structure1.clear();
        structure1.setX((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        examples.Structure structure1 = new examples.Structure(100);
        int int2 = structure1.foo();
        java.lang.Class<?> wildcardClass3 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.Class<?> wildcardClass13 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        examples.Structure structure1 = new examples.Structure(6);
        structure1.setX(0);
        structure1.clear();
        structure1.clear();
        structure1.setX(100);
        structure1.setX((int) (short) 100);
        structure1.clear();
        structure1.setX(8);
        structure1.setX((-6));
        java.lang.Class<?> wildcardClass15 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        examples.Structure structure1 = new examples.Structure((int) (byte) 100);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        examples.Structure structure1 = new examples.Structure(36);
        int int2 = structure1.foo();
        int int3 = structure1.foo();
        java.lang.Class<?> wildcardClass4 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        examples.Structure structure1 = new examples.Structure(3);
        structure1.clear();
        int int3 = structure1.foo();
        structure1.setX((int) '#');
        java.lang.Class<?> wildcardClass6 = structure1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        structure1.setX(10);
        java.lang.Class<?> wildcardClass22 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        int int14 = structure1.foo();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        examples.Structure structure1 = new examples.Structure(101);
        structure1.clear();
        structure1.clear();
        structure1.clear();
        java.lang.Class<?> wildcardClass5 = structure1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

