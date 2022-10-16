import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        java.lang.Class<?> wildcardClass1 = simpleMethods0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(32, 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin(10, 97);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 1, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-1), (int) '#');
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(32, 10);
        int int12 = simpleMethods0.getMin((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(0, (-1));
        int int15 = simpleMethods0.getMin((int) '4', 97);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 97);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(97, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        int int12 = simpleMethods0.getMin((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, 1);
        int int9 = simpleMethods0.getMin(97, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 32);
        int int15 = simpleMethods0.getMin(97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((int) ' ', 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) '4');
        int int18 = simpleMethods0.getMin((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin(35, 32);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        int int18 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        int int15 = simpleMethods0.getMin(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) '4');
        int int18 = simpleMethods0.getMin((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int18 = simpleMethods0.getMin(52, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(35, (int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        int int18 = simpleMethods0.getMin(0, (-1));
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) 'a', 0);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) 0, 32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin((int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(97, (int) 'a');
        int int21 = simpleMethods0.getMin((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (byte) 1, 52);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) '4', 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        int int18 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int21 = simpleMethods0.getMin(1, (int) '#');
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 10);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 10);
        int int9 = simpleMethods0.getMin(10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) ' ', 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(0, (-1));
        int int15 = simpleMethods0.getMin(100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin(52, (int) 'a');
        int int27 = simpleMethods0.getMin(97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        int int18 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int21 = simpleMethods0.getMin(1, (int) '#');
        int int24 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 32);
        int int27 = simpleMethods0.getMin((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        int int15 = simpleMethods0.getMin(0, (int) (short) 1);
        int int18 = simpleMethods0.getMin(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int6 = simpleMethods0.getMin((int) '#', 32);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int15 = simpleMethods0.getMin((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin((int) '4', 52);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(10, (int) (short) 0);
        int int18 = simpleMethods0.getMin(97, (-1));
        int int21 = simpleMethods0.getMin(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(100, (int) '4');
        int int15 = simpleMethods0.getMin((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(0, (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        int int6 = simpleMethods0.getMin((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int6 = simpleMethods0.getMin((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 0, (-1));
        int int24 = simpleMethods0.getMin((int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin(0, (int) 'a');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(97, (int) 'a');
        int int21 = simpleMethods0.getMin(0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass4 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, 35);
        int int21 = simpleMethods0.getMin((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(0, 0);
        int int15 = simpleMethods0.getMin(10, (int) '4');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin(32, 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 10);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) 1);
        int int21 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 1);
        int int24 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(35, 52);
        int int21 = simpleMethods0.getMin((int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', (int) '4');
        int int9 = simpleMethods0.getMin(32, (-1));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(10, (int) (short) 1);
        int int24 = simpleMethods0.getMin(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 32);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(35, (int) ' ');
        int int21 = simpleMethods0.getMin((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin((int) ' ', (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) (byte) 1, 35);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin(97, (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        int int6 = simpleMethods0.getMin((int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) '#');
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int18 = simpleMethods0.getMin((int) (short) 0, 32);
        int int21 = simpleMethods0.getMin((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) '#');
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) (short) 1);
        int int21 = simpleMethods0.getMin((int) (short) 0, (-1));
        int int24 = simpleMethods0.getMin((int) '#', (int) (byte) 0);
        int int27 = simpleMethods0.getMin((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', (int) '4');
        int int9 = simpleMethods0.getMin(32, (-1));
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', (int) '4');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 100);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin(52, 0);
        int int15 = simpleMethods0.getMin(97, (int) '4');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(35, 52);
        int int21 = simpleMethods0.getMin(97, 97);
        int int24 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(10, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) '#', 32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 32);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(32, 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(32, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, 1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 1, (int) (byte) -1);
        int int18 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(0, (-1));
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(1, (int) (short) -1);
        int int12 = simpleMethods0.getMin(0, 52);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(35, (int) ' ');
        int int21 = simpleMethods0.getMin((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(35, (int) ' ');
        int int21 = simpleMethods0.getMin((-1), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(35, 52);
        int int21 = simpleMethods0.getMin(97, 97);
        int int24 = simpleMethods0.getMin(10, (int) 'a');
        int int27 = simpleMethods0.getMin((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, 35);
        int int21 = simpleMethods0.getMin(52, 0);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin(0, (int) 'a');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int18 = simpleMethods0.getMin((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin((-1), 0);
        int int18 = simpleMethods0.getMin((int) '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(1, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(0, (-1));
        int int12 = simpleMethods0.getMin((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((int) ' ', 1);
        int int24 = simpleMethods0.getMin((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((-1), (int) '#');
        int int6 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 0, (int) '4');
        int int21 = simpleMethods0.getMin((int) (short) 0, (int) (short) 10);
        int int24 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 97);
        int int18 = simpleMethods0.getMin((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin(0, (int) 'a');
        int int21 = simpleMethods0.getMin((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 1);
        int int24 = simpleMethods0.getMin(32, 97);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin(10, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 35);
        int int27 = simpleMethods0.getMin(52, (int) (short) 1);
        int int30 = simpleMethods0.getMin((int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(52, (int) '4');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int15 = simpleMethods0.getMin(1, 52);
        int int18 = simpleMethods0.getMin((-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (int) '4');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(97, (-1));
        int int15 = simpleMethods0.getMin(32, 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int15 = simpleMethods0.getMin(1, 52);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 32);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(97, (int) ' ');
        int int21 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(32, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) '#', 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin((-1), 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin(52, (int) 'a');
        int int27 = simpleMethods0.getMin(35, (int) ' ');
        int int30 = simpleMethods0.getMin((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass31 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 10);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) 1);
        int int21 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int24 = simpleMethods0.getMin((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(0, (-1));
        int int15 = simpleMethods0.getMin(0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin(97, (-1));
        int int15 = simpleMethods0.getMin(10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((int) ' ', 1);
        int int24 = simpleMethods0.getMin(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) '#');
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int18 = simpleMethods0.getMin((int) (short) 0, 32);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(10, (int) (short) 1);
        int int24 = simpleMethods0.getMin(100, (int) (short) 10);
        int int27 = simpleMethods0.getMin((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(52, (int) '4');
        int int21 = simpleMethods0.getMin(1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(0, (-1));
        int int12 = simpleMethods0.getMin((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 97);
        int int18 = simpleMethods0.getMin((-1), 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(1, (int) (short) -1);
        int int12 = simpleMethods0.getMin((-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(10, (int) (short) 0);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin(52, (int) 'a');
        int int27 = simpleMethods0.getMin(35, (int) ' ');
        int int30 = simpleMethods0.getMin((int) '4', 32);
        int int33 = simpleMethods0.getMin(0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) 1, 100);
        int int6 = simpleMethods0.getMin(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(32, 10);
        int int12 = simpleMethods0.getMin((int) (short) 10, 100);
        int int15 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int18 = simpleMethods0.getMin((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin(35, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(35, (int) ' ');
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-1));
        int int24 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin((int) ' ', (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) (byte) 1, 35);
        int int21 = simpleMethods0.getMin(35, 100);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 32);
        int int27 = simpleMethods0.getMin((int) (short) 10, (int) 'a');
        int int30 = simpleMethods0.getMin((int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        int int15 = simpleMethods0.getMin(52, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin(52, (int) 'a');
        int int27 = simpleMethods0.getMin(35, (int) ' ');
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) ' ', 1);
        int int15 = simpleMethods0.getMin(52, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(35, 52);
        int int21 = simpleMethods0.getMin(32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 35);
        int int27 = simpleMethods0.getMin(52, (int) (short) 1);
        int int30 = simpleMethods0.getMin(97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(0, (-1));
        int int15 = simpleMethods0.getMin((int) '4', 97);
        int int18 = simpleMethods0.getMin((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) -1, 0);
        int int24 = simpleMethods0.getMin((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 35);
        int int27 = simpleMethods0.getMin(52, (int) (short) 1);
        int int30 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) '#', 32);
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((-1), (int) ' ');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        int int18 = simpleMethods0.getMin((int) ' ', (int) (short) 10);
        int int21 = simpleMethods0.getMin(1, (int) '#');
        int int24 = simpleMethods0.getMin((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int12 = simpleMethods0.getMin((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin((int) '#', 35);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', (int) '4');
        int int9 = simpleMethods0.getMin(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 35);
        int int24 = simpleMethods0.getMin((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 1);
        int int24 = simpleMethods0.getMin(32, 97);
        int int27 = simpleMethods0.getMin((int) 'a', (int) '#');
        int int30 = simpleMethods0.getMin((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, (int) (short) 0);
        int int18 = simpleMethods0.getMin((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        int int18 = simpleMethods0.getMin((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(32, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 1, 35);
        int int21 = simpleMethods0.getMin((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(0, (int) (short) 10);
        int int15 = simpleMethods0.getMin(1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, (int) '4');
        int int6 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        int int18 = simpleMethods0.getMin(32, (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, 1);
        int int9 = simpleMethods0.getMin(97, (int) (short) 0);
        int int12 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 100, 0);
        int int18 = simpleMethods0.getMin(35, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        int int15 = simpleMethods0.getMin((int) 'a', (int) 'a');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(0, (int) (short) 100);
        int int21 = simpleMethods0.getMin((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (int) (byte) 10);
        int int15 = simpleMethods0.getMin((int) (byte) 1, (int) 'a');
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin(0, (int) 'a');
        int int21 = simpleMethods0.getMin(97, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin(32, 100);
        int int18 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        int int21 = simpleMethods0.getMin((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin(0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, (int) (byte) 0);
        int int12 = simpleMethods0.getMin(0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin(32, (int) 'a');
        java.lang.Class<?> wildcardClass7 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (short) -1, 0);
        int int24 = simpleMethods0.getMin(0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, 1);
        int int9 = simpleMethods0.getMin(97, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        int int18 = simpleMethods0.getMin(0, 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) (byte) -1, (int) (short) 0);
        int int18 = simpleMethods0.getMin((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) '#', 0);
        int int27 = simpleMethods0.getMin(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((-1), (int) (short) 100);
        int int15 = simpleMethods0.getMin(35, 32);
        int int18 = simpleMethods0.getMin(1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 0);
        int int18 = simpleMethods0.getMin(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(32, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) -1);
        int int18 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin(32, 100);
        int int18 = simpleMethods0.getMin((int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 1);
        int int24 = simpleMethods0.getMin(32, 97);
        int int27 = simpleMethods0.getMin((int) 'a', (int) '#');
        int int30 = simpleMethods0.getMin(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) '#');
        int int15 = simpleMethods0.getMin((int) (byte) -1, 97);
        int int18 = simpleMethods0.getMin(10, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) 'a', (int) (short) 0);
        int int27 = simpleMethods0.getMin((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin(1, (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(52, (-1));
        int int12 = simpleMethods0.getMin(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin(0, (int) (short) 1);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) ' ');
        int int21 = simpleMethods0.getMin(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) ' ', 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (short) -1);
        int int12 = simpleMethods0.getMin((-1), (int) (short) 10);
        int int15 = simpleMethods0.getMin(32, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        int int12 = simpleMethods0.getMin(35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) (short) 0, 32);
        int int21 = simpleMethods0.getMin((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin((int) '4', (int) (short) -1);
        int int21 = simpleMethods0.getMin((int) ' ', 1);
        int int24 = simpleMethods0.getMin((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin((int) (short) 100, (int) (short) 100);
        int int18 = simpleMethods0.getMin(32, (int) (byte) 1);
        int int21 = simpleMethods0.getMin(0, 35);
        int int24 = simpleMethods0.getMin(52, (int) 'a');
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) 'a');
        int int9 = simpleMethods0.getMin(32, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) '4', 32);
        int int21 = simpleMethods0.getMin(1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 32);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(97, (int) ' ');
        int int21 = simpleMethods0.getMin((int) (short) -1, 97);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int21 = simpleMethods0.getMin(32, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(32, 52);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(32, 52);
        int int18 = simpleMethods0.getMin(10, 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(1, (int) (short) -1);
        int int12 = simpleMethods0.getMin((int) (short) 10, 32);
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        int int18 = simpleMethods0.getMin(35, (int) ' ');
        int int21 = simpleMethods0.getMin((int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(32, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 35);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin((int) ' ', 100);
        int int21 = simpleMethods0.getMin((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(32, (int) (short) 1);
        int int12 = simpleMethods0.getMin((int) (byte) -1, 100);
        int int15 = simpleMethods0.getMin(0, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(35, 52);
        int int21 = simpleMethods0.getMin(97, 97);
        int int24 = simpleMethods0.getMin((int) (short) 10, 0);
        int int27 = simpleMethods0.getMin(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) '#', 52);
        int int18 = simpleMethods0.getMin(0, (-1));
        int int21 = simpleMethods0.getMin((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(0, (-1));
        int int24 = simpleMethods0.getMin(97, 97);
        int int27 = simpleMethods0.getMin(97, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) (short) 10, (int) (byte) -1);
        int int15 = simpleMethods0.getMin((int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (short) 10, (int) (short) 1);
        int int18 = simpleMethods0.getMin((int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        int int12 = simpleMethods0.getMin(35, 10);
        int int15 = simpleMethods0.getMin(32, 100);
        int int18 = simpleMethods0.getMin((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) (byte) 10, 100);
        int int12 = simpleMethods0.getMin((int) (short) -1, (int) (byte) 10);
        int int15 = simpleMethods0.getMin((int) (byte) 1, (int) 'a');
        int int18 = simpleMethods0.getMin((int) (byte) 0, 100);
        int int21 = simpleMethods0.getMin((int) 'a', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) 100, 1);
        int int15 = simpleMethods0.getMin(10, (int) (short) 0);
        int int18 = simpleMethods0.getMin(97, (-1));
        int int21 = simpleMethods0.getMin((int) (byte) 0, (int) (short) 10);
        int int24 = simpleMethods0.getMin(100, 97);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(0, (-1));
        int int24 = simpleMethods0.getMin(97, 97);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) ' ', (int) '#');
        int int9 = simpleMethods0.getMin(52, (-1));
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(100, 1);
        int int24 = simpleMethods0.getMin(32, 97);
        int int27 = simpleMethods0.getMin((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 10, 32);
        int int15 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 100);
        int int18 = simpleMethods0.getMin(97, (int) ' ');
        int int21 = simpleMethods0.getMin((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin(0, (int) 'a');
        int int18 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(97, (int) (byte) -1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, 100);
        int int15 = simpleMethods0.getMin(1, 52);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin((int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 100, (int) (short) 1);
        int int9 = simpleMethods0.getMin((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) 1);
        int int12 = simpleMethods0.getMin((int) (byte) 100, (int) (short) -1);
        int int15 = simpleMethods0.getMin((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (short) 100, 1);
        int int18 = simpleMethods0.getMin((int) (byte) 10, 1);
        int int21 = simpleMethods0.getMin(0, (int) (byte) 0);
        int int24 = simpleMethods0.getMin((int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin(97, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin(0, (-1));
        int int24 = simpleMethods0.getMin((-1), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass10 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) ' ', 0);
        int int15 = simpleMethods0.getMin(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((-1), (int) ' ');
        int int18 = simpleMethods0.getMin((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin(1, 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) (byte) 0);
        int int12 = simpleMethods0.getMin((int) '4', (int) '#');
        int int15 = simpleMethods0.getMin((int) (short) 1, (-1));
        int int18 = simpleMethods0.getMin((int) (short) 1, 35);
        int int21 = simpleMethods0.getMin(1, 97);
        java.lang.Class<?> wildcardClass22 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (short) 100, 100);
        int int6 = simpleMethods0.getMin(0, (int) (short) 0);
        int int9 = simpleMethods0.getMin((int) (short) -1, 10);
        int int12 = simpleMethods0.getMin((int) (byte) 1, 0);
        int int15 = simpleMethods0.getMin((int) (byte) 10, 10);
        int int18 = simpleMethods0.getMin((int) 'a', (int) (byte) 1);
        int int21 = simpleMethods0.getMin((int) '4', (int) (short) 1);
        int int24 = simpleMethods0.getMin(35, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', 0);
        int int9 = simpleMethods0.getMin((int) '4', (int) ' ');
        int int12 = simpleMethods0.getMin((int) (short) 0, (int) '#');
        int int15 = simpleMethods0.getMin((-1), (int) (byte) 0);
        int int18 = simpleMethods0.getMin((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass19 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((int) (short) 1, (int) ' ');
        int int9 = simpleMethods0.getMin(10, 35);
        int int12 = simpleMethods0.getMin((int) (short) -1, 1);
        int int15 = simpleMethods0.getMin(0, 35);
        int int18 = simpleMethods0.getMin((int) (short) -1, (int) '#');
        int int21 = simpleMethods0.getMin((int) (byte) 0, 1);
        int int24 = simpleMethods0.getMin((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) (byte) -1, (int) 'a');
        int int6 = simpleMethods0.getMin((-1), (int) (short) -1);
        int int9 = simpleMethods0.getMin(1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin((int) '4', 0);
        int int6 = simpleMethods0.getMin((int) 'a', (-1));
        int int9 = simpleMethods0.getMin((int) (short) 10, 32);
        int int12 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int15 = simpleMethods0.getMin((int) (byte) 10, (int) (byte) 1);
        int int18 = simpleMethods0.getMin(0, (int) (byte) 10);
        int int21 = simpleMethods0.getMin(10, (int) (short) 1);
        int int24 = simpleMethods0.getMin(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(0, 0);
        int int6 = simpleMethods0.getMin((int) (byte) 1, (int) (byte) 0);
        int int9 = simpleMethods0.getMin(10, 100);
        int int12 = simpleMethods0.getMin(97, (int) '#');
        java.lang.Class<?> wildcardClass13 = simpleMethods0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        examples.SimpleMethods simpleMethods0 = new examples.SimpleMethods();
        int int3 = simpleMethods0.getMin(97, (int) 'a');
        int int6 = simpleMethods0.getMin((int) '4', (int) '4');
        int int9 = simpleMethods0.getMin((int) '#', 10);
        int int12 = simpleMethods0.getMin((-1), 35);
        int int15 = simpleMethods0.getMin((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }
}

